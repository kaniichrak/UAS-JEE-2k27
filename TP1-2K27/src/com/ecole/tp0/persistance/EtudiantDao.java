package com.ecole.tp0.persistance;

import com.ecole.tp0.metier.Etudiant;

import java.util.List;

public interface EtudiantDao {
    void  ajouter (Etudiant e );
    List <Etudiant> lister ();
}
