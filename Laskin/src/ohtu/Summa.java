package ohtu;

import javax.swing.JTextField;

public class Summa extends Komento {

    private int luku = 0;

    Summa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        super(sovellus, tuloskentta, syotekentta);
    }

    @Override
    void suorita() {
        luku = Integer.parseInt(syotekentta.getText());
        sovellus.plus(luku);
        tuloskentta.setText(Integer.toString(sovellus.tulos()));
    }

    @Override
    void peru() {
        sovellus.miinus(luku);
        tuloskentta.setText(Integer.toString(sovellus.tulos()));
        syotekentta.setText(syotekentassa);
    }

}
