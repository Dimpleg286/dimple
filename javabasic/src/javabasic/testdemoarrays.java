package javabasic;

public class testdemoarrays {
public static void main(String[] args) {
	

	
	int s[][]=new int[4][4]	;
	s[0][0]= 12;
	s[0][1]= 1;
	s[0][2]= 12;
	s[0][3]= 12;

	s[1][0]= 12;
	s[1][1]= 12;
	s[1][2]= 1;
	s[1][3]= 12;
	
	s[2][0]= 1;
	s[2][1]= 12;
	s[2][2]= 12;
	s[2][3]= 12;
	
	s[3][0]= 12;
	s[3][1]= 1;
	s[3][2]= 12;
	s[3][3]= 1;
for(int  i=0;i<s.length;i++) {
for(int j=0;j<4;j++) {
	System.out.println(s[i][j]);
}

}

}
}
