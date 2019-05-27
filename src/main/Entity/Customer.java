package main.Entity;

public class Customer {
    private int cuId;
    private String cuFname;
    private String cuLname;
    private String cuType;
    private Integer cuContactnumber;
    private String cuStreetaddress;
    private String cuCityaddress;
    private String cuPhno;
    private Integer eyeDistanceodsphere;
    private Integer eyeDistanceodaxis;
    private Integer eyeDistanceodprism;
    private Integer eyeDistanceodbase;
    private Integer eyeDistanceodcylinder;
    private Integer eyeDistanceossphere;
    private Integer eyeDistanceosaxis;
    private Integer eyeDistanceosprism;
    private Integer eyeDistanceosbase;
    private Integer eyeDistanceoscylinder;
    private Integer eyeAddossphere;
    private Integer eyeAddodsphere;

    public int getCuId() {
        return cuId;
    }

    public void setCuId(int cuId) {
        this.cuId = cuId;
    }

    public String getCuFname() {
        return cuFname;
    }

    public void setCuFname(String cuFname) {
        this.cuFname = cuFname;
    }

    public String getCuLname() {
        return cuLname;
    }

    public void setCuLname(String cuLname) {
        this.cuLname = cuLname;
    }

    public String getCuType() {
        return cuType;
    }

    public void setCuType(String cuType) {
        this.cuType = cuType;
    }

    public Integer getCuContactnumber() {
        return cuContactnumber;
    }

    public void setCuContactnumber(Integer cuContactnumber) {
        this.cuContactnumber = cuContactnumber;
    }

    public String getCuStreetaddress() {
        return cuStreetaddress;
    }

    public void setCuStreetaddress(String cuStreetaddress) {
        this.cuStreetaddress = cuStreetaddress;
    }

    public String getCuCityaddress() {
        return cuCityaddress;
    }

    public void setCuCityaddress(String cuCityaddress) {
        this.cuCityaddress = cuCityaddress;
    }

    public String getCuPhno() {
        return cuPhno;
    }

    public void setCuPhno(String cuPhno) {
        this.cuPhno = cuPhno;
    }

    public Integer getEyeDistanceodsphere() {
        return eyeDistanceodsphere;
    }

    public void setEyeDistanceodsphere(Integer eyeDistanceodsphere) {
        this.eyeDistanceodsphere = eyeDistanceodsphere;
    }

    public Integer getEyeDistanceodaxis() {
        return eyeDistanceodaxis;
    }

    public void setEyeDistanceodaxis(Integer eyeDistanceodaxis) {
        this.eyeDistanceodaxis = eyeDistanceodaxis;
    }

    public Integer getEyeDistanceodprism() {
        return eyeDistanceodprism;
    }

    public void setEyeDistanceodprism(Integer eyeDistanceodprism) {
        this.eyeDistanceodprism = eyeDistanceodprism;
    }

    public Integer getEyeDistanceodbase() {
        return eyeDistanceodbase;
    }

    public void setEyeDistanceodbase(Integer eyeDistanceodbase) {
        this.eyeDistanceodbase = eyeDistanceodbase;
    }

    public Integer getEyeDistanceodcylinder() {
        return eyeDistanceodcylinder;
    }

    public void setEyeDistanceodcylinder(Integer eyeDistanceodcylinder) {
        this.eyeDistanceodcylinder = eyeDistanceodcylinder;
    }

    public Integer getEyeDistanceossphere() {
        return eyeDistanceossphere;
    }

    public void setEyeDistanceossphere(Integer eyeDistanceossphere) {
        this.eyeDistanceossphere = eyeDistanceossphere;
    }

    public Integer getEyeDistanceosaxis() {
        return eyeDistanceosaxis;
    }

    public void setEyeDistanceosaxis(Integer eyeDistanceosaxis) {
        this.eyeDistanceosaxis = eyeDistanceosaxis;
    }

    public Integer getEyeDistanceosprism() {
        return eyeDistanceosprism;
    }

    public void setEyeDistanceosprism(Integer eyeDistanceosprism) {
        this.eyeDistanceosprism = eyeDistanceosprism;
    }

    public Integer getEyeDistanceosbase() {
        return eyeDistanceosbase;
    }

    public void setEyeDistanceosbase(Integer eyeDistanceosbase) {
        this.eyeDistanceosbase = eyeDistanceosbase;
    }

    public Integer getEyeDistanceoscylinder() {
        return eyeDistanceoscylinder;
    }

    public void setEyeDistanceoscylinder(Integer eyeDistanceoscylinder) {
        this.eyeDistanceoscylinder = eyeDistanceoscylinder;
    }

    public Integer getEyeAddossphere() {
        return eyeAddossphere;
    }

    public void setEyeAddossphere(Integer eyeAddossphere) {
        this.eyeAddossphere = eyeAddossphere;
    }

    public Integer getEyeAddodsphere() {
        return eyeAddodsphere;
    }

    public void setEyeAddodsphere(Integer eyeAddodsphere) {
        this.eyeAddodsphere = eyeAddodsphere;
    }

    public Customer(String cuFname, String cuLname, String cuType, Integer cuContactnumber, String cuStreetaddress, String cuCityaddress, String cuPhno, Integer eyeDistanceodsphere, Integer eyeDistanceodaxis, Integer eyeDistanceodprism, Integer eyeDistanceodbase, Integer eyeDistanceodcylinder, Integer eyeDistanceossphere, Integer eyeDistanceosaxis, Integer eyeDistanceosprism, Integer eyeDistanceosbase, Integer eyeDistanceoscylinder, Integer eyeAddossphere, Integer eyeAddodsphere) {
        this.cuFname = cuFname;
        this.cuLname = cuLname;
        this.cuType = cuType;
        this.cuContactnumber = cuContactnumber;
        this.cuStreetaddress = cuStreetaddress;
        this.cuCityaddress = cuCityaddress;
        this.cuPhno = cuPhno;
        this.eyeDistanceodsphere = eyeDistanceodsphere;
        this.eyeDistanceodaxis = eyeDistanceodaxis;
        this.eyeDistanceodprism = eyeDistanceodprism;
        this.eyeDistanceodbase = eyeDistanceodbase;
        this.eyeDistanceodcylinder = eyeDistanceodcylinder;
        this.eyeDistanceossphere = eyeDistanceossphere;
        this.eyeDistanceosaxis = eyeDistanceosaxis;
        this.eyeDistanceosprism = eyeDistanceosprism;
        this.eyeDistanceosbase = eyeDistanceosbase;
        this.eyeDistanceoscylinder = eyeDistanceoscylinder;
        this.eyeAddossphere = eyeAddossphere;
        this.eyeAddodsphere = eyeAddodsphere;
    }

    public Customer(int cuId, String cuFname, String cuLname, String cuType, Integer cuContactnumber, String cuStreetaddress, String cuCityaddress, String cuPhno, Integer eyeDistanceodsphere, Integer eyeDistanceodaxis, Integer eyeDistanceodprism, Integer eyeDistanceodbase, Integer eyeDistanceodcylinder, Integer eyeDistanceossphere, Integer eyeDistanceosaxis, Integer eyeDistanceosprism, Integer eyeDistanceosbase, Integer eyeDistanceoscylinder, Integer eyeAddossphere, Integer eyeAddodsphere) {
        this.cuId = cuId;
        this.cuFname = cuFname;
        this.cuLname = cuLname;
        this.cuType = cuType;
        this.cuContactnumber = cuContactnumber;
        this.cuStreetaddress = cuStreetaddress;
        this.cuCityaddress = cuCityaddress;
        this.cuPhno = cuPhno;
        this.eyeDistanceodsphere = eyeDistanceodsphere;
        this.eyeDistanceodaxis = eyeDistanceodaxis;
        this.eyeDistanceodprism = eyeDistanceodprism;
        this.eyeDistanceodbase = eyeDistanceodbase;
        this.eyeDistanceodcylinder = eyeDistanceodcylinder;
        this.eyeDistanceossphere = eyeDistanceossphere;
        this.eyeDistanceosaxis = eyeDistanceosaxis;
        this.eyeDistanceosprism = eyeDistanceosprism;
        this.eyeDistanceosbase = eyeDistanceosbase;
        this.eyeDistanceoscylinder = eyeDistanceoscylinder;
        this.eyeAddossphere = eyeAddossphere;
        this.eyeAddodsphere = eyeAddodsphere;
    }
}
