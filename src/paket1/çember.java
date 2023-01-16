package paket1;

public class çember extends şekil {
    int yarıçap;

    public çember(int yarıçap) {
        this.yarıçap = yarıçap;
    }
    public int alan(){
        return 3*this.yarıçap*this.yarıçap;
    }

    @Override
    public String toString() {
        return "çemberinalanı="+alan()+"\nçemberinçevresi"+çevre();
    }

    public int çevre(){
        return 2*3*this.yarıçap;
    }

    public static void main(String[] args) {
        çember çmb=new çember(5);
        System.out.println(çmb);
    }
}
