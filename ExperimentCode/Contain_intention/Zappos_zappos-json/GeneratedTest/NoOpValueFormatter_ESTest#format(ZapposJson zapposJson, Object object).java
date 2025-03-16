// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/Zappos_zappos-json/src/test/java/com/zappos/json/format/NoOpValueFormatter_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 13:46:01 GMT 2024
 */
package com.zappos.json.format;
import org.junit.Test;
import static org.junit.Assert.*;
import com.zappos.json.ZapposJson;
import com.zappos.json.format.NoOpValueFormatter;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.ZapposJson;
import com.zappos.json.format.NoOpValueFormatter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class NoOpValueFormatter_ESTest extends NoOpValueFormatter_ESTest_scaffolding {
    @Test
    public void testFormatThrowsUnsupportedOperationException() {
        NoOpValueFormatter noOpValueFormatter = new NoOpValueFormatter();
        ZapposJson zapposJson = new ZapposJson();
        Object object = new Object();

        try {
            noOpValueFormatter.format(zapposJson, object);
            fail("Expected UnsupportedOperationException was not thrown");
        } catch (UnsupportedOperationException e) {
            assertEquals("NoOp", e.getMessage());
        }
    }
}
