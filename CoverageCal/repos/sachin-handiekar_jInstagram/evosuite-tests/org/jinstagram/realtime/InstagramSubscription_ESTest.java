/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:59:46 GMT 2024
 */

package org.jinstagram.realtime;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.InstagramConfig;
import org.jinstagram.realtime.InstagramSubscription;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class InstagramSubscription_ESTest extends InstagramSubscription_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InstagramSubscription instagramSubscription0 = new InstagramSubscription();
      String string0 = instagramSubscription0.toString();
      assertEquals("InstagramSubscription [callback_url=oob]", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InstagramSubscription instagramSubscription0 = new InstagramSubscription();
      InstagramConfig instagramConfig0 = new InstagramConfig();
      InstagramSubscription instagramSubscription1 = instagramSubscription0.requestConfiguration(instagramConfig0);
      assertSame(instagramSubscription0, instagramSubscription1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InstagramSubscription instagramSubscription0 = new InstagramSubscription();
      InstagramSubscription instagramSubscription1 = instagramSubscription0.requestConfiguration((InstagramConfig) null);
      assertSame(instagramSubscription1, instagramSubscription0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InstagramSubscription instagramSubscription0 = new InstagramSubscription();
      // Undeclared exception!
      try { 
        instagramSubscription0.radius("");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("org.jinstagram.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InstagramSubscription instagramSubscription0 = new InstagramSubscription();
      // Undeclared exception!
      try { 
        instagramSubscription0.verifyToken("InstagramSubscription [");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("org.jinstagram.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InstagramSubscription instagramSubscription0 = new InstagramSubscription();
      // Undeclared exception!
      try { 
        instagramSubscription0.callback((String) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("org.jinstagram.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InstagramSubscription instagramSubscription0 = new InstagramSubscription();
      // Undeclared exception!
      try { 
        instagramSubscription0.latitute(">r");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("org.jinstagram.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InstagramSubscription instagramSubscription0 = new InstagramSubscription();
      InstagramSubscription instagramSubscription1 = instagramSubscription0.objectId("$VALUES");
      assertSame(instagramSubscription0, instagramSubscription1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InstagramSubscription instagramSubscription0 = new InstagramSubscription();
      // Undeclared exception!
      try { 
        instagramSubscription0.aspect("+");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("org.jinstagram.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InstagramSubscription instagramSubscription0 = new InstagramSubscription();
      // Undeclared exception!
      try { 
        instagramSubscription0.clientSecret((String) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("org.jinstagram.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InstagramSubscription instagramSubscription0 = new InstagramSubscription();
      // Undeclared exception!
      try { 
        instagramSubscription0.clientId("");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("org.jinstagram.utils.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InstagramSubscription instagramSubscription0 = new InstagramSubscription();
      // Undeclared exception!
      try { 
        instagramSubscription0.longitude((String) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("org.jinstagram.utils.Preconditions", e);
      }
  }
}
