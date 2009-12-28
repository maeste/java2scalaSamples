package it.javalinux.samples.java.post3;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;



public class VariablesAndFunctionsTest {
	
	
    @Test
    public void testAccessToPublicVar() {
    	VariablesAndFunctions instance = new VariablesAndFunctions();
    	instance.fooIntVar = 12;
    	assertTrue(instance.fooIntVar == 12);
    }
    
    @Test
    public void  testAccessToPublicVal()  {
    	VariablesAndFunctions instance = new VariablesAndFunctions();
    	// It doesn't compile...you can't reassign a final property
    	//instance.fooStringVal = "anotherString"
    	assertTrue(instance.fooStringVal.equals("fooString") );
    	assertFalse(instance.fooStringVal == new String("fooString") );
    }
    
    @Test
    public void  testAccessToPrivateVar()  {
    	VariablesAndFunctions instance = new VariablesAndFunctions();
    	instance.setPrivateIntVar(12);
    	assertTrue(instance.getPrivateIntVar() == 12);
    }
    
    @Test
    public void  testEmptyConstructor()  {
    	VariablesAndFunctions instance = new VariablesAndFunctions();
    	assertTrue(instance.getInputString().equals("defaultString"));
    	assertFalse(instance.getInputString() == new String("defaultString") );
    }
    
    @Test
    public void  testConstructor()  {
    	VariablesAndFunctions instance = new VariablesAndFunctions("myString");
    	assertTrue(instance.getInputString().equals("myString"));
    	assertFalse(instance.getInputString() == new String("myString") );
    }


}


