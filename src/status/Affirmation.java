package status;

public class Affirmation {
    private final String texte;
    private final Boolean valeur; // vrai, faux, ou null pour indécis

    public Affirmation(String texte, Boolean valeur) {
        this.texte = texte;
        this.valeur = valeur;
    }

    public Boolean évaluer() {
        return this.valeur;
    }

    public String getTexte() {
        return texte;
    }

    public Boolean getValeur() {
        return valeur;
    }

}
