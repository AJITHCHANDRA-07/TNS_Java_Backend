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
class Vehicle {   					// multilevel inheritence
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}
class FourWheeler extends Vehicle {
    FourWheeler() {
        System.out.println("4 Wheeler Vehicles");
    }
}
class Car extends FourWheeler {
    Car() {
        System.out.println("This 4 Wheeler Vehicle is a Car");
    }
}
class Vehicle {   // Hierarchical Inheritance
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle {
    Car() {
        System.out.println("This Vehicle is Car");
    }
}

class Bus extends Vehicle {
    Bus() {
        System.out.println("This Vehicle is Bus");
    }
}
