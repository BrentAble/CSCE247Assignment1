/** 
 * Author @ Brent Able
 */

public abstract class Character {
	/**
	 * This is a program to implementing the weapon behavoirs, and variables to extend into other classes
	 */
	protected String name;
	WeaponBehavior weaponBehavior;
	/**
	 * @param name to be used for each characters name in the following programs (king, queen, knight, troll)
	 * WeaponBehavior is an interface that houses the weapons each character will use
	 */
	public Character(String name) {
		this.name = name;
	}
	
	public void attack() {
		weaponBehavior.attack();
	}
	/**
	 * @param wb calls the interface, and specifically the variable for how each weapons does its attack.
	 */
	
	public void setWeaponBehavior(WeaponBehavior wb) {
		weaponBehavior = wb;
	}
	/**
	 * This calls from the interface and its classes for which weapon the characters are using.
	 */
	
	public abstract void display();
	/**
	 * This will display all the information for each class. As each varies to a degree it is left abstract.
	 */
	
}