
public class Greeter {
	private String name;
	private int age;
	
	public Greeter() {
		name="Thomas";
		age=10;
	}
	public Greeter(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return "Greeter|age: "+age+"name: "+name;
	}
}
