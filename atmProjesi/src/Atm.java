
public class Atm {
    public int toplamMiktar = 0;
    public String kullaniciAdi = "taha123";
    public String sifre = "1234";

    public void bakiyeSorgulama(){
        System.out.println("Toplam Bakiyeniz: "+toplamMiktar);
    }

    public void paraYatir(int para){
        toplamMiktar += para;
        System.out.println("Para yatırıldı. Yatirilan miktar: "+para);
    }

    public void paraCek(int para){
        toplamMiktar-=para;
        System.out.println("Para cekildi. Cekilen miktar: "+para);
    }

}
