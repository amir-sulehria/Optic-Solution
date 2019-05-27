package main.Entity;

public class Supplier {
    private int suId;
    private String suFname;
    private String suLname;
    private String suPhno;
    private String suStreetaddress;
    private String suCityaddress;
    private Integer suCharges;

    public Supplier(String suFname, String suLname, String suPhno, String suStreetaddress, String suCityaddress, Integer suCharges) {
        this.suFname = suFname;
        this.suLname = suLname;
        this.suPhno = suPhno;
        this.suStreetaddress = suStreetaddress;
        this.suCityaddress = suCityaddress;
        this.suCharges = suCharges;
    }

    public Supplier(int suId, String suFname, String suLname, String suPhno, String suStreetaddress, String suCityaddress, Integer suCharges) {
        this.suId = suId;
        this.suFname = suFname;
        this.suLname = suLname;
        this.suPhno = suPhno;
        this.suStreetaddress = suStreetaddress;
        this.suCityaddress = suCityaddress;
        this.suCharges = suCharges;
    }

    public int getSuId() {
        return suId;
    }

    public void setSuId(int suId) {
        this.suId = suId;
    }

    public String getSuFname() {
        return suFname;
    }

    public void setSuFname(String suFname) {
        this.suFname = suFname;
    }

    public String getSuLname() {
        return suLname;
    }

    public void setSuLname(String suLname) {
        this.suLname = suLname;
    }

    public String getSuPhno() {
        return suPhno;
    }

    public void setSuPhno(String suPhno) {
        this.suPhno = suPhno;
    }

    public String getSuStreetaddress() {
        return suStreetaddress;
    }

    public void setSuStreetaddress(String suStreetaddress) {
        this.suStreetaddress = suStreetaddress;
    }

    public String getSuCityaddress() {
        return suCityaddress;
    }

    public void setSuCityaddress(String suCityaddress) {
        this.suCityaddress = suCityaddress;
    }

    public Integer getSuCharges() {
        return suCharges;
    }

    public void setSuCharges(Integer suCharges) {
        this.suCharges = suCharges;
    }
}
