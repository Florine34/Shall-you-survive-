package com.example.justine.shallyousurvive.Class;

import android.os.Parcel;

import com.example.justine.shallyousurvive.Class.Personnage;
import com.example.justine.shallyousurvive.Class.Mob;

public class Mage extends Personnage {

	public Mage(){
		//String nom, String img, String histoire, String nomClasse, int or, int hp, int force, int agi,int magie
		super("Nom Mage","@drawable/mage.png", "Intelligent et perspicace","Mage", 80, 10,1,3,10);
	}

	public void combat(Mob creature){
		while(!this.isDead || !creature.isDead){
			creature.takeDamage(this.magie);
			if (!creature.isDead) {
				this.takeDamage(creature.force);
			}
		}
	}
}