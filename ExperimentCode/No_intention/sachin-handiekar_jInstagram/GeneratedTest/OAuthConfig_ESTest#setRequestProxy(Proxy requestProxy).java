// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/model/OAuthConfig_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:18:36 GMT 2024
 */
package org.jinstagram.auth.model;
import java.net.Proxy;
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
    public void testSetRequestProxy() {
        // Create an instance of OAuthConfig
        OAuthConfig oauthConfig = new OAuthConfig("key", "secret");

        // Create a Proxy object
        Proxy proxy = Proxy.NO_PROXY;

        // Set the Proxy object using the setRequestProxy method
        oauthConfig.setRequestProxy(proxy);

        // Verify that the Proxy object is set correctly
        assertEquals(proxy, oauthConfig.getRequestProxy());
    }
}
