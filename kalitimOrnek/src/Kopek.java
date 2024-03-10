public class Kopek extends Hayvan{
    public void yuruyusYap(){
        System.out.println("Yürüyüş yapıldı");
    }

    public void egitimVer(){
        System.out.println("Eğitim verildi");
    }

    //tüm hayvanlara aşı yapılıyor ama ek olarak köpeklere kuduz aşısı yapılıyor diyelim işte burada override kullanacağız.

    @Override
    public void asiYap() {
        super.asiYap();
        System.out.println("Kuduz aşısı da yapıldı");
    }

    @Override
    public void yemekVer() {
        System.out.println("Et verildi");
    }
}
