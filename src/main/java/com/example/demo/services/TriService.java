package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Carte;
import com.example.demo.entities.CouleurCarte;
import com.example.demo.entities.ValeurCarte;

public interface TriService {

	List<Carte> trierCartes(List<ValeurCarte> ListValeursInversees, List<CouleurCarte> ListCouleursInversees);
}
