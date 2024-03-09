public class Muhasebe {
    public int toplamPara = 0;
    public String ilgiliMudur = "Taha ADIYAMAN";

    public void paraEkle(int para){
        toplamPara += para;
        System.out.println("Para Eklendi. Toplam para: "+ toplamPara);
    }

    public void paraCek(int para){
        toplamPara -= para;
        System.out.println("Para cekildi. Toplam para: "+toplamPara);
    }

    public void toplamParaGoster(){
        System.out.println(toplamPara);
    }
}
