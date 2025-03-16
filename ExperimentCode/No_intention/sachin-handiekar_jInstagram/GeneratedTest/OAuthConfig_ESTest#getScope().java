// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/model/OAuthConfig_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:18:36 GMT 2024
 */
package org.jinstagram.auth.model;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.net.Proxy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.auth.model.OAuthConfig;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class OAuthConfig_ESTest extends OAuthConfig_ESTest_scaffolding {
    @Test
    public void testGetScope() {
        // Create an instance of OAuthConfig
        OAuthConfig oauthConfig = new OAuthConfig("key", "secret", "callback", "scope", "display");

        // Call the getScope() method
        String scope = oauthConfig.getScope();

        // Assert that the returned scope is not null
        assertNotNull(scope);

        // Assert that the returned scope is equal to the expected scope
        assertEquals("scope", scope);
    }
}
