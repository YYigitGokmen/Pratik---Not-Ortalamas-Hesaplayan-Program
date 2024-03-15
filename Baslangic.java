
    import java.sql.SQLOutput;
    import java.util.Scanner;


public class Baslangic {
    public static void main(String[] args) {

    //Değişkenleri oluştur
        int mat,fizik,kimya,turkce,tarih,muzik;

        //Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //kullanıcıdan değerleri almalıyız
        System.out.print("Matemetik Notunuz:");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz:");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz:");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz:");
        tarih = inp.nextInt();


        System.out.print("Müzik Notunuz:");
        muzik = inp.nextInt();

        int toplam =(mat + fizik + kimya + turkce + tarih + muzik);
        double  sonuc = toplam/ 6.0;

        System.out.println("Ortalamanız:" + sonuc);

       String Str = (sonuc >=60) ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.println(Str);

    }
}
