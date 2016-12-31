public class Platypus {
	
	String name;
	public Platypus(String name) {
	this.name=name;	
	}

	void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
	
	public static void main(String[] args) {
		//1. Make an instance of your new pet platypus
		Platypus basicPlatypus = new Platypus("basic platypus");
		Platypus basicPlatypusTwo = new Platypus("extra basic platypus");
		//2. Call the sayHi method
		basicPlatypus.sayHi();
		basicPlatypusTwo.sayHi();
		//3. Create a constructor in the platypus class so that you can give your platypus a name.
		
	}
}

