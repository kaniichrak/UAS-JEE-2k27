package com.ecole.tp0.presentation;

import com.ecole.tp0.metier.Etudiant;
import com.ecole.tp0.persistance.EtudiantDao;
import com.ecole.tp0.persistance.EtudiantDaoMemoire;

public class Main {
    public  static  void main (String[] args){
        Etudiant e1 = new Etudiant(1,"Abidi","Iheb");
        Etudiant e2 = new Etudiant(2,"Kani","Ichrak");
        Etudiant e3 = new Etudiant();


        e3.setId(3);
        e3.setNom("Gharbi");
        e3.setPrenom("Yasmine");


        e1.afficher();
        e2.afficher();
        e3.afficher();

        EtudiantDao dao = new EtudiantDaoMemoire();
        dao.ajouter(e1);
        dao.ajouter(e2);
        dao.ajouter(e3);

        System.out.println("Liste des etudiants");

        for (Etudiant e : dao.lister()) {
            e.afficher();
        }

        e2 = null;
        System.out.println("e2 vaut maintenant : " + e2);

    }
}
