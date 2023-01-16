package paket1;

public class dikdörtgen extends şekil{
    int uzun;
    int kısa;

    public dikdörtgen(int uzun, int kısa) {
        this.uzun = uzun;
        this.kısa = kısa;
    }

    public int alan(){
        return this.uzun*this.kısa;

    }

    @Override
    public String toString() {
        return
                "dikdörtgençevre" +çevre()+"\ndikdörtgenalan"+alan();

    }




    public int çevre(){
        return 2*(this.uzun+this.kısa);

    }

    public dikdörtgen() {
    }

    public static void main(String[] args) {
        dikdörtgen dkdört=new dikdörtgen(2,3);
        System.out.println(dkdört);
    }

}

