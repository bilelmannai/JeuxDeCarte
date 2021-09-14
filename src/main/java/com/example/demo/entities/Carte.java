package com.example.demo.entities;

import java.util.Objects;

public class Carte {
	
	private CouleurCarte couleur ;
    private ValeurCarte valeur ;
    
    
	public Carte(CouleurCarte couleur, ValeurCarte valeur) {
	
		this.couleur = couleur;
		this.valeur = valeur;
	}


	@Override
	public int hashCode() {
		return Objects.hash(couleur, valeur);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carte other = (Carte) obj;
		return couleur == other.couleur && valeur == other.valeur;
	}
	
	
    
    
}
