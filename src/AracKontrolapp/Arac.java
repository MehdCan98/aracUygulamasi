package AracKontrolapp;

import java.sql.SQLOutput;

public class Arac {
    private long id;

    private String aracIsmi;

    private String renk;

    private double fiyat;

    private int lastikSayisi;

    private String marka;

    private String model;

    public Arac() {

    }

    public Arac(long id, String aracIsmi, String renk, String marka, String model, double fiyat, int lastikSayisi) {
        this.aracIsmi = aracIsmi;
        this.id = id;
        this.fiyat = fiyat;
        this.marka = marka;
        this.lastikSayisi = lastikSayisi;
        this.renk = renk;
        this.model = model;
    }

    public void aracBilgileri(){
        System.out.println("Araç Bilgileri: ");
        System.out.println("---------------------------------------");
    }

    public void trafikCezasi(double cezaTutari){
        System.out.println("Trafik Cezası: ");
        System.out.println("-----------------------------------------");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAracIsmi() {
        return aracIsmi;
    }

    public void setAracIsmi(String aracIsmi) {
        this.aracIsmi = aracIsmi;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public int getLastikSayisi() {
        return lastikSayisi;
    }

    public void setLastikSayisi(int lastikSayisi) {
        this.lastikSayisi = lastikSayisi;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


}
