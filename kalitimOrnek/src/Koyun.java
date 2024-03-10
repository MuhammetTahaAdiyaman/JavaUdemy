public class Koyun extends Hayvan{
    public String renk;

    public void kırp(){
        System.out.println("Kırpılıyor");
    }

    @Override
    public void yemekVer() {
        System.out.println("Ot verildi");
    }
}
