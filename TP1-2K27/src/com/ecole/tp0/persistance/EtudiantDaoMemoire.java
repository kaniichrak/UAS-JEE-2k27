package src.com.ecole.tp0.persistance;



import src.com.ecole.tp0.metier.Etudiant;

import java.util.ArrayList;
import java.util.List;

public class EtudiantDaoMemoire implements EtudiantDao {
    private List <Etudiant> etudiants = new ArrayList<>();

    @Override
    public void ajouter(Etudiant e) {
    etudiants.add(e);
    }

    @Override
    public List<Etudiant> lister() {
        return etudiants;
    }
}
