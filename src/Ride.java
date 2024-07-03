import java.time.LocalDate;

public class Ride {
    private final long rideId;
    private boolean immediatePayment;
    private int immediateTransactionsCounter;
    private final int minutes;
    private LocalDate startDate;

    public Ride(long rideId, boolean immediatePayment, int immediateTransactionsCounter, int minutes, LocalDate startDate) {
        this.rideId = rideId;
        this.immediatePayment = immediatePayment;
        this.immediateTransactionsCounter = immediateTransactionsCounter;
        this.minutes = minutes;
        this.startDate = startDate;
    }

    float ridePrice(float scooterPrice){
        if(immediatePayment){
            this.immediateTransactionsCounter += 1;
            return minutes * 0.9f * scooterPrice;
        }

        else return minutes * scooterPrice;
    }

    public boolean isImmediatePayment() {
        return immediatePayment;
    }
}
