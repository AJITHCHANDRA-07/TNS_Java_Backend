
public class Main_Inheritence {

	public static void main(String[] args) {
		Cat a=new Cat();  // Instatiating the Object
		a.sound();   // calling the method with parent class refrence by child class
		a.sound2();  // calling the method with parent class refrence by child class
		Cow b=new Cow(); // Instatiating the object for another child class
		b.sound3();      // calling the method with parent class refrence by child class
		Dog c=new Dog();// Instatiating the object for another child class
		c.sound1();       // calling the method with parent class refrence by child class
		
	}

}

