import java.util.Random;


public class Wheel {

	int remainingSpins;
	String[] wheelCategories;
	int spinSpeed; // why do we need spinspeed?
	
	
	Wheel(String[] wheelCategories, int numSpins) {
		this.remainingSpins = numSpins;
		this.wheelCategories = wheelCategories;
		this.spinSpeed = 0;
	}
	
	String setColor() {
		// shouldn't this be in the GUI class?
		return "blue";
	}
	
	String setBackground() {
		// shouldn't  this be in the GUI class?
		return "black";
	}
	
	void setKeyboardListener() {
		// do we need this function?  
	}
	
	public void reduceSpins() {
		
		this.remainingSpins -=1;
	}
	
	public String spinWheel(){
		int randomCatNum = (int)(Math.random() * (this.wheelCategories.length));
		this.reduceSpins();
		return this.wheelCategories[randomCatNum];
	}
	
	public void setWheelCategories(String[] wheelCategories) {
		this.wheelCategories = wheelCategories;
	}
	
}
