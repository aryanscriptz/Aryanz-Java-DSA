class DeliveryPartner {
    public void showEstimatedDeliveryTime() {
        System.out.println("Standard delivery time: 45-60 minutes.");
    }
}

class BikeDelivery extends DeliveryPartner {
    @Override
    public void showEstimatedDeliveryTime() {
        System.out.println("Bike Delivery: Estimated time is 20-30 minutes.");
    }
}

class DroneDelivery extends DeliveryPartner {
    @Override
    public void showEstimatedDeliveryTime() {
        System.out.println("Drone Delivery: Estimated time is 10-15 minutes.");
    }
}

public class DeliveryPartner2 {
    public static void main(String[] args) {
        
        DeliveryPartner partner1 = new BikeDelivery();
        DeliveryPartner partner2 = new DroneDelivery();

        partner1.showEstimatedDeliveryTime();
        partner2.showEstimatedDeliveryTime();
    }
}
