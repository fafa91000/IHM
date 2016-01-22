package fr.snekkja.cours.jsf2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

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
	
	/** Boisson */
	private String m_boisson;
	
	/** Boissons disponibles */
	private List<String> m_boissonsDisponibles;
	
	/**
	 * Construire un formulaire de commande.
	 */
	public CommandeForm() {
		
		this.m_boissonsDisponibles = new ArrayList<>(Arrays.asList("café", "thé", "chocolat", "café au lait"));
	}

	/**
	 * Obtenir La boisson.
	 * @return La boisson.
	 */
	public String getBoisson()
	{
		return m_boisson;
	}

	/**
	 * Peupler la boisson.
	 * @param boisson Une boisson.
	 */
	public void setBoisson(final String boisson)
	{
		this.m_boisson = boisson;
	}

	/**
	 * Obtenir les boissons disponibles.
	 * @return Les boissons disponibles.
	 */
	public List<String> getBoissonsDisponibles()
	{
		return m_boissonsDisponibles;
	}

	/**
	 * Peupler les boissons disponibles.
	 * @param boissonsDisponibles Une liste de boissons disponibles.
	 */
	public void setBoissonsDisponibles(final List<String> boissonsDisponibles)
	{
		m_boissonsDisponibles = boissonsDisponibles;
	}
	
}
