/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:38:49 GMT 2024
 */
package org.jinstagram.entity.common;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.GridPosition;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class GridPosition_ESTest extends GridPosition_ESTest_scaffolding {
    @Test 
    public void testGetX() { 
    System.out.println("getX");
    GridPosition instance = new GridPosition();
    double expResult = 0.0;
    double result = instance.getX();
    assertEquals(expResult, result, 0.0);
    }
    
}
