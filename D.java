package interfaceDemo;

/*
 * Author Anish
 * Visit the channel http://youtube.com/zarigatongy
 */
public interface D {
	
	default void dontSayHelloAgain() {
		System.out.println("Hello Interface Demo");
	}

}
