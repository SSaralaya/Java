import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int ans = 0;
		boolean f = true;
		int flag = 1;
		while(f) {
			System.out.println("Enter a operator:");
			char op = in.next().charAt(0);
			if(op == '+'  || op == '-' || op == '*' || op == '/' || op == '%' ) {
				System.out.print("Enter two numbers:");
				int num1 = in.nextInt();
				int num2 = in.nextInt();
				switch(op) {
				case('+') -> ans = num1 + num2;
				case('-') -> ans = num1 - num2;
				case('*') -> ans = num1 * num2;
				case('/') ->{
					if(num2 != 0) {
					ans = num1 / num2;
					}else {
						System.out.println("Number cannot be divided by zero");
						flag = 0;
					}
					}
				case('%') -> ans = num1 % num2;	
				}
				if(flag == 1) {
					System.out.print("Answer: " + ans + "\n");
				}
			} else if(op == 'x' || op == 'X') {
				break;
			}else {
				System.out.println("Invalid Character");
			}
		}
	}

}

//Simple Calculator Program
