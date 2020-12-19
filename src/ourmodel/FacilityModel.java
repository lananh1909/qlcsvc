package ourmodel;

import java.util.Date;

public class FacilityModel {
    private int facilityId;
    private String facilityName;
    private int totalQuantity;
    private int available;
    private double price;
    private String desciption;
    private Date lastUpdate;

    public FacilityModel(){}

    public FacilityModel(String facilityName, int totalQuantity, int available, double price, String desciption, Date lastUpdate) {
        this.facilityName = facilityName;
        this.totalQuantity = totalQuantity;
        this.available = available;
        this.price = price;
        this.desciption = desciption;
        this.lastUpdate = lastUpdate;
    }

    public FacilityModel(int facilityId, String facilityName, int totalQuantity, int available, double price, String desciption, Date lastUpdate) {
        this.facilityId = facilityId;
        this.facilityName = facilityName;
        this.totalQuantity = totalQuantity;
        this.available = available;
        this.price = price;
        this.desciption = desciption;
        this.lastUpdate = lastUpdate;
    }

    public int getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(int facilityId) {
        this.facilityId = facilityId;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
