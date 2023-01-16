package paket2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class İŞLEMLER {
    static List<öğrencikayıt> okulum=new ArrayList<>();
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        İşlemler();

    }

     public  static void İşlemler() {
        System.out.println("2. ============= İŞLEMLER =============\n" +
                "            1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "    Q-ÇIKIŞ"+"\nistediğiniz işleme göre numaraya basınız!!!");
        boolean devam=true;
        while (devam) {
            int seçim=0;
            try {
                seçim = scan.nextInt();
                devam=false;
            } catch (Exception e) {
                String çıkış=scan.next();
                if(çıkış.equalsIgnoreCase("Q")){
                    System.out.println("bizi tercih ettiğiniz için teşekkür ederiz...");
                    devam=false;
                    System.exit(0);
                }
                else{
                    System.out.println("yanlış harf girdiniz lütfen tekrar giriniz!!! ");

                }
            }

            switch(seçim){
                case 1:
                    ekleme();
                case 2:
                    arama();
                case 3:
                    listeleme();
                case 4:
                    silme();

                default:
                    System.out.println("yanlış rakam girdiniz lütfen tekrar giriniz:");
            }

        }




    }

    private static void silme() {
        System.out.println("silmek istediğiniz öğrencinin TC sini giriniz:");
        int tc =scan.nextInt();
        for (int i = 0; i <okulum.size() ; i++) {
            if(tc==okulum.get(i).getKimlikno()){
                okulum.remove(i);
                System.out.println(okulum);
                İşlemler();
            }
            else{
                System.out.println("böyle bir öğrenci bulunmamaktadır:");
                İşlemler();
            }
        }

    }

    private static void listeleme() {
        for (int i = 0; i <okulum.size() ; i++) {
            System.out.println(okulum.get(i));
            System.out.println();

        }
        İşlemler();
    }

    private static void arama() {
        System.out.println("aramak istediğiniz kişinin TC sini giriniz: ");
        int tc=scan.nextInt();
        for (int i = 0; i <okulum.size() ; i++) {
            if(okulum.get(i).getKimlikno()==tc){
                System.out.println(okulum.get(i));
                İşlemler();
            }
            else{
                System.out.println("böyle bir öğrenci sınıfta bulunmamaktadır!!!");
                İşlemler();
            }

        }
    }

    private static void ekleme() {

        System.out.println("lütfen öğrenci adını giriniz:");
        String ad=scan.next();
        System.out.println("lütfen öğrenci soyadıını giriniz:");
        String soyad=scan.next();
        System.out.println("lutfen kımlık no gırınız:");
        int kimlik=scan.nextInt();
        System.out.println("lutfen yaşını giriniz:");
        int yaş=scan.nextInt();
        System.out.println("lütfen numara giriniz:");
        int numara=scan.nextInt();
        System.out.println("lütfen sınıfı giriniz:");
        int sınıfı=scan.nextInt();
        öğrencikayıt öğrenci=new öğrencikayıt(ad,soyad,kimlik,yaş,numara,sınıfı);
        okulum.add(öğrenci);
        İşlemler();
    }
     /* ÖĞRENCİ YÖNETİM PLATFORMU KODLAYINIZ.
            1. BU PROGRAMDA ÖĞRENCİ KAYITLARI İLE İLGİLİ İŞLEMLER
            YAPILABİLMEKTEDİR. KAYITLARDA ŞU BİLGİLER OLMALIDIR:

            -AD SOYAD
	-KİMLİK NO
	-YAŞ
	-NUMARA
	-SINIF  BİLGİLERİNİ İÇERMELİDİR.
2. ============= İŞLEMLER =============
            1-EKLEME
		 2-ARAMA
		 3-LİSTELEME
		 4-SİLME
    Q-ÇIKIŞ
    SEÇİMİNİZ:
    ŞEKLİNDE BİR MENÜ OLUŞTURULMALI.
            3. ARAMA VE SİLME İŞLEMLERİ KİMLİK NO YA GÖRE YAPILMALIDIR.
            NOT: PROJEYİ YAPARKEN MÜMKÜN OLAN EN KISA KODLARI YAZMAK İÇİN NESNE YÖNELİMLİ
            PROGRAMLAMANIN BİZE SAĞLADIĞI İMKANLARI KULLANMAYA DİKKAT EDİNİZ.
    */



}
