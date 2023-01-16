package paket1;

public class yazdırma {
    private String ad;

    private String yazarad;

    private int fiyat;


    private int kitapno;





    @Override
    public String toString() {
        return "KİTABIN ADI="+ ad +
                "\nYAZARIN ADI=" + yazarad +
                "\nFİYAT=" + fiyat+"\nKİTAPNO="+kitapno ;
    }

    public yazdırma(String ad, String yazarad, int fiyat,int kitapno) {
        this.ad = ad;
        this.yazarad = yazarad;
        this.fiyat = fiyat;
        this.kitapno=kitapno;
    }
    public void setKitapno(int kitapno) {

        this.kitapno = kitapno;
    }

    public int getKitapno() {
        return kitapno;
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getYazarad() {
        return yazarad;
    }

    public void setYazarad(String yazarad) {
        this.yazarad = yazarad;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }
}
