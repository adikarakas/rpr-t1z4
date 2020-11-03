package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void racunaLiDobroCijenu() {
        Artikl a1 = new Artikl("Bicikl", "1000", 1);
        Artikl a2 = new Artikl ("Automobil", "1005", 6);
        Korpa k = new Korpa();
        k.dodajArtikl(a1);
        k.dodajArtikl(a2);
        assertEquals(7, k.dajUkupnuCijenuArtikala());
    }

    @Test
    void izbacujeLiDobro() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("Bicikl", "1000", 1));
        k.dodajArtikl(new Artikl("Automobil", "1005", 6));
        k.dodajArtikl(new Artikl("Autobus", "1008", 9));
        k.izbaciArtiklSaKodom("1005");
        assertEquals(2, k.broj);
    }

    @Test
    void ubacujeLiDobro() {
        Korpa k = new Korpa();
        assertTrue(k.dodajArtikl(new Artikl("Bicikl", "1000", 1)));
    }

}