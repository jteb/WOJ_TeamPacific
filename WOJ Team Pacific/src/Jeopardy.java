
public class Jeopardy {

	int valueMultiplier;
	int seconds;
	int questionsValue;
	Category[] boardCategories;
	
	Jeopardy(int valueMultiplier) {
		this.valueMultiplier = valueMultiplier;
		
	}
	
	void setTextbox(){
		
	}
	
	void setBackgroundColor(){
		
	}
	
	void setKeyboardListener(){
		
	}
	
	private void loadQuestions(){
		
	}
	
	public String[] getCategories(){
		
		//driver
		String[] driverString = {"category1","category2","category3","category4","category5","category6"};
		return driverString; 	
	}

	public String[] getQuestionsFromCategory(String inCategory) {
		
		String[] driverString = {"question1","question2","question3","question4","queston5","question6"};
		return driverString;
	}
	
	public boolean isBoardEmpty(){
		
		//driver
		return true;
	}
	
	public boolean isPlayerChoice(){
		
		//driver
		return true;
	}
	
	public boolean evaluateAnswer(){
		
		//driver
		return true;
	}
	
	public int getValue(){
		
		//driver
		return 100;
	}
	
	public int gameTime(){
		
		return this.seconds;
	}
}
