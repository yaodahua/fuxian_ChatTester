// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/realtime/SubscriptionResponseObject_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 05:03:32 GMT 2024
 */
package org.jinstagram.realtime;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.realtime.SubscriptionResponseObject;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class SubscriptionResponseObject_ESTest extends SubscriptionResponseObject_ESTest_scaffolding {
    @Test
    public void testSetObjectId() {
        // Given
        SubscriptionResponseObject subscriptionResponseObject = new SubscriptionResponseObject();
        String expectedObjectId = "12345";

        // When
        subscriptionResponseObject.setObjectId(expectedObjectId);

        // Then
        assertEquals(expectedObjectId, subscriptionResponseObject.getObjectId());
    }
}
