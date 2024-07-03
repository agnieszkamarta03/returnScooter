public class Scooter {
    private long scooterId;
    private float batteryLevel;
    Object[] scooterData;

    public Scooter(long scooterId, float batteryLevel, Object[] scooterData) {
        this.scooterId = scooterId;
        this.batteryLevel = batteryLevel;
        this.scooterData = scooterData;
    }

    float price(int minutes) {
        float price;
        float pricePerMinute;
        if (scooterData[0].equals("01")) {
            pricePerMinute = (float) scooterData[1];
        } else {
            pricePerMinute = (float) scooterData[3];
        }
        price = minutes * pricePerMinute;
        return price;
    }

    boolean lowBattery() {
        return batteryLevel < 0.07;
    }

}



