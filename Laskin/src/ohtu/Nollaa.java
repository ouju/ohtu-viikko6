
package ohtu;

import javax.swing.JTextField;

public class Nollaa extends Komento {

    public Nollaa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        super(sovellus, tuloskentta, syotekentta);
    }

    @Override
    void suorita() {
        sovellus.nollaa();
        syotekentta.setText("");
        tuloskentta.setText("");
    }

    @Override
    void peru() {
        sovellus.plus(Integer.parseInt(tuloskentassa));
        tuloskentta.setText(tuloskentassa);
        syotekentta.setText(syotekentassa);
    }
    
}
