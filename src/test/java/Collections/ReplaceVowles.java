package Collections;

public class ReplaceVowles {
public static void main(String[] args) {
	String input ="NAme";
//	input = input.toLowerCase();
	
StringBuilder sb = new StringBuilder();

for (char currentChar : input.toCharArray()) {
	if (isVowel(currentChar)) {
		sb.append("x");
	}else {
		sb.append(currentChar);
	}
	
}

System.out.println(sb.toString());
}


public static boolean isVowel(char currentChar) {
	if (currentChar=='a'||currentChar=='e'||	
	currentChar=='i'||currentChar=='o'||currentChar=='u'
	||currentChar=='A'||currentChar=='E'||currentChar=='I'||
	currentChar=='O'||currentChar=='U') {
		return true;
	}else {
		return false;
	}
}
}
