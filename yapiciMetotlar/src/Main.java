//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci("Taha","Adıyaman",1307,1999);
        System.out.println(ogrenci.getIsim());

        //varsaylına değer olarak girilmedi atadık ama şimdi bir değer ataması yapalım setter methodu ile
        ogrenci.setIsim("Taha");
        //tekrar get metodunu çağıralım.
        System.out.println(ogrenci.getIsim());

    }
}