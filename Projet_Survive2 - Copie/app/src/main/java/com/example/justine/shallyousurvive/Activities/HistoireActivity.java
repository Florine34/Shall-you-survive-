package com.example.justine.shallyousurvive.Activities;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.justine.shallyousurvive.MainActivity;
import com.example.justine.shallyousurvive.R;
import com.example.justine.shallyousurvive.Class.*;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Lupusanghren on 02/04/2018.
 */

public class HistoireActivity extends AppCompatActivity {

    public Personnage perso;

    public Chapitre chapitre;

    public int index;

    public ArrayList<String> partie;

    public ArrayList<ArrayList<String>> histoirelist;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        perso = (Personnage) getIntent().getParcelableExtra(ChoixPersoActivity.PERSONNAGE_CLASS);
        //chapitre = (Chapitre) getIntent().getParcelableExtra(ChoixPersoActivity.CHAPITRE_CLASS);
        index = getIntent().getIntExtra(ChoixPersoActivity.INDEX_CLASS,0);
        histoirelist = ((ArrayList<ArrayList<String>>)getIntent().getSerializableExtra(ChoixPersoActivity.CHAPITRE_CLASS));

        /*for (int i=0;i<index;i++){
            histoire.remove(i);
        }*/
        //index=0;
        partie= histoirelist.get(index);
        Log.i("DICJ","Partie : "+partie);
        if(partie.size()==0) {
            Log.i("DICJ", "On rentre dans finish");
            Toast.makeText(this, "BRAVO ! Vous avez survécu ! Retour au menu principal",
                    Toast.LENGTH_LONG).show();
            finish();
        }else {
            chapitre = (Chapitre) Histoire.getChapitreById(partie.get(0));
            //Chapitre chance = chapitre.radndomChapitre(partie);
            Log.i("DICJ", chapitre.nom);
            int or = 0;
            if (chapitre.deltaGold < 0) {
                or = perso.looseGold(-chapitre.deltaGold);
            } else {
                or = perso.gainGold(chapitre.deltaGold);
            }
            int hp = 0;
            if (chapitre.deltaHp < 0) {
                hp = perso.takeDamage(-chapitre.deltaHp);
            } else {
                hp = perso.heal(chapitre.deltaHp);
            }

            if (hp <= 0) {
                //le perso est mort
                Toast.makeText(this, "Vous n'avez plus de points de vie ! DEFAITE ! Retour au menu principal",
                        Toast.LENGTH_LONG).show();
                finish();

            }
            if (or < 0) {
                Toast.makeText(this, "Vous n'avez plus d'or ! DEFAITE ! Retour au menu principal",
                        Toast.LENGTH_LONG).show();
                finish();
            }

            Log.i("DICJ", "Taille de Choix : " + partie.size());

            //        if (chapitre.Choix.size()==1){
            //            setContentView(R.layout.evenement);
            //        }else if(chapitre.Choix.size()==0){
            //            Log.i("DICJ","On rentre dans finish");
            //            finish();
            //        }else{
            //            setContentView(R.layout.histoire);
            //        }

            if (partie.size() <= 2) {
                setContentView(R.layout.evenement);
            /*} else if (partie.size() == 1) {
                Log.i("DICJ", "On rentre dans finish");
                finish();*/
            } else {
                setContentView(R.layout.histoire);
            }

            //if (partie.size()!=1) {
                /*((TextView) findViewById(R.id.StatForce)).setText("" + perso.force);
                ((TextView) findViewById(R.id.StatAgilite)).setText("" + perso.agilite);
                ((TextView) findViewById(R.id.StatMagie)).setText("" + perso.magie);*/
                ((TextView) findViewById(R.id.StatOr)).setText("" + or);
                ((TextView) findViewById(R.id.StatHp)).setText("" + hp);
                if (partie.size() != 0) {
                    // remplissage via ID
                    TextView histoire = findViewById(R.id.textHistoire);
                    histoire.setText(chapitre.histoire);

                    ImageView img = findViewById(R.id.imgHistoire);
                    img.setImageResource(chapitre.refImage);

                    String randomChap = chapitre.RandomChapitre(partie);
                    if (randomChap != null) {
                        Intent intent = new Intent(this, HistoireActivity.class);
                        intent.putExtra(ChoixPersoActivity.PERSONNAGE_CLASS, perso);
                        intent.putExtra(ChoixPersoActivity.INDEX_CLASS, findIndexByFirstElement(randomChap));
                        intent.putExtra(ChoixPersoActivity.CHAPITRE_CLASS, histoirelist);
                        startActivity(intent);
                        finish();
                    } else {
                        if (partie.size() == 2) {
                            //evenement
                            Chapitre chapSuivant = Histoire.getChapitreById(partie.get(1));
                            ((RadioButton) findViewById(R.id.radioButtonEvenement)).setText(chapSuivant.previsualitation);
                        } else if (partie.size() == 1) {
                                //evenement
                                if(chapitre.nom.equals("Chapitre 16")){
                                    ((RadioButton) findViewById(R.id.radioButtonEvenement)).setText("VICTOIRE !");
                                }else {
                                    ((RadioButton) findViewById(R.id.radioButtonEvenement)).setText("DEFAITE !");
                                }

                        }
                        else {
                            //histoire
                                RadioGroup radioGroup = findViewById(R.id.radioGroupHistoire);
                                if (partie.size() == 4) {
                                    int j = 0;
                                    for (int i = 0; i < radioGroup.getChildCount(); i += 2) {
                                        int text = Histoire.getChapitreById(partie.get(j+1)).previsualitation;
                                        Log.i("DICJ","SetText : "+text);
                                        Log.i("DICJ","j : "+j);
                                        ((TextView) radioGroup.getChildAt(i)).setText(text);
                                        j++;
                                    }
                                } else if (partie.size() == 3) {
                                    int j = 0;
                                    Log.i("DICJ","Valeur de partie 2 : "+Histoire.getChapitreById(partie.get(2)).nom);
                                    for (int i = 0; i < radioGroup.getChildCount() - 2; i += 2) {
                                        int text = Histoire.getChapitreById(partie.get(j+1)).previsualitation;
                                        Log.i("DICJ","SetText : "+text);
                                        Log.i("DICJ","j : "+j);
                                        ((TextView) radioGroup.getChildAt(i)).setText(text);
                                        j++;
                                    }
                                    radioGroup.removeViews(4, 1);
                                } else {
                                    radioGroup.removeViews(1, radioGroup.getChildCount());
                                    ((TextView) radioGroup.getChildAt(0)).setText(chapitre.Choix.get(0).previsualitation);
                                }
                            }
                    }
                    //Button button = (Button) findViewById(R.id.validerChoix);
                    findViewById(R.id.validerChoix).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (partie.size() == 2) {
                                nextEvenement();
                            }else if(partie.size()==1){
                                /*Toast.makeText(MainActivity.class, "BRAVO ! Vous avez survécu ! Retour au menu principal",
                                        Toast.LENGTH_LONG).show();*/
                                finish();
                            }

                            else {
                                nextChapitre();
                            }
                        }
                    });
                    //OnClick du button
                }
            //}
        }
    }

    public void nextChapitre(){
        RadioGroup radioGroup = findViewById(R.id.radioGroupHistoire);
        Intent intent = new Intent(this,HistoireActivity.class);
        intent.putExtra(ChoixPersoActivity.PERSONNAGE_CLASS,perso);
        intent.putExtra(ChoixPersoActivity.CHAPITRE_CLASS,histoirelist);
        Log.i("DICJ","idRadioButton : "+radioGroup.getCheckedRadioButtonId());
        switch (radioGroup.getCheckedRadioButtonId()){
            case R.id.choix1Histoire:
                //Choix 1
                //intent.putExtra(ChoixPersoActivity.CHAPITRE_CLASS,chapitre.Choix.get(0));
                int index =findIndexByFirstElement(partie.get(1));
                intent.putExtra(ChoixPersoActivity.INDEX_CLASS,index);
                break;

            case R.id.choix2Histoire:
                //choix2
                //intent.putExtra(ChoixPersoActivity.CHAPITRE_CLASS,chapitre.Choix.get(1));
                intent.putExtra(ChoixPersoActivity.INDEX_CLASS,findIndexByFirstElement(partie.get(2)));
                break;

            case R.id.choix3Histoire:
                //choix3
                //intent.putExtra(ChoixPersoActivity.CHAPITRE_CLASS,chapitre.Choix.get(2));
                intent.putExtra(ChoixPersoActivity.INDEX_CLASS,findIndexByFirstElement(partie.get(3)));
                break;


            default:
                intent.putExtra(ChoixPersoActivity.CHAPITRE_CLASS,chapitre.Choix.get(0));
                break;
        }

        startActivity(intent);
        finish();
    };

    public void nextEvenement(){
        Log.i("DICJ","NextEvenement");
        Intent intent = new Intent(this,HistoireActivity.class);
        intent.putExtra(ChoixPersoActivity.PERSONNAGE_CLASS,perso);
        //intent.putExtra(ChoixPersoActivity.CHAPITRE_CLASS,chapitre.Choix.get(0));
        intent.putExtra(ChoixPersoActivity.CHAPITRE_CLASS,histoirelist);
        intent.putExtra(ChoixPersoActivity.INDEX_CLASS,findIndexByFirstElement(partie.get(1)));

        startActivity(intent);
        finish();
    }

    private int findIndexByFirstElement(String element){
        //int ind =index;
        int ind=index;
        while (ind<histoirelist.size()){
            if(histoirelist.get(ind).get(0).equals(element)){
                Log.i("DICJ","Found Index : "+ind);
                break;
            }
            ind++;

        }
        Log.i("DICJ","Index fin boucle: "+ind);
        Log.i("DICJ","Entre de find : "+element);
        Log.i("DICJ","Sortie de find : "+histoirelist.get(ind).get(0));
        /*if (ind==index){
            String tmp = histoire.get(index).get(0);
            histoire.remove(index);
            ArrayList<String> listTmp= new ArrayList<String>();
            histoire.add(listTmp);
        }*/
        return ind;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_goBack:
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
}
