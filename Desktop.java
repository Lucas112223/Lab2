public class Desktop extends ComputingEquipment{
    public Desktop(String id, String name, double dailyPrice, String processor) {
        super(id, name, dailyPrice, processor);
    }

    @Override
    public String getEquipmentType() {
        return "Desktop";
    }
}
