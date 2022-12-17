
import java.util.ArrayList;

public class Heart 
{
    ArrayList <String> Medical_condition = new ArrayList<>();
    ArrayList <Integer> HeartRate = new ArrayList<>();
    public ArrayList<String> getMedical_condition() {
        return Medical_condition;
    }
    public void setMedical_condition(ArrayList<String> medical_condition) 
    {
        Medical_condition = medical_condition;
    }
    public ArrayList<Integer> getHeartRate() 
    {
        return HeartRate;
    }
    public void setHeartRate(ArrayList<Integer> heartRate) 
    {
        HeartRate = heartRate;
    }
    
}
