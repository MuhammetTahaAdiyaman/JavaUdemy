//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Kopek kopek = new Kopek();
        Koyun koyun =  new Koyun();
        At at = new At();

        kopek.yemekVer();
        koyun.yemekVer();
        at.yemekVer();

        //biz yemekver methodunu override yapmıştık üçüde kendi içinde özellştirdiğimiz için kendi özellikleri şeklinde yazacak.
        

    }

}