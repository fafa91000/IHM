package fr.snekkja.cours.jsf2.converter;

import java.util.List;
import java.util.function.Predicate;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;

import fr.snekkja.cours.jsf2.domain.Boisson;
import fr.snekkja.cours.jsf2.service.BoissonService;

/**
 * Convertisseur JSF 2 pour les boissons.
 * 
 * @author Jyko
 * @since 22 janv. 2016
 */
@Named(value = "boissonConverter")
public class BoissonConverter implements Converter
{
	
	@Inject
	private BoissonService m_boissonService;
	
	@Override
	public Boisson getAsObject(final FacesContext context, final UIComponent component, final String value)
	{
		final List<Boisson> boissons = m_boissonService.obtenirBoissonsDisponibles();

		/*
		 * Nous écrivons une règle conditionnelle fonctionnelle grâce aux lambdas de Java 8.
		 * 
		 * Pour que la boisson réponde à la condition, il faut que son identifiant soit égal à la valeur cherchée.
		 * 
		 * Nous appliquons ensuite la règle conditionnelle à la liste de boissons disponibles, afin d'isoler la première boisson disposant de l'identifiant recherché.
		 * Si aucune boisson ne dispose du même identifiant, nous renvoyons null.
		 */
		final Predicate<Boisson> condition = (final Boisson boisson) -> boisson.getId() == Integer.parseInt(value);
		
		return boissons.stream().filter(condition).findFirst().orElse(null);
	}

	@Override
	public String getAsString(final FacesContext context, final UIComponent component, final Object value)
	{
		return ((Boisson) value).getId().toString();
	}
	
}
