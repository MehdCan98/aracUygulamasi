import AracKontrolapp.Arac;
import AracKontrolapp.Kamyon;
import AracKontrolapp.Motosilklet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Arac arac = new Arac();


        System.out.println("Araç Uygulaması Programına Hoş Geldiniz");
        System.out.println("Lütfen Araç Seçimi Yapın");
        String giris = "1- Kamyon\n" +
                "2-Motorsiklet";
        System.out.println(giris);


        int secim = input.nextInt();

        if (secim == 1) {
            Kamyon kamyon = new Kamyon(5, "Kamyon", "Kırmızı", "SCANİA", "2011", 3.0, 4, 1000);
            System.out.println("1-Araç Bilgileri\n"+"2-Trafik Ceza Bilgileri");
            int bilgiSecim=input.nextInt();

            if (bilgiSecim == 1){
                kamyon.aracBilgileri();
            }else if(bilgiSecim == 2){
                kamyon.getTrafikCezasi();
            }else {
                System.out.println("Lütfen uygun seçim yapın!");
            }


        }else if (secim == 2){
            Motosilklet motosilklet = new Motosilklet(5,"Motor","Gri","yamaha","2015",3.0,2,1000);
            System.out.println("1-Araç Bilgileri\n"+"2-Trafik Ceza Bilgileri");
            int bilgiSecim=input.nextInt();
            int trafikCezasi = 500;
            if (bilgiSecim == 1){

                motosilklet.aracBilgileri();
            }else if(bilgiSecim == 2){

                motosilklet.setTrafikCezasi(trafikCezasi);
            }else {
                System.out.println("Lütfen uygun seçin yapın");
            }
        }else {
            System.out.println("Lütfen doğruseçim yapın");
        }
    }
}