package fr.snekkja.cours.jsf2;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import fr.snekkja.cours.jsf2.domain.Boisson;
import fr.snekkja.cours.jsf2.service.BoissonService;

/**
 * Formulaire de commande.
 * 
 * @author Jyko
 * @since 21 janv. 2016
 */
@ManagedBean
@RequestScoped
public class CommandeForm implements Serializable
{

	/** Identifiant de version */
	private static final long	serialVersionUID	= 1;
	
	/** Service de gestion des boissons */
	@Inject
	private BoissonService m_boissonService;
	
	/** Boisson sélectionnée */
	private Boisson m_boissonSelectionnee;
	
	/** Somme payée par l'utilisateur */
	private Double m_sommePayee;
	
	/**
	 * Construire un formulaire de commande.
	 */
	public CommandeForm() {
		super();
	}

	/**
	 * Obtenir la boisson selectionnée.
	 * @return La boisson selectionnée.
	 */
	public Boisson getBoissonSelectionnee()
	{
		return m_boissonSelectionnee;
	}

	/**
	 * Peupler la boisson sélectionnée.
	 * @param nomBoisson Une boisson.
	 */
	public void setBoissonSelectionnee(final Boisson nomBoisson)
	{
		this.m_boissonSelectionnee = nomBoisson;
	}

	/**
	 * Obtenir les boissons disponibles.
	 * @return Les boissons disponibles.
	 */
	public List<Boisson> getBoissonsDisponibles()
	{
		return m_boissonService.obtenirBoissonsDisponibles();
	}

	/**
	 * Obtenir la somme payée par l'utilisateur.
	 * 
	 * @return La somme payée par l'utilisateur.
	 */
	public Double getSommePayee()
	{
		return m_sommePayee;
	}

	/**
	 * Peupler la somme payée par l'utilisateur.
	 * 
	 * @param sommePayee Une somme.
	 */
	public void setSommePayee(final Double sommePayee)
	{
		m_sommePayee = sommePayee;
	}
	
	/**
	 * Commander une boisson.
	 * 
	 * @return La règle de navigation post-commande.
	 */
	public String commander()
	{
		if (m_sommePayee >= m_boissonSelectionnee.getPrix())
		{
			return "commande";
		}
		else
		{
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "N'essayez pas de nous arnaquer !", ""));
			return "index";
		}
	}
	
}
