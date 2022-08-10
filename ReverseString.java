public class ReverseString
{
	public static void main(String[] args)
	{
		//add the original string
		String name = "Anja";
		//display the original and reversed strings
		System.out.println("Original name: " + name);
		System.out.println("Reversed name: " + reverse(name));	
	}
	
	public static String reverse(String name)
	{
		//If the string is empty throw an exception
		if (name == null)
		{
			throw new IllegalArgumentException("A value must be entered.");
		}
		
		//append the characters to a string builder
		StringBuilder output = new StringBuilder();
		char[] characters = name.toCharArray();
		
		//iterate through the array from the end to the start
		//the loop has to start at length-1 since Java indexing starts at 0
		for (int i = characters.length - 1; i >= 0; i--)
		{
			output.append(characters[i]);
		}	
		
		//give output
		return output.toString();	
	}
}