package helloworld1;

enum TrafficLight {
	RED("stop"), GREEN("go"), YELLOW("wait");
	
	private String action;
	
	//Parameterized constructor for enum, private!
	private TrafficLight(String action) {
		this.action = action;
	}
	
	public String getAction() {
		return this.action;
	}

}
