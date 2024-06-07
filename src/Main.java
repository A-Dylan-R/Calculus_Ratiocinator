import calculateur.CalculeVerite;
import status.Affirmation;
import status.Mensonge;
import status.Verite;

public class Main {
    public static void main(String[] args) {
        Verite verite_1 = new Verite("Lou est beau");
        Mensonge mensonge_1 = new Mensonge("Lou est pauvre");
        Affirmation affirmation_1 = new Affirmation("Lou est généreux", null);

        CalculeVerite calculateur = new CalculeVerite();

        Affirmation résultat1 = calculateur.évaluerEt(mensonge_1, affirmation_1);
        Affirmation résultat2 = calculateur.évaluerDonc(verite_1, mensonge_1);
        Affirmation résultat3 = calculateur.évaluerDonc(mensonge_1, affirmation_1);
        Affirmation résultat4 = calculateur.évaluerDonc(calculateur.évaluerOu(verite_1, affirmation_1), mensonge_1);

        System.out.println(résultat1.getTexte() + " : " + (résultat1.getValeur() != null ? résultat1.getValeur() : "jenesaispas"));
        System.out.println(résultat2.getTexte() + " : " + (résultat2.getValeur() != null ? résultat2.getValeur() : "jenesaispas"));
        System.out.println(résultat3.getTexte() + " : " + (résultat3.getValeur() != null ? résultat3.getValeur() : "jenesaispas"));
        System.out.println(résultat4.getTexte() + " : " + (résultat4.getValeur() != null ? résultat4.getValeur() : "jenesaispas"));
    }
}
