import Strategy.SportDriveStrategy;

public class SportVehicle extends Vehicle{
    SportVehicle(){
        super(new SportDriveStrategy());
    }
}
