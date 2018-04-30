

package tic.tac.toe;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, sayac = 0;//Tahtanın boyutu n adlı değişkeninde saklanakcatir
        String isim, secim;//Kullanıcının ismi isim değişkeninde saklanacaktir
        char harf1, harf2;

        System.out.println("Oyun Tahtasının Boyutunu Giriniz : ");
        n = input.nextInt();

        System.out.println("İsminizi Giriniz : ");
        isim = input.next();

        oyunTahtasi tahta = new oyunTahtasi(n);
        oyuncu insan = new oyuncu();

        secim = insan.karakteriAl();//Kullanicidan karakter alıyoruz
        harf1 = secim.charAt(0);//Alınan stringi chara çeviriyoruz
        harf2 = insan.karakterinTersi(harf1);//Kullanicin girişine göre bilgisayara değer atiyoruz

        tahta.oyunTahtasiniYazdir(n);
        boolean kontrol = true;

        while (kontrol) {
            tahta.hamleyiYaz(insan.insanOyuncuHamlesiniKotrol(), harf1, n);//Burada kullanıcıdan hamlenin koordinatini alip o koordinata yazma işlemi yapiyoruz

            if (n == 3 && sayac != 4 || n == 5 && sayac != 12 || n == 7 && sayac != 24) {//Oyun tahtasında en son insan veri girişi yapabilir matematiksel olarak burada onun kontrolünü yapiyoruz
                tahta.hamleyiYaz(insan.bilgisayarHamlesiUret(n), harf2, n);//Bilgisayar rastgele koordinata kendi harfini giriyor
            }
            if (tahta.beraberlikKontrol(harf1, n)) {//Beraberlik kontrolu yapiliyorr
                kontrol = false;//Eğer beraberlik varsa döngüden çıkmak için kontrol değişkenini false yapiyoruz
            }
            tahta.oyunTahtasiniYazdir(n);//Oyun tahtasini yazdiriyoruz
            if (tahta.kazanan(harf1, n) == true) {//İnsan için Kazanma kontrolü yapiyoruz
                System.out.println("Oyunu Siz Kazandiniz ");
                kontrol = false;//Eğer kazanma varsa döngüden çıkmak için kontrol değişkenini false yapiyoruz
            } else if (tahta.kazanan(harf2, n) == true) {//Bilgisayar için Kazanma kontrolü yapiyoruz
                System.out.println("Oyunu Bilgisayar Kazandi ");
                kontrol = false;
            }
            sayac++;
        }

    }
}
