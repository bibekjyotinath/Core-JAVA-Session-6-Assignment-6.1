import java.util.Scanner;  //importing scanner class to take input from user

public class EvenNum {		//EvenNum class created which holds the main method of the program

	public static void main(String[] args) {	//main method of the program
		
		int []arr = new int[10];     //declaration of array and fixing the size of the array to 10
		int i;			     //initialization of variable to integer data type
		
		Scanner sc = new Scanner(System.in);		//creating object of scanner class 
		
		System.out.println("Enter 10 numbers inside the array ");  	//printing statement on the console
		for(i=0;i<10;i++)		//loop runs from 0-9 to insert elements from user
		{
			arr[i] = sc.nextInt();     //taking input from the user and storing it in the array
		}
		
		sc.close();       //to close the scanner input
		System.out.println("Even numbers present in the array are: \n");	//printing statement on the console
			
		for(i=0; i<10;i++)	//loop runs from 0-9 to check the elements present in the array
		{
			if(arr[i] % 2 == 0)      //condition to check the even array elements
			{
				System.out.println(arr[i]);   //displays the element who statisfies the condition on the console
			}
		}
	}

}
