// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Meta_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:48:49 GMT 2024
 */
package org.jinstagram.entity.common;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Meta;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Meta_ESTest extends Meta_ESTest_scaffolding {
@Test
public void testToString() {
    // Create a Meta object with test values
    Meta meta = new Meta();
    meta.setCode(200);
    meta.setErrorType("Error");
    meta.setErrorMessage("An error occurred");

    // Call the toString() method
    String result = meta.toString();

    // Verify the expected output
    String expected = "Meta [code=200, errorMessage=An error occurred, errorType=Error]";
    assertEquals(expected, result);
}
}
