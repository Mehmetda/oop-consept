package paket2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static paket2.İŞLEMLER.İşlemler;

public class öğretmenişlem {
    static List<öğretmen> okulum=new ArrayList<>();
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {

    }
    public static void kayıt(){
        System.out.println("2. ============= İŞLEMLER =============\n" +
                "            1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "    Q-ÇIKIŞ"+"\t\t5-ÖĞRENCİ İŞLEMLERİ"+"\nistediğiniz işleme göre numaraya basınız!!!");
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
                case 5:
                    İşlemler();

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
                kayıt();
            }
            else{
                System.out.println("böyle bir öğrenci bulunmamaktadır:");
                kayıt();
            }
        }

    }

    private static void listeleme() {
        for (int i = 0; i <okulum.size() ; i++) {
            System.out.println(okulum.get(i));
            System.out.println();

        }
        kayıt();
    }

    private static void arama() {
        System.out.println("aramak istediğiniz kişinin TC sini giriniz: ");
        int tc=scan.nextInt();
        for (int i = 0; i <okulum.size() ; i++) {
            if(okulum.get(i).getKimlikno()==tc){
                System.out.println(okulum.get(i));
                kayıt();
            }
            else{
                System.out.println("böyle bir öğrenci sınıfta bulunmamaktadır!!!");
                kayıt();
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
        öğretmen öğret=new öğretmen(ad,soyad,kimlik,yaş,numara,sınıfı);
        okulum.add(öğret);
        kayıt();


    }
}
