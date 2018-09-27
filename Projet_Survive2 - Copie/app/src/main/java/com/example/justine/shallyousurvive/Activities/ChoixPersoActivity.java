package com.example.justine.shallyousurvive.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.justine.shallyousurvive.Class.ChapitreChance;
import com.example.justine.shallyousurvive.Class.Mage;
import com.example.justine.shallyousurvive.Class.Personnage;
import com.example.justine.shallyousurvive.Class.Chapitre;
import com.example.justine.shallyousurvive.Class.Soldat;
import com.example.justine.shallyousurvive.Class.Voleur;
import com.example.justine.shallyousurvive.MainActivity;
import com.example.justine.shallyousurvive.R;

import java.util.ArrayList;

/**
 * Created by Justine on 02/04/2018.
 */

public class ChoixPersoActivity extends AppCompatActivity{

    public static final String CHAPITRE_CLASS = "Chapitre";
    public static final String PERSONNAGE_CLASS = "Personnage";
    public static final String INDEX_CLASS = "Index";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.choixperso);

        //Changez la descriptions des personnages

        ((TextView)findViewById(R.id.descMage)).setText(new Mage().histoire);
        ((TextView)findViewById(R.id.descVoleur)).setText(new Voleur().histoire);
        ((TextView)findViewById(R.id.descSoldat)).setText(new Soldat().histoire);



        final ImageButton buttonSM = findViewById(R.id.selectMage);
        buttonSM.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentHistoire = new Intent(ChoixPersoActivity.this, HistoireActivity.class);
                intentHistoire.putExtra(ChoixPersoActivity.PERSONNAGE_CLASS,new Mage());
                //intentHistoire.putExtra(ChoixPersoActivity.CHAPITRE_CLASS,chapitre1);
                intentHistoire.putExtra(ChoixPersoActivity.INDEX_CLASS,0);
                final ArrayList<ArrayList<String>> histoire = getHistoireMage();
                intentHistoire.putExtra(ChoixPersoActivity.CHAPITRE_CLASS,histoire);
                Log.i("DICJ","button mage");
                startActivity(intentHistoire);
                finish();
            }
        });

        final ImageButton buttonSV = findViewById(R.id.selecVoleur);
        buttonSV.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentHistoire = new Intent(ChoixPersoActivity.this, HistoireActivity.class);
                intentHistoire.putExtra(ChoixPersoActivity.PERSONNAGE_CLASS,new Voleur());
                //intentHistoire.putExtra(ChoixPersoActivity.CHAPITRE_CLASS,chapitre1);
                intentHistoire.putExtra(ChoixPersoActivity.INDEX_CLASS,0);
                final ArrayList<ArrayList<String>> histoire = getHistoireVoleur();
                intentHistoire.putExtra(ChoixPersoActivity.CHAPITRE_CLASS,histoire);
                startActivity(intentHistoire);
                finish();
            }
        });

        final ImageButton buttonSS = findViewById(R.id.selecSoldat);
        buttonSS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentHistoire = new Intent(ChoixPersoActivity.this, HistoireActivity.class);
                intentHistoire.putExtra(ChoixPersoActivity.PERSONNAGE_CLASS,new Soldat());
                //intentHistoire.putExtra(ChoixPersoActivity.CHAPITRE_CLASS,chapitre1);
                intentHistoire.putExtra(ChoixPersoActivity.INDEX_CLASS,0);
                final ArrayList<ArrayList<String>> histoire = getHistoireSoldat();
                intentHistoire.putExtra(ChoixPersoActivity.CHAPITRE_CLASS,histoire);
                startActivity(intentHistoire);
                finish();
            }
        });
    }

    //create the menu
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_goBack:
                //Intent intentAccueil = new Intent(this, MainActivity.class);
                //startActivity(intentAccueil);
                finish();
                return true;

            case R.id.action_quit:
                finish();
                System.exit(0);
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }

    @Override
    protected void onSaveInstanceState(Bundle oldInstanceState) {
        super.onSaveInstanceState(oldInstanceState);
        oldInstanceState.clear();
    }

    private ArrayList<ArrayList<String>> getHistoireMage(){
        final ArrayList<ArrayList<String>> histoire = new ArrayList<>();
        ArrayList<String> chap1=new ArrayList<>();
        chap1.add("Chapitre 1");
        chap1.add("Chapitre 2");
        histoire.add(chap1);

        ArrayList<String> chap2=new ArrayList<>();
        chap2.add("Chapitre 2");
        chap2.add("Chapitre 3");
        histoire.add(chap2);

        ArrayList<String> chap3=new ArrayList<>();
        chap3.add("Chapitre 3");
        chap3.add("Chapitre 4");
        histoire.add(chap3);

        ArrayList<String> chap4=new ArrayList<>();
        chap4.add("Chapitre 4");
        chap4.add("Chapitre 5 Mage");
        histoire.add(chap4);

        ArrayList<String> chap5=new ArrayList<>();
        chap5.add("Chapitre 5 Mage");
        chap5.add("Chapitre 6");
        histoire.add(chap5);

        ArrayList<String> chap6=new ArrayList<>();
        chap6.add("Chapitre 6");
        chap6.add("Evenement Cocher");
        chap6.add("Evenement Marcher");
        histoire.add(chap6);

        ArrayList<String> chap6_Cocher=new ArrayList<>();
        chap6_Cocher.add("Evenement Cocher");
        chap6_Cocher.add("Chapitre 8");
        histoire.add(chap6_Cocher);

        ArrayList<String> chap6_Marcher=new ArrayList<>();
        chap6_Marcher.add("Evenement Marcher");
        chap6_Marcher.add("Chapitre 7 intermédiaire Foret1");
        histoire.add(chap6_Marcher);

        ArrayList<String> chap7=new ArrayList<>();
        chap7.add("Chapitre 7 intermédiaire Foret1");
        chap7.add("Chapitre 7 intermédiaire Foret2a Mage");
        chap7.add("Chapitre 7 intermédiaire Foret2b Mage");
        histoire.add(chap7);

        ArrayList<String> chap7_Foret2a=new ArrayList<>();
        chap7_Foret2a.add("Chapitre 7 intermédiaire Foret2a Mage");
        chap7_Foret2a.add("Chapitre 8");
        histoire.add(chap7_Foret2a);

        ArrayList<String> chap7_Foret2b=new ArrayList<>();
        chap7_Foret2b.add("Chapitre 7 intermédiaire Foret2b Mage");
        chap7_Foret2b.add("Chapitre 8");
        histoire.add(chap7_Foret2b);

        ArrayList<String> chap8=new ArrayList<>();
        chap8.add("Chapitre 8");
        chap8.add("Evenement Payer");
        chap8.add("Evenement Fuite");
        chap8.add("Evenement Mur");
        histoire.add(chap8);


        ArrayList<String> chap8_Payer=new ArrayList<>();
        chap8_Payer.add("Evenement Payer");
        chap8_Payer.add("Chapitre 9");
        histoire.add(chap8_Payer);

        ArrayList<String> chap8_Fuite=new ArrayList<>();
        chap8_Fuite.add("Evenement Fuite");
        chap8_Fuite.add("Chapitre 9");
        histoire.add(chap8_Fuite);

        ArrayList<String> chap8_Mur=new ArrayList<>();
        chap8_Mur.add("Evenement Mur");
        chap8_Mur.add("Evenement Mur Reussite");
        histoire.add(chap8_Mur);

        ArrayList<String> chap8_MurReussite=new ArrayList<>();
        chap8_MurReussite.add("Evenement Mur Reussite");
        chap8_MurReussite.add("Chapitre 9");
        histoire.add(chap8_MurReussite);

        ArrayList<String> chap9=new ArrayList<>();
        chap9.add("Chapitre 9");
        chap9.add("Evenement Nourrir");
        chap9.add("Evenement Balader");
        chap9.add("Evenement Voler");
        histoire.add(chap9);


        ArrayList<String> chap9_Nourrir=new ArrayList<>();
        chap9_Nourrir.add("Evenement Nourrir");
        chap9_Nourrir.add("Chapitre 10");
        histoire.add(chap9_Nourrir);

        ArrayList<String> chap9_Balader=new ArrayList<>();
        chap9_Balader.add("Evenement Balader");
        chap9_Balader.add("Evenement Ne Rien Faire");
        chap9_Balader.add("Evenement La Vieille");
        chap9_Balader.add("Evenement se Fait voller");
        chap9_Balader.add("Evenement Trouve Or");
        histoire.add(chap9_Balader);

        ArrayList<String> chap9_RienFaire=new ArrayList<>();
        chap9_RienFaire.add("Evenement Ne Rien Faire");
        chap9_RienFaire.add("Chapitre 10");
        histoire.add(chap9_RienFaire);

        ArrayList<String> chap9_Vieille=new ArrayList<>();
        chap9_Vieille.add("Evenement La Vieille");
        chap9_Vieille.add("Chapitre 10");
        histoire.add(chap9_Vieille);

        ArrayList<String> chap9_FaitVoler=new ArrayList<>();
        chap9_FaitVoler.add("Evenement se Fait voller");
        chap9_FaitVoler.add("Chapitre 10");
        histoire.add(chap9_FaitVoler);

        ArrayList<String> chap9_TrouveOr=new ArrayList<>();
        chap9_TrouveOr.add("Evenement Trouve Or");
        chap9_TrouveOr.add("Chapitre 10");
        histoire.add(chap9_TrouveOr);

        ArrayList<String> chap9_Voler=new ArrayList<>();
        chap9_Voler.add("Evenement Voler");
        chap9_Voler.add("Evenement Voler Echec");
        histoire.add(chap9_Voler);

        ArrayList<String> chap9_VolerEchec=new ArrayList<>();
        chap9_VolerEchec.add("Evenement Voler Echec");
        chap9_VolerEchec.add("Chapitre 10");
        histoire.add(chap9_VolerEchec);

        ArrayList<String> chap10=new ArrayList<>();
        chap10.add("Chapitre 10");
        chap10.add("Chapitre 11 C1");
        chap10.add("Chapitre 11 C2");
        chap10.add("Chapitre 11 C3");
        histoire.add(chap10);

        ArrayList<String> chap11_C1=new ArrayList<>();
        chap11_C1.add("Chapitre 11 C1");
        chap11_C1.add("Evenement Baie");
        chap11_C1.add("Evenement Champignons");
        histoire.add(chap11_C1);

        ArrayList<String> chap11_C2=new ArrayList<>();
        chap11_C2.add("Chapitre 11 C2");
        chap11_C2.add("Evenement Baie");
        chap11_C2.add("Evenement Champignons");
        histoire.add(chap11_C2);

        ArrayList<String> chap11_C3=new ArrayList<>();
        chap11_C3.add("Chapitre 11 C3");
        chap11_C3.add("Evenement Baie");
        chap11_C3.add("Evenement Champignons");
        histoire.add(chap11_C3);

        ArrayList<String> chap11_Baie=new ArrayList<>();
        chap11_Baie.add("Evenement Baie");
        chap11_Baie.add("Chapitre 12");
        histoire.add(chap11_Baie);

        ArrayList<String> chap11_Champignons=new ArrayList<>();
        chap11_Champignons.add("Evenement Champignons");
        chap11_Champignons.add("Chapitre 12");
        histoire.add(chap11_Champignons);

        ArrayList<String> chap12=new ArrayList<>();
        chap12.add("Chapitre 12");
        chap12.add("Evenement Bruit");
        chap12.add("Evenement Magie");
        chap12.add("Evenement Errer Foret0");
        histoire.add(chap12);

        ArrayList<String> chap12_Bruit=new ArrayList<>();
        chap12_Bruit.add("Evenement Bruit");
        chap12_Bruit.add("Evenement Bruit Ours");
        chap12_Bruit.add("Evenement Bruit Sauve");
        histoire.add(chap12_Bruit);

        ArrayList<String> chap12_BruitOurs=new ArrayList<>();
        chap12_BruitOurs.add("Evenement Bruit Ours");
        chap12_BruitOurs.add("Chapitre 13");
        histoire.add(chap12_BruitOurs);

        ArrayList<String> chap12_BruitSauve=new ArrayList<>();
        chap12_BruitSauve.add("Evenement Bruit Sauve");
        chap12_BruitSauve.add("Chapitre 13");
        histoire.add(chap12_BruitSauve);

        ArrayList<String> chap12_Magie=new ArrayList<>();
        chap12_Magie.add("Evenement Magie");
        chap12_Magie.add("Chapitre 13");
        histoire.add(chap12_Magie);

        ArrayList<String> chap12_Foret0=new ArrayList<>();
        chap12_Foret0.add("Evenement Errer Foret0");
        chap12_Foret0.add("Chapitre 13");
        chap12_Foret0.add("Evenement Errer Foret");
        histoire.add(chap12_Foret0);

        ArrayList<String> chap12_Foret=new ArrayList<>();
        chap12_Foret.add("Evenement Errer Foret");
        histoire.add(chap12_Foret);


        ArrayList<String> chap13=new ArrayList<>();
        chap13.add("Chapitre 13");
        chap13.add("Chapitre 14");
        histoire.add(chap13);

        ArrayList<String> chap14=new ArrayList<>();
        chap14.add("Chapitre 14");
        chap14.add("Evenement Demande Info Gentil 0");
        chap14.add("Evenement Demande Info Or");
        chap14.add("Evenement Demande Info Menace 0");
        histoire.add(chap14);

        ArrayList<String> chap14_InfoGentil0=new ArrayList<>();
        chap14_InfoGentil0.add("Evenement Demande Info Gentil 0");
        chap14_InfoGentil0.add("Evenement Demande Info Gentil");
        chap14_InfoGentil0.add("Evenement Demande Info Gentil 2");
        histoire.add(chap14_InfoGentil0);

        ArrayList<String> chap14_InfoGentil=new ArrayList<>();
        chap14_InfoGentil.add("Evenement Demande Info Gentil");
        chap14_InfoGentil.add("Chapitre 15 Informations");
        histoire.add(chap14_InfoGentil);

        ArrayList<String> chap14_InfoGentil2=new ArrayList<>();
        chap14_InfoGentil2.add("Evenement Demande Info Gentil 2");
        chap14_InfoGentil2.add("Chapitre 15 Pas Informations");
        histoire.add(chap14_InfoGentil2);

        ArrayList<String> chap14_InfoOr=new ArrayList<>();
        chap14_InfoOr.add("Evenement Demande Info Or");
        chap14_InfoOr.add("Chapitre 15 Informations");
        histoire.add(chap14_InfoOr);

        ArrayList<String> chap14_InfoMenace0=new ArrayList<>();
        chap14_InfoMenace0.add("Evenement Demande Info Menace 0");
        chap14_InfoMenace0.add("Evenement Demande Info Menace 1");
        chap14_InfoMenace0.add("Evenement Demande Info Menace 2");
        histoire.add(chap14_InfoMenace0);

        ArrayList<String> chap14_InfoMenace1=new ArrayList<>();
        chap14_InfoMenace1.add("Evenement Demande Info Menace 1");
        chap14_InfoMenace1.add("Chapitre 15 Informations");
        histoire.add(chap14_InfoMenace1);

        ArrayList<String> chap14_InfoMenace2=new ArrayList<>();
        chap14_InfoMenace2.add("Evenement Demande Info Menace 2");
        chap14_InfoMenace2.add("Chapitre 15 Pas Informations");
        histoire.add(chap14_InfoMenace2);

        ArrayList<String> chap15_Info=new ArrayList<>();
        chap15_Info.add("Chapitre 15 Informations");
        chap15_Info.add("Chapitre 16");
        histoire.add(chap15_Info);

        ArrayList<String> chap15_PasInfo=new ArrayList<>();
        chap15_PasInfo.add("Chapitre 15 Pas Informations");
        chap15_PasInfo.add("Evenement Pas Informations Magie");
        chap15_PasInfo.add("Evenement Pas Informations Forcer");
        histoire.add(chap15_PasInfo);

        ArrayList<String> chap15_PasInfoMagie=new ArrayList<>();
        chap15_PasInfoMagie.add("Evenement Pas Informations Magie");
        chap15_PasInfoMagie.add("Chapitre 16");
        histoire.add(chap15_PasInfoMagie);

        ArrayList<String> chap15_PasInfoForcer=new ArrayList<>();
        chap15_PasInfoForcer.add("Evenement Pas Informations Forcer");
        chap15_PasInfoForcer.add("Chapitre 16");
        histoire.add(chap15_PasInfoForcer);

        ArrayList<String> chap16=new ArrayList<>();
        chap16.add("Chapitre 16");
        histoire.add(chap16);

        return histoire;
    }

    private ArrayList<ArrayList<String>> getHistoireVoleur(){
        final ArrayList<ArrayList<String>> histoire = new ArrayList<>();
        ArrayList<String> chap1=new ArrayList<>();
        chap1.add("Chapitre 1");
        chap1.add("Chapitre 2");
        histoire.add(chap1);

        ArrayList<String> chap2=new ArrayList<>();
        chap2.add("Chapitre 2");
        chap2.add("Chapitre 3");
        histoire.add(chap2);

        ArrayList<String> chap3=new ArrayList<>();
        chap3.add("Chapitre 3");
        chap3.add("Chapitre 4");
        histoire.add(chap3);

        ArrayList<String> chap4=new ArrayList<>();
        chap4.add("Chapitre 4");
        chap4.add("Chapitre 5 Voleur");
        histoire.add(chap4);

        ArrayList<String> chap5=new ArrayList<>();
        chap5.add("Chapitre 5 Voleur");
        chap5.add("Chapitre 6");
        histoire.add(chap5);

        ArrayList<String> chap6=new ArrayList<>();
        chap6.add("Chapitre 6");
        chap6.add("Evenement Cocher");
        chap6.add("Evenement Marcher");
        histoire.add(chap6);

        ArrayList<String> chap6_Cocher=new ArrayList<>();
        chap6_Cocher.add("Evenement Cocher");
        chap6_Cocher.add("Chapitre 8");
        histoire.add(chap6_Cocher);

        ArrayList<String> chap6_Marcher=new ArrayList<>();
        chap6_Marcher.add("Evenement Marcher");
        chap6_Marcher.add("Chapitre 7 intermédiaire Foret1");
        histoire.add(chap6_Marcher);

        ArrayList<String> chap7=new ArrayList<>();
        chap7.add("Chapitre 7 intermédiaire Foret1");
        chap7.add("Chapitre 7 intermédiaire Foret2a Voleur");
        chap7.add("Chapitre 7 intermédiaire Foret2b Voleur");
        histoire.add(chap7);

        ArrayList<String> chap7_Foret2a=new ArrayList<>();
        chap7_Foret2a.add("Chapitre 7 intermédiaire Foret2a Voleur");
        chap7_Foret2a.add("Chapitre 8");
        histoire.add(chap7_Foret2a);

        ArrayList<String> chap7_Foret2b=new ArrayList<>();
        chap7_Foret2b.add("Chapitre 7 intermédiaire Foret2b Voleur");
        chap7_Foret2b.add("Chapitre 8");
        histoire.add(chap7_Foret2b);

        ArrayList<String> chap8=new ArrayList<>();
        chap8.add("Chapitre 8");
        chap8.add("Evenement Payer");
        chap8.add("Evenement Fuite");
        chap8.add("Evenement Mur");
        histoire.add(chap8);


        ArrayList<String> chap8_Payer=new ArrayList<>();
        chap8_Payer.add("Evenement Payer");
        chap8_Payer.add("Chapitre 9");
        histoire.add(chap8_Payer);

        ArrayList<String> chap8_Fuite=new ArrayList<>();
        chap8_Fuite.add("Evenement Fuite");
        chap8_Fuite.add("Chapitre 9");
        histoire.add(chap8_Fuite);

        ArrayList<String> chap8_Mur=new ArrayList<>();
        chap8_Mur.add("Evenement Mur");
        chap8_Mur.add("Evenement Mur Reussite");
        histoire.add(chap8_Mur);

        ArrayList<String> chap8_MurReussite=new ArrayList<>();
        chap8_MurReussite.add("Evenement Mur Reussite");
        chap8_MurReussite.add("Chapitre 9");
        histoire.add(chap8_MurReussite);

        ArrayList<String> chap9=new ArrayList<>();
        chap9.add("Chapitre 9");
        chap9.add("Evenement Nourrir");
        chap9.add("Evenement Balader");
        chap9.add("Evenement Voler");
        histoire.add(chap9);


        ArrayList<String> chap9_Nourrir=new ArrayList<>();
        chap9_Nourrir.add("Evenement Nourrir");
        chap9_Nourrir.add("Chapitre 10");
        histoire.add(chap9_Nourrir);

        ArrayList<String> chap9_Balader=new ArrayList<>();
        chap9_Balader.add("Evenement Balader");
        chap9_Balader.add("Evenement Ne Rien Faire");
        chap9_Balader.add("Evenement La Vieille");
        chap9_Balader.add("Evenement se Fait voller");
        chap9_Balader.add("Evenement Trouve Or");
        histoire.add(chap9_Balader);

        ArrayList<String> chap9_RienFaire=new ArrayList<>();
        chap9_RienFaire.add("Evenement Ne Rien Faire");
        chap9_RienFaire.add("Chapitre 10");
        histoire.add(chap9_RienFaire);

        ArrayList<String> chap9_Vieille=new ArrayList<>();
        chap9_Vieille.add("Evenement La Vieille");
        chap9_Vieille.add("Chapitre 10");
        histoire.add(chap9_Vieille);

        ArrayList<String> chap9_FaitVoler=new ArrayList<>();
        chap9_FaitVoler.add("Evenement se Fait voller");
        chap9_FaitVoler.add("Chapitre 10");
        histoire.add(chap9_FaitVoler);

        ArrayList<String> chap9_TrouveOr=new ArrayList<>();
        chap9_TrouveOr.add("Evenement Trouve Or");
        chap9_TrouveOr.add("Chapitre 10");
        histoire.add(chap9_TrouveOr);

        ArrayList<String> chap9_Voler=new ArrayList<>();
        chap9_Voler.add("Evenement Voler");
        chap9_Voler.add("Evenement Voler Echec");
        histoire.add(chap9_Voler);

        ArrayList<String> chap9_VolerEchec=new ArrayList<>();
        chap9_VolerEchec.add("Evenement Voler Echec");
        chap9_VolerEchec.add("Chapitre 10");
        histoire.add(chap9_VolerEchec);

        ArrayList<String> chap10=new ArrayList<>();
        chap10.add("Chapitre 10");
        chap10.add("Chapitre 11 C1");
        chap10.add("Chapitre 11 C2");
        chap10.add("Chapitre 11 C3");
        histoire.add(chap10);

        ArrayList<String> chap11_C1=new ArrayList<>();
        chap11_C1.add("Chapitre 11 C1");
        chap11_C1.add("Evenement Baie");
        chap11_C1.add("Evenement Champignons");
        histoire.add(chap11_C1);

        ArrayList<String> chap11_C2=new ArrayList<>();
        chap11_C2.add("Chapitre 11 C2");
        chap11_C2.add("Evenement Baie");
        chap11_C2.add("Evenement Champignons");
        histoire.add(chap11_C2);

        ArrayList<String> chap11_C3=new ArrayList<>();
        chap11_C3.add("Chapitre 11 C3");
        chap11_C3.add("Evenement Baie");
        chap11_C3.add("Evenement Champignons");
        histoire.add(chap11_C3);

        ArrayList<String> chap11_Baie=new ArrayList<>();
        chap11_Baie.add("Evenement Baie");
        chap11_Baie.add("Chapitre 12");
        histoire.add(chap11_Baie);

        ArrayList<String> chap11_Champignons=new ArrayList<>();
        chap11_Champignons.add("Evenement Champignons");
        chap11_Champignons.add("Chapitre 12");
        histoire.add(chap11_Champignons);

        ArrayList<String> chap12=new ArrayList<>();
        chap12.add("Chapitre 12");
        chap12.add("Evenement Bruit");
        chap12.add("Evenement Errer Foret0");
        histoire.add(chap12);

        ArrayList<String> chap12_Bruit=new ArrayList<>();
        chap12_Bruit.add("Evenement Bruit");
        chap12_Bruit.add("Evenement Bruit Ours");
        chap12_Bruit.add("Evenement Bruit Sauve");
        histoire.add(chap12_Bruit);

        ArrayList<String> chap12_BruitOurs=new ArrayList<>();
        chap12_BruitOurs.add("Evenement Bruit Ours");
        chap12_BruitOurs.add("Chapitre 13");
        histoire.add(chap12_BruitOurs);

        ArrayList<String> chap12_BruitSauve=new ArrayList<>();
        chap12_BruitSauve.add("Evenement Bruit Sauve");
        chap12_BruitSauve.add("Chapitre 13");
        histoire.add(chap12_BruitSauve);

        ArrayList<String> chap12_Foret0=new ArrayList<>();
        chap12_Foret0.add("Evenement Errer Foret0");
        chap12_Foret0.add("Chapitre 13");
        chap12_Foret0.add("Evenement Errer Foret");
        histoire.add(chap12_Foret0);

        ArrayList<String> chap12_Foret=new ArrayList<>();
        chap12_Foret.add("Evenement Errer Foret");
        histoire.add(chap12_Foret);


        ArrayList<String> chap13=new ArrayList<>();
        chap13.add("Chapitre 13");
        chap13.add("Chapitre 14");
        histoire.add(chap13);

        ArrayList<String> chap14=new ArrayList<>();
        chap14.add("Chapitre 14");
        chap14.add("Evenement Demande Info Gentil 0");
        chap14.add("Evenement Demande Info Or");
        chap14.add("Evenement Demande Info Menace 0");
        histoire.add(chap14);

        ArrayList<String> chap14_InfoGentil0=new ArrayList<>();
        chap14_InfoGentil0.add("Evenement Demande Info Gentil 0");
        chap14_InfoGentil0.add("Evenement Demande Info Gentil");
        chap14_InfoGentil0.add("Evenement Demande Info Gentil 2");
        histoire.add(chap14_InfoGentil0);

        ArrayList<String> chap14_InfoGentil=new ArrayList<>();
        chap14_InfoGentil.add("Evenement Demande Info Gentil");
        chap14_InfoGentil.add("Chapitre 15 Informations");
        histoire.add(chap14_InfoGentil);

        ArrayList<String> chap14_InfoGentil2=new ArrayList<>();
        chap14_InfoGentil2.add("Evenement Demande Info Gentil 2");
        chap14_InfoGentil2.add("Chapitre 15 Pas Informations");
        histoire.add(chap14_InfoGentil2);

        ArrayList<String> chap14_InfoOr=new ArrayList<>();
        chap14_InfoOr.add("Evenement Demande Info Or");
        chap14_InfoOr.add("Chapitre 15 Informations");
        histoire.add(chap14_InfoOr);

        ArrayList<String> chap14_InfoMenace0=new ArrayList<>();
        chap14_InfoMenace0.add("Evenement Demande Info Menace 0");
        chap14_InfoMenace0.add("Evenement Demande Info Menace 1");
        chap14_InfoMenace0.add("Evenement Demande Info Menace 2");
        histoire.add(chap14_InfoMenace0);

        ArrayList<String> chap14_InfoMenace1=new ArrayList<>();
        chap14_InfoMenace1.add("Evenement Demande Info Menace 1");
        chap14_InfoMenace1.add("Chapitre 15 Informations");
        histoire.add(chap14_InfoMenace1);

        ArrayList<String> chap14_InfoMenace2=new ArrayList<>();
        chap14_InfoMenace2.add("Evenement Demande Info Menace 2");
        chap14_InfoMenace2.add("Chapitre 15 Pas Informations");
        histoire.add(chap14_InfoMenace2);

        ArrayList<String> chap15_Info=new ArrayList<>();
        chap15_Info.add("Chapitre 15 Informations");
        chap15_Info.add("Chapitre 16");
        histoire.add(chap15_Info);

        ArrayList<String> chap15_PasInfo=new ArrayList<>();
        chap15_PasInfo.add("Chapitre 15 Pas Informations");
        chap15_PasInfo.add("Evenement Pas Informations Forcer");
        histoire.add(chap15_PasInfo);

        ArrayList<String> chap15_PasInfoForcer=new ArrayList<>();
        chap15_PasInfoForcer.add("Evenement Pas Informations Forcer");
        chap15_PasInfoForcer.add("Chapitre 16");
        histoire.add(chap15_PasInfoForcer);

        ArrayList<String> chap16=new ArrayList<>();
        chap16.add("Chapitre 16");
        histoire.add(chap16);

        return histoire;
    }

    private ArrayList<ArrayList<String>> getHistoireSoldat(){
        final ArrayList<ArrayList<String>> histoire = new ArrayList<>();
        ArrayList<String> chap1=new ArrayList<>();
        chap1.add("Chapitre 1");
        chap1.add("Chapitre 2");
        histoire.add(chap1);

        ArrayList<String> chap2=new ArrayList<>();
        chap2.add("Chapitre 2");
        chap2.add("Chapitre 3");
        histoire.add(chap2);

        ArrayList<String> chap3=new ArrayList<>();
        chap3.add("Chapitre 3");
        chap3.add("Chapitre 4");
        histoire.add(chap3);

        ArrayList<String> chap4=new ArrayList<>();
        chap4.add("Chapitre 4");
        chap4.add("Chapitre 5 Soldat");
        histoire.add(chap4);

        ArrayList<String> chap5=new ArrayList<>();
        chap5.add("Chapitre 5 Soldat");
        chap5.add("Chapitre 6");
        histoire.add(chap5);

        ArrayList<String> chap6=new ArrayList<>();
        chap6.add("Chapitre 6");
        chap6.add("Evenement Cocher");
        chap6.add("Evenement Marcher");
        histoire.add(chap6);

        ArrayList<String> chap6_Cocher=new ArrayList<>();
        chap6_Cocher.add("Evenement Cocher");
        chap6_Cocher.add("Chapitre 8");
        histoire.add(chap6_Cocher);

        ArrayList<String> chap6_Marcher=new ArrayList<>();
        chap6_Marcher.add("Evenement Marcher");
        chap6_Marcher.add("Chapitre 7 intermédiaire Foret1");
        histoire.add(chap6_Marcher);

        ArrayList<String> chap7=new ArrayList<>();
        chap7.add("Chapitre 7 intermédiaire Foret1");
        chap7.add("Chapitre 7 intermédiaire Foret2a Soldat");
        chap7.add("Chapitre 7 intermédiaire Foret2b Soldat");
        histoire.add(chap7);

        ArrayList<String> chap7_Foret2a=new ArrayList<>();
        chap7_Foret2a.add("Chapitre 7 intermédiaire Foret2a Soldat");
        chap7_Foret2a.add("Chapitre 8");
        histoire.add(chap7_Foret2a);

        ArrayList<String> chap7_Foret2b=new ArrayList<>();
        chap7_Foret2b.add("Chapitre 7 intermédiaire Foret2b Soldat");
        chap7_Foret2b.add("Chapitre 8");
        histoire.add(chap7_Foret2b);

        ArrayList<String> chap8=new ArrayList<>();
        chap8.add("Chapitre 8");
        chap8.add("Evenement Payer");
        chap8.add("Evenement Fuite");
        chap8.add("Evenement Mur");
        histoire.add(chap8);


        ArrayList<String> chap8_Payer=new ArrayList<>();
        chap8_Payer.add("Evenement Payer");
        chap8_Payer.add("Chapitre 9");
        histoire.add(chap8_Payer);

        ArrayList<String> chap8_Fuite=new ArrayList<>();
        chap8_Fuite.add("Evenement Fuite");
        chap8_Fuite.add("Chapitre 9");
        histoire.add(chap8_Fuite);

        ArrayList<String> chap8_Mur=new ArrayList<>();
        chap8_Mur.add("Evenement Mur");
        chap8_Mur.add("Evenement Mur Reussite");
        histoire.add(chap8_Mur);

        ArrayList<String> chap8_MurReussite=new ArrayList<>();
        chap8_MurReussite.add("Evenement Mur Reussite");
        chap8_MurReussite.add("Chapitre 9");
        histoire.add(chap8_MurReussite);

        ArrayList<String> chap9=new ArrayList<>();
        chap9.add("Chapitre 9");
        chap9.add("Evenement Nourrir");
        chap9.add("Evenement Balader");
        chap9.add("Evenement Voler");
        histoire.add(chap9);


        ArrayList<String> chap9_Nourrir=new ArrayList<>();
        chap9_Nourrir.add("Evenement Nourrir");
        chap9_Nourrir.add("Chapitre 10");
        histoire.add(chap9_Nourrir);

        ArrayList<String> chap9_Balader=new ArrayList<>();
        chap9_Balader.add("Evenement Balader");
        chap9_Balader.add("Evenement Ne Rien Faire");
        chap9_Balader.add("Evenement La Vieille");
        chap9_Balader.add("Evenement se Fait voller");
        chap9_Balader.add("Evenement Trouve Or");
        histoire.add(chap9_Balader);

        ArrayList<String> chap9_RienFaire=new ArrayList<>();
        chap9_RienFaire.add("Evenement Ne Rien Faire");
        chap9_RienFaire.add("Chapitre 10");
        histoire.add(chap9_RienFaire);

        ArrayList<String> chap9_Vieille=new ArrayList<>();
        chap9_Vieille.add("Evenement La Vieille");
        chap9_Vieille.add("Chapitre 10");
        histoire.add(chap9_Vieille);

        ArrayList<String> chap9_FaitVoler=new ArrayList<>();
        chap9_FaitVoler.add("Evenement se Fait voller");
        chap9_FaitVoler.add("Chapitre 10");
        histoire.add(chap9_FaitVoler);

        ArrayList<String> chap9_TrouveOr=new ArrayList<>();
        chap9_TrouveOr.add("Evenement Trouve Or");
        chap9_TrouveOr.add("Chapitre 10");
        histoire.add(chap9_TrouveOr);

        ArrayList<String> chap9_Voler=new ArrayList<>();
        chap9_Voler.add("Evenement Voler");
        chap9_Voler.add("Evenement Voler Echec");
        histoire.add(chap9_Voler);

        ArrayList<String> chap9_VolerEchec=new ArrayList<>();
        chap9_VolerEchec.add("Evenement Voler Echec");
        chap9_VolerEchec.add("Chapitre 10");
        histoire.add(chap9_VolerEchec);

        ArrayList<String> chap10=new ArrayList<>();
        chap10.add("Chapitre 10");
        chap10.add("Chapitre 11 C1");
        chap10.add("Chapitre 11 C2");
        chap10.add("Chapitre 11 C3");
        histoire.add(chap10);

        ArrayList<String> chap11_C1=new ArrayList<>();
        chap11_C1.add("Chapitre 11 C1");
        chap11_C1.add("Evenement Baie");
        chap11_C1.add("Evenement Champignons");
        histoire.add(chap11_C1);

        ArrayList<String> chap11_C2=new ArrayList<>();
        chap11_C2.add("Chapitre 11 C2");
        chap11_C2.add("Evenement Baie");
        chap11_C2.add("Evenement Champignons");
        histoire.add(chap11_C2);

        ArrayList<String> chap11_C3=new ArrayList<>();
        chap11_C3.add("Chapitre 11 C3");
        chap11_C3.add("Evenement Baie");
        chap11_C3.add("Evenement Champignons");
        histoire.add(chap11_C3);

        ArrayList<String> chap11_Baie=new ArrayList<>();
        chap11_Baie.add("Evenement Baie");
        chap11_Baie.add("Chapitre 12");
        histoire.add(chap11_Baie);

        ArrayList<String> chap11_Champignons=new ArrayList<>();
        chap11_Champignons.add("Evenement Champignons");
        chap11_Champignons.add("Chapitre 12");
        histoire.add(chap11_Champignons);

        ArrayList<String> chap12=new ArrayList<>();
        chap12.add("Chapitre 12");
        chap12.add("Evenement Bruit");
        chap12.add("Evenement Errer Foret0");
        histoire.add(chap12);

        ArrayList<String> chap12_Bruit=new ArrayList<>();
        chap12_Bruit.add("Evenement Bruit");
        chap12_Bruit.add("Evenement Bruit Ours");
        chap12_Bruit.add("Evenement Bruit Sauve");
        histoire.add(chap12_Bruit);

        ArrayList<String> chap12_BruitOurs=new ArrayList<>();
        chap12_BruitOurs.add("Evenement Bruit Ours");
        chap12_BruitOurs.add("Chapitre 13");
        histoire.add(chap12_BruitOurs);

        ArrayList<String> chap12_BruitSauve=new ArrayList<>();
        chap12_BruitSauve.add("Evenement Bruit Sauve");
        chap12_BruitSauve.add("Chapitre 13");
        histoire.add(chap12_BruitSauve);

        ArrayList<String> chap12_Foret0=new ArrayList<>();
        chap12_Foret0.add("Evenement Errer Foret0");
        chap12_Foret0.add("Chapitre 13");
        chap12_Foret0.add("Evenement Errer Foret");
        histoire.add(chap12_Foret0);

        ArrayList<String> chap12_Foret=new ArrayList<>();
        chap12_Foret.add("Evenement Errer Foret");
        histoire.add(chap12_Foret);


        ArrayList<String> chap13=new ArrayList<>();
        chap13.add("Chapitre 13");
        chap13.add("Chapitre 14");
        histoire.add(chap13);

        ArrayList<String> chap14=new ArrayList<>();
        chap14.add("Chapitre 14");
        chap14.add("Evenement Demande Info Gentil 0");
        chap14.add("Evenement Demande Info Or");
        chap14.add("Evenement Demande Info Menace 0");
        histoire.add(chap14);

        ArrayList<String> chap14_InfoGentil0=new ArrayList<>();
        chap14_InfoGentil0.add("Evenement Demande Info Gentil 0");
        chap14_InfoGentil0.add("Evenement Demande Info Gentil");
        chap14_InfoGentil0.add("Evenement Demande Info Gentil 2");
        histoire.add(chap14_InfoGentil0);

        ArrayList<String> chap14_InfoGentil=new ArrayList<>();
        chap14_InfoGentil.add("Evenement Demande Info Gentil");
        chap14_InfoGentil.add("Chapitre 15 Informations");
        histoire.add(chap14_InfoGentil);

        ArrayList<String> chap14_InfoGentil2=new ArrayList<>();
        chap14_InfoGentil2.add("Evenement Demande Info Gentil 2");
        chap14_InfoGentil2.add("Chapitre 15 Pas Informations");
        histoire.add(chap14_InfoGentil2);

        ArrayList<String> chap14_InfoOr=new ArrayList<>();
        chap14_InfoOr.add("Evenement Demande Info Or");
        chap14_InfoOr.add("Chapitre 15 Informations");
        histoire.add(chap14_InfoOr);

        ArrayList<String> chap14_InfoMenace0=new ArrayList<>();
        chap14_InfoMenace0.add("Evenement Demande Info Menace 0");
        chap14_InfoMenace0.add("Evenement Demande Info Menace 1");
        chap14_InfoMenace0.add("Evenement Demande Info Menace 2");
        histoire.add(chap14_InfoMenace0);

        ArrayList<String> chap14_InfoMenace1=new ArrayList<>();
        chap14_InfoMenace1.add("Evenement Demande Info Menace 1");
        chap14_InfoMenace1.add("Chapitre 15 Informations");
        histoire.add(chap14_InfoMenace1);

        ArrayList<String> chap14_InfoMenace2=new ArrayList<>();
        chap14_InfoMenace2.add("Evenement Demande Info Menace 2");
        chap14_InfoMenace2.add("Chapitre 15 Pas Informations");
        histoire.add(chap14_InfoMenace2);

        ArrayList<String> chap15_Info=new ArrayList<>();
        chap15_Info.add("Chapitre 15 Informations");
        chap15_Info.add("Chapitre 16");
        histoire.add(chap15_Info);

        ArrayList<String> chap15_PasInfo=new ArrayList<>();
        chap15_PasInfo.add("Chapitre 15 Pas Informations");
        chap15_PasInfo.add("Evenement Pas Informations Forcer");
        histoire.add(chap15_PasInfo);

        ArrayList<String> chap15_PasInfoForcer=new ArrayList<>();
        chap15_PasInfoForcer.add("Evenement Pas Informations Forcer");
        chap15_PasInfoForcer.add("Chapitre 16");
        histoire.add(chap15_PasInfoForcer);

        ArrayList<String> chap16=new ArrayList<>();
        chap16.add("Chapitre 16");
        histoire.add(chap16);

        return histoire;
    }
}
