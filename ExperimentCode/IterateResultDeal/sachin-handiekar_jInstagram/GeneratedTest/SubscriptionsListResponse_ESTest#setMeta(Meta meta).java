// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/realtime/SubscriptionsListResponse_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 05:05:11 GMT 2024
 */
package org.jinstagram.realtime;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Meta;
import org.jinstagram.realtime.SubscriptionsListResponse;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class SubscriptionsListResponse_ESTest extends SubscriptionsListResponse_ESTest_scaffolding {
    @Test
    public void testSetMeta() {
        // Given
        SubscriptionsListResponse subscriptionsListResponse = new SubscriptionsListResponse();
        Meta meta = new Meta();
        meta.setCode(200);
        meta.setErrorType("testError");
        
        // When
        subscriptionsListResponse.setMeta(meta);
        
        // Then
        Meta updatedMeta = subscriptionsListResponse.getMeta();
        assertEquals(200, updatedMeta.getCode());
        assertEquals("testError", updatedMeta.getErrorType());
    }
}
