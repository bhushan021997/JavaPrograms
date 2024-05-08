package PacticeQuestion;

public class PQ20DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Bhushann";
		char[] characters = input.toCharArray();
        int length = characters.length;

        System.out.print("Duplicate Characters using Two Loops: ");
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (characters[i] == characters[j]) {
                    System.out.print(characters[i] + " ");
                    
                    break;
                }
            }
        }
        
    }

	}


