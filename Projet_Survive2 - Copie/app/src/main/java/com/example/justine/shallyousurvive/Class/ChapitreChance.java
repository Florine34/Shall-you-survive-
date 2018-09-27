package com.example.justine.shallyousurvive.Class;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by guill on 14/04/2018.
 */

public class ChapitreChance extends Chapitre {

    public int[] listPourCent;

    public ChapitreChance(String n, int h, int p, int img, int[] listPourCent_){
        super(n,h,p,img);
        listPourCent = listPourCent_;
    }

    public String RandomChapitre(ArrayList<String> listId){
        Random r = new Random();
        int result = r.nextInt(100);
        for(int i = 1; i<listId.size(); i++){
            if (result < listPourCent[i-1]){
                return listId.get(i);
            }
        }
        return null;
    }
}
