abstract class Animal{
	String name;
	Animal(String name){
		this.name=name;
	}
	void eat(){
		System.out.println(name+ " is eating");
	}
	abstract void makeSound();
}
class Dog extends Animal{
	Dog(String name){
		super(name);
	}
	void eat(){
		System.out.println(name+" is eating");
	}
	void makeSound(){
		System.out.println("Bow bow...");
	}
}
class cat extends Animal{
	 cat(String name){
	 super(name);
	}
	void eat(){
		System.out.println(name+" is eating");
	}
	void makeSound(){
		System.out.println("Meow meow...");
	}
}
class Abs{
	public static void main(String args[]){
		cat obj=new cat("cat");
		obj.eat();
		obj.makeSound();
	}
}