
public class testGreeter {
	public static void main(String[] args) {
		Greeter bob=new Greeter();
		System.out.println(bob.toString());
		Greeter[] array = {new Greeter(),new Greeter(), new Greeter()};
		for(Greeter bib:array) {
			System.out.println(bib.toString());
		}
	}
}
