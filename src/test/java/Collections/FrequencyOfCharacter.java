package Collections;

import java.util.HashMap;

public class FrequencyOfCharacter {
public static void main(String[] args) {
	String input= "madam";
	HashMap<Character, Integer> frequencyMap=new HashMap<Character,Integer>();
	  // how to convert String to Array
	
	char inputArray[] = input.toCharArray();
	
for (char c : inputArray) {
	System.out.println(c);
	// getOrdefault will check if the char is present default will be zero.
	frequencyMap.put(c, frequencyMap.getOrDefault(c, 0)+1);
}

for (char c1 :frequencyMap.keySet()) {
	System.out.println(c1 +"  "+ frequencyMap.get(c1));
}
}
}
