// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/UserFeedData_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:34:30 GMT 2024
 */
package org.jinstagram.entity.users.feed;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.users.feed.UserFeedData;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class UserFeedData_ESTest extends UserFeedData_ESTest_scaffolding {
    @Test
    public void testToString() {
        UserFeedData userFeedData = new UserFeedData();
        userFeedData.setId("123");
        userFeedData.setProfilePictureUrl("https://example.com/profile.jpg");
        userFeedData.setUserName("john_doe");
        userFeedData.setFullName("John Doe");
        userFeedData.setWebsite("https://example.com");
        userFeedData.setBio("Hello, I'm John!");

        String expected = "UserFeedData [id=123, profilePictureUrl=https://example.com/profile.jpg, userName=john_doe, fullName=John Doe, website=https://example.com, bio=Hello, I'm John!]";
        String actual = userFeedData.toString();

        assertEquals(expected, actual);
    }
}
