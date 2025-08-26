package java_project.OOP_examples.Polymorphism;

public class Printer {
	
	public void print(String text) {
		System.out.println("Printing text: " + text);
	}
	
	public void print(int number) {
		System.out.println("Printing number: " + number);
	}
	
	public void print(String text, int number) {
		System.out.println("Printing text and number: " + text + " " + number);
	}
	
	
}
