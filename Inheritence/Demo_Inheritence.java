//Deriving a Public class and method
class Animal{
	void sound() {
		System.out.println("This is Animal class");
	}
}
class Dog extends Animal{   // Inherit properties and features from parent class //child class (*Single inheritence)
	void sound1() {
		System.out.println("Dog Barks"); 
	}
}
class Cat extends Animal{  // Inherit properties and features from parent class //child class (*Multiple inheritence)
	void sound2() {
		System.out.println("Cats meows");
	}
}
class Cow extends Animal{  // Inherit properties and features from parent class //child class (*Multiple inheritence)
	void sound3() {
		System.out.println("Cow Moos");
	}

}
