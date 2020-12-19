package second;
import java.util.Scanner;

public class DogKennel {
	Dog[] dogs;
	private Scanner scan = new Scanner(System.in);
	
	void newdogs(int i){
		dogs = new Dog[i];
		String name;
		int age = 0;
		for(int j = 0; j < i; j++) {
			System.out.print("Введите кличку собаки " + (j+1) + ": ");
			name = scan.next();
			System.out.print("Введите возраст собаки " + (j+1) + ": ");
			age = scan.nextInt();
			dogs[j] = new Dog(name, age);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DogKennel kennel = new DogKennel();
		System.out.print("Количество собак в питомнике: ");
		int s = scan.nextInt();
		kennel.newdogs(s);
		System.out.println();
		
		for(int j = 0; j < s; j++) {
			System.out.println("Собака № " + (j+1) + ":");
			System.out.println(kennel.dogs[j]);
		}
	}
}