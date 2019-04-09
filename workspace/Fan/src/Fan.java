
public class Fan {
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	private int speed;
	private double radius;
	private boolean on;
	String color;
	public int getSpeed() {
		return speed;
	}
	public double getRadius() {
		return radius;
	}
	public boolean getOn() {
		return on;
	}
	public String getColor() {
		return color;
	}
	public void changeSpeed(int speed) {
		this.speed = speed;
	}
	public void changeRadius(double radius) {
		this.radius = radius;
	}
	public void turnOn(boolean on) {
		this.on = on;
	}
	public void changeColor(String color) {
		this.color = color;
	}
	Fan() {
		speed = 1;
		radius = 5;
		color = "blue";
		on = false;
	}
	public String toString() {
		return "Fan speed: " + speed + ", color: " + color + ", radius: " + radius +
				"Fan color: blue, radius: 5.0" +
				"fan is off";
	}
}
