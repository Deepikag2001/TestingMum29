import java.util.*;
 
public class UserInterface {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Products p=new Products();
		int choice;
		do {
		System.out.println("1.Add");	
		System.out.println("2.Display");
		System.out.println("3.Exit");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the product");
			String product=sc.next();
			p.addProductToList(product);
			break;
			  
		case 2:
			p.displayProductList();
			break;
			 
		case 3:
			System.out.println("Thanks for using the application");
			break;
			default:
				System.out.println("Invalid choice");
		}}
			
		while(choice!=3);
		}
		}
		
		