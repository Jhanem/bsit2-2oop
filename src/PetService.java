public class PetService {

    public int calculateFee() {
        return 50; // base fee
    }

    public int calculate(boolean vaccination) {
        int fee = calculateFee();
        if (vaccination) {
            fee += 20;
        }
        return fee;
    }

    public int calculate(boolean vaccination, boolean grooming) {
        int fee = calculate(vaccination);
        if (grooming) {
            fee += 30;
        }
        return fee;
    }

    public int calculateFee(String serviceType) {
        if (serviceType.equalsIgnoreCase("emergency")) {
            return 100;
        }
        return calculateFee();
    }
}
