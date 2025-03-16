/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:34:30 GMT 2024
 */

package org.jinstagram.entity.users.feed;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.users.feed.UserFeedData;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UserFeedData_ESTest extends UserFeedData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UserFeedData userFeedData0 = new UserFeedData();
      userFeedData0.setWebsite("UserFeedData [id=%s, profilePictureUrl=%s, userName=%s, fullName=%s, website=%s, bio=%s]");
      String string0 = userFeedData0.getWebsite();
      assertEquals("UserFeedData [id=%s, profilePictureUrl=%s, userName=%s, fullName=%s, website=%s, bio=%s]", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UserFeedData userFeedData0 = new UserFeedData();
      userFeedData0.setUserName("r5GwG@&");
      String string0 = userFeedData0.getUserName();
      assertEquals("r5GwG@&", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UserFeedData userFeedData0 = new UserFeedData();
      userFeedData0.setUserName("");
      String string0 = userFeedData0.getUserName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UserFeedData userFeedData0 = new UserFeedData();
      userFeedData0.setProfilePictureUrl("UserFeedData [id=null, profilePictureUrl=null, userName=0a[$^RQ_+5J7}'0>|, fullName=null, website=null, bio=hI5pm.XR*]");
      String string0 = userFeedData0.getProfilePictureUrl();
      assertEquals("UserFeedData [id=null, profilePictureUrl=null, userName=0a[$^RQ_+5J7}'0>|, fullName=null, website=null, bio=hI5pm.XR*]", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UserFeedData userFeedData0 = new UserFeedData();
      userFeedData0.setProfilePictureUrl("");
      String string0 = userFeedData0.getProfilePictureUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UserFeedData userFeedData0 = new UserFeedData();
      userFeedData0.setLastName("");
      String string0 = userFeedData0.getLastName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UserFeedData userFeedData0 = new UserFeedData();
      userFeedData0.setId("R&\"d?[");
      String string0 = userFeedData0.getId();
      assertEquals("R&\"d?[", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UserFeedData userFeedData0 = new UserFeedData();
      userFeedData0.setFullName("Fda/4.k:A`1Vw");
      String string0 = userFeedData0.getFullName();
      assertEquals("Fda/4.k:A`1Vw", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UserFeedData userFeedData0 = new UserFeedData();
      userFeedData0.setFullName("");
      String string0 = userFeedData0.getFullName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UserFeedData userFeedData0 = new UserFeedData();
      userFeedData0.setFirstName("UserFeedData [id=%s, profilePictureUrl=%s, userName=%s, fullName=%s, website=%s, bio=%s]");
      String string0 = userFeedData0.getFirstName();
      assertEquals("UserFeedData [id=%s, profilePictureUrl=%s, userName=%s, fullName=%s, website=%s, bio=%s]", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UserFeedData userFeedData0 = new UserFeedData();
      userFeedData0.setBio("UserFeedData [id=%s, profilePictureUrl=%s, userName=%s, fullName=%s, website=%s, bio=%s]");
      String string0 = userFeedData0.getBio();
      assertEquals("UserFeedData [id=%s, profilePictureUrl=%s, userName=%s, fullName=%s, website=%s, bio=%s]", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UserFeedData userFeedData0 = new UserFeedData();
      String string0 = userFeedData0.getWebsite();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UserFeedData userFeedData0 = new UserFeedData();
      String string0 = userFeedData0.getFullName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UserFeedData userFeedData0 = new UserFeedData();
      String string0 = userFeedData0.getFirstName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UserFeedData userFeedData0 = new UserFeedData();
      String string0 = userFeedData0.getBio();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UserFeedData userFeedData0 = new UserFeedData();
      userFeedData0.setBio("");
      String string0 = userFeedData0.getBio();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UserFeedData userFeedData0 = new UserFeedData();
      String string0 = userFeedData0.toString();
      assertEquals("UserFeedData [id=null, profilePictureUrl=null, userName=null, fullName=null, website=null, bio=null]", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UserFeedData userFeedData0 = new UserFeedData();
      userFeedData0.setWebsite("");
      String string0 = userFeedData0.getWebsite();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UserFeedData userFeedData0 = new UserFeedData();
      String string0 = userFeedData0.getLastName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UserFeedData userFeedData0 = new UserFeedData();
      userFeedData0.setLastName("UserFeedData [id=%s, profilePictureUrl=%s, userName=%s, fullName=%s, website=%s, bio=%s]");
      String string0 = userFeedData0.getLastName();
      assertEquals("UserFeedData [id=%s, profilePictureUrl=%s, userName=%s, fullName=%s, website=%s, bio=%s]", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UserFeedData userFeedData0 = new UserFeedData();
      userFeedData0.setId("");
      String string0 = userFeedData0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UserFeedData userFeedData0 = new UserFeedData();
      userFeedData0.setFirstName("");
      String string0 = userFeedData0.getFirstName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UserFeedData userFeedData0 = new UserFeedData();
      String string0 = userFeedData0.getUserName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UserFeedData userFeedData0 = new UserFeedData();
      String string0 = userFeedData0.getProfilePictureUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UserFeedData userFeedData0 = new UserFeedData();
      String string0 = userFeedData0.getId();
      assertNull(string0);
  }
}
