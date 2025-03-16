// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/Zappos_zappos-json/src/test/java/com/zappos/json/JsonWriter_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 14:01:13 GMT 2024
 */
package com.zappos.json;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.JsonConfig;
import com.zappos.json.JsonWriter;
import com.zappos.json.ZapposJson;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.IOException;
import java.io.PipedWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.time.ZoneId;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class JsonWriter_ESTest extends JsonWriter_ESTest_scaffolding {
    @Test
    public void testWriteMap() throws IOException {
        // Create a StringWriter to capture the output
        StringWriter writer = new StringWriter();

        // Create a test instance of ZapposJson
        ZapposJson zapposJson = new ZapposJson();

        // Create a test map
        Map<String, Object> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", 123);
        map.put("key3", true);

        // Call the writeMap method
        JsonWriter.writeMap(zapposJson, map, writer);

        // Verify the output
        String expectedOutput = "{\"key1\":\"value1\",\"key2\":123,\"key3\":true}";
        assertEquals(expectedOutput, writer.toString());
    }
}
