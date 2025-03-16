// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/User_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:53:01 GMT 2024
 */
package org.jinstagram.entity.common;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.User;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class User_ESTest extends User_ESTest_scaffolding {
@Test
public void testToString() {
    // Create a User object with sample data
    User user = new User();
    user.setBio("Sample Bio");
    user.setFullName("John Doe");
    user.setId("123456");
    user.setProfilePictureUrl("https://example.com/profile.jpg");
    user.setUserName("johndoe");
    user.setWebsiteUrl("https://example.com");

    // Expected result
    String expected = "User [bio=Sample Bio, fullName=John Doe, id=123456, profilePictureUrl=https://example.com/profile.jpg, userName=johndoe, websiteUrl=https://example.com]";

    // Call the toString() method
    String result = user.toString();

    // Assert the result
    assertEquals(expected, result);
}
}
