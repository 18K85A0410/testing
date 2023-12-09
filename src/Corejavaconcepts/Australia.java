package Corejavaconcepts;

public class Australia implements Centraltrafficteam,Continental {
public static void main(String[] args) {
	Centraltrafficteam a = new Australia();
	a.Redsignal();
	a.Greensignal();
	a.Yellowsignal();
	Australia b = new Australia();
	b.Walk();
	Continental c = new Australia();
	c.Train();
}
	@Override
	public void Redsignal() {
	System.out.println("red is for Stop");
		
	}
	public void Engine() {
		System.out.println("hello");
	}

	@Override
	public void Greensignal() {
	System.out.println("Green is to Go");
		
	}
	public void Walk() {
		System.out.println("walking");
	}

	@Override
	public void Yellowsignal() {
    System.out.println("Yellow is for wait");
		
	}
	@Override
	public void Train() {
	System.out.println("train");
		
	}

}
