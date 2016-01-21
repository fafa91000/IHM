package fr.snekkja.cours.jsf2;

import java.io.Serializable;

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
	
}
