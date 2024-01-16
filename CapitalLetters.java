package stringassignment;

public class CapitalLetters {

	public static void main(String[] args) {
		String sentence = "India Is A Great Country";
		for(int i=0;i<sentence.length();i++)
		{
			if(Character.isUpperCase(sentence.charAt(i)))
			{
				System.out.println(sentence.charAt(i));
			}

			
			
		}
	}

}
//IIVB