package LearnAutomation1;

public class ifelse {

	public static void main(String[] args) {
        int number = 10;  // Missing semicolon fixed
        
        if (number > 0) {
            System.out.println("The number is positive");
        }
        else if (number < 0) {   // 'num' changed to 'number'
            System.out.println("The number is negative");
        }
        else {
            System.out.println("The number is zero");
        }
    }
	
}
