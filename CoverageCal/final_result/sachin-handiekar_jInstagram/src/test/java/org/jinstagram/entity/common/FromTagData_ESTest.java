/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:38:11 GMT 2024
 */
package org.jinstagram.entity.common;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.FromTagData;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class FromTagData_ESTest extends FromTagData_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        FromTagData fromTagData0 = new FromTagData();
        fromTagData0.setUsername("zL9g");
        String string0 = fromTagData0.getUsername();
        assertEquals("zL9g", string0);
    }
    
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        FromTagData fromTagData0 = new FromTagData();
        fromTagData0.setUsername("zL9g");
        String string0 = fromTagData0.getUsername();
        assertEquals("zL9g", string0);
    }
    
    @Test(timeout = 4000)
    public void test02() throws Throwable {
        FromTagData fromTagData0 = new FromTagData();
        fromTagData0.setProfilePicture("GOVl:-=@x^Bh_");
        String string0 = fromTagData0.getProfilePicture();
        assertEquals("GOVl:-=@x^Bh_", string0);
    }
    
    @Test(timeout = 4000)
    public void test02() throws Throwable {
        FromTagData fromTagData0 = new FromTagData();
        fromTagData0.setProfilePicture("GOVl:-=@x^Bh_");
        String string0 = fromTagData0.getProfilePicture();
        assertEquals("GOVl:-=@x^Bh_", string0);
    }
    
    @Test(timeout = 4000)
    public void test05() throws Throwable {
        FromTagData fromTagData0 = new FromTagData();
        fromTagData0.setFullName("GOVl:-=@x^Bh_");
        String string0 = fromTagData0.getFullName();
        assertEquals("GOVl:-=@x^Bh_", string0);
    }
    
    @Test(timeout = 4000)
    public void test05() throws Throwable {
        FromTagData fromTagData0 = new FromTagData();
        fromTagData0.setFullName("GOVl:-=@x^Bh_");
        String string0 = fromTagData0.getFullName();
        assertEquals("GOVl:-=@x^Bh_", string0);
    }
}
