package second;

public class Dog {
	private String name;
	private int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	String getname(){
		return name;
	}
	void setname(String name){
		this.name = name;
	}
	
	int getage(){
		return age;
	}
	void setage(int age){
		this.age = age;
	}
	
	int peopleage() {
		return 7 * age;
	}
	
	public String toString() {
		return "Кличка собаки: " + name + "\n" + "Возраст собаки: " + age + "\n" 
	+ "'Человеческий' возраст собаки: " + peopleage() + "\n";
		
	}
}