package helloworld1;

public class InterfaceOneClass implements InterfaceOne {
	
	public void iocMethod() {
		System.out.println("interface one class method.");
	}

	@Override
	public void doSomethingForInterfaceOne() {
		// TODO Auto-generated method stub
		System.out.println("InterfaceOneExample: doSomethingForInterfaceOne method.");
	}
	
}
