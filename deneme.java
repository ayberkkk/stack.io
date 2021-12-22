
import java.util.*; 
/* Ödevi Ayberk Tığlı,Doğukan Kayar beraber yaptık.*/ 
public class deneme { 
	
	static boolean Parantez(String expr) 
	{
		Stack<Character> stack 
			= new Stack<Character>(); 

	for (int i = 0; i < expr.length(); i++) 
		{char x = expr.charAt(i); 

			if (x == '(' || x == '[' || x == '{') 
			{ 
				stack.push(x); 
				continue; 
			} 

		
			if (stack.isEmpty()) 
				return false; 
			char check; 
			switch (x) { 
			case ')': 
				check = stack.pop(); 
				if (check == '{' || check == '[') 
					return false; 
				break; 

			case '}': 
				check = stack.pop(); 
				if (check == '(' || check == '[') 
					return false; 
				break; 

			case ']': 
				check = stack.pop(); 
				if (check == '(' || check == '{') 
					return false; 
				break; 
			} 
		}return (stack.isEmpty()); 
	} 


	public static void main(String[] args) 
	{ 
        System.out.println("Matematiksel bir işlem giriniz : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
		String expr = input; 

	
	if (Parantez(expr)) 
		System.out.println("Eksik Değil ! "); 
	else
		System.out.println("Eksik !! "); 
	} 
} 

