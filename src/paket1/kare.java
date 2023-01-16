package paket1;

public class kare extends dikdörtgen{
    int kenar;

    public kare(int kenar) {

        this.kenar = kenar;
    }
    public int alan(){
        return this.kenar*this.kenar;
    }

    @Override
    public String toString() {
        return "kareninalan"+alan()+"\nkareninçevre"+çevre();
    }

    public  int çevre(){

        return 4*this.kenar;
    }

    public static void main(String[] args) {
        kare kr=new kare(5);
        System.out.println(kr);
    }
}
