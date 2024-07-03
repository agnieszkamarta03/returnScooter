import java.util.List;

public class Client {
    float clientCredit;
    int points;
    List<Ride> rides;
    float piggyBank;

    public Client(float clientCredit, int points, List<Ride> rides, float piggyBank) {
        this.clientCredit = clientCredit;
        this.points = points;
        this.rides = rides;
        this.piggyBank = piggyBank;
    }

    int addPoints(int minutes, float charge, boolean isImmediate){
        if(minutes > 60){
            points+=3;
        }
        if(isImmediate){
            points+=1;
        }
        if(rides.size() % 10 == 0){ //co 10,20,30... wiecej punktow
            points +=2;
        }
        return points;
    }

    float amountToPay(float payment){
        payment -= clientCredit;
        if (piggyBank > payment){
            return payment;
        }
        else return -1;
    }

}
