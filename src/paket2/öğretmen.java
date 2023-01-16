package paket2;

public class öğretmen {
    private String ad;
    private String soyad;
    private int numara;
     private int kimlikno;

     private int yaş;

    public öğretmen() {
    }

    @Override
    public String toString() {
        return "öğretmen{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", numara=" + numara +
                ", kimlikno=" + kimlikno +
                ", yaş=" + yaş +
                ", sınıf=" + sınıf +
                '}';
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public int getKimlikno() {
        return kimlikno;
    }

    public void setKimlikno(int kimlikno) {
        this.kimlikno = kimlikno;
    }

    public int getYaş() {
        return yaş;
    }

    public void setYaş(int yaş) {
        this.yaş = yaş;
    }

    public int getSınıf() {
        return sınıf;
    }

    public void setSınıf(int sınıf) {
        this.sınıf = sınıf;
    }

    public öğretmen(String ad, String soyad, int numara, int kimlikno, int yaş, int sınıf) {
        this.ad = ad;
        this.soyad = soyad;
        this.numara = numara;
        this.kimlikno = kimlikno;
        this.yaş = yaş;
        this.sınıf = sınıf;
    }

    private int sınıf;

}
