package com.example.justine.shallyousurvive.Class;

/**
 * Created by Lupusanghren on 19/04/2018.
 */

import com.example.justine.shallyousurvive.Class.Chapitre;
import com.example.justine.shallyousurvive.R;

import java.util.ArrayList;

public class Histoire {

    public static Chapitre getChapitreById(String id) {
        switch (id) {
            case "Chapitre 1":
                return new Chapitre("Chapitre 1", (R.string.TvillePaisible_1), 0, R.drawable.ville_paisible_1);
            case "Chapitre 2":
                return new Chapitre("Chapitre 2", (R.string.TartefactBleu_2), (R.string.continuer), R.drawable.artefact_2);
            case "Chapitre 3":
                return new Chapitre("Chapitre 3", (R.string.Tmalediction_3), (R.string.continuer), R.drawable.malediction_3);
            case "Chapitre 4":
                return new Chapitre("Chapitre 4", (R.string.TporteOuverte_4), (R.string.continuer), R.drawable.open_door_4);
            case "Chapitre 5 Mage":
                return new Chapitre("Chapitre 5 Mage", (R.string.Tartefact_5M), (R.string.continuer), R.drawable.livre_5m);
            case "Chapitre 5 Voleur":
                return new Chapitre("Chapitre 5 Voleur", (R.string.Tartefact_5V), (R.string.continuer), R.drawable.livre_5m);
            case "Chapitre 5 Soldat":
                return new Chapitre("Chapitre 5 Soldat", (R.string.Tartefact_5S), (R.string.continuer), R.drawable.livre_5m);
            case "Chapitre 6":
                return new Chapitre("Chapitre 6", (R.string.TporteVille_6), (R.string.continuer), R.drawable.porte_de_la_ville_6);
            case "Evenement Cocher":
                Chapitre eventCocher = new Chapitre("Evenement Cocher", (R.string.Ev_C1cocher_6), (R.string.C1cocher_6), R.drawable.cocher_6c);
                eventCocher.setDeltaGold(-10);
                return eventCocher;
            case "Evenement Marcher":
                return new Chapitre("Evenement Marcher", (R.string.Ev_C2marcher_6), (R.string.C2marcher_6), R.drawable.marche_8);
            case "Chapitre 7 intermédiaire Foret1":
                return new Chapitre("Chapitre 7 intermédiaire Foret1", (R.string.Tforet_7), (R.string.continuer), R.drawable.route_nuit_7);
            case "Chapitre 7 intermédiaire Foret2a Mage":
                Chapitre chap7foretAM = new Chapitre("Chapitre 7 intermédiaire Foret2a Mage", (R.string.Ev_C1_sePresser_7M), (R.string.C1_sePresser_7), R.drawable.intermetidaire_foret1);
                chap7foretAM.setDeltaHp(-3);
                return chap7foretAM;
            case "Chapitre 7 intermédiaire Foret2a Voleur":
                Chapitre chap7foretAV = new Chapitre("Chapitre 7 intermédiaire Foret2a Voleur", (R.string.Ev_C1_sePresser_7V), (R.string.C1_sePresser_7), R.drawable.intermetidaire_foret1);
                chap7foretAV.setDeltaHp(-3);
                return chap7foretAV;
            case "Chapitre 7 intermédiaire Foret2a Soldat":
                return new Chapitre("Chapitre 7 intermédiaire Foret2a Soldat", (R.string.Ev_C1_sePresser_7S), (R.string.C1_sePresser_7), R.drawable.intermetidaire_foret1);
            case "Chapitre 7 intermédiaire Foret2b Mage":
                Chapitre chap7foretBM = new Chapitre("Chapitre 7 intermédiaire Foret2b Mage", (R.string.Ev_C2_camp_7M), (R.string.C2_camp_7), R.drawable.camp_9);
                chap7foretBM.setDeltaHp(-3);
                return chap7foretBM;
            case "Chapitre 7 intermédiaire Foret2b Voleur":
                return new Chapitre("Chapitre 7 intermédiaire Foret2b Voleur", (R.string.Ev_C2_camp_7V), (R.string.C2_camp_7), R.drawable.camp_9);
            case "Chapitre 7 intermédiaire Foret2b Soldat":
                Chapitre chap7foretBS = new Chapitre("Chapitre 7 intermédiaire Foret2b Soldat", (R.string.Ev_C2_camp_7S), (R.string.C2_camp_7), R.drawable.camp_9);
                chap7foretBS.setDeltaHp(-3);
                return chap7foretBS;
            case "Chapitre 8":
                return new Chapitre("Chapitre 8", (R.string.TvilleSuivante_8), (R.string.continuer), R.drawable.pied_de_la_ville_10);
            case "Evenement Payer":
                Chapitre eventPayer = new Chapitre("Evenement1", (R.string.Ev_C1_payerGarde_8), (R.string.C1_payerGarde_8), R.drawable.garde_10p);
                eventPayer.setDeltaGold(-15);
                return eventPayer;
            case "Evenement Fuite":
                return new Chapitre("Evenement Fuite", (R.string.Ev_C2_fuite_8), (R.string.C2_fuite_8), R.drawable.fuite_10c);
            case "Evenement Mur":
                return new Chapitre("Evenement Mur", (R.string.Ev_C3_mur_8), (R.string.C3_mur_8), R.drawable.mur_10f);
            case "Evenement Mur Reussite":
                return new Chapitre("Evenement Mur Reussite", (R.string.Ev_C3_mur_8Reussite), (R.string.continuer), R.drawable.reussite_mur_10f);
            case "Evenement Mur Echec":
                Chapitre eventMurEchec = new Chapitre("Evenement Mur Echec", (R.string.Ev_C3_mur_8Echec), (R.string.continuer), R.drawable.garde_10p);
                eventMurEchec.setDeltaHp(-3);
                return eventMurEchec;
            case "Chapitre 9":
                return new Chapitre("Chapitre 9", (R.string.Tville_9), (R.string.continuer), R.drawable.ville_11);
            case "Evenement Nourrir":
                Chapitre eventNourir = new Chapitre("Evenement Nourir", (R.string.Ev_C1_ville_9), (R.string.C1_ville_9), R.drawable.nouriture_11n);
                eventNourir.setDeltaGold(-20);
                eventNourir.setDeltaHp(3);
                return eventNourir;
            case "Evenement Balader":
                return new ChapitreChance("Evenement Balader", (R.string.Ev_C2_ville_9), (R.string.C2_ville_9), R.drawable.rien_vent_feuille_11b,new int[]{25,50,75,100});
            case "Evenement Ne Rien Faire":
                return new Chapitre("Evenement Ne Rien Faire", (R.string.Ev_neRienFaire_9_1), (R.string.C2_ville_9), R.drawable.rien_vent_feuille_11b);
            case "Evenement La Vieille":
                return new Chapitre("Evenement La Vielle", (R.string.Ev_vieille_9_2), (R.string.C2_ville_9), R.drawable.vielle_11b);
            case "Evenement se Fait voller":
                Chapitre eventSeFaitVoller = new Chapitre("Evenement se Fait voller", (R.string.Ev_bourseTrouee_9_3), (R.string.C2_ville_9), R.drawable.sac_troue);
                eventSeFaitVoller.setDeltaGold(-30);
                return eventSeFaitVoller;
            case "Evenement Trouve Or":
                Chapitre eventTrouveOr = new Chapitre("Evenement Trouve Or", (R.string.Ev_pieceOr_9_4), (R.string.C2_ville_9), R.drawable.or_piece_18b);
                eventTrouveOr.setDeltaGold(20);
                return eventTrouveOr;
            case "Evenement Voler":
                Chapitre eventVolerEchec = new Chapitre("Evenement Voler", (R.string.Ev_C3_voler_9), (R.string.C3_voler_9), R.drawable.volsac_11v);
                eventVolerEchec.setDeltaHp(-3);
                return eventVolerEchec;
            case "Evenement Voler Reussite1":
                Chapitre eventVolerReussite1 = new Chapitre("Evenement Voler Reussite1", (R.string.Ev_C3_voler_9Reussite1), (R.string.continuer), R.drawable.pain);
                eventVolerReussite1.setDeltaHp(3);
                return eventVolerReussite1;
            case "Evenement Voler Reussite2":
                Chapitre eventVolerReussite2 = new Chapitre("Evenement Voler Reussite2", (R.string.Ev_C3_voler_9Reussite2), (R.string.continuer), R.drawable.or_piece_18b);
                eventVolerReussite2.setDeltaGold(20);
                return eventVolerReussite2;
            case "Evenement Voler Echec":
                return new Chapitre("Evenement Voler Echec", (R.string.Ev_C3_voler_9Echec), (R.string.continuer), R.drawable.garde_10p);
            case "Chapitre 10":
                return new Chapitre("Chapitre 10", (R.string.Tbandit_10), (R.string.continuer), R.drawable.bandit_12);
            case "Chapitre 11 C1":
                Chapitre chap11PostOrBandit = new Chapitre("Chapitre 11 C1", (R.string.Tforet_11), (R.string.C1_bandit_10), R.drawable.foret_13);
                chap11PostOrBandit.setDeltaGold(-30);
                return chap11PostOrBandit;
            case "Chapitre 11 C2":
                Chapitre chap11PostCombatBandit = new Chapitre("Chapitre 11 C2", (R.string.Tforet_11), (R.string.C2_bandit_10), R.drawable.foret_13);
                chap11PostCombatBandit.setDeltaHp(-3);
                return chap11PostCombatBandit;
            case "Chapitre 11 C3":
                return new Chapitre("Chapitre 11 C3", (R.string.Tforet_11), (R.string.C3_bandit_10), R.drawable.foret_13);
            case "Evenement Baie":
                Chapitre eventBaie = new Chapitre("Baie", (R.string.Ev_C1_foret_11), (R.string.C1_foret_11), R.drawable.baie);
                eventBaie.setDeltaHp(-3);
                return eventBaie;
            case "Evenement Champignons":
                Chapitre eventChampi = new Chapitre("Champignons", (R.string.Ev_C2_foret_11), (R.string.C2_foret_11), R.drawable.champinion);
                eventChampi.setDeltaHp(3);
                return eventChampi;
            case "Chapitre 12":
                return new Chapitre("Chapitre 12", (R.string.TforetProfonde_12), (R.string.continuer), R.drawable.foretprofonde_14);
            case "Evenement Bruit":
                return new ChapitreChance("Evenement Bruit", (R.string.Ev_C1_foretProfonde_12_2), (R.string.C1_foretProfonde_12), R.drawable.foret_homme,new int[]{50,100});
            case "Evenement Bruit Ours":
                Chapitre eventBruitOurs = new Chapitre("Evenement Bruit Ours", (R.string.Ev_C1_foretProfonde_12_1), (R.string.C1_foretProfonde_12), R.drawable.foret_ours);
                eventBruitOurs.setDeltaHp(-3);
                return eventBruitOurs;
            case "Evenement Bruit Sauve":
                return new Chapitre("Evenement Bruit Sauve", (R.string.Ev_C1_foretProfonde_12_2), (R.string.C1_foretProfonde_12), R.drawable.foret_homme);
            case "Evenement Magie":
                return new Chapitre("Evenement Magie", (R.string.Ev_C2_foretProfonde_12), (R.string.C2_foretProfonde_12), R.drawable.foret_chemin_magie);
            case "Evenement Errer Foret0":
                return new ChapitreChance("Evenement Errer Foret0", (R.string.Ev_C3_foretProfonde_12), (R.string.C3_foretProfonde_12), R.drawable.mort,new int[]{75,100});
            case "Evenement Errer Foret":
                return new Chapitre("Evenement Errer Foret", (R.string.Ev_C3_foretProfonde_12), (R.string.C3_foretProfonde_12), R.drawable.mort);
            case "Chapitre 13":
                return new Chapitre("Chapitre 13", (R.string.TsortForet_13), (R.string.continuer), R.drawable.sortforet_15);
            case "Chapitre 14":
                return new Chapitre("Chapitre 14", (R.string.TarriveVillage_14), (R.string.continuer), R.drawable.village_16);
            case "Evenement Demande Info Gentil 0":
                return new ChapitreChance("Evenement Demande Info Gentil 0", (R.string.Ev_C1_arriveVillage_14_1), (R.string.C1_arriveVillage_14), R.drawable.villageois,  new int[]{25,100});
            case "Evenement Demande Info Gentil":
                return new Chapitre("Evenement Demande Info Gentil", (R.string.Ev_C1_arriveVillage_14_1), (R.string.C1_arriveVillage_14), R.drawable.villageois);
            case "Evenement Demande Info Gentil 2":
                return new Chapitre("Evenement Demande Info Gentil 2", (R.string.Ev_C1_arriveVillage_14_2), (R.string.C1_arriveVillage_14), R.drawable.villageois);
            case "Evenement Demande Info Or":
                Chapitre eventInfoOr = new Chapitre("Evenement Demande Info Or", (R.string.Ev_C2_arriveVillage_14), (R.string.C2_arriveVillage_14), R.drawable.villageois);
                eventInfoOr.setDeltaGold(-30);
                return eventInfoOr;
            case "Evenement Demande Info Menace 0":
                return new ChapitreChance("Evenement Demande Info Menace 0", (R.string.Ev_C3_arriveVillage_14_1), (R.string.C3_arriveVillage_14), R.drawable.villageois, new int[]{75,100});
            case "Evenement Demande Info Menace 1":
                return new Chapitre("Evenement Demande Info Menace 1", (R.string.Ev_C3_arriveVillage_14_1), (R.string.C3_arriveVillage_14), R.drawable.villageois);
            case "Evenement Demande Info Menace 2":
                return new Chapitre("Evenement Demande Info Menace 2", (R.string.Ev_C3_arriveVillage_14_2), (R.string.C3_arriveVillage_14), R.drawable.villageois);
            case "Chapitre 15 Informations":
                return new Chapitre("Chapitre 15 Informations", (R.string.Tgrotte_15Info), (R.string.continuer), R.drawable.cave_17);
            case "Chapitre 15 Pas Informations":
                return new Chapitre("Chapitre 15 Pas Informations", (R.string.Tgrotte_15PasInfo), (R.string.continuer), R.drawable.caveblocked_17b);
            case "Evenement Pas Informations Magie":
                return new Chapitre("Evenement Pas Informations Magie", (R.string.Ev_C1_grotte_15PasInfo), (R.string.C1_grotte_15PasInfo), R.drawable.cave_17);
            case "Evenement Pas Informations Forcer":
                Chapitre eventPasInfoForcer = new Chapitre("Evenement Pas Informations Forcer", (R.string.Ev_C2_grotte_15PasInfo), (R.string.C2_grotte_15PasInfo), R.drawable.cave_17);
                eventPasInfoForcer.setDeltaHp(-3);
                return eventPasInfoForcer;
            case "Chapitre 16":
                return new Chapitre("Chapitre 16", (R.string.TVictoire_16), (R.string.continuer), R.drawable.artefact_2);
            default:
                //Chapitre1
                return new Chapitre("Chapitre 1", (R.string.TvillePaisible_1), 0, R.drawable.ville_paisible_1);
        }
    }
}
