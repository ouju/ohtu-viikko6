package ohtu;

import javax.swing.JTextField;

public class Erotus extends Komento {
    private int luku = 0;

    Erotus(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        super(sovellus, tuloskentta, syotekentta);
    }

    @Override
    void suorita() {
        luku = Integer.parseInt(syotekentta.getText());
        sovellus.miinus(luku);
        tuloskentta.setText(Integer.toString(sovellus.tulos()));
    }

    @Override
    public void peru() {
        sovellus.plus(luku);
        tuloskentta.setText(Integer.toString(sovellus.tulos()));
        syotekentta.setText(syotekentassa);
    }
}
