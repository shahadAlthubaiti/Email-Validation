import java.util.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidtion {

	
	   private static final String regex = "^(.+)@(.+)$";

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		 List<String> emails = new ArrayList<String>();
		 System.out.println(" Enter your Email to check validition :");
		 String em = in.nextLine();
		 emails.add(em);
	       Pattern pattern = Pattern.compile(regex);
	       for (String value : emails) {
	           Matcher matcher = pattern.matcher(value);

	           System.out.println("The Email address " + value + " is " 
	           + (matcher.matches() ? "valid" : "invalid"));
	       }
	   }
	
	     
	}

