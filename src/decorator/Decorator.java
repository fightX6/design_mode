package decorator;

public class Decorator implements Sourceable{
	private Source source;
	public Decorator(Source source){
		super();
		this.source = source;
	}
	public void method(){
		System.out.println("before decorator!");
		source.method();
		System.out.println("after decorator!");
	}
}
