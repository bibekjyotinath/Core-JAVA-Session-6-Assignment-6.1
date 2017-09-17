import java.util.Scanner;  //importing scanner class to take input from user

public class EvenNum {

	public static void main(String[] args) {
		
		int []arr = new int[10];     //declaration of array and fixing the size of the array to 10
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 10 numbers inside the array ");  
		for(i=0;i<10;i++)
		{
			arr[i] = sc.nextInt();     //taking input from the user and storing it in the array
		}
		
		sc.close();       //to close the scanner input
		System.out.println("Even numbers present in the array are: \n");
		
		for(i=0; i<10;i++)
		{
			if(arr[i] % 2 == 0)      //condition to check the even array elements
			{
				System.out.println(arr[i]);
			}
		}
	}

}
