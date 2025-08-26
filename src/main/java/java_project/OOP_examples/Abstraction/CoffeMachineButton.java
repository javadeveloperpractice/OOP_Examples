package java_project.OOP_examples.Abstraction;

public class CoffeMachineButton extends CoffeMachine {
	// The body of startMachine() is provided here
	@Override
	public boolean startMachine() {
		System.out.println("The coffee machine is starting...");
		return true;
	}

	@Override
	public boolean stopMachine() {
		System.out.println("The coffee machine is stopping...");
		return false;
	}

}
