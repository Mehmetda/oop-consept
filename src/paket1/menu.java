package paket1;

import java.util.*;

public class menu {
    public static void main(String[] args) {

    }
    static List<yazdırma> Kitaplistem=new ArrayList<>();
    static  Scanner scan=new Scanner(System.in);



        /*
         *
         * Bir kitapci icin program yapalim Kitap no 1000'den baslayarak sirali no olsun
         * Her kitap icin kitapAdi, yazarAdi,fiyati bilgilerini girelim
         *
         * Programin baslayinca menu isminde bir method calissin ve kullaniciya istegini
         * sorsun 1- kitap ekle 2- numara ile kitap goruntule 3- bilgi ile kitap
         * goruntule 4- numara ile kitap sil 5- Tum kitaplari listele 6- çıkış
         */
    public static void menu(){
        System.out.println("kıtap eklemek için 1'e \nnumara ile kitap görüntülemek için 2'ye " +
                "\nbilgi ile kitap görüntülemek için 3'e" +
                "\nnumara ile kitap silmek için 4'e" +
                "\ntüm kitapları listelemek için 5'e\nçıkış için 6'a ya basınız: ");
        int seçim=scan.nextInt();
        switch (seçim){
            case 1:
                kitapekle();
                break;
            case 2:
                numarailekitapgörüntüle();
            case 3:
                bilgiilekitapgörüntüle();
            case 4:
                numarailekitapsil();
            case 5:
                KitapListele();
            case 6:
                çıkış();
        }
    }

    private static void çıkış() {
        System.out.println("bizi tercih ettiğiniz için teşekkür ederiz!!!!");
        System.exit(0);
    }

    private static void KitapListele() {
        for (yazdırma each :Kitaplistem
             ) {
            System.out.println(each);
            System.out.println();

        }
        menu();
    }

    private static void numarailekitapsil() {
        System.out.println("silmek istediğiniz kitabın numarasını yazınız:");
        int numara=scan.nextInt();
        for (int i = 0; i <Kitaplistem.size() ; i++) {
            if(numara==Kitaplistem.get(i).getKitapno()){
                Kitaplistem.remove(i);
                System.out.println(Kitaplistem);
                menu();
            }

        }
    }

    private static void bilgiilekitapgörüntüle() {
        System.out.println("aradığınız kitabın adını yazınız:");
        String ad=scan.next();
        for (int i = 0; i <Kitaplistem.size() ; i++) {
            if (Kitaplistem.get(i).getAd().equalsIgnoreCase(ad)){
                System.out.println(Kitaplistem.get(i));
            }

        }
        menu();
    }

    private static void numarailekitapgörüntüle() {
        System.out.println("lutfen kıtap numaranızı giriniz:");
        int kitapnumara=scan.nextInt();
        for (int i = 0; i <Kitaplistem.size() ; i++) {
            if(Kitaplistem.get(i).getKitapno()==kitapnumara){
                System.out.println(Kitaplistem.get(i));
            }


        }
        menu();

    }

    public static void kitapekle() {

        boolean devam = true;
        int kitapno = 1000;
        while (devam) {


            System.out.println("lütfen kitap bilgilerini giriniz: yeter diyosanız 0'a yoksa 1'e basınız:");

            int çıkış=scan.nextInt();

            if(çıkış==0){
                System.out.println("bizi tercih ettiğiniz için teşekkür ederiz:");
                break;

            }else if(çıkış==1){
                System.out.println("kitap adı:");

                String kitapad = scan.next();

                System.out.println("yazar adı:");

                String yazarad = scan.next();

                System.out.println("fiyatı:");

                int fiyat = scan.nextInt();

                yazdırma kitap=new yazdırma(kitapad,yazarad,fiyat,kitapno);
                Kitaplistem.add(kitap);
                kitapno++;
            }





        }
        System.out.println(Kitaplistem);
        menu();


    }
}
