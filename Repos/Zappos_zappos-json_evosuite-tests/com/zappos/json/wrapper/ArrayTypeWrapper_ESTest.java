/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 14:16:56 GMT 2024
 */

package com.zappos.json.wrapper;

import org.junit.Test;
import static org.junit.Assert.*;
import com.zappos.json.wrapper.ArrayTypeWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ArrayTypeWrapper_ESTest extends ArrayTypeWrapper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayTypeWrapper<Object> arrayTypeWrapper0 = new ArrayTypeWrapper<Object>();
      Class<Object> class0 = Object.class;
      arrayTypeWrapper0.setTarget(class0);
      Class class1 = (Class)arrayTypeWrapper0.getTarget();
      assertFalse(class1.isInterface());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayTypeWrapper<Object> arrayTypeWrapper0 = new ArrayTypeWrapper<Object>();
      Class<Object> class0 = Object.class;
      arrayTypeWrapper0.setComponentType(class0);
      Class<?> class1 = arrayTypeWrapper0.getComponentType();
      assertFalse(class1.isArray());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayTypeWrapper<Object> arrayTypeWrapper0 = new ArrayTypeWrapper<Object>();
      Object object0 = arrayTypeWrapper0.getTarget();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayTypeWrapper<Object> arrayTypeWrapper0 = new ArrayTypeWrapper<Object>();
      Class<?> class0 = arrayTypeWrapper0.getComponentType();
      assertNull(class0);
  }
}
