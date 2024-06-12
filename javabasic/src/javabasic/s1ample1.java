package javabasic;
public class s1ample1 {
	
	public static void main(Strings[] args) {
		//string can be create in two way with new and with out new.
				// if we create string with out new keyword it store in String pool or it store in heap memory
		Strings firstname = new Strings("India");
		Strings Lastname = " Bharath";
		Strings FullStr = "Bharat@India";
		//length,concat(),charAt,equals
		int lengthN =firstname.length();
		System.out.println(lengthN);
		//charAT
		char s = firstname.charAt(1);
		System.out.println(s);
		//concat
		System.out.println("Welcome to "+firstname.concat(Lastname));
		//uppercasr
		firstname.toUpperCase();
		Strings t = firstname.toUpperCase();
		Strings g = Lastname.toLowerCase();
		System.out.println(firstname);
		//subString 
		Strings u = firstname.substring(0,4);
		System.out.println(t+" "+g+" "+u);
		//StringBuffer
		StringBuffer i = new StringBuffer("Jalaj");
		i.reverse();
		i.insert(5, 'a');
		i.insert(6, 6);
		System.out.println(i);
		//contains 
		if(u.contains("&")) 
			System.out.println("Y");
		else
			System.out.println("N");

			//if(FullStr.endsWith(firstname)) 
			if(FullStr.startsWith(firstname))
				System.out.println("Y");
			else
				System.out.println("N");
			
			Scanner o = new Scanner(System.in);
			System.out.println("enter the data");
			Strings line =o.nextLine();
			Strings arr[]= line.split(",");
					for(Strings r:arr) {
						System.out.println(r);
					}
	
}
	

}












/*for(int i=1;i<=6;i++) {//coloum
			//step1:   0   0<6  
			//step5    1    1<6
			//step10   2    2<6
			for(int j=1;j<=i;j++) {//row
	 // step2        0   0<=0  1  :F
	//step6          0   0<=1  1
	//step8:         1   1<=1	2	:F	     
				System.out.print(i);}//step3: *
			                           //step7:**
			System.out.println();// step4: //step9:*/