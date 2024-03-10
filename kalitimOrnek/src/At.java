public class At extends Hayvan{
    public double bacakBoyu;
    public int hiz;

    public void nalDegistir(){
        System.out.println("Nal değiştirildi");
    }

    public void egitimVer(){
        System.out.println("Eğitim verildi");
    }

    //her hayvan yemek yer fakat farklı yemekler yer burada da super class içinde yer alan yemekver methoduna bir override yapacağız

    @Override
    public void yemekVer() {
        System.out.println("Yulaf verildi");
    }
}
