
package tic.tac.toe;

import java.util.Scanner;
import java.util.Random;

public class oyuncu {

    Scanner input = new Scanner(System.in);
    Random rastgele = new Random();
    public boolean insanmiKontrolu;
    private char harf;
    public String koordinat;
    private String id;

    oyuncu() {
        if (insanmiKontrolu == true) {
            harf = 'X';
            insanmiKontrolu = true;
        }

    }

    oyuncu(boolean insanmiKontrolu) {
        this.insanmiKontrolu = insanmiKontrolu;
        if (insanmiKontrolu == true) {
            harf = 'X';
        } else {
            harf = 'O';
        }
    }

    oyuncu(boolean insanmiKontrolu, char kr) {
        this.insanmiKontrolu = insanmiKontrolu;
        this.harf = kr;
    }

    String karakteriAl() {
        String geciciharf;

        System.out.println("X yada O seçiminizi yapabilirsiniz (Yapmak istemiyorsanız * giriniz : ");
        geciciharf = input.next();
        if ("*".equals(geciciharf)) {
            return "X";
        }
        return geciciharf;
    }

    char karakterinTersi(char karakter) {
        char harf = 0;
        if (karakter == 'X') {
            harf = 'O';
        }
        if (karakter == 'O') {
            harf = 'X';
        }
        if (karakter == '*') {
            harf = 'O';
        }

        return harf;
    }

    boolean oyuncuTurunuAl() {
        return this.insanmiKontrolu == true;
    }

    String oyuncununHamlesiniAl() {
        return koordinat;
    }

    String insanOyuncuHamlesiniKotrol() {
        System.out.println("Hamle Sırası Sizde !!");
        System.out.println("Koordinati Giriniz : ");
        koordinat = input.next();
        return koordinat;
    }

    String bilgisayarHamlesiUret(int n) {

        int satir = rastgele.nextInt(n);
        int sutun = rastgele.nextInt(n);
        while (true) {
            if ("-".equals(oyunTahtasi.oyunTahtasi1[satir][sutun])) {
                return (((satir + 1) + "") + ((sutun + 1) + ""));

            } else {
                satir = rastgele.nextInt(n);
                sutun = rastgele.nextInt(n);
            }

        }
    }

    String bilgisayarHamlesiUret() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

