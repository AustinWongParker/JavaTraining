
/*
 * Austin Wong-Parker
 * Enum Practice - Java
 */

// ---------------------------

/* Example of Enums
 *
 * Q: What is Java Enums?
 * A: Enums restrict a variable to have one (of only a few) predefined values. Short for enumerated list.
 *
 */

class McDonaldDrinks {
	enum McDrinkSize{ SMALL, MEDIUM, LARGE }
	McDrinkSize size;
}

public class EnumExample {
	public static void main(String args[]) {
		McDonaldDrinks my_drink = new McDonaldDrinks();
		my_drink.size = McDonaldDrinks.McDrinkSize.LARGE;
		System.out.println("My drink size is: " + my_drink.size);
	}
}
