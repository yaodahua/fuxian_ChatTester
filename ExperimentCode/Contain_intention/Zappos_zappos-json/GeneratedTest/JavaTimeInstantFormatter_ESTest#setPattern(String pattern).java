// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/Zappos_zappos-json/src/test/java/com/zappos/json/format/JavaTimeInstantFormatter_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 13:40:01 GMT 2024
 */
package com.zappos.json.format;
import static org.junit.Assert.*;
import org.junit.Test;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.ZapposJson;
import com.zappos.json.format.JavaTimeInstantFormatter;
import com.zappos.json.format.ValueFormatter;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.format.DateTimeParseException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class JavaTimeInstantFormatter_ESTest extends JavaTimeInstantFormatter_ESTest_scaffolding {
    @Test
    public void testSetPattern() {
        JavaTimeInstantFormatter formatter = new JavaTimeInstantFormatter();
        String pattern = "yyyy-MM-dd HH:mm:ss";
        ValueFormatter<Instant> result = formatter.setPattern(pattern);

        assertNotNull(result);
        assertNotNull(formatter.getFormatter());
        assertEquals(DateTimeFormatter.ofPattern(pattern).withZone(ZoneId.systemDefault()), formatter.getFormatter());
    }
}
