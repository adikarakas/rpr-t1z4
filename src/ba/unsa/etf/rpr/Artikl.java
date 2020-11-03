package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv, kod;
    int cijena;

    public Artikl(String naziv, String kod, int cijena) {
        setNaziv(naziv);
        setKod(kod);
        setCijena(cijena);
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public int getCijena() {
        return cijena;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }
}