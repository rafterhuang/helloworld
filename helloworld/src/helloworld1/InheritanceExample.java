package helloworld1;

public class InheritanceExample {
	final StringBuffer sb = new StringBuffer("This is a stringbuffer constant");
	InheritanceExample() {
		System.out.println(sb);
	}
}

//do not use public, otherwise should define a separate file
//Any class, field, method or constructor that has no declared 
//access modifier is accessible only by classes in the same package.
class Sub extends InheritanceExample {
	Sub() {
		//Constructor declarations are not members. They are never inherited .
		//super();
		System.out.println("This is a subclass contructor.");
	}
}