package helloworld1;

public class InterfaceTwoClass implements InterfaceTwo{
	public void itcMethod() {
		System.out.println("interface two class method.");
	}

	@Override
	public void doSomethingForInterfaceTwo() {
		// TODO Auto-generated method stub
		System.out.println("InterfaceTwoExample: doSomethingForInterfaceTwo method.");
	}

}
