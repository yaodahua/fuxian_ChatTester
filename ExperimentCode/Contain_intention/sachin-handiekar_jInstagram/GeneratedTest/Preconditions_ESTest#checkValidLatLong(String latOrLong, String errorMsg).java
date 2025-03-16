// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/utils/Preconditions_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 05:17:41 GMT 2024
 */
package org.jinstagram.utils;
import org.junit.Test;
import static org.junit.Assert.*;
import org.jinstagram.utils.Preconditions;
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
    public void testCheckValidLatLong_validLatLong() {
        String validLatLong = "40.7128,-74.0060"; // Example valid latitude and longitude
        String errorMsg = "Invalid latitude or longitude";

        try {
            Preconditions.checkValidLatLong(validLatLong, errorMsg);
            // If no exception is thrown, the test passes
        } catch (Exception e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
    }
}
