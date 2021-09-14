package com.example.demo.traitement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import com.example.demo.entities.Carte;
import com.example.demo.entities.CouleurCarte;
import com.example.demo.entities.ValeurCarte;
import com.example.demo.services.JeuxDeCarteService;

@Service
public class JeuxDeCarteImpl implements JeuxDeCarteService {

	@Autowired
	TriImpl triImpl;

	private static final int numCartes = 10;

	@Override
	public List<Carte> construireCarte() {
		List<Carte> cartesDistribuees = new ArrayList<>();
		List<Carte> carteListComplete = new ArrayList<>();
		if (ValeurCarte.values().length > 0 && CouleurCarte.values().length > 0) {

			for (ValeurCarte valeurCarte : ValeurCarte.values()) {

				for (CouleurCarte cardSymbol : CouleurCarte.values()) {
					carteListComplete.add(new Carte(cardSymbol, valeurCarte));
				}
			}

			for (int i = 0; i < numCartes; i++) {
				int carteIndice = (int) (Math.random() * (carteListComplete.size()));
				cartesDistribuees.add(carteListComplete.get(carteIndice));
			}

		}
		return cartesDistribuees;
	}

	@Override
	public List<Carte> TrierCarteDistribuees(List<Carte> cartesList, List<ValeurCarte> ListValeurs,
			List<CouleurCarte> ListCouleurs) {

		List<Carte> sortedHands = new ArrayList<>();
		try {

			if (cartesList.size() > 0 && ListCouleurs.size() > 0 && ListValeurs.size() > 0) {
				List<Carte> OrdreCartes = triImpl.trierCartes(ListValeurs, ListCouleurs);

				Comparator<Carte> comparateurDesCartes = Comparator.comparing(item -> OrdreCartes.indexOf(item));

				// Collections.sort(cartesList, comparateurDesCartes);
				sortedHands = cartesList.stream().sorted(comparateurDesCartes).collect(Collectors.toList());
			}
		} catch (Exception e) {
			
		}
		return sortedHands;
	}

}
