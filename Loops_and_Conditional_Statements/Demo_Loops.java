package NEW_PACKAGE;

public class Demo_Loops {
    // Method to demonstrate different types of Iterative loops
    public void Iterative_Loops() {
        //for loop example
        for(int i = 0; i < 5; i++) {
            System.out.println("For Loop iteration: " + i);
        }
        //while loop example
        int j = 0;
        while(j < 5) {
            System.out.println("While Loop iteration: " + j);
            j++;
        }
        // Nested loop example
        for(int m=0;m<3;m++) {
            for(int n=0;n<2;n++) {
                System.out.println("Nested Loop m: " + m + ", n: " + n);
            }
        }
        // do while loop   
        int k = 0;
       
            do {
                System.out.println("Do-While Loop iteration: " + k);
                k++;
            } while(k < 5); // Example condition
        }

    public void Conditional_Loops() {
        // if-else example
        int a = 10;
        if(a % 2 == 0) {
            System.out.println(a + " is even.");
        } else {
            System.out.println(a + " is odd.");
        }

    // if else ladder example    
        int b=20;
        if(b > 0) {
            System.out.println(b + " is positive.");
        } else if(b < 0) {
            System.out.println(b + " is negative.");
        } else {
            System.out.println(b + " is zero.");
        }
        
        //switch-case Example
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Group dicussion on Monday");
                break;
            case 2:
                System.out.println("Techincal session on Tuesday");
                break;
            case 3:
                System.out.println("Aptitude session on Wednesday");
                break;
            default:
                System.out.println("No sessions scheduled");
        }


}
}