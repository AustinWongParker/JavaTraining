/*
 * Austin Wong-Parker
 * Object & Classes Practice - Java
 * 
 * Java is Object-Oriented. It supports the following:
 * 
 * Polymorphism
 * Inheritance
 * Encapsulation
 * Abstraction
 * Classes
 * Objects
 * Instance
 * Method
 * Message Passing
 * 
 * Object - Objects have states and behaviors. 
 * Example: A dog has states - color, name, breed as well as behaviors - 
 * wagging the tail, barking, eating. An object is an instance of a class.
 * 
 * Class - A class can be defined as a template/blueprint that describes the 
 * behavior/state that the object of its type support.
 * 
 */
public class ObjectAndClassExamples { // Class is like a blueprint for objects
	public class Dog {
		String breed;			// Instance Variable 
		int age;				// Instance Variable 
		String color;			// Instance Variable 
		
	public Puppy() {			// Constructor #1 - classes can have more than one constructor.
		
	}
	
	public Puppy(String name) { //Constructor #2
		
	}
		
		void barking() {		// Void Method
			System.out.println("Bark!");
		}
		
		void hungry() {
			
		}
		
		void sleeping() {
			
		}
	}

	
	// Creating an Object
	
	public class Puppy1 {
		public Puppy1(String name) { //Constructor has one parameter, name.
			System.out.println("Passed name is: " + name);
		}
		
		public static void main(String []args) {
			// The following will create a myPuppy object.
			Puppy1 myPuppy = new Puppy1("Cooper"); 			
		//  'Class_name' pick_name = new 'Class_name'(name);
			
		}
	}
	
	// Accessing Instance Variables and Methods
	public class Puppy2 {
		int puppyAge;
		
		public Puppy2(String name) { //Constructor has one parameter, name.
			System.out.println("Name is: " + name);
		}
		
		public void setAge(int age) {
			puppyAge = age;
		}
		
		public int getAge() {
			System.out.println("Puppy's age is: " + puppyAge);
			return puppyAge;
		}
		
		public static void main(String []args) {
			/* Object creation */
			Puppy2 myPuppy2 = new Puppy2("Cooper"); 
			
			/* Call class method to set puppy's age */
			myPuppy2.setAge(2);
			
			/* Call another class method to get puppy's age */
			myPuppy2.getAge();
			
			/* You can access instance variable as follows as well */
			System.out.println("Variable Value: " + myPuppy2.puppyAge);		
			
			
			/* OUTPUT:
			 * 
			 * Name is: Cooper
			 * Puppy's age is: 2
			 * Variable Value: 2
			 * 
			 */
		}
		
		
		/* More Information
		 * 
		 * Java Packages:
		 * In simple words, it is a way of categorizing the classes and interfaces. 
		 * When developing applications in Java, hundreds of classes and interfaces will be written, therefore 
		 * categorizing these classes is a must as well as makes life much easier.
		 * 
		 * Import Statements:
		 * In Java if a fully qualified name, which includes the package and the class name is given, then the compiler 
		 * can easily locate the source code or classes. Import statement is a way of giving the proper location for the 
		 * compiler to find that particular class.
		 * Example: import java.io.*  --  This will load all the classes available in directory java_installation/java/io -
		 * 
		 */
		
		
	}
	
	

}

