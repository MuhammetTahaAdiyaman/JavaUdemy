public class OgrenciIslemleri {
    //burasi manage class ekleme silme işlemlerini burada yapacağız.
    //ogrenci işlemlerini çalıştırabilmem için ogrenciyi almam gerekiyor.
    public Ogrenci ogrenci;
    public OgrenciIslemleri(Ogrenci ogrenci) {
        this.ogrenci = ogrenci;
    }

    public void ekle(){
        System.out.println("Öğrenci eklendi"+ogrenci.ad);
    }

    public void sil(){
        System.out.println("Ogrenci silindi"+ogrenci.no);
    }
}
