/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 05:05:11 GMT 2024
 */

package org.jinstagram.realtime;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Meta;
import org.jinstagram.realtime.SubscriptionsListResponse;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SubscriptionsListResponse_ESTest extends SubscriptionsListResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SubscriptionsListResponse subscriptionsListResponse0 = new SubscriptionsListResponse();
      Meta meta0 = new Meta();
      subscriptionsListResponse0.setMeta(meta0);
      Meta meta1 = subscriptionsListResponse0.getMeta();
      assertEquals(0, meta1.getCode());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SubscriptionsListResponse subscriptionsListResponse0 = new SubscriptionsListResponse();
      Meta meta0 = new Meta();
      meta0.setCode((-3326));
      subscriptionsListResponse0.setMeta(meta0);
      Meta meta1 = subscriptionsListResponse0.getMeta();
      assertSame(meta1, meta0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SubscriptionsListResponse subscriptionsListResponse0 = new SubscriptionsListResponse();
      Meta meta0 = subscriptionsListResponse0.getMeta();
      assertNull(meta0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SubscriptionsListResponse subscriptionsListResponse0 = new SubscriptionsListResponse();
      Meta meta0 = new Meta();
      subscriptionsListResponse0.setMeta(meta0);
      meta0.setCode(521);
      Meta meta1 = subscriptionsListResponse0.getMeta();
      assertNull(meta1.getErrorType());
  }
}
