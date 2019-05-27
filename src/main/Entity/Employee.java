package main.Entity;

import java.util.Date;

public class Employee {
    private int eId;
    private String eUname;
    private String eFname;
    private String eLname;
    private String ePhno;
    private String ePassword;
    private String eType;
    private Integer eWorksfor;
    private Date eDatestart;
    private String eStreetaddress;
    private String eCityaddress;
    private Integer eBasesalary;
    private Integer eBonuses;
    private Integer eReductions;

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteUname() {
        return eUname;
    }

    public void seteUname(String eUname) {
        this.eUname = eUname;
    }

    public String geteFname() {
        return eFname;
    }

    public void seteFname(String eFname) {
        this.eFname = eFname;
    }

    public String geteLname() {
        return eLname;
    }

    public void seteLname(String eLname) {
        this.eLname = eLname;
    }

    public String getePhno() {
        return ePhno;
    }

    public void setePhno(String ePhno) {
        this.ePhno = ePhno;
    }

    public String getePassword() {
        return ePassword;
    }

    public void setePassword(String ePassword) {
        this.ePassword = ePassword;
    }

    public String geteType() {
        return eType;
    }

    public void seteType(String eType) {
        this.eType = eType;
    }

    public Integer geteWorksfor() {
        return eWorksfor;
    }

    public void seteWorksfor(Integer eWorksfor) {
        this.eWorksfor = eWorksfor;
    }

    public Date geteDatestart() {
        return eDatestart;
    }

    public void seteDatestart(Date eDatestart) {
        this.eDatestart = eDatestart;
    }

    public String geteStreetaddress() {
        return eStreetaddress;
    }

    public void seteStreetaddress(String eStreetaddress) {
        this.eStreetaddress = eStreetaddress;
    }

    public String geteCityaddress() {
        return eCityaddress;
    }

    public void seteCityaddress(String eCityaddress) {
        this.eCityaddress = eCityaddress;
    }

    public Integer geteBasesalary() {
        return eBasesalary;
    }

    public void seteBasesalary(Integer eBasesalary) {
        this.eBasesalary = eBasesalary;
    }

    public Integer geteBonuses() {
        return eBonuses;
    }

    public void seteBonuses(Integer eBonuses) {
        this.eBonuses = eBonuses;
    }

    public Integer geteReductions() {
        return eReductions;
    }

    public void seteReductions(Integer eReductions) {
        this.eReductions = eReductions;
    }

    public Employee(String eUname, String eFname, String eLname, String ePhno, String ePassword, String eType, Integer eWorksfor, Date eDatestart, String eStreetaddress, String eCityaddress, Integer eBasesalary, Integer eBonuses, Integer eReductions) {
        this.eUname = eUname;
        this.eFname = eFname;
        this.eLname = eLname;
        this.ePhno = ePhno;
        this.ePassword = ePassword;
        this.eType = eType;
        this.eWorksfor = eWorksfor;
        this.eDatestart = eDatestart;
        this.eStreetaddress = eStreetaddress;
        this.eCityaddress = eCityaddress;
        this.eBasesalary = eBasesalary;
        this.eBonuses = eBonuses;
        this.eReductions = eReductions;
    }

    public Employee(int eId, String eUname, String eFname, String eLname, String ePhno, String ePassword, String eType, Integer eWorksfor, Date eDatestart, String eStreetaddress, String eCityaddress, Integer eBasesalary, Integer eBonuses, Integer eReductions) {
        this.eId = eId;
        this.eUname = eUname;
        this.eFname = eFname;
        this.eLname = eLname;
        this.ePhno = ePhno;
        this.ePassword = ePassword;
        this.eType = eType;
        this.eWorksfor = eWorksfor;
        this.eDatestart = eDatestart;
        this.eStreetaddress = eStreetaddress;
        this.eCityaddress = eCityaddress;
        this.eBasesalary = eBasesalary;
        this.eBonuses = eBonuses;
        this.eReductions = eReductions;
    }
}
