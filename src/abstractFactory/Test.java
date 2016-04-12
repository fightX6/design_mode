package abstractFactory;

public class Test {
	public static void main(String[] args) {
		System.out.println("抽象工厂模式");
		System.out.println("工 厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则，所以，从设计角度考虑，有一定的 问题，如何解决？就用到抽象工厂模式，创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码");
		System.out.println("如果你现在想增加一个功能：发及时信息，则只需做一个实现类，实现Sender接口，同时做一个工厂类，实现Provider接口，就OK了，无需去改动现成的代码。这样做，拓展性较好！");
		Provider provider = new SendMailFactory();  
        Sender sender = provider.produce();  
        sender.send(); 
        Provider provider1 = new SendSmsFactory();  
        Sender sender1 = provider1.produce();  
        sender1.send(); 
	}
	
}
