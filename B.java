package interfaceDemo;

/*
 * Author Anish
 * Visit the channel http://youtube.com/zarigatongy
 */

public class B  implements A,D{
	
	@Override
	public void sayHello()
	{
		
	}
	
	public static void main(String[] args) {
		B b  = new B();
		b.dontSayHello(); //from A
		b.dontSayHelloAgain(); //from D
	}

}
