import java.util.Scanner;
 
class Division {
  @SuppressWarnings("resource")
public static void main(String[] args) {
 
  int a, b, result;
 
  try
  {
  Scanner input = new Scanner(System.in);
  System.out.println("Input two integers");
 
  a = input.nextInt();
  b = input.nextInt();
 if((a/b) == 0)
 {
	 throw new ArithmeticException();
 }
  result = a / b;
 
  System.out.println("Result = " + result);
  input.close();
  }
  catch(ArithmeticException e)
  {
	  System.out.println("Error! cannot divid by zero");
  }
  }
}