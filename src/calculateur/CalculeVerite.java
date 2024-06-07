package calculateur;

import status.Affirmation;

public class CalculeVerite {
    public Affirmation évaluerEt(Affirmation a1, Affirmation a2) {
        CalculerEt et = new CalculerEt();
        return et.évaluer(a1, a2);
    }

    public Affirmation évaluerOu(Affirmation a1, Affirmation a2) {
        CalculerOu ou = new CalculerOu();
        return ou.évaluer(a1, a2);
    }

    public Affirmation évaluerDonc(Affirmation a1, Affirmation a2) {
        CalculerDonc donc = new CalculerDonc();
        return donc.évaluer(a1, a2);
    }
}

