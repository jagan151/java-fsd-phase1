package emailid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validEmail {
	public static boolean isValidmail(String email) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(email);
		return matcher.matches();
	}
	public static void main(String[] args) {
		
		ArrayList<String> emailid=new ArrayList<String>();
		emailid.add("fro.fds@dj.com");
		emailid.add("mnh.qwe@dj.com");
		emailid.add("oiu.dj.com");
		emailid.add("vhu.ojf@dj.com");
		for (String value: emailid) {
			System.out.println("the email address: " + value + " is " + (isValidmail(value) ? "Valid" : "Invalid"));
		}
		System.out.println("enter mail to check");
		try (Scanner sc=new Scanner(System.in)) {
			String input=sc.nextLine();
			System.out.println("the email address you given : " + input + " is " + (isValidmail(input) ? " Valid" : " Invalid"));
		}
		
				
			}		
			
	}

	 
