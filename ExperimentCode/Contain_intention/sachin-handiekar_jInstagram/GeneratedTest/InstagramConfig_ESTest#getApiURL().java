// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/InstagramConfig_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:50:40 GMT 2024
 */
package org.jinstagram;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.InstagramConfig;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class InstagramConfig_ESTest extends InstagramConfig_ESTest_scaffolding {
    @Test
    public void testGetApiURL() {
        InstagramConfig instagramConfig = new InstagramConfig();
        String expectedApiURL = Constants.API_URL;
        
        String actualApiURL = instagramConfig.getApiURL();
        
        assertEquals(expectedApiURL, actualApiURL);
    }
}
