package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void ubacivanjeArtikalaUSupermarket () {
        Supermarket s = new Supermarket();
        s.dodajArtikl(new Artikl("Bicikl", "1000", 1));
        s.dodajArtikl(new Artikl("Romobil", "1001", 2));
        s.dodajArtikl(new Artikl("Trotinet", "1002", 3));
        s.dodajArtikl(new Artikl("Moped", "1003", 4));
        s.izbaciArtiklSaKodom("1003");
        assertEquals(3, s.broj);
    }

}