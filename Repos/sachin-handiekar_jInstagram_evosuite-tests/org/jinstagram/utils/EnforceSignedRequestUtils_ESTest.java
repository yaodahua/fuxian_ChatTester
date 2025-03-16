/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 05:11:49 GMT 2024
 */

package org.jinstagram.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.utils.EnforceSignedRequestUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EnforceSignedRequestUtils_ESTest extends EnforceSignedRequestUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      // Undeclared exception!
      try { 
        EnforceSignedRequestUtils.signature("~${%tAVEHEh$y[F#", hashMap0, "%s=%s");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("org.jinstagram.utils.EnforceSignedRequestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      // Undeclared exception!
      try { 
        EnforceSignedRequestUtils.signature((String) null, hashMap0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jinstagram.utils.EnforceSignedRequestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      // Undeclared exception!
      try { 
        EnforceSignedRequestUtils.signature("", hashMap0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("+3r-h=>3", "+3r-h=>3");
      // Undeclared exception!
      try { 
        EnforceSignedRequestUtils.signature("+3r-h=>3", hashMap0, "+3r-h=>3");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("org.jinstagram.utils.EnforceSignedRequestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EnforceSignedRequestUtils enforceSignedRequestUtils0 = new EnforceSignedRequestUtils();
  }
}
