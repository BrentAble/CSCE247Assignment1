/** 
 * Author @ Brent Able
 */
public class King extends Character {
	/**
	 * This is child class the calls variables from the class character
	 * @param name
	 */
	public King(String name) {
		super(name + " the noble");
		weaponBehavior = new WeaponSword();
	}
	/**
	 * Calls super name to use the string variable name, and then add any extensions to it.
	 * WeaponBehavior calls the interface and then selects the appropriate weapon for it
	 */	
	public void display() {
		System.out.println(name);
	}
	/**
	 * calls the method abstract, and then name is inserted and simply printed out.
	 */
}
