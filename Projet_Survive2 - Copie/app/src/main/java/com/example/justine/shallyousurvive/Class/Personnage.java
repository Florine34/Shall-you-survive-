package com.example.justine.shallyousurvive.Class;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.justine.shallyousurvive.Class.Entite;
import com.example.justine.shallyousurvive.Class.Mob;

import java.io.Serializable;

public abstract class Personnage extends Entite implements Parcelable{


	public String histoire;

	public String nomClasse;

	private int or;

	public int agilite;

	public int magie;	

	public Personnage(String n, String img, String his, String nc, int o, int hp, int forc, int agi,int mag){
		super(n,img,hp,forc);
		histoire=his;
		nomClasse=nc;
		or=o;
		force=forc;
		agilite=agi;
		magie=mag;
	}

	public int gainGold(int montant){
		or+=montant;
		return or;
	}

	public int looseGold(int montant){
		//renvoie le nombre de gold restant apres l envoie ou -1 si il n y as pas assez
		if (or<montant) {
			or=0;
			return -1;
		}else{
			or-=montant;
			return or;
		}
	}

	public int getCurrentGold(){
		return or;
	}

	public abstract void combat (Mob creature);

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel parcel, int i) {
		parcel.writeString(nom);
		parcel.writeString(refImage);
		parcel.writeInt(getMaxHealth());
		parcel.writeInt(getCurrentHealth());
		parcel.writeInt(force);

		parcel.writeString(histoire);
		parcel.writeString(nomClasse);
		parcel.writeInt(or);
		parcel.writeInt(agilite);
		parcel.writeInt(magie);

	}

	public static final Parcelable.Creator<Personnage> CREATOR = new Parcelable.Creator<Personnage>() {
		public Personnage createFromParcel(Parcel in) {
			return new Personnage(in) {
				@Override
				public void combat(Mob creature) {

				}
			};
		}

		public Personnage[] newArray(int size) {
			return new Personnage[size];
		}
	};

	private Personnage(Parcel parcel) {
		super(parcel.readString(),parcel.readString(),parcel.readInt(),parcel.readInt(),parcel.readInt());//nom,img,hp,force
		histoire=parcel.readString();
		nomClasse=parcel.readString();
		or=parcel.readInt();
		agilite=parcel.readInt();
		magie=parcel.readInt();

	}
}