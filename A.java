package interfaceDemo;

/*
 * Author Anish
 * Visit the channel http://youtube.com/zarigatongy
 */
public interface A {

	void sayHello();

	default void dontSayHello() {
		System.out.println("Hello Interface Demo");
	}

}
