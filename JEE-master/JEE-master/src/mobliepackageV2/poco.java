package mobliepackageV2;

public class poco {
	
	public static void main(String[] args) {
		/*poco w = new poco();
		w.bluetooth();
		w.screenrecorder();
		w.location();
		w.hotsport();*/
		MI e = new MI();
		e.casting();
		e.GPS();
		e.Smartshare();
	
	}
	
	//In this poco class different methods has be created.
		// method with a public accessModifier(accessSpecifier):with in the project
	public void hotsport() {
		System.out.println("poco hotsport");
	}
	//method with a private accessModifier: with in the class
	private void bluetooth() {
		System.out.println("poco bluetooth");
	}
	//method with a protected accessModifier: with in the package/otherPackage-inheritance
	 protected void location() {
		System.out.println("poco location");
	}
	//with out any modifier is call as default: with in the package 
	void screenrecorder() {
		System.out.println("poco screenrecorder");
	}
}
