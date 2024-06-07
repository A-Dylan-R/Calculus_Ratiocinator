package calculateur;

import status.Affirmation;

public class CalculerEt {
    public Affirmation évaluer(Affirmation a1, Affirmation a2) {
        if (!a1.évaluer() || !a2.évaluer()) {
            return new Affirmation(a1.getTexte() + " et " + a2.getTexte(), false);
        }
        return new Affirmation(a1.getTexte() + " et " + a2.getTexte(), true);
    }

}
