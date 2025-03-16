/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:15:21 GMT 2024
 */

package org.jinstagram.auth;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetAddress;
import java.net.Proxy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.jinstagram.auth.InstagramAuthService;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class InstagramAuthService_ESTest extends InstagramAuthService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InstagramAuthService instagramAuthService0 = new InstagramAuthService();
      // Undeclared exception!
      try { 
        instagramAuthService0.build();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("org.jinstagram.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InstagramAuthService instagramAuthService0 = new InstagramAuthService();
      // Undeclared exception!
      try { 
        instagramAuthService0.apiKey("P]");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("org.jinstagram.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InstagramAuthService instagramAuthService0 = new InstagramAuthService();
      // Undeclared exception!
      try { 
        instagramAuthService0.display((String) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("org.jinstagram.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      InstagramAuthService instagramAuthService0 = new InstagramAuthService();
      // Undeclared exception!
      try { 
        instagramAuthService0.callback(".E~GUc;tF1R");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("org.jinstagram.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      InstagramAuthService instagramAuthService0 = new InstagramAuthService();
      // Undeclared exception!
      try { 
        instagramAuthService0.apiSecret("Qc|?>8@&g.(+V<v%");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("org.jinstagram.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      InstagramAuthService instagramAuthService0 = new InstagramAuthService();
      Proxy.Type proxy_Type0 = Proxy.Type.HTTP;
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(inetAddress0, 0);
      Proxy proxy0 = new Proxy(proxy_Type0, mockInetSocketAddress0);
      InstagramAuthService instagramAuthService1 = instagramAuthService0.proxy(proxy0);
      assertSame(instagramAuthService1, instagramAuthService0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      InstagramAuthService instagramAuthService0 = new InstagramAuthService();
      // Undeclared exception!
      try { 
        instagramAuthService0.scope(",+");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("org.jinstagram.utils.Preconditions", e);
      }
  }
}
