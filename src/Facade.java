public class Facade {
    DvdOynatici dvdOynatici =new DvdOynatici();
    Isik isik = new Isik();
    MisirPatlatma misirPatlatma = new MisirPatlatma();
    Perde perde = new Perde();
    Projektor projektor = new Projektor();
    SesSistemi sesSistemi = new SesSistemi();

    public void watchMovie(){
        isik.isikAyarla(10);
        misirPatlatma.ac();
        misirPatlatma.misirPatlatma();
        perde.ac();
        projektor.ac();
        projektor.ekranModuAyarla(true);
        sesSistemi.ac();
        sesSistemi.dvdSec("KVP");
        sesSistemi.sesAyarla(70);
        dvdOynatici.ac();
        dvdOynatici.oynat();
    }
    public void endMovie() {
        misirPatlatma.kapa();
        isik.isikAyarla(60);
        perde.kapa();
        projektor.ekranModuAyarla(false);
        projektor.kapa();
        sesSistemi.sesAyarla(10);
        sesSistemi.kapat();
        dvdOynatici.kapat();
    }
}
