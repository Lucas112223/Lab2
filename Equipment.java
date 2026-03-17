public class Equipment {

    private String id;
    private String name;
    private double dailyPrice;


    public String getId() {
        return id; }
    public String getName() {
        return name; }
    public double getDailyPrice() {
        return dailyPrice; }

    public Equipment(String id, String name, double dailyPrice) {
        this.id = id;
        this.name = name;
        this.dailyPrice = dailyPrice;
    }

    public String getEquipmentType() {
        return "Equipment";
    }
    public double insuranceRate() {
        return 0.01;
    }
    public double calculateInsurance() {
        return dailyPrice * insuranceRate();
    }
    public boolean equals(Object o) {
        if (o.equals(id)) {
            return true;
        }
        return false;
    }
    public int hashCode() {
        return id.hashCode();
    }


    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nDaily price: " + dailyPrice + "€";
    }
}
