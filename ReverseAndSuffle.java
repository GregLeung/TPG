import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ReverseAndSuffle {
	public String reverse(String str){
		//initialize string buffer
		StringBuffer sb = new StringBuffer();
		//read the string backward
		for(int i = str.length()-1; i >= 0; i--){
			//used String buffer to reduce the running complexity [i.e. instead of doing: str = str + str.charAt(i)]
			sb.append(str.charAt(i));
		}
		//return the inversed string
		return sb.toString();
	}
	public String reShuffle(String str){
		//initialize arraylist for shuffling
		List<Character> myList = new ArrayList<Character>();
		for(char c : str.toCharArray()){
			myList.add(c);
		}
		//initialize random number generator
		Random rand = new Random();
		//initialize string buffer to store the result
		StringBuffer sb = new StringBuffer();
		while(!myList.isEmpty()){
			//get the randomized number from 0 - length of mylist
			int randNum = rand.nextInt(myList.size());
			//append the randomized char to string buffer
			sb.append(myList.get(randNum));
			//remove that randomized char in mylist
			myList.remove(randNum);
		}
		//return the shuffled string
		return sb.toString();
	}
	
}
