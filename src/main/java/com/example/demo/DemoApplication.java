package com.example.demo;

import com.example.demo.entities.*;
import com.example.demo.traitement.CarteCouleurImpl;
import com.example.demo.traitement.CarteValeurImpl;
import com.example.demo.traitement.JeuxDeCarteImpl;
import com.example.demo.traitement.TriImpl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	CarteCouleurImpl carteCouleurImpl;

	@Autowired
	CarteValeurImpl carteValeurImpl;

	@Autowired
	JeuxDeCarteImpl jeuxDeCarteImpl;

	@Autowired
	TriImpl triImpl;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@PostConstruct
	public void init() {
		System.out.println("*********ordres des couleurs********");
		List<CouleurCarte> ListCouleurs = carteCouleurImpl.construireListCouleur();
		ListCouleurs.forEach(System.out::println);

		System.out.println("*******ordre des valeurs *******");
		List<ValeurCarte> ListValeurs = carteValeurImpl.construireListValeur();
		ListValeurs.forEach(System.out::println);

		System.out.println("*****Liste des carte à la main*******");

		List<Carte> ListCarteGeneree = jeuxDeCarteImpl.construireCarte();

		for (Carte carte : ListCarteGeneree) {
			System.out.println(carte.toString());
		}
		System.out.println("****** liste des carte triées ******");
		List<Carte> ListCartetriées = jeuxDeCarteImpl.TrierCarteDistribuees(ListCarteGeneree, ListValeurs,
				ListCouleurs);

		for (Carte carte : ListCartetriées) {
			System.out.println(carte.toString());
		}

	}
}
