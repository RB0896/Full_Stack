import java.util.Scanner;
class Variables_Example
{
public static void main(String[] args)
{
	Scanner obj1= new Scanner(System.in);

	int number1=obj1.nextInt();
	int number2=obj1.nextInt();

	if(number1==number2)
	{
		System.out.println("number1 and number2 are equal");
    }
	else
	{
		System.out.println("number1 and number2 are not equal");
	}
}
}
