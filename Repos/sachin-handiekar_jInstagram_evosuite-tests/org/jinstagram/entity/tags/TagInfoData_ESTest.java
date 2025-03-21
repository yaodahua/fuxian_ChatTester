/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:12:33 GMT 2024
 */

package org.jinstagram.entity.tags;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.tags.TagInfoData;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TagInfoData_ESTest extends TagInfoData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TagInfoData tagInfoData0 = new TagInfoData();
      tagInfoData0.setTagName("TagInfoData [mediaCount=%s, tagName=%s]");
      String string0 = tagInfoData0.getTagName();
      assertEquals("TagInfoData [mediaCount=%s, tagName=%s]", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TagInfoData tagInfoData0 = new TagInfoData();
      tagInfoData0.setTagName("");
      String string0 = tagInfoData0.getTagName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TagInfoData tagInfoData0 = new TagInfoData();
      tagInfoData0.setMediaCount(81L);
      long long0 = tagInfoData0.getMediaCount();
      assertEquals(81L, long0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TagInfoData tagInfoData0 = new TagInfoData();
      tagInfoData0.setMediaCount((-881L));
      long long0 = tagInfoData0.getMediaCount();
      assertEquals((-881L), long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TagInfoData tagInfoData0 = new TagInfoData();
      long long0 = tagInfoData0.getMediaCount();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TagInfoData tagInfoData0 = new TagInfoData();
      String string0 = tagInfoData0.toString();
      assertEquals("TagInfoData [mediaCount=0, tagName=null]", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TagInfoData tagInfoData0 = new TagInfoData();
      String string0 = tagInfoData0.getTagName();
      assertNull(string0);
  }
}
