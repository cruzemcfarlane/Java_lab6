package Lab6;

public class Engine
{
    enum Condi{Poor, Fair, Good, Excellent}
    private Condi condition;
    private String engineNum;
    private int cc;
    private int cylinder;
    
    public Engine(int condition, String engineNum, int cc, int cylinder)
    {
        setCondition(condition);
        this.engineNum = engineNum;
        this.cc = cc;
        this.cylinder = cylinder;        
    }
    
    public String getCondition()
    {
        return condition.name();
    }
    
    public String getEngineNum()
    {
        return engineNum;
    }
    
    public int getCC()
    {
        return cc;
    }
    
    public int getCylinder()
    {
        return cylinder;
    }
    
    public void setCondition(int num)
    {
        if(num == 0)
            condition = Condi.Poor;
            
        else if(num == 1)
            condition = Condi.Fair;
            
        else if (num == 2)
            condition = Condi.Good;
            
        else if(num == 3)
            condition = Condi.Excellent;
    }
         
    public String toString()
    {
        return "\nEngine Information:" + "\n\tEngine number: " + engineNum + "\n\tCC rating: " + cc
               + "\n\tNumber of Cylinders: " + cylinder + "\n\tCondition: " + condition;
    }   
}