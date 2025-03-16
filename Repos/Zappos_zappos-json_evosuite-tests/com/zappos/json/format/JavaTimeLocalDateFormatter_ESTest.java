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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JavaTimeLocalDateFormatter_ESTest extends JavaTimeLocalDateFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
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
  public void test01()  throws Throwable  {
      JavaTimeLocalDateFormatter javaTimeLocalDateFormatter0 = new JavaTimeLocalDateFormatter();
      LocalDate localDate0 = javaTimeLocalDateFormatter0.cast((Object) null);
      assertNull(localDate0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JavaTimeLocalDateFormatter javaTimeLocalDateFormatter0 = new JavaTimeLocalDateFormatter();
      // Undeclared exception!
      try { 
        javaTimeLocalDateFormatter0.setPattern((String) null);
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
      JavaTimeLocalDateFormatter javaTimeLocalDateFormatter0 = new JavaTimeLocalDateFormatter();
      // Undeclared exception!
      try { 
        javaTimeLocalDateFormatter0.setPattern("qs3'4]V`bTG[e:](T");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pattern ends with an incomplete string literal: qs3'4]V`bTG[e:](T
         //
         verifyException("java.time.format.DateTimeFormatterBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JavaTimeLocalDateFormatter javaTimeLocalDateFormatter0 = new JavaTimeLocalDateFormatter();
      // Undeclared exception!
      try { 
        javaTimeLocalDateFormatter0.setPattern("GpAD-gK?*J,R)bY`k{r");
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
      JavaTimeLocalDateFormatter javaTimeLocalDateFormatter0 = new JavaTimeLocalDateFormatter();
      ZapposJson zapposJson0 = ZapposJson.getInstance((String) null);
      try { 
        javaTimeLocalDateFormatter0.parse(zapposJson0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // text
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JavaTimeLocalDateFormatter javaTimeLocalDateFormatter0 = new JavaTimeLocalDateFormatter();
      javaTimeLocalDateFormatter0.setPattern("+!&4-L~%a");
      ZapposJson zapposJson0 = ZapposJson.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      LocalDate localDate0 = MockLocalDate.now((ZoneId) zoneOffset0);
      // Undeclared exception!
      try { 
        javaTimeLocalDateFormatter0.format(zapposJson0, localDate0);
        fail("Expecting exception: UnsupportedTemporalTypeException");
      
      } catch(UnsupportedTemporalTypeException e) {
         //
         // Unsupported field: AmPmOfDay
         //
         verifyException("java.time.LocalDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JavaTimeLocalDateFormatter javaTimeLocalDateFormatter0 = new JavaTimeLocalDateFormatter();
      ZapposJson zapposJson0 = ZapposJson.getInstance("_U89~");
      // Undeclared exception!
      try { 
        javaTimeLocalDateFormatter0.format(zapposJson0, (LocalDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // temporal
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JavaTimeLocalDateFormatter javaTimeLocalDateFormatter0 = new JavaTimeLocalDateFormatter();
      ZapposJson zapposJson0 = ZapposJson.getInstance();
      // Undeclared exception!
      try { 
        javaTimeLocalDateFormatter0.cast(zapposJson0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JavaTimeLocalDateFormatter javaTimeLocalDateFormatter0 = new JavaTimeLocalDateFormatter();
      ValueFormatter<LocalDate> valueFormatter0 = javaTimeLocalDateFormatter0.newInstance();
      assertNotSame(javaTimeLocalDateFormatter0, valueFormatter0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JavaTimeLocalDateFormatter javaTimeLocalDateFormatter0 = new JavaTimeLocalDateFormatter();
      ZapposJson zapposJson0 = ZapposJson.getInstance();
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(241);
      Clock clock0 = MockClock.tickMinutes(zoneOffset0);
      LocalDate localDate0 = MockLocalDate.now(clock0);
      String string0 = javaTimeLocalDateFormatter0.format(zapposJson0, localDate0);
      assertEquals("\"2014-02-14\"", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JavaTimeLocalDateFormatter javaTimeLocalDateFormatter0 = new JavaTimeLocalDateFormatter();
      LocalDate localDate0 = MockLocalDate.ofEpochDay(0L);
      LocalDate localDate1 = javaTimeLocalDateFormatter0.cast(localDate0);
      assertSame(localDate1, localDate0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JavaTimeLocalDateFormatter javaTimeLocalDateFormatter0 = new JavaTimeLocalDateFormatter();
      javaTimeLocalDateFormatter0.setPattern("");
      ZapposJson zapposJson0 = ZapposJson.getInstance();
      try { 
        javaTimeLocalDateFormatter0.parse(zapposJson0, "");
        fail("Expecting exception: DateTimeException");
      
      } catch(DateTimeException e) {
         //
         // Unable to obtain LocalDate from TemporalAccessor: {},ISO,GMT of type java.time.format.Parsed
         //
         verifyException("java.time.LocalDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JavaTimeLocalDateFormatter javaTimeLocalDateFormatter0 = new JavaTimeLocalDateFormatter();
      ZapposJson zapposJson0 = ZapposJson.getInstance();
      try { 
        javaTimeLocalDateFormatter0.parse(zapposJson0, "");
        fail("Expecting exception: DateTimeParseException");
      
      } catch(DateTimeParseException e) {
         //
         // Text '' could not be parsed at index 0
         //
         verifyException("java.time.format.DateTimeFormatter", e);
      }
  }
}
