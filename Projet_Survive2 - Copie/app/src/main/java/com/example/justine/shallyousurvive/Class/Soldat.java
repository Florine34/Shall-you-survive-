package com.example.justine.shallyousurvive.Class;

import com.example.justine.shallyousurvive.Class.Mob;
import com.example.justine.shallyousurvive.Class.Personnage;

public class Soldat extends Personnage {

	public Soldat(){
		//String nom, String img, String histoire, String nomClasse, int or, int hp, int force, int agi,int magie
		super("Nom Soldat","@drawable/soldat.jpg", "Fort et resistant","Soldat", 40, 10,10,3,0);
	}

	public void combat(Mob creature){
		while(!this.isDead || !creature.isDead){
			creature.takeDamage(this.force);
			if (!creature.isDead) {
				this.takeDamage(creature.force);
			}
		}
	}
}