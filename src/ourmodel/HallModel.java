package ourmodel;

public class HallModel {
    private int hallId;
    private String hallName;
    private double price;
    private String desciption;

    public HallModel(){}

    public HallModel(String hallName, double price, String desciption) {
        this.hallName = hallName;
        this.price = price;
        this.desciption = desciption;
    }

    public HallModel(int hallId, String hallName, double price, String desciption) {
        this.hallId = hallId;
        this.hallName = hallName;
        this.price = price;
        this.desciption = desciption;
    }

    public int getHallId() {
        return hallId;
    }

    public void setHallId(int hallId) {
        this.hallId = hallId;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
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
}
