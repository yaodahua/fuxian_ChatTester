/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 13:49:54 GMT 2024
 */

package com.zappos.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.JsonBeanAttribute;
import com.zappos.json.JsonBeanIntrospector;
import com.zappos.json.ZapposJson;
import com.zappos.json.format.NoOpValueFormatter;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JsonBeanIntrospector_ESTest extends JsonBeanIntrospector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ZapposJson zapposJson0 = ZapposJson.getInstance();
      JsonBeanIntrospector jsonBeanIntrospector0 = new JsonBeanIntrospector(zapposJson0);
      // Undeclared exception!
      try { 
        jsonBeanIntrospector0.getMutators((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.beans.Introspector", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ZapposJson zapposJson0 = ZapposJson.getInstance();
      JsonBeanIntrospector jsonBeanIntrospector0 = new JsonBeanIntrospector(zapposJson0);
      // Undeclared exception!
      try { 
        jsonBeanIntrospector0.getAccessors((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.beans.Introspector", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ZapposJson zapposJson0 = new ZapposJson(false);
      JsonBeanIntrospector jsonBeanIntrospector0 = new JsonBeanIntrospector(zapposJson0);
      Class<NoOpValueFormatter> class0 = NoOpValueFormatter.class;
      List<JsonBeanAttribute> list0 = jsonBeanIntrospector0.getAccessors(class0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ZapposJson zapposJson0 = new ZapposJson(false);
      JsonBeanIntrospector jsonBeanIntrospector0 = new JsonBeanIntrospector(zapposJson0);
      Class<NoOpValueFormatter> class0 = NoOpValueFormatter.class;
      List<JsonBeanAttribute> list0 = jsonBeanIntrospector0.getMutators(class0);
      assertEquals(1, list0.size());
  }
}
