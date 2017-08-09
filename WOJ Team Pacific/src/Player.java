
public class Player {

	private String name;
	private int freeTokens;
	private int balance;
	private int seconds;
	
	Player(String name) {
		this.name = name;
		freeTokens = 0;
		balance = 0;
		
		//TODO: 
		// set start value for seconds
	}
	
	void userKeyboardSetting(){
		
	}
	
	void setActionListener(){
		
	}
	
	public int getFreeToken(){
	
		return freeTokens;
	}
	
	public void useToken(){
		
		this.freeTokens -=1;
	}
	
	public void addToken(){
		
		this.freeTokens +=1;
	}
	
	public int getBalance(){
		
		return this.balance;
	}
	
	public void addBalance(int addValue) {
		
		this.balance += addValue;
	}
	
	public void bankrput() {
		
		this.balance = 0;
	}
	
	public String getCategoryChoice() {
		
		//driver
		return "getCategoryChoiceDriver";
	}
	
	public int getTokenChoice(){
		
		return 1;
	}
	
	public String getPlayerName(){
		
		//driver
		return "getPlayerNameDriver";
	}
	
	public String getAnswer(){
		
		//driver
		return "getAnswerDriver";
	}
	
	public int getPlayerTime(){
		
		//driver
		return this.seconds;
	}
	
}
