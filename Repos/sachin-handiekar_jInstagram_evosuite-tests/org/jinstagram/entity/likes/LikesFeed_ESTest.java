/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:59:43 GMT 2024
 */

package org.jinstagram.entity.likes;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.common.User;
import org.jinstagram.entity.likes.LikesFeed;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LikesFeed_ESTest extends LikesFeed_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LikesFeed likesFeed0 = new LikesFeed();
      LinkedList<User> linkedList0 = new LinkedList<User>();
      User user0 = new User();
      linkedList0.add(user0);
      likesFeed0.setUserList(linkedList0);
      List<User> list0 = likesFeed0.getUserList();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LikesFeed likesFeed0 = new LikesFeed();
      Meta meta0 = new Meta();
      likesFeed0.setMeta(meta0);
      Meta meta1 = likesFeed0.getMeta();
      assertEquals(0, meta1.getCode());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LikesFeed likesFeed0 = new LikesFeed();
      Meta meta0 = new Meta();
      meta0.setCode((-1));
      likesFeed0.setMeta(meta0);
      Meta meta1 = likesFeed0.getMeta();
      assertEquals((-1), meta1.getCode());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LikesFeed likesFeed0 = new LikesFeed();
      LinkedList<User> linkedList0 = new LinkedList<User>();
      likesFeed0.setUserList(linkedList0);
      List<User> list0 = likesFeed0.getUserList();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LikesFeed likesFeed0 = new LikesFeed();
      String string0 = likesFeed0.toString();
      assertEquals("LikesFeed [meta=null, userList=null]", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LikesFeed likesFeed0 = new LikesFeed();
      List<User> list0 = likesFeed0.getUserList();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LikesFeed likesFeed0 = new LikesFeed();
      Meta meta0 = likesFeed0.getMeta();
      assertNull(meta0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LikesFeed likesFeed0 = new LikesFeed();
      Meta meta0 = new Meta();
      likesFeed0.setMeta(meta0);
      meta0.setCode(3102);
      Meta meta1 = likesFeed0.getMeta();
      assertNull(meta1.getErrorType());
  }
}
