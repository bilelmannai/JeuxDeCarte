package com.example.demo.traitement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Carte;
import com.example.demo.entities.ValeurCarte;
import com.example.demo.entities.CouleurCarte;
import com.example.demo.services.TriService;

@Service
public class TriImpl implements TriService {

	@Override
	public List<Carte> trierCartes(List<ValeurCarte> ListValeursInversees, List<CouleurCarte> ListCouleursInversees) {

		List<Carte> ListCarteInversees = new ArrayList<>();
		try {

			if (ListValeursInversees.size() > 0 && ListCouleursInversees.size() > 0) {
				for (ValeurCarte valeurCarte : ListValeursInversees) {
					for (CouleurCarte couleurCarte : ListCouleursInversees) {
						ListCarteInversees.add(new Carte(couleurCarte, valeurCarte));
					}
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return ListCarteInversees;

	}

}
