package fr.snekkja.cours.jsf2.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import fr.snekkja.cours.jsf2.domain.Boisson;

/**
 * Service de gestion des boissons.
 * 
 * @author Jyko
 * @since 22 janv. 2016
 */
@Named
public class BoissonService
{
	
	/**
	 * Obtenir la liste des boissons disponibles.
	 * 
	 * @return Les boissons disponibles.
	 */
	public List<Boisson> obtenirBoissonsDisponibles()
	{
		// Rien de tout cela n'est optimisé, ne jamais utilisé ce genre d'instructions en production.
		
		final Boisson cafe = new Boisson(1, "café", 1.2);
		final Boisson cafeAuLait = new Boisson(2, "café au lait", 2d);
		final Boisson chocolat = new Boisson(3, "chocolat", (double) 2);
		final Boisson the = new Boisson(4, "thé", new Double(1.5));
		
		final List<Boisson> boissonsDisponibles = new ArrayList<>();
		
		boissonsDisponibles.add(cafe);
		boissonsDisponibles.add(cafeAuLait);
		boissonsDisponibles.add(chocolat);
		boissonsDisponibles.add(the);
		
		return boissonsDisponibles;
	}
	
}
