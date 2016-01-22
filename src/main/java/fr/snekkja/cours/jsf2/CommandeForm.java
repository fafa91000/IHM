package fr.snekkja.cours.jsf2;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

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
	@EJB
	private BoissonService m_boissonService;
	
	/** Nom de la boisson sélectionnée */
	private String m_nomBoissonSelectionnee;
	
	/**
	 * Construire un formulaire de commande.
	 */
	public CommandeForm() {
		super();
	}

	/**
	 * Obtenir le nom de la boisson selectionnée.
	 * @return Le nom de la boisson selectionnée.
	 */
	public String getNomBoissonSelectionnee()
	{
		return m_nomBoissonSelectionnee;
	}

	/**
	 * Peupler le nom de la boisson sélectionnée.
	 * @param nomBoisson Un nom de boisson.
	 */
	public void setNomBoissonSelectionnee(final String nomBoisson)
	{
		this.m_nomBoissonSelectionnee = nomBoisson;
	}

	/**
	 * Obtenir les boissons disponibles.
	 * @return Les boissons disponibles.
	 */
	public List<Boisson> getBoissonsDisponibles()
	{
		return m_boissonService.obtenirBoissonsDisponibles();
	}
	
}
