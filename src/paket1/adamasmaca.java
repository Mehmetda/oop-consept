package paket1;

import java.util.Arrays;
import java.util.Scanner;

public class adamasmaca {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("kelimenızı gırınız:");
        String kelime=scan.next();
        String[]array=kelime.split("");
        System.out.println("toplam hakkınız:"+ kelime.length());
        for (int i = 0; i < array.length-1; i++) {
            System.out.println("tahmininizi söyleyin:");
            String tahmin=scan.next().substring(0,1);
            if(Arrays.asList(array).contains(tahmin)){
                System.out.println("harfinizin kelimedeki yeri\t"+(Arrays.binarySearch(array,tahmin)+1)+"\tinci sıradır");
            }

        }
        System.out.println("hakkınız bitti lutfen kelime tahmınınızi soyleyınız:");
        String tahminkelime=scan.next();
        if(tahminkelime.equalsIgnoreCase(kelime)){
            System.out.println("oyunu kazandınız tebrikler");
        }
        else{
            System.out.println("oyunu kaybettiniz");
        }

    }
}
