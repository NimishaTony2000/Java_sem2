import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter 2 Numbers:");

    int num1 = myObj.nextInt();
    int num2 = myObj.nextInt();
    if(num1>num2){
		System.out.println("Greater Number is " + num1);	
    }
    else{
		System.out.println("Greater Number is " + num2);
    }
  }
}
