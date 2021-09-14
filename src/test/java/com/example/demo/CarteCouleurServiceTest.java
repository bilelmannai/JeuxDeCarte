package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.traitement.CarteCouleurImpl;

import com.example.demo.entities.*;

public class CarteCouleurServiceTest {

@Autowired
private CarteCouleurImpl carteCouleurImpl;

private List<CouleurCarte> ListCouleurs;



@Test
void genererCouleursTest() {
	ListCouleurs = carteCouleurImpl.construireListCouleur();
    ListCouleurs.forEach(System.out::println);
    Assertions.assertEquals(CouleurCarte.values().length, ListCouleurs.size());

}

}
