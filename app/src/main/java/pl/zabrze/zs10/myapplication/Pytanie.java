package pl.zabrze.zs10.myapplication;

import com.google.gson.annotations.SerializedName;

public class Pytanie {

    @SerializedName("tresc")
    private String trescPytania;
    private String odpa;
    private String odpb;
    private String odpc;
    @SerializedName("poprawna")
    private int poprawnaOdpowiedz;

    public String getTrescPytania() {
        return trescPytania;
    }

    public String getOdpa() {
        return odpa;
    }

    public String getOdpb() {
        return odpb;
    }

    public String getOdpc() {
        return odpc;
    }

    public int getPoprawnaOdpowiedz() {
        return poprawnaOdpowiedz;
    }
}
