package assignment2;

public class AddCommandLine {

    public static void main(String[] args) {
       
        int sum = 0; 
        for(String arg : args) {
            int num = Integer.parseInt(arg);
            sum += num;
        }
        System.out.println(sum);
    }
}