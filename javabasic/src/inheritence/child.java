package inheritence;

public class child extends parent{
public static void main(String[] args) {
	
	child obj = new child();
	obj.ptest1();
	
}
	

	public void ptest1() {
		super.ptest1();
		System.out.println("cname");
		
}
	public void cage() {
		System.out.println("cname");
}

	public void cclass() {
		System.out.println("cname");
}

}
