package examples_strings;

public class StringPoolandLiteral {
   public static void main(String args[]) {
	   
	   String str1 ="Good";
	   String str2 ="Good";
	   String str3 = new String("Good");
	   String str4 = new String("good");
	   
	   System.out.println(str1 == str2); //true
	   System.out.println(str1 == str3); //false
	   System.out.println(str1.equals(str3)); //true
	   System.out.println(str1.equalsIgnoreCase(str4)); //true
	      
   }
}
