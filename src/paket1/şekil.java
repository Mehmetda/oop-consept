package paket1;

public class şekil {
    public static void main(String[] args) {
        dikdörtgen dk=new dikdörtgen(2,3);
        System.out.println(dk);
        kare kr=new kare(4);
        System.out.println(kr);
        çember çm=new çember(2);
        System.out.println(çm);


    }
/*
1-asagidaki hiyerarsiye gore siniflar olusturunuz
sekil <--Cember
sekil <--Dikdortgen <--Kare
​
2- Turetilen siniflardan uygun olanlarina yaricap,
uzunluk ve genislik ekleyiniz.++
3- Her bir sinifa consructor ekleyiniz.+++
4- Her sinifa alan ve cevre hesaplamasi metodlarini ekleyiniz.++
(cemberin alanini hesaplama)++
5-Her metodun toStringini yapiniz.++
6- Main de bunlardan nesne olusturup sonuclari yazdiriniz.
 */

    public şekil() {

    }
}
