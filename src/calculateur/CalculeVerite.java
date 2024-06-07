package calculateur;

import status.Affirmation;

public class CalculeVerite {
    public Affirmation évaluerEt(Affirmation a1, Affirmation a2) {
        if (!a1.évaluer() || !a2.évaluer()) {
            return new Affirmation(a1.getTexte() + " et " + a2.getTexte(), false);
        }
        return new Affirmation(a1.getTexte() + " et " + a2.getTexte(), true);
    }

    public Affirmation évaluerOu(Affirmation a1, Affirmation a2) {
        if (!a1.évaluer() && !a2.évaluer()) {
            return new Affirmation(a1.getTexte() + " ou " + a2.getTexte(), false);
        }
        return new Affirmation(a1.getTexte() + " ou " + a2.getTexte(), true);
    }

    public Affirmation évaluerDonc(Affirmation a1, Affirmation a2) {
        if (a1.évaluer() && !a2.évaluer()) {
            return new Affirmation(a1.getTexte() + " donc " + a2.getTexte(), false);
        }
        return new Affirmation(a1.getTexte() + " donc " + a2.getTexte(), true);
    }
}

