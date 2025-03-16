/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 14:07:05 GMT 2024
 */
package com.zappos.json.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.ZapposJson;
import com.zappos.json.util.JsonUtils;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PipedWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class JsonUtils_ESTest extends JsonUtils_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test15() throws Throwable {
        ZapposJson zapposJson0 = ZapposJson.getInstance();
        Charset charset0 = Charset.defaultCharset();
        ByteBuffer byteBuffer0 = charset0.encode("$u@],C=p25\\_^znH8,*Z");
        CharBuffer charBuffer0 = charset0.decode(byteBuffer0);
        String string0 = JsonUtils.unescape(zapposJson0, (CharSequence) charBuffer0);
        assertEquals("$u@],C=p25_^znH8,*Z", string0);
    }
    
    @Test(timeout = 4000)
    public void test12() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(8232);
        ZapposJson zapposJson0 = ZapposJson.getInstance();
        JsonUtils.escape(zapposJson0, (CharSequence) "\u2028& \u2028", (Writer) stringWriter0);
        assertEquals("\\u2028& \\u2028", stringWriter0.toString());
    }
}
