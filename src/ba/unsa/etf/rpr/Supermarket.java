package ba.unsa.etf.rpr;

public class Supermarket {
    int broj=0;
    Artikl[] artikli=null;

    public Supermarket() {
        artikli = new Artikl[1000];
        broj=0;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }


    public void dodajArtikl(Artikl a) {
        this.artikli[broj++]=a;
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
