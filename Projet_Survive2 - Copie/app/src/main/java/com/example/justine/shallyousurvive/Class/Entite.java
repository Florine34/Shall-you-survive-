package com.example.justine.shallyousurvive.Class;

public abstract class Entite{

	public String nom;

	public String refImage;
	
	protected int maxHealth;

	protected int currentHealth;

	public int force;

	public boolean isDead;

	public Entite(String n,String img, int hp, int f){
		nom=n;
		refImage=img;
		maxHealth=hp;
		currentHealth=hp;
		force=f;
		isDead=false;
	}

	public Entite(String n,String img, int hp,int currenthp, int f){
		nom=n;
		refImage=img;
		maxHealth=hp;
		currentHealth=currenthp;
		force=f;
		isDead=false;
	}

	public int takeDamage (int dmg){
		currentHealth-=dmg;
		if (currentHealth<=0) {
			currentHealth=0;
			isDead=true;
			return -1;
		}
		return currentHealth;
	}

	public int heal(int valeur){
		currentHealth+=valeur;
		if (currentHealth>maxHealth) {
			currentHealth=maxHealth;
		}
		return currentHealth;
	}

	public int getCurrentHealth(){
		return currentHealth;
	}

	public int getMaxHealth(){return maxHealth;}
}