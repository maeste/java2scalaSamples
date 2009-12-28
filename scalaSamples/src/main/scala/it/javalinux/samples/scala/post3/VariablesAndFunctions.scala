package it.javalinux.samples.scala.post3

class VariablesAndFunctions(val inputString : String) {
  
    println("Created VariablesAndFunctions with inputString=" + inputString);
  
    // it doesnt compile
    // inputString = inputString + "hasBeenModified";
    
	def this() = this("defaultString")
  
	var fooIntVar : Int = 11
	val fooStringVal = "fooString"  
	private var privateIntVar = 1.1 
	private val privateStringVal = "fooString"
 
	def getPrivateVarIntVar() = privateIntVar
	
	def getPrivateStringVal() = privateStringVal
 
	def setPrivateVarIntVar(x : Int) {
	  privateIntVar = x
   	}
	
// It doesn't compile...you can't reassign val
//	def setPrivateStringVal(s : String) {
//	  privateStringVal = s;
//    }
	
   

}
