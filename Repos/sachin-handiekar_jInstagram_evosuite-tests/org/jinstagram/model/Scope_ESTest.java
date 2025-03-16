/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:57:25 GMT 2024
 */

package org.jinstagram.model;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.model.Scope;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Scope_ESTest extends Scope_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Scope[] scopeArray0 = Scope.values();
      assertEquals(4, scopeArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Scope scope0 = Scope.valueOf("COMMENTS");
      assertEquals(Scope.COMMENTS, scope0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Scope scope0 = Scope.RELATIONSHIPS;
      String string0 = scope0.toString();
      assertEquals("relationships", string0);
  }
}
