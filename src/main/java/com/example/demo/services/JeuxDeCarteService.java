package com.example.demo.services;
 
import java.util.List;

import com.example.demo.entities.Carte;
import com.example.demo.entities.CouleurCarte;
import com.example.demo.entities.ValeurCarte;

public interface JeuxDeCarteService {

	List<Carte> construireCarte();

	 List<Carte> TrierCarteDistribuees(List<Carte> cardsToSort, List<ValeurCarte> ListValeurs, List<CouleurCarte> ListCouleurs);
}
