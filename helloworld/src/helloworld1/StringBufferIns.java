package helloworld1;

public class StringBufferIns { //String type is immutable, but StringBuffer class can manipulate
	StringBuffer sb;
	public StringBufferIns(StringBuffer sb) {
		this.sb = sb;
	}
	public StringBuffer getStringBuffer() {
		return this.sb;
	}

}
