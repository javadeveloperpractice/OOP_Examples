package java_project.OOP_examples.Inheritance;

public class Figures {

	private String color;
	private int length;
	private int width;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public Figures() {
		super();
	}

	public Figures(String color, int length, int width) {
		super();
		this.color = color;
		this.length = length;
		this.width = width;
	}

}
