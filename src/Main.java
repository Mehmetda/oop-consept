import paket2.öğretmenişlem;
import paket2.İŞLEMLER;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("ÖĞRENCİ VE ÖĞRETMEN PANELİ\n1- ÖĞRENCİ İŞLEMLERİ\n" +
                " 2- ÖĞRETMEN İŞLEMLERİ\n" +
                " Q- ÇIKIŞ");
        System.out.println("lütefen yapmak istediğiniz işlemi seçiniz");
        int seçim= 0;
        boolean devam=true;
        while(devam){
            try {
                seçim = scan.nextInt();
                devam=false;
            } catch (Exception e) {
                String çıkış=scan.next();
                if(çıkış.equalsIgnoreCase("q")){
                    System.out.println("bizi tercih ettiğiniz için teşekkür ederiz:");
                    devam=false;
                    System.exit(0);

                }
                else{
                    System.out.println("yanlış harf girdiniz lütfen tekrar giriniz:");
                    çıkış=scan.next();

                }
            }

        }

        if(seçim==1){
            İŞLEMLER.İşlemler();
        }
        else if(seçim==2){
            öğretmenişlem.kayıt();
        }
    }
}