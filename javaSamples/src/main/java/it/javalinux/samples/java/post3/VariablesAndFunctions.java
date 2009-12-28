package it.javalinux.samples.java.post3;

class VariablesAndFunctions {
  
	private final String inputString;
	
	public int fooIntVar = 11;
	public final String fooStringVal = "fooString";  
	private double privateIntVar = 1.1; 
	private final String privateStringVal = "fooString";
	
	public VariablesAndFunctions(String inputString) {
		//it could compile! and if you uncomment the line tests will fail
		//inputString = inputString + "hasBeenModified";
		this.inputString = inputString;
		//it doesent compile because you have already assigned the final property 
		//this.inputString = inputString + "hasBeenModified";
		System.out.println("Created VariablesAndFunctions with inputString=" + inputString);
	}
	
	public VariablesAndFunctions() {
		this("defaultString");
	}

	public String getInputString() {
		return inputString;
	}

	public String getFooStringVal() {
		return fooStringVal;
	}

// i. You can't re-assign a final variable
//	public void setFooStringVal(String fooStringVal) {
//		this.fooStringVal = fooStringVal;
//	}

	public double getPrivateIntVar() {
		return privateIntVar;
	}

	public void setPrivateIntVar(double privateIntVar) {
		this.privateIntVar = privateIntVar;
	}

	public int getFooIntVar() {
		return fooIntVar;
	}

	public String getPrivateStringVal() {
		return privateStringVal;
	}

	public void setFooIntVar(int fooIntVar) {
		this.fooIntVar = fooIntVar;
	}
   

}