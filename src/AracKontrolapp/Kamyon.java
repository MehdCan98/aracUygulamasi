package AracKontrolapp;

import java.sql.SQLOutput;

public class Kamyon extends Arac{

    private double trafikCezasi;

public Kamyon(long id, String aracIsmi, String renk, String marka, String model, double fiyat, int lastikSayis, double trafikCezasi){

    setId(id);
    setFiyat(fiyat);
    setAracIsmi(aracIsmi);
    setMarka(marka);
    setModel(model);
    setRenk(renk);
    setLastikSayisi(lastikSayis);
    this.trafikCezasi=trafikCezasi;
}

    @Override
    public void aracBilgileri() {
        super.aracBilgileri();
        System.out.println("İD             : "+getId());
        System.out.println("ARAÇ İSMİ      : "+getAracIsmi());
        System.out.println("MODEL          : "+getModel());
        System.out.println("MARKA          : "+getMarka());
        System.out.println("FİYAT          : "+getFiyat());
        System.out.println("RENK           : "+getRenk());
        System.out.println("LASTİK SAYISI  : "+getLastikSayisi());
        System.out.println("TRAFİK CEZASI  : "+getTrafikCezasi());

    }

    @Override
    public void trafikCezasi(double cezaTutari) {
        super.trafikCezasi(cezaTutari);
        System.out.println(getAracIsmi()+"tipli aracın trafik ceza tutarı: "+getTrafikCezasi());
    }

    public double getTrafikCezasi() {
        return trafikCezasi;
    }

    public void setTrafikCezasi(double trafikCezasi) {
        this.trafikCezasi = trafikCezasi;
    }
}
