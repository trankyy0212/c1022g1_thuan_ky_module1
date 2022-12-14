package CaseStudy.Model.model.Facility;

public class Villa extends Falicity {
    private String standard;//Tiêu chuẩn phòng
    private String swimmingArea;//Diện tích hồ bơi
    private String numFloors;//Số tầng

    public Villa() {
    }

    public Villa(String serviceName, String usableArea, String price, String peopleMaximum, String rentalType, String standard, String swimmingArea, String numFloors) {
        super(serviceName, usableArea, price, peopleMaximum, rentalType);
        this.standard = standard;
        this.swimmingArea = swimmingArea;
        this.numFloors = numFloors;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getSwimmingArea() {
        return swimmingArea;
    }

    public void setSwimmingArea(String swimmingArea) {
        this.swimmingArea = swimmingArea;
    }

    public String getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(String numFloors) {
        this.numFloors = numFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standard='" + standard + '\'' +
                ", swimmingArea='" + swimmingArea + '\'' +
                ", numFloors=" + numFloors +
                "} " + super.toString();
    }
}
