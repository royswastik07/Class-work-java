import java.util.Scanner;

class input{
	public static void main(String[] args) {
		System.out.println("WellCome To My Enter Student Details Program");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many records you want to input: ");
		int n = Integer.parseInt(scan.nextLine());
		if (( n>=1 ) && (n<=3)){
			int i;
			for(i=1;i<=n;i++){
				System.out.println("Enter your name");
				String name = scan.nextLine();
		
				System.out.println("Enter your Age");
				int Age = Integer.parseInt(scan.nextLine());
		
				System.out.println("Enter your Class");
				String classs = scan.nextLine();
		
				System.out.println("Enter your reg_no");
				long reg_no = Long.parseLong(scan.nextLine());
		
				System.out.println("Your Name: "+name);
				System.out.println("Your Age: "+Age);
				System.out.println("Your Class: "+classs);
				System.out.println("Your Reg no: "+reg_no);
				System.out.println(i+" Record succesfully stored");
			
		}
		}
		else{
			System.out.println("You entered the value that is out of the Range min is 1 AND max is 3");
		}
		scan.close();
	}
}
