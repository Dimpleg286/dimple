package BasicOfJava;
import java.util.Scanner;
import java .util.regex. Matcher; 
import java.util.regex.Pattern; 
public class regex {
	
	public static void main(String[] args) { 
	Pattern pattern=Pattern.compile("[a-z]+"); 
	Matcher matcher=pattern.matcher("Welcome to Java 1.8"); 
	while(matcher.find()){ 
	System.out.println("Found "+matcher.group()); 
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the date");
	String date=sc.nextLine();
	System.out.println(date.matches("^(0[1-9]|[12][0-9]|3[0-1]{2})(\\/|-)(0[1-9]|11|12{2})(\\/|-)(19|20|21|[0-9]{4})$"));
System.out.println("enter the email");
	String email= sc.nextLine();
System.out.println(email.matches("^([a-zA-Z]{0,10})(@)(gmail)(.)(com)$"));
	}
}}