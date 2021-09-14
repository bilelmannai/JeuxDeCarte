package com.example.demo.traitement;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.CouleurCarte;
import com.example.demo.services.CarteCouleurService;

@Service
public class CarteCouleurImpl implements CarteCouleurService {

	@Override
	public List<CouleurCarte> construireListCouleur() {
		List<CouleurCarte> listCarteCouleur = Arrays.asList(CouleurCarte.values());
		Collections.reverse(listCarteCouleur);
		return listCarteCouleur;
	}

}
