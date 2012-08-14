package com.mangrove.core;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.mangrove.processed.StoredSugar;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void sugarInnerClassTest(){
    	Sugar sugar = new Sugar();
    	ComplexSugar complexSugar = new ComplexSugar();
    	StoredSugar storedSugar = new StoredSugar();
    	
    	//Make sure the inner class is STATIC on test
    	Sugar.PublicStaticInnerClass sugarPublicStatic = new Sugar.PublicStaticInnerClass();
    	
    	//If innerclass is public and non static, then we must have an instance of outer class and call the .new operator to access the inner classes constructor
    	Sugar.PublicInnerClass publicInnerClass = sugar.new PublicInnerClass();
    }
}
