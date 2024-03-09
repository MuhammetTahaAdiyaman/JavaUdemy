public class Kullanici {
    //public demek herkesin erişebileceği anlamına gelmektedir.
    //private özel demek sahibinden başka kimse erişemez yani class içinde erişim sağlarız sadece.
    //protected sadece class içinde bulunan - aynı paket içindeki classlar bu anahtara erişim sağlayabilir.
    protected String isim = "Bahadır";
    private String soyisim = "Sevim";
    private int yas = 21;
    private String email = "bahadir@sevim.com";

    public void bilgileriYazdir(){
        System.out.println(isim);
        System.out.println(soyisim);
        System.out.println(yas);
        System.out.println(email);

    }
}
