/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:30:22 GMT 2024
 */

package org.jinstagram.entity.comments;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.comments.CommentData;
import org.jinstagram.entity.comments.MediaCommentResponse;
import org.jinstagram.entity.common.Meta;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class MediaCommentResponse_ESTest extends MediaCommentResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MediaCommentResponse mediaCommentResponse0 = new MediaCommentResponse();
      Meta meta0 = new Meta();
      mediaCommentResponse0.setMeta(meta0);
      Meta meta1 = mediaCommentResponse0.getMeta();
      assertNull(meta1.getErrorType());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MediaCommentResponse mediaCommentResponse0 = new MediaCommentResponse();
      Meta meta0 = new Meta();
      meta0.setCode(3);
      mediaCommentResponse0.setMeta(meta0);
      Meta meta1 = mediaCommentResponse0.getMeta();
      assertEquals(3, meta1.getCode());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MediaCommentResponse mediaCommentResponse0 = new MediaCommentResponse();
      Meta meta0 = new Meta();
      meta0.setCode((-1717));
      mediaCommentResponse0.setMeta(meta0);
      Meta meta1 = mediaCommentResponse0.getMeta();
      assertEquals((-1717), meta1.getCode());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MediaCommentResponse mediaCommentResponse0 = new MediaCommentResponse();
      CommentData commentData0 = new CommentData();
      mediaCommentResponse0.setCommentData(commentData0);
      CommentData commentData1 = mediaCommentResponse0.getCommentData();
      assertNull(commentData1.getId());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MediaCommentResponse mediaCommentResponse0 = new MediaCommentResponse();
      Meta meta0 = mediaCommentResponse0.getMeta();
      assertNull(meta0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MediaCommentResponse mediaCommentResponse0 = new MediaCommentResponse();
      CommentData commentData0 = mediaCommentResponse0.getCommentData();
      assertNull(commentData0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MediaCommentResponse mediaCommentResponse0 = new MediaCommentResponse();
      String string0 = mediaCommentResponse0.toString();
      assertEquals("MediaCommentResponse [commentData=null, meta=null]", string0);
  }
}
