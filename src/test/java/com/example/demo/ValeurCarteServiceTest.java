package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.ValeurCarte;
import com.example.demo.traitement.CarteValeurImpl;

public class ValeurCarteServiceTest {
	@Autowired
	private CarteValeurImpl carteValeurImpl;

	private List<ValeurCarte> ListValeurs;



	@Test
	void genererCouleursTest() {
		ListValeurs = carteValeurImpl.construireListValeur();
		ListValeurs.forEach(System.out::println);
	    Assertions.assertEquals(ValeurCarte.values().length, ListValeurs.size());

	}
}
