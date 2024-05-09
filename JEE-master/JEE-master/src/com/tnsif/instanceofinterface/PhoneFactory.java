package com.tnsif.instanceofinterface;

public class PhoneFactory {
	public static Phone createPhone(String company) {
		if (company.equalsIgnoreCase("Samsung"))
			return new Samsung();
		else if (company.equalsIgnoreCase("mi"))
			return new mi();
		return null;
	}
}
