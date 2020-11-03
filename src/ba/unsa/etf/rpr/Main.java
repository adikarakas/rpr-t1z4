package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    private static Korpa korpa = new Korpa();
    private static Supermarket supermarket = new Supermarket();

    private static void unosArtikalaUMarket(){
        supermarket.dodajArtikl(new Artikl("Bicikl", "1000", 1));
        supermarket.dodajArtikl(new Artikl("Romobil", "1001", 2));
        supermarket.dodajArtikl(new Artikl("Trotinet", "1002", 3));
        supermarket.dodajArtikl(new Artikl("Moped", "1003", 4));
        supermarket.dodajArtikl(new Artikl("Motocikl", "1004", 5));
        supermarket.dodajArtikl(new Artikl("Automobil", "1005", 6));
        supermarket.dodajArtikl(new Artikl("Prikolica", "1006", 7));
        supermarket.dodajArtikl(new Artikl("Kombi", "1007", 8));
        supermarket.dodajArtikl(new Artikl("Autobus", "1008", 9));
        supermarket.dodajArtikl(new Artikl("Kamion", "1009", 10));
        supermarket.dodajArtikl(new Artikl("Tramvaj", "1010", 11));
        supermarket.dodajArtikl(new Artikl("Trolejbus", "1011", 12));
        supermarket.dodajArtikl(new Artikl("Čamac", "1012", 13));
        supermarket.dodajArtikl(new Artikl("Trajekt", "1013", 14));
        supermarket.dodajArtikl(new Artikl("Brod", "1014", 15));
        supermarket.dodajArtikl(new Artikl("Avion", "1015", 16));
        supermarket.dodajArtikl(new Artikl("Helikopter", "1016", 17));
        supermarket.dodajArtikl(new Artikl("Voz", "1017", 18));
        supermarket.dodajArtikl(new Artikl("Jedrilica", "1018", 19));
        supermarket.dodajArtikl(new Artikl("Svemirski brod", "1019", 20));
    }

    public static void ispisArtikala(Artikl[] artikli){
        for (Artikl a : artikli) {
            if(a != null) System.out.println("Naziv: " + a.getNaziv() + ", Kod: " + a.getKod() + ", Cijena: " + a.getCijena() + " KM");
        }
    }

    public static void main(String[] args) {
        unosArtikalaUMarket();
        for(;;){
            System.out.print("0 - odustani\n1 - dodaj u korpu\n2 - izbaci iz korpe\n3 - checkout\nUnesite opciju: ");
            Scanner scanner = new Scanner(System.in);
            int opcija = scanner.nextInt();

            if(opcija == 0){
                System.out.println("Odustali ste od kupovine.");
                return;
            }
            else if(opcija == 1){
                System.out.println("Dodavanje artikla u korpu\nArtikli u marketu su: ");
                ispisArtikala(supermarket.getArtikli());
                System.out.println("Unesite kod artikla (unesite malo slovo \"c\" za odustajanje): ");
                String kod = scanner.nextLine();
                kod = scanner.nextLine();
                if(!kod.equals("c")){
                    Artikl a = supermarket.izbaciArtiklSaKodom(kod);
                    if(a != null){
                        if(korpa.dodajArtikl(a)) System.out.println("Artikl dodan u korpu.");
                        else {
                            supermarket.dodajArtikl(a);
                            System.out.println("Korpa je puna, artikl nije dodan!");
                        }
                    }
                }
            }
            else if(opcija == 2){
                System.out.println("Izbacivanje artikla iz korpe\nArtikli u korpi su: ");
                ispisArtikala(korpa.getArtikli());
                System.out.println("Unesite kod artikla (unesite malo slovo \"c\" za odustajanje): ");
                String kod = scanner.nextLine();
                kod = scanner.nextLine();
                if(!kod.equals("c")){
                    Artikl a = korpa.izbaciArtiklSaKodom(kod);
                    if(a != null){
                        supermarket.dodajArtikl(a);
                    }
                }
            }
            else if(opcija == 3){
                int cijena = korpa.dajUkupnuCijenuArtikala(), iznos;
                System.out.println("Ukupna cijena je " + korpa.dajUkupnuCijenuArtikala() + " KM.");
                do{
                    System.out.print("Unesite ispravan iznos: ");
                    iznos = scanner.nextInt();
                }while(iznos < cijena);
                if(iznos > cijena) System.out.println("Povratni iznos: " + (iznos - cijena));
                System.out.println("Placeno, kupovina finalizirana.");
                return;
            }
        }

    }
}