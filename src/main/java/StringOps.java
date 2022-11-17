public class StringOps {

	//static hello method
	// take a string and print out "Hello string" or "Hello there" if blank
        pulic static String hello(String name){
		if (!name.eqaual("")
		    return "Hello "+name;
		else
		    return "Hello there";
	
	}
	//static  isPalindrome  
	// write a method to check if the given string is a palindrome
	 pulic static boolean isPlaindrome(String s){
		 int n = s.length();
		  for (int i = 0; i < (n/2); ++i) {
		     if (s.charAt(i) != s.charAt(n - i - 1)) {
			 return false;
		     }
		  }

		  return true;
	
	}	   


	//instance trimAll
	// return Returns the substring after removing any leading and trailing whitespace from the specified string. 
		    public String trimAll(String s){
		       return s.trim();
		    }
	

}
