/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 13:40:01 GMT 2024
 */

package com.zappos.json.format;

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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JavaTimeInstantFormatter_ESTest extends JavaTimeInstantFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JavaTimeInstantFormatter javaTimeInstantFormatter0 = new JavaTimeInstantFormatter();
      ZapposJson zapposJson0 = ZapposJson.getInstance();
      javaTimeInstantFormatter0.setPattern("");
      javaTimeInstantFormatter0.setJsString(false);
      Instant instant0 = MockInstant.ofEpochMilli(0L);
      String string0 = javaTimeInstantFormatter0.format(zapposJson0, instant0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JavaTimeInstantFormatter javaTimeInstantFormatter0 = new JavaTimeInstantFormatter();
      Instant instant0 = javaTimeInstantFormatter0.cast((Object) null);
      assertNull(instant0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JavaTimeInstantFormatter javaTimeInstantFormatter0 = new JavaTimeInstantFormatter();
      // Undeclared exception!
      try { 
        javaTimeInstantFormatter0.setPattern((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // pattern
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JavaTimeInstantFormatter javaTimeInstantFormatter0 = new JavaTimeInstantFormatter();
      // Undeclared exception!
      try { 
        javaTimeInstantFormatter0.setPattern("NoOp");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown pattern letter: o
         //
         verifyException("java.time.format.DateTimeFormatterBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JavaTimeInstantFormatter javaTimeInstantFormatter0 = new JavaTimeInstantFormatter();
      // Undeclared exception!
      try { 
        javaTimeInstantFormatter0.setPattern("upqA\"y/tq7Re");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.time.format.DateTimeFormatterBuilder$PadPrinterParserDecorator cannot be cast to java.time.format.DateTimeFormatterBuilder$NumberPrinterParser
         //
         verifyException("java.time.format.DateTimeFormatterBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZapposJson zapposJson0 = ZapposJson.getInstance();
      JavaTimeInstantFormatter javaTimeInstantFormatter0 = new JavaTimeInstantFormatter();
      javaTimeInstantFormatter0.setPattern("1323000");
      try { 
        javaTimeInstantFormatter0.parse(zapposJson0, "__value");
        fail("Expecting exception: DateTimeParseException");
      
      } catch(DateTimeParseException e) {
         //
         // Text '__value' could not be parsed at index 0
         //
         verifyException("java.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JavaTimeInstantFormatter javaTimeInstantFormatter0 = new JavaTimeInstantFormatter();
      ZapposJson zapposJson0 = ZapposJson.getInstance("0;-uGc)*0");
      try { 
        javaTimeInstantFormatter0.parse(zapposJson0, "0;-uGc)*0");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"0;-uGc)*0\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JavaTimeInstantFormatter javaTimeInstantFormatter0 = new JavaTimeInstantFormatter();
      javaTimeInstantFormatter0.setPattern("case ");
      ZapposJson zapposJson0 = ZapposJson.getInstance();
      try { 
        javaTimeInstantFormatter0.parse(zapposJson0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // text
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JavaTimeInstantFormatter javaTimeInstantFormatter0 = new JavaTimeInstantFormatter();
      // Undeclared exception!
      try { 
        javaTimeInstantFormatter0.cast("1392409281320");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JavaTimeInstantFormatter javaTimeInstantFormatter0 = new JavaTimeInstantFormatter();
      ZapposJson zapposJson0 = ZapposJson.getInstance();
      javaTimeInstantFormatter0.setPattern("");
      try { 
        javaTimeInstantFormatter0.parse(zapposJson0, "");
        fail("Expecting exception: DateTimeException");
      
      } catch(DateTimeException e) {
         //
         // Unable to obtain Instant from TemporalAccessor: {},ISO,GMT of type java.time.format.Parsed
         //
         verifyException("java.time.Instant", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JavaTimeInstantFormatter javaTimeInstantFormatter0 = new JavaTimeInstantFormatter();
      ZapposJson zapposJson0 = ZapposJson.getInstance("");
      Instant instant0 = javaTimeInstantFormatter0.parse(zapposJson0, "1392409281320");
      assertNotNull(instant0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JavaTimeInstantFormatter javaTimeInstantFormatter0 = new JavaTimeInstantFormatter();
      ZapposJson zapposJson0 = ZapposJson.getInstance();
      javaTimeInstantFormatter0.setPattern("");
      Instant instant0 = MockInstant.ofEpochMilli(0L);
      String string0 = javaTimeInstantFormatter0.format(zapposJson0, instant0);
      assertEquals("\"\"", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JavaTimeInstantFormatter javaTimeInstantFormatter0 = new JavaTimeInstantFormatter();
      ZapposJson zapposJson0 = ZapposJson.getInstance();
      // Undeclared exception!
      try { 
        javaTimeInstantFormatter0.format(zapposJson0, (Instant) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.time.MockInstant", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JavaTimeInstantFormatter javaTimeInstantFormatter0 = new JavaTimeInstantFormatter();
      ValueFormatter<Instant> valueFormatter0 = javaTimeInstantFormatter0.newInstance();
      assertNotSame(javaTimeInstantFormatter0, valueFormatter0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JavaTimeInstantFormatter javaTimeInstantFormatter0 = new JavaTimeInstantFormatter();
      MockDate mockDate0 = new MockDate();
      Instant instant0 = mockDate0.toInstant();
      Instant instant1 = javaTimeInstantFormatter0.cast(instant0);
      assertSame(instant0, instant1);
  }
}
