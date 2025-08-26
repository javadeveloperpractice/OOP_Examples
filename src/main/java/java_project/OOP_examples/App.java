package java_project.OOP_examples;

import java_project.OOP_examples.Abstraction.CalculatorService;
import java_project.OOP_examples.Abstraction.CalculatorServiceImpl;
import java_project.OOP_examples.Abstraction.CoffeMachineButton;
import java_project.OOP_examples.Encapsulation.Employee;
import java_project.OOP_examples.Inheritance.Figures;
import java_project.OOP_examples.Inheritance.Square;
import java_project.OOP_examples.Polymorphism.Animal;
import java_project.OOP_examples.Polymorphism.Cat;
import java_project.OOP_examples.Polymorphism.Dog;
import java_project.OOP_examples.Polymorphism.Printer;

public class App {
	public static void main(String[] args) {
		
		// Encapsulation example:
		
		Employee employee = new Employee("John Doe", 30, 50000, "IT");
		employee.setAge(31);
		System.out.println(employee.getName() + " Employee age: " + employee.getAge());
		
		//----------------------------------------------
		
		
		// Inheritance example:
		
		Figures figureSquare = new Square("Red", 5, 5);
		System.out.println("Square color: " + figureSquare.getColor());
		
		//----------------------------------------------
		
		
		// Polymorphism example:
		
		 // - Method Overriding example:
		Animal dog = new Dog();
		Animal cat = new Cat();
		dog.sound();
		cat.sound();
		
		 // - Method Overloading example:
		Printer printer = new Printer();
		printer.print("Hello, World!");
		printer.print(700);
		printer.print("Age:", 31);
		
		//----------------------------------------------
		
		
		// Abstraction example:
		
		  // - Method Interface example:
		int a = 10;
		int b = 5;
		CalculatorService calculator = new CalculatorServiceImpl();
		System.out.println("Addition: " + calculator.add(a, b));
		System.out.println("Subtraction: " + calculator.subtract(a, b));
		System.out.println("Multiplication: " + calculator.multiply(a, b));
		System.out.println("Division: " + calculator.divide(a, b));
		
		
		  // - Abstract Class example:
		CoffeMachineButton myCoffeMachine = new CoffeMachineButton();
		myCoffeMachine.startMachine();
		myCoffeMachine.stopMachine();
		
		//----------------------------------------------
	}
}
