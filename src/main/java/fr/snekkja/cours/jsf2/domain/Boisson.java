package fr.snekkja.cours.jsf2.domain;

/**
 * Une boisson servie chaude ou froide !
 * 
 * @author Jyko
 * @since 22 janv. 2016
 */
public class Boisson
{
	
	/** Nom */
	private String m_nom;
	
	/** Prix HT */
	private Double m_prix;
	
	/**
	 * Construire une boisson.
	 */
	public Boisson()
	{
		super();
	}
	
	/**
	 * Construire une boisson.
	 * 
	 * @param nom Un nom.
	 * @param prix Un prix HT en €.
	 */
	public Boisson(final String nom, final Double prix)
	{
		super();
		m_nom = nom;
		m_prix = prix;
	}

	/**
	 * Obtenir le nom.
	 * @return Le nom.
	 */
	public String getNom()
	{
		return m_nom;
	}
	
	/**
	 * Peupler le nom.
	 * @param nom Un nom.
	 */
	public void setNom(final String nom)
	{
		m_nom = nom;
	}
	
	/**
	 * Obtenir le prix HT en €.
	 * @return Le prix HT en €.
	 */
	public Double getPrix()
	{
		return m_prix;
	}
	
	/**
	 * Peupler le prix HT en €.
	 * @param prix Un prix HT en €.
	 */
	public void setPrix(final Double prix)
	{
		m_prix = prix;
	}
	
}
