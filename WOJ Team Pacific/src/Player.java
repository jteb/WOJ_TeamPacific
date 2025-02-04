import java.util.Scanner; 


public class Player {

	private String name;
	private int freeTokens;
	private int balance;
	private int seconds;
	static Scanner userInput;
	
	// constructor
	Player(String name, Scanner scanner) {
		this.name = name;
		freeTokens = 0;
		balance = 0;
		this.seconds = 60;
		userInput = scanner;
		
	}
	
	void userKeyboardSetting(){
		// I don't think we need this
	}
	
	void setActionListener(){
		// I don't think we need this
	}
	
	// get the number of free tokens the player has
	public int getFreeToken(){
	
		return this.freeTokens;
	}
	
	// remove one token from the player token count
	public void useToken(){
		
		this.freeTokens -=1;
	}
	
	// add one token to the player token count
	public void addToken(){
		
		this.freeTokens +=1;
	}
	
	// get the player balance
	public int getBalance(){
		
		return this.balance;
	}
	
	// add integer value to player balance
	public void addBalance(int addValue) {
		
		this.balance += addValue;
	}
	
	// set player balance to 0 when the player lands on the bankrupt sector
	public void bankrput() {
		
		this.balance = 0;
	}
	
	// get the player's choice for category.  Currently returns integer.  Can change to string
	public int getCategoryChoice() {
		System.out.println("player choice");
		Scanner userInput = new Scanner(System.in);
		//String user1 = userInput.next();
		int userChoice = userInput.nextInt();
		return userChoice;
	}
	
	// get player response about whether or not they want to use a free move token
	// returns 1 if the player wants to use a token (player enters a string starting with 'y' or 'Y')
	// returns 0 if the player doesn't want to use a token (player enters a string starting with 'n' or 'N')
	// returns -1 if the player entered an invalid answer 
	public int getTokenChoice(){
		Scanner userInput = new Scanner(System.in);
		String userChoice = userInput.next();
		char firstChar = userChoice.charAt(0);
		int useToken;
		switch(firstChar) {
		case 'y':
			useToken = 1;
			break;
		case 'Y':
			useToken = 1;
			break;
		case 'n':
			useToken = 0;
			break;
		case 'N':
			useToken = 0;
			break;
		default:
			useToken = -1;
		}
		return useToken;
	}
	
	// get the player name
	public String getPlayerName(){
		return this.name;
	}
	
	// get the player's response to a jeopardy question
	public String getAnswer(){
		String userChoice = userInput.next();
		return userChoice;
	}
	
	// get the amount of time left for player to act
	public int getPlayerTime(){
		return this.seconds;
	}
	
	public void setPlayerTime(int newTime){
		this.seconds = newTime;
	}
	
	public void subtractTime(int timeLost){
		this.seconds -= timeLost;
	}
}
