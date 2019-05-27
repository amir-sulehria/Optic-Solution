package main.Entity;

public class Manufacturer {
    private int maId;
    private String maFname;
    private String maLname;
    private String maPhno;
    private String maStreetaddress;
    private String maCityaddress;

    public Manufacturer(int maId, String maFname, String maLname, String maPhno, String maStreetaddress, String maCityaddress) {
        this.maId = maId;
        this.maFname = maFname;
        this.maLname = maLname;
        this.maPhno = maPhno;
        this.maStreetaddress = maStreetaddress;
        this.maCityaddress = maCityaddress;
    }
}
