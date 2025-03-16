// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/model/Token_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:23:21 GMT 2024
 */
package org.jinstagram.auth.model;


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.auth.model.Token;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class Token_ESTest extends Token_ESTest_scaffolding {

    @Test
    public void testGetRawResponse() {
        // Create a Token object with a rawResponse
        Token token = new Token("token", "secret", "rawResponse");

        // Call the getRawResponse() method
        String rawResponse = token.getRawResponse();

        // Assert that the returned rawResponse is equal to the expected value
        assertEquals("rawResponse", rawResponse);
    }

@Test
public void testGetToken() {
    // Create a Token object with a token value
    Token tokenObj = new Token("myToken", "mySecret");

    // Call the getToken() method and store the result
    String result = tokenObj.getToken();

    // Assert that the result is equal to the expected token value
    assertEquals("myToken", result);
}

    @Test
    public void testGetSecret() {
        // Create a Token object with a token and secret
        Token token = new Token("myToken", "mySecret");

        // Call the getSecret() method
        String secret = token.getSecret();

        // Assert that the returned secret is equal to the expected secret
        assertEquals("mySecret", secret);
    }

}
