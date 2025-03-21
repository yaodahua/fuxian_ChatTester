/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:12:15 GMT 2024
 */

package org.jinstagram.auth.exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.auth.exceptions.OAuthException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OAuthException_ESTest extends OAuthException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OAuthException oAuthException0 = new OAuthException("ry 1}L[68U");
      OAuthException oAuthException1 = new OAuthException("PT+fQRnP`*k&m&pS6", oAuthException0);
      assertFalse(oAuthException1.equals((Object)oAuthException0));
  }
}
