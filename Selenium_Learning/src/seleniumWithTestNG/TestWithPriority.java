package seleniumWithTestNG;

import org.testng.annotations.Test;

public class TestWithPriority {
	
	@Test (priority = 0)
    public void startEngine(){
        System.out.println("Engine started");
    }

    @Test (priority = 1)
    public void putFirstGear(){
        System.out.println("Car is in first Gear");
    }

    @Test (priority = 2)
    public void putSecondGear(){
        System.out.println("Car is in second Gear");
    }

    @Test (priority = 3)
    public void putThirdGear(){
        System.out.println("Car is in third Gear");
    }
}


