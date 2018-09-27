package com.example.justine.shallyousurvive.Class;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.justine.shallyousurvive.Activities.ChoixPersoActivity;

import java.io.Serializable;
import java.util.ArrayList;

public class Chapitre implements Parcelable{

	public String nom;

	public int histoire;

	public ArrayList<Chapitre> Choix;

	public int previsualitation;

	public int refImage;

	public int deltaGold;

	public int deltaHp;

	public Chapitre(String n, int h, int p, int img){
		nom=n;
		histoire=h;
		previsualitation=p;
		refImage=img;
		Choix=new ArrayList<>();
		deltaGold=0;
		deltaHp=0;
	}

	public Chapitre(String n, int h, int p, int img, ArrayList<Chapitre> listChoix){
		nom=n;
		histoire=h;
		previsualitation=p;
		refImage=img;
		Choix=listChoix;
		deltaGold=0;
		deltaHp=0;
	}

	public Chapitre(String n, int h, int p, int img, Chapitre choix1){
		nom=n;
		histoire=h;
		previsualitation=p;
		refImage=img;
		Choix=new ArrayList<Chapitre>(1);
		Choix.add(choix1);
		deltaGold=0;
		deltaHp=0;
	}

	public Chapitre(String n, int h, int p, int img, Chapitre choix1, Chapitre choix2){
		nom=n;
		histoire=h;
		previsualitation=p;
		refImage=img;
		Choix=new ArrayList<Chapitre>(2);
		Choix.add(choix1);
		Choix.add(choix2);
		deltaGold=0;
		deltaHp=0;
	}

	public Chapitre(String n, int h, int p, int img, Chapitre choix1, Chapitre choix2, Chapitre choix3){
		nom=n;
		histoire=h;
		previsualitation=p;
		refImage=img;
		Choix=new ArrayList<Chapitre>(3);
		Choix.add(choix1);
		Choix.add(choix2);
		Choix.add(choix3);
		deltaGold=0;
		deltaHp=0;
	}

	public Chapitre (Parcel in){
		nom=in.readString();
		histoire=in.readInt();
		previsualitation=in.readInt();
		refImage=in.readInt();
		//Choix= new ArrayList<Chapitre>();
		Choix=in.createTypedArrayList(CREATOR);
		//in.readTypedList(Choix,CREATOR);
		//Choix= in.readParcelableArray(Chapitre.class.getClassLoader());
		deltaGold=in.readInt();
		deltaHp=in.readInt();
	}

	public boolean isEvent(){
		return Choix.size()==1;
	}

	public void setDeltaGold(int delta){
		deltaGold=delta;
	}

	public void setDeltaHp(int delta){
		deltaHp=delta;
	}

	public int describeContents(){
		return 0;
	}

	public void writeToParcel(Parcel out, int flags){
		out.writeString(nom);
		out.writeInt(histoire);
		out.writeInt(previsualitation);
		out.writeInt(refImage);
		out.writeTypedList(Choix);
		out.writeInt(deltaGold);
		out.writeInt(deltaHp);
	}

	public static final Parcelable.Creator<Chapitre> CREATOR = new Parcelable.Creator<Chapitre>() {
		public Chapitre createFromParcel(Parcel in) {
			return new Chapitre(in);
		}

		public Chapitre[] newArray(int size) {
			return new Chapitre[size];
		}
	};

	public String RandomChapitre(ArrayList<String> listId){
		return null;
	}
}