package fr.snekkja.cours.jsf2.domain;

/**
 * Une boisson servie chaude ou froide !
 * 
 * @author Jyko
 * @since 22 janv. 2016
 */
public class Boisson
{
	
	/** Identifiant */
	private Integer m_id;
	
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
	public Boisson(final Integer id, final String nom, final Double prix)
	{
		super();
		m_id = id;
		m_nom = nom;
		m_prix = prix;
	}
	
	/**
	 * Obtenir l'identifiant.
	 * @return L'identifiant.
	 */
	public Integer getId()
	{
		return m_id;
	}

	/**
	 * Peupler l'identifiant.
	 * @param id Un identifiant de boisson.
	 */
	public void setId(final Integer id)
	{
		m_id = id;
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
	

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((m_id == null) ? 0 : m_id.hashCode());
		result = prime * result + ((m_nom == null) ? 0 : m_nom.hashCode());
		result = prime * result + ((m_prix == null) ? 0 : m_prix.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Boisson other = (Boisson) obj;
		if (m_id == null)
		{
			if (other.m_id != null)
				return false;
		}
		else if (!m_id.equals(other.m_id))
			return false;
		if (m_nom == null)
		{
			if (other.m_nom != null)
				return false;
		}
		else if (!m_nom.equals(other.m_nom))
			return false;
		if (m_prix == null)
		{
			if (other.m_prix != null)
				return false;
		}
		else if (!m_prix.equals(other.m_prix))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "Boisson [m_id=" + m_id + ", m_nom=" + m_nom + ", m_prix=" + m_prix + "]";
	}
	
}
