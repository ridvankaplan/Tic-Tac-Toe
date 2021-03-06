

package tic.tac.toe;

public class oyunTahtasi {

    public static String[][] oyunTahtasi1 = new String[7][7];

    oyunTahtasi(int n) {//Oyun tahtasinin değerlerine başlangiç olarak R atiyoruz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                oyunTahtasi1[i][j] = "-";
            }
        }
    }

    oyunTahtasi(char[][] oynTahtasi) {
        oyunTahtasi oyunTahtasi = new oyunTahtasi(oynTahtasi);
    }

    String[][] oyunTahtasiniAl() {
        return oyunTahtasi1;
    }

    void oyunTahtasiniYazdir(int n) {//Oyun tahtasını ekrana bastırıyor
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(oyunTahtasi1[i][j] + "  ");
            }
            System.out.println();
        }
    }

    boolean hamleyiYaz(String koordinat, char oyuncu, int n) {

        int gecici5;
        int gecici6;
        gecici5 = Integer.parseInt(koordinat);
        gecici6 = Integer.parseInt(koordinat);
        gecici5 = gecici5 / 10 - 1;
        gecici6 = gecici6 % 10 - 1;
        koordinat = gecici5 + "" + gecici6 + "";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char gecici1;
                String gecici2 = i + "";
                char gecici3;
                String gecici4 = j + "";
                gecici1 = gecici2.charAt(0);
                gecici3 = gecici4.charAt(0);
                if (koordinat.charAt(0) == gecici1 && koordinat.charAt(1) == gecici3) {
                    if ("-".equals(oyunTahtasi1[i][j])) {
                        if (oyuncu == 'X') {
                            oyunTahtasi1[i][j] = "X";
                        }
                        if (oyuncu == 'O') {
                            oyunTahtasi1[i][j] = "O";
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

     boolean kazanan(char oyuncu, int n) {
        String harf = null;
        if (oyuncu == 'X') {
            harf = "X";
        }
        if (oyuncu == 'O') {
            harf = "O";
        }
        switch (n) {

            case 3:
                for (int i = 0; i < 3; i++) {
                    if (harf.equals(oyunTahtasi1[i][0]) && harf.equals(oyunTahtasi1[i][1]) && harf.equals(oyunTahtasi1[i][2])) {//Satirlari Kontrol Ediyor
                        return true;
                    }
                    if (harf.equals(oyunTahtasi1[0][i]) && harf.equals(oyunTahtasi1[1][i]) && harf.equals(oyunTahtasi1[2][i])) {//Sutunlari Kontrol Ediyor
                        return true;
                    }
                    if (i == 0) {
                        if (harf.equals(oyunTahtasi1[i][i]) && harf.equals(oyunTahtasi1[i + 1][i + 1]) && harf.equals(oyunTahtasi1[i + 2][i + 2])) {//Sol üstten Sağ asagiya gider Kosegeni kontrol Ediyor
                            return true;
                        }
                    }
                }
                if (harf.equals(oyunTahtasi1[0][2]) && harf.equals(oyunTahtasi1[1][1]) && harf.equals(oyunTahtasi1[2][0])) {//Sol Altdan Sag ustte giden köşegeni kontrol ediyor
                    return true;
                }
                return false;
            case 5:
                for (int i = 0; i < 5; i++) {
                    if (harf.equals(oyunTahtasi1[i][0]) && harf.equals(oyunTahtasi1[i][1]) && harf.equals(oyunTahtasi1[i][2]) && harf.equals(oyunTahtasi1[i][3]) && harf.equals(oyunTahtasi1[i][4])) {//Satirlari Kontrol Ediyor
                        return true;
                    }
                    if (harf.equals(oyunTahtasi1[0][i]) && harf.equals(oyunTahtasi1[1][i]) && harf.equals(oyunTahtasi1[2][i]) && harf.equals(oyunTahtasi1[3][i]) && harf.equals(oyunTahtasi1[4][i])) {//Sutunlari Kontrol Ediyor
                        return true;
                    }
                    if (i == 0) {
                        if (harf.equals(oyunTahtasi1[i][i]) && harf.equals(oyunTahtasi1[i + 1][i + 1]) && harf.equals(oyunTahtasi1[i + 2][i + 2]) && harf.equals(oyunTahtasi1[i + 3][i + 3]) && harf.equals(oyunTahtasi1[i + 4][i + 4])) {//Sol üstten Sağ asagiya gider Kosegeni kontrol Ediyor
                            return true;
                        }
                    }
                }
                if (harf.equals(oyunTahtasi1[0][4]) && harf.equals(oyunTahtasi1[1][3]) && harf.equals(oyunTahtasi1[2][2]) && harf.equals(oyunTahtasi1[3][1]) && harf.equals(oyunTahtasi1[4][0])) {//Sol Altdan Sag ustte giden köşegeni kontrol ediyor
                    return true;
                }
                return false;

            case 7:

                for (int i = 0; i < 7; i++) {
                    if (harf.equals(oyunTahtasi1[i][0]) && harf.equals(oyunTahtasi1[i][1]) && harf.equals(oyunTahtasi1[i][2]) && harf.equals(oyunTahtasi1[i][3]) && harf.equals(oyunTahtasi1[i][4]) && harf.equals(oyunTahtasi1[i][5]) && harf.equals(oyunTahtasi1[i][6])) {//Satirlari Kontrol Ediyor
                        return true;
                    }
                    if (harf.equals(oyunTahtasi1[0][i]) && harf.equals(oyunTahtasi1[1][i]) && harf.equals(oyunTahtasi1[2][i]) && harf.equals(oyunTahtasi1[3][i]) && harf.equals(oyunTahtasi1[4][i]) && harf.equals(oyunTahtasi1[5][i]) && harf.equals(oyunTahtasi1[6][i])) {//Sutunlari Kontrol Ediyor
                        return true;
                    }
                    if (i == 0) {
                        if (harf.equals(oyunTahtasi1[i][i]) && harf.equals(oyunTahtasi1[i + 1][i + 1]) && harf.equals(oyunTahtasi1[i + 2][i + 2]) && harf.equals(oyunTahtasi1[i + 3][i + 3]) && harf.equals(oyunTahtasi1[i + 4][i + 4]) && harf.equals(oyunTahtasi1[i + 5][i + 5]) && harf.equals(oyunTahtasi1[i + 6][i + 6])) {//Sol üstten Sağ asagiya gider Kosegeni kontrol Ediyor
                            return true;
                        }
                    }

                }
                if (harf.equals(oyunTahtasi1[0][6]) && harf.equals(oyunTahtasi1[1][5]) && harf.equals(oyunTahtasi1[2][4]) && harf.equals(oyunTahtasi1[3][3]) && harf.equals(oyunTahtasi1[4][2]) && harf.equals(oyunTahtasi1[5][1]) && harf.equals(oyunTahtasi1[6][0])) {//Sol Altdan Sag ustte giden köşegeni kontrol ediyor
                    return true;
                }
                return false;
            default:
                break;
        }
        return false;
    }
    

    boolean beraberlikKontrol(char oyuncu, int n
    ) {
        int sayac = 0;
        for (int i = 0; i < n; i++) {//Oyun tahtasının tüm elemanlarina bakıyoruz eğer oynanmamış eleman varsa sayaci arttiriyoruz
            for (int j = 0; j < n; j++) {
                if ("-".equals(oyunTahtasi1[i][j])) {
                    sayac++;
                }
            }
        }
        if (sayac == 0) { //Eğer sayac 0 ise oynanmamış eleman kalmamıştır ve hale kazanan çıkmadığı için oyun
            System.out.println("Oyun Berabere Bitmiştir");  //berabere bitmiştir
            return true;
        } else {
            return false;
        }
    }
}