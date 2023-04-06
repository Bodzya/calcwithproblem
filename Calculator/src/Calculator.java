import java.util.Scanner;
import javax.swing.JOptionPane; 

public class Main {
public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);
	while(true) {
		System.out.println("Виберіть дію");
		System.out.println("1)Додавання");	
		System.out.println("2)Віднімання");	
		System.out.println("3)Множення");
		System.out.println("4)Діленння");	
		System.out.println("5)Вийти");	
		int person = scanner.nextInt();
		int result;
		if(person == 5) {
			break;
			} else if (person == 1) {
				System.out.println("Введіть перше число");	
				int a = scanner.nextInt();
				System.out.println("Введіть друге число");
				int b = scanner.nextInt();
				System.out.println("a: " + a);	
				System.out.println("b: " + b);	
				result = a + b;
				System.out.println("Відповідь :" + result);
			} else if (person == 2) {
					System.out.println("Введіть перше число");	
					int a = scanner.nextInt();
					System.out.println("Введіть друге число");
					int b = scanner.nextInt();
					System.out.println("a: " + a);	
					System.out.println("b: " + b);	
					result = a - b;
					System.out.println("Відповідь :" + result);	
				} else if (person == 3) {
					System.out.println("Введіть перше число");	
					int a = scanner.nextInt();
					System.out.println("Введіть друге число");
					int b = scanner.nextInt();
					System.out.println("a: " + a);	
					System.out.println("b: " + b);	
					result = a * b;
					System.out.println("Відповідь :" + result);	
				} else if (person == 4) {
					System.out.println("Введіть перше число");	
					int a = scanner.nextInt();
					System.out.println("Введіть друге число");
					int b = scanner.nextInt();
					if (b == 0) {
						System.out.println(" На ноль ділити не можна ");	
					}
					System.out.println("a: " + a);	
					System.out.println("b: " + b);	
					result = a / b;
					System.out.println("Відповідь: " + result);	
				} else {
					System.out.println("Помилка/error ");	
				}
			}
	System.out.println("Програма завершена ");	
	   }
    }
 
