package LearnAutomation1;

public class LearnMethod {

    public void takephoto() {
        System.out.println("take photo");
    }
    
    public static void main(String[] args) {
        LearnMethod obj = new LearnMethod();  // semicolon added
        obj.takephoto();                      // method call correct
    }
}
