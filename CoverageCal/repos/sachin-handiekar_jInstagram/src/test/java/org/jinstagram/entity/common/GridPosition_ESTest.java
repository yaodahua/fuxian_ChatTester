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


@Test(timeout = 4000)
public void test0() throws Throwable {
    GridPosition gridPosition0 = new GridPosition();
    gridPosition0.setY(405.93);
    double double0 = gridPosition0.getY();
    assertEquals(405.93, double0, 0.01);
}


@Test(timeout = 4000)
public void test1() throws Throwable {
    GridPosition gridPosition0 = new GridPosition();
    gridPosition0.setX(1.0);
    double double0 = gridPosition0.getX();
    assertEquals(1.0, double0, 0.01);
}

}
