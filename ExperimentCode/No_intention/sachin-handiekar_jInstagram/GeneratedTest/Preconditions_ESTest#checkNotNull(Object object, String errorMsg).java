// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/utils/Preconditions_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 05:17:41 GMT 2024
 */
package org.jinstagram.utils;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.utils.Preconditions;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Preconditions_ESTest extends Preconditions_ESTest_scaffolding {
    @Test
    public void testCheckNotNull() {
        // Test case 1: object is not null
        Object object1 = new Object();
        try {
            Preconditions.checkNotNull(object1, "Object should not be null");
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
        
        // Test case 2: object is null
        Object object2 = null;
        try {
            Preconditions.checkNotNull(object2, "Object should not be null");
            fail("Exception should be thrown");
        } catch (Exception e) {
            assertEquals("Object should not be null", e.getMessage());
        }
    }
}
