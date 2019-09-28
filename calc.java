
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
	/**
	 * A method that takes user input from the console
	 * @param void
	 * @return void
	 */

	public void userInput(){
		System.out.println("Enter your euqation");
		Scanner s = new Scanner(System.in);
		String eq = s.nextLine();

		parse(eq);
	}


	/**
	 * A method that reads in a string and parses it such that integers are added to the numbers
	 * collection, operators are added to the operators collection
	 * TODO:// decide if the return needs to be changed
	 * @param eq the string of the input from the user. 
	 * 
	 */
	public void parse(String eq){
		int opCounter = 0;
		int intCounter = 0;
		StringBuilder sb = new StringBuilder(eq);

		//first remove operators and store in operators collection
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
		System.out.println("\n length = " + sb.length());

		//StringBuilder sb1 = new StringBuilder(sb);
		for(int i = 0; i < sb.length(); i++){
			int spcCntr = 0;
			char currentChar = sb.charAt(i);
			//number could be any length, but is always seperated by a space

			//TODO: find a better way to do this. 
			while(currentChar != ' ' || i >= sb.length()){
				System.out.println("\n Current Char start of while " + currentChar);
				//StringBuilder sb2 = new StringBuilder();
				//sb2.append(currentChar);
				sb.deleteCharAt(i);
				//i++;
				currentChar = sb.charAt(i);
				System.out.println("\n Current Char end of while " + currentChar + "12315");
			}

			//space denotes end of current number
			if(currentChar == ' ' || i >= sb.length()){
				spcCntr++;
				numbers.put(spcCntr, convertToInteger(currentChar));
			}
		}

		performCalc();

	}


	public Integer convertToInteger(char currentChar){
		return Character.getNumericValue(currentChar);
	}

	/**
	 * A method that performs the calculations on the string that has been parsed
	 */ 
	public void performCalc(){


		int calc = numbers.get(1);
		System.out.println(calc);

	}
}