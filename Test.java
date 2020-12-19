package second;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		book newbook = new book();
		System.out.print("Автор: ");
		newbook.author = sc.nextLine();
		System.out.print("Название: ");
		newbook.name = sc.nextLine();
		System.out.print("Год написания: ");
		newbook.year = sc.nextInt();
		System.out.print("Количество страниц: ");
		newbook.pages = sc.nextInt();
		System.out.println();
		System.out.println(newbook);
		System.out.println();
		ball soccer = new ball();
		System.out.print("Материал мяча: ");
		soccer.material = sc.next();
		System.out.print("Объём мяча: ");
		soccer.value = sc.nextInt();
		System.out.println();
		System.out.println(soccer);
		System.out.println();
		Shape newshape = new Shape();
		System.out.print("Название фигуры: ");
		newshape.name = sc.next();
		System.out.print("Объём фигуры: ");
		newshape.value = sc.nextInt();
		System.out.println();
		System.out.println(newshape);
		System.out.println();
	}
}