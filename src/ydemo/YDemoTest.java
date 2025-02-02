package ydemo;

public class YDemoTest {

	public static void main(String[] args) {
		System.out.println("Team 4");
		System.out.println("Team4IsTheBest");
	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void myName() {
		System.out.println("David Avila");
	}

	public void getInfo() {
		System.out.println("Brett");
	}
	
	 // Brett1: Prints a greeting message
    public void greet() {
        System.out.println("Hello! Welcome to Java programming.");
    }

	public void subtract(int y, int z) {
		System.out.println(y - z);

	}

	public void divide(int a, int b) {
		System.out.println(a / b);
	}
	
	public void myFirstPush() {
		System.out.println("This is my first push Team4");	
		
	}
	public void multiply(int d,int e) {
		System.out.println(d*e);
		//noor second push
	
		
	}
	public void mySecondPush() {
		System.out.println("Rafeef's second push !!");
		
		}
	
	  // Brett2: Displays the sum of two numbers
    public void displaySum(int a, int b) {
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    
    //Noor's 3rd push
    char grade = 'A';
    System.out.println(grade);
    
    //David's second push
    int age = 32;
    System.out.println(age);
    
    //Rafeef's 3rd push !!
    
    String name = "Team4";
    System.out.println(name);  
 }
    
    // Brett3: Prints an array of integers
    public void printArray(int[] arr) {
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }	
    
    // Brett4: Shows a countdown from a given number
    public void countdown(int start) {
        System.out.println("Countdown:");
        for (int i = start; i >= 0; i--) {
            System.out.println(i);
        }
    }
}