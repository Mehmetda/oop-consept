package paket2;

public class öğrencikayıt {
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
    private String ad;
    private String soyad;

    private int kimlikno;

    private int yaş;

    private int numara;

    private  int sınıf;

    @Override
    public String toString() {
        return
                "ADI= " + ad +
                "SOYADI= " + soyad +
                "KimlikNo= " + kimlikno +
                "YAŞ= " + yaş +
                "NUMARA= " + numara +
                "SINIF= " + sınıf ;
    }

    public öğrencikayıt() {
    }

    public öğrencikayıt(String ad, String soyad, int kimlikno, int yaş, int numara, int sınıf) {
        this.ad = ad;
        this.soyad = soyad;
        this.kimlikno = kimlikno;
        this.yaş = yaş;
        this.numara = numara;
        this.sınıf = sınıf;
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

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public int getSınıf() {
        return sınıf;
    }

    public void setSınıf(int sınıf) {
        this.sınıf = sınıf;
    }
}
