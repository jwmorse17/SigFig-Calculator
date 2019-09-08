
import java.lang.*;
import java.util.*;


public class calc {

	//////////////////
	// Member Variables
	/////////////////
	Map<Integer, Integer> numbers = new HashMap<>();
	Map<Integer, Character> operators = new HashMap<>();


	//////////////////
	// Constructors
	/////////////////
	calc(){
		Map<Integer, Integer> numbers = new HashMap<>();
		Map<Integer, Character> operators = new HashMap<>();
		List<String> stringNums = new LinkedList<>();
		userInput();

	}

	//////////////////
	// Methods
	/////////////////
	public static void main(String[] args){
		calc object = new calc();

	}

	public void userInput(){
		System.out.println("Enter your euqation");
		Scanner s = new Scanner(System.in);
		String eq = s.nextLine();

		parse(eq);
	}



	public String parse(String eq){
		int opCounter = 0;
		int intCounter = 0;
		StringBuilder sb = new StringBuilder(eq);
		for(int i = 0; i < sb.length(); i++){
			char currentChar = sb.charAt(i);
			if(currentChar == '+' || currentChar == '/' || currentChar == '*' || currentChar == '-'){
				opCounter++;
				operators.put(i, currentChar);
				sb.deleteCharAt(i);
			} 
			////// testing //////
			System.out.println("\n" + sb);
			///// end testing//////
		}

		//StringBuilder sb1 = new StringBuilder(sb);
		for(int i = 0; i < sb.length(); i++){
			char currentChar = sb.charAt(i);
			while(currentChar != ' ' || i > sb.length()){
				StringBuilder sb2 = new StringBuilder();
				sb2.append(currentChar);
				i++;
			}
			System.out.println("\n" + sb2);

/*			System.out.println(i);
			char currentChar = sb.charAt(i);
			if(i == 0){
				StringBuilder sb2 = new StringBuilder();
			}
			if(currentChar == ' '){
				stringNums.add(sb2);
				StringBuilder sb2 = new StringBuilder();
			sb2.append(currentChar);*/
		}

		return null;
	}
}