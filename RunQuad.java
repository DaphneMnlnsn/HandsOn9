import java.util.Scanner;

public class RunQuad {
	public static void main(String[] args) {
            while(true){
		Scanner scn = new Scanner(System.in);
		System.out.print("Press R for Rectangle or S for Square. ");
		char choice = scn.next().toUpperCase().charAt(0);
		if(choice == 'R') {
			System.out.println("A rectangle:");
			Rectangle r = new Rectangle();
			r.showDescription();
                        break;
		}
		if(choice == 'S') {
			System.out.println("A square:");
			Square s = new Square();
			s.showDescription();
                        break;
		}
                else{
                    System.out.println("Invalid input. Please try again.\n");
                }
            }
	}
}

class Quadrilateral{
	public void showDescription() {
		System.out.println("- is quadrilateral");
	}
}

class Rectangle extends Quadrilateral{
	public void showDescription() {
		System.out.println("- has 4 right angles");
		super.showDescription();
	}
}
class Square extends Rectangle{
	public void showDescription() {
		System.out.println("- has 4 equal sides");
		 super.showDescription();
	}
}
