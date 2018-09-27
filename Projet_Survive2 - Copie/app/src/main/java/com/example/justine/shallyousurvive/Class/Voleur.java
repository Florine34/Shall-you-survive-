package com.example.justine.shallyousurvive.Class;

import com.example.justine.shallyousurvive.Class.Mob;
import com.example.justine.shallyousurvive.Class.Personnage;

public class Voleur extends Personnage {

	public Voleur(){
		//String nom, String img, String histoire, String nomClasse, int or, int hp, int force, int agi,int magie
		super("Nom Voleur","@drawable/voleur.png", "Agile et malicieux","Voleur", 60, 10,3,10,0);
	}

	public void combat(Mob creature){
		while(!this.isDead || !creature.isDead){
			creature.takeDamage(this.agilite/2);
			if (!creature.isDead) {
				this.takeDamage(creature.force);
			}
		}
	}
}