/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 13:56:57 GMT 2024
 */

package com.zappos.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.JsonReaderInvoker;
import com.zappos.json.ZapposJson;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JsonReaderInvoker_ESTest extends JsonReaderInvoker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ZapposJson zapposJson0 = ZapposJson.getInstance();
      Class<Object> class0 = Object.class;
      JsonReaderInvoker jsonReaderInvoker0 = null;
      try {
        jsonReaderInvoker0 = new JsonReaderInvoker(zapposJson0, class0);
        fail("Expecting exception: NoSuchMethodException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ZapposJson zapposJson0 = new ZapposJson();
      JsonReaderInvoker jsonReaderInvoker0 = null;
      try {
        jsonReaderInvoker0 = new JsonReaderInvoker(zapposJson0, (Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.zappos.json.JsonReaderInvoker", e);
      }
  }
}
