
public class car {
	
 
		// TODO Auto-generated method stub
		
     int noofcars;
     String models;
     int speed;
     
     public void setSpeed(int S)
     {
    	 this.speed=S;
     }
    public int getSpeed()
    {
    	return speed;
    }
    void display()
    {
    	System.out.println("welcome to audi");
    }
    public static void main (String[] args) 
    {
    	car obj=new car();
    	obj.display();
    	obj.setSpeed(80);
    	System.out.println(obj.getSpeed());
    }

    
    	
    }
   
    


