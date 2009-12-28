package it.javalinux.samples.scala.post3

import org.junit._
import Assert._

@Test
class VariablesAndFunctionsTest {

    @Test
    def testAccessToPublicVar() = {
    	val instance = new VariablesAndFunctions()
    	instance.fooIntVar = 12
    	assertTrue(instance.fooIntVar == 12)
    }
    
    @Test
    def testAccessToPublicVal() = {
    	val instance = new VariablesAndFunctions()
    	// It doesn't compile...you can't reassign val

    	//instance.fooStringVal = "anotherString"
    	assertTrue(instance.fooStringVal == new String("fooString") )
        assertFalse(instance.fooStringVal eq new String("fooString") )
    }
    
    @Test
    def testAccessToPrivateVar() = {
    	val instance = new VariablesAndFunctions()
    	instance.setPrivateVarIntVar(12)
    	assertTrue(instance.getPrivateVarIntVar == 12)
    }
    
    @Test
    def testEmptyConstructor() = {
    	val instance = new VariablesAndFunctions()
    	assertTrue(instance.inputString == new String("defaultString") )
        assertFalse(instance.inputString eq new String("defaultString") )
    }
    
    @Test
    def testConstructor() = {
    	val instance = new VariablesAndFunctions("myString")
    	assertTrue(instance.inputString == new String("myString") )
        assertFalse(instance.inputString eq new String("myString") )
    }


}


