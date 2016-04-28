
package ohtu;

import javax.swing.JTextField;

abstract class Komento {
    final Sovelluslogiikka sovellus;
    final JTextField tuloskentta;
    final String tuloskentassa;
    final JTextField syotekentta;
    final String syotekentassa;
    
    public Komento(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta){
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.tuloskentassa = tuloskentta.getText();
        this.syotekentta = syotekentta;
        this.syotekentassa = syotekentta.getText();
    }
    abstract void suorita();
    abstract void peru();
}
