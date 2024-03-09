public class Kullanici {
    private String isim;
    private String soyisim;
    private int yas;
    private String email;

    public void bilgileriYaz(){
        System.out.println(isim);
        System.out.println(soyisim);
        System.out.println(yas);
        System.out.println(email);

    }

    //field yani özelliklerimiz private biz bunlara başka bir sınıftan ulaşamayız ulaşamazsak nasıl bir değer vereceğiz ?
    //değer vermek istersek eğer bir method ile verelim ki işlemi bir filtreleyelim.
    //bu methodlara biz getter ve setter methodları deriz.
    //getter ve setter methodları public olması gerekir ki erişmemiz gerekiyor.


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas > 0 && yas < 100){
            this.yas = yas;
        }else{
            System.out.println("Doğru yaş giriniz");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //şimdi başta belirttiğimiz filtreleme özelliğini kullanalım yaş özelliğini 0 ile 100 arasında olmasını istiyorsam yukarı çıkalım.
}
