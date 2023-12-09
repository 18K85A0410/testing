package Corejavaconcepts;

public class Childaircraft extends Parentaircraft{
public static void main(String[] args) {
	Childaircraft c = new Childaircraft();
	c.bodycolor();
	c.Engine();
	c.Safety();
}
	@Override
	public void bodycolor() {
	System.out.println("Red");
		
	}

}
