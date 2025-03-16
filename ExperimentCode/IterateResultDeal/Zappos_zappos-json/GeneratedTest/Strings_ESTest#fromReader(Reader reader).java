// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/Zappos_zappos-json/src/test/java/com/zappos/json/util/Strings_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 14:13:31 GMT 2024
 */
package com.zappos.json.util;





import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.*;
import java.lang.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.util.Strings;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Strings_ESTest extends Strings_ESTest_scaffolding {
    
    
    
    
    
    
    
    @Test
    public void testFromReader() throws IOException {
        // Given
        Reader reader = mock(Reader.class);
        when(reader.read()).thenReturn((int) 'T').thenReturn((int) 'e').thenReturn((int) 's').thenReturn((int) 't').thenReturn(-1);

        // When
        String result = Strings.fromReader(reader);

        // Then
        assertEquals("Test", result);
    }
}
