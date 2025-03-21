/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 13:42:08 GMT 2024
 */
package com.zappos.json.format;


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.ZapposJson;
import com.zappos.json.format.JavaTimeLocalDateFormatter;
import com.zappos.json.format.ValueFormatter;
import java.time.Clock;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeParseException;
import java.time.temporal.UnsupportedTemporalTypeException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class JavaTimeLocalDateFormatter_ESTest extends JavaTimeLocalDateFormatter_ESTest_scaffolding {


@Test(timeout = 4000)
public void test12() throws Throwable {
    JavaTimeLocalDateFormatter javaTimeLocalDateFormatter0 = new JavaTimeLocalDateFormatter();
    javaTimeLocalDateFormatter0.setPattern("");
    ZapposJson zapposJson0 = ZapposJson.getInstance();
    try {
        javaTimeLocalDateFormatter0.parse(zapposJson0, "");
        fail("Expecting exception: DateTimeException");
    } catch (DateTimeException e) {
        // 
        // Unable to obtain LocalDate from TemporalAccessor: {},ISO,GMT of type java.time.format.Parsed
        // 
        verifyException("java.time.LocalDate", e);
    }
}


@Test(timeout = 4000)
public void test00() throws Throwable {
    JavaTimeLocalDateFormatter javaTimeLocalDateFormatter0 = new JavaTimeLocalDateFormatter();
    javaTimeLocalDateFormatter0.setPattern("");
    ZapposJson zapposJson0 = ZapposJson.getInstance();
    ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(241);
    Clock clock0 = MockClock.tickMinutes(zoneOffset0);
    javaTimeLocalDateFormatter0.setJsString(false);
    LocalDate localDate0 = MockLocalDate.now(clock0);
    String string0 = javaTimeLocalDateFormatter0.format(zapposJson0, localDate0);
    assertEquals("", string0);
}


@Test(timeout = 4000)
public void test09() throws Throwable {
    JavaTimeLocalDateFormatter javaTimeLocalDateFormatter0 = new JavaTimeLocalDateFormatter();
    ValueFormatter<LocalDate> valueFormatter0 = javaTimeLocalDateFormatter0.newInstance();
    assertNotSame(javaTimeLocalDateFormatter0, valueFormatter0);
}


@Test(timeout = 4000)
public void test01() throws Throwable {
    JavaTimeLocalDateFormatter javaTimeLocalDateFormatter0 = new JavaTimeLocalDateFormatter();
    LocalDate localDate0 = javaTimeLocalDateFormatter0.cast((Object) null);
    assertNull(localDate0);
}

}
