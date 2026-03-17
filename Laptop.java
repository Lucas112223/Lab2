public class Laptop extends ComputingEquipment{

    private int batteryLife;
    private double weightKg;

    public Laptop(String id, String name, double dailyPrice, String processor, int batteryLife, double weightKg) {
        super(id, name, dailyPrice, processor);
        this.batteryLife = batteryLife;
        this.weightKg = weightKg;
    }

    @Override
    public String getEquipmentType() {
        return "Laptop";
    }

    @Override
    public double insuranceRate() {
        return 0.07;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBattery life: " + batteryLife + " horas" + "\nWeight: " + weightKg + "Kg";
    }
}
