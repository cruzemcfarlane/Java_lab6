package Lab6;
import java.text.*;

public class Vehicle
{
    private String make;
    private int year;
    private Engine engine_info;;
    private int mileage;
    private double value;
    
        
    public Vehicle(String make, int year, int condition, String engineNum, int cc, int cylinder, int mileage, double value)
    {
        this.make = make;
        this.year = year;
        this.engine_info = new Engine(condition, engineNum, cc, cylinder);
        this.mileage = mileage;
        this.value = value;
    }
    
    public Vehicle(String make, String model, int year)
    {
        this.make = make;
        this.year = year;
    }
    
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        return "\nVehicle Information:" + "\nMake: " + make + "\nYear: " + year + engine_info.toString() 
               + "\nMileage: " + mileage + "\nValue: " + fmt.format(value) + "\n";
    }
    
    public void calculateValue(int rate, int newMileage)
    {
        value = value - ((rate/100.0) * (newMileage - mileage));
        mileage = newMileage;
    }
    
    public void calculateValue(int rate)
    {
        value = value - ((rate/100.0) * value);
    }
}