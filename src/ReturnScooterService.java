

public class ReturnScooterService {
    void returnScooter(Long clientId, Long scooterId,Long rideId, Position where, int minutes) {
        Scooter scooter = loadScooter(scooterId);
        Client client = loadClient(clientId);
        Ride ride = findRide(rideId);

        float scooterPrice = scooter.price(minutes);
        float chargeAmount = client.amountToPay(scooterPrice);
        chargeClient(clientId,chargeAmount);
        client.addPoints(minutes, chargeAmount, ride.isImmediatePayment());
        chargeScooter(scooter.lowBattery());
    }

    private void chargeScooter(boolean lowBattery) {
        if(lowBattery){
            System.out.println("Low battery, need to charge");
        }
    }

    private Ride findRide(Long rideId) {
        return null;
    }

    private void chargeClient(Long clientId, float chargeAmount) {
    }


    private Scooter loadScooter(Long scooterId) {
        return null;
    }
    private Client loadClient(Long clientId) {
        return null;
    }
}
class Position {
    private float latitude;
    private float longitude;
}