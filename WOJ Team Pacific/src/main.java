import java.util.Scanner;

public class main {
	

public static void main_Andy_test(String[] args){
	String[] cateogryString = {"category 1", "category2","category3","category4","category5","cateogry6"};
	Wheel a = new Wheel(cateogryString,1);
	System.out.println(a.remainingSpins);
	System.out.println(a.spinWheel());
	Scanner scan = new Scanner(System.in);
	Player p1 = new Player("p1", scan);
	System.out.println(p1.getAnswer());
	System.out.println(p1.getBalance());
	System.out.println(p1.getCategoryChoice());
	System.out.println(p1.getFreeToken());
	System.out.println(p1.getPlayerName());
	System.out.println(p1.getPlayerTime());
	System.out.println(p1.getTokenChoice());
}




}
