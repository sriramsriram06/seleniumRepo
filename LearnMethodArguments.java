package LearnAutomation1;

public class LearnMethodArguments {

    public void takephoto() {
        System.out.println("take photo");
    }
    public void regno(String number) {
    	System.out.println(number);
    }
    public static void main(String[] args) {
        LearnMethodArguments obj = new LearnMethodArguments();  // semicolon added
        obj.takephoto();
        obj.regno("231121101113");// method call correct
    }
}
