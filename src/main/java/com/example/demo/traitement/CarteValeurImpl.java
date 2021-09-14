package com.example.demo.traitement;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.ValeurCarte;
import com.example.demo.services.CarteValeurService;

@Service
public class CarteValeurImpl implements CarteValeurService {

	@Override
	public List<ValeurCarte> construireListValeur() {
		List<ValeurCarte> listCarteValeur = Arrays.asList(ValeurCarte.values());
		Collections.reverse(listCarteValeur);
		return listCarteValeur;
	}


}
