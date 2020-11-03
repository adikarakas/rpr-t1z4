package ba.unsa.etf.rpr;

public class Korpa {

    Artikl[] artikli=null;
    int broj=0;

    public Korpa () {
        artikli= new Artikl[100];
        broj=0;
    }

    public boolean dodajArtikl(Artikl a) {
        artikli[broj++]= new Artikl(a.getNaziv(), a.getKod(), a.getCijena());
        return true;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public int dajUkupnuCijenuArtikala() {
        int cijena=0;
        for (int i=0; i<broj; i++) {
            cijena=cijena+artikli[i].getCijena();
        }
        return cijena;
    }
    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl temp = null;
        for (int i=0; i<broj; i++) {
            if (artikli[i].getKod().equals(kod)) {
                for (int j=i; j<broj-1; j++) {
                    temp=artikli[j];
                    artikli[j]=artikli[j+1];
                    artikli[j+1]=temp;
                }
                broj--;
                temp=artikli[broj];
                break;
            }
        }
        return temp;
    }
}