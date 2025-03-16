// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/http/Request_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:43:07 GMT 2024
 */
package org.jinstagram.http;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLStreamHandler;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.jinstagram.http.Request;
import org.jinstagram.http.Verbs;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Request_ESTest extends Request_ESTest_scaffolding {
    @Test
    public void testGetConnectTimeoutInMillis() {
        // Given
        Verbs verb = Verbs.GET;
        String url = "https://example.com";
        Request request = new Request(verb, url);
        int expectedConnectTimeout = 5000; // Assuming a connect timeout of 5000 milliseconds
        request.setConnectTimeout(expectedConnectTimeout, TimeUnit.MILLISECONDS);

        // When
        int actualConnectTimeout = request.getConnectTimeoutInMillis();

        // Then
        assertEquals(expectedConnectTimeout, actualConnectTimeout);
    }
}
