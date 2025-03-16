/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Jan 25 13:33:42 GMT 2024
 */

package com.zappos.json.format;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class BigIntegerFormatter_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.zappos.json.format.BigIntegerFormatter"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "C:\\Users\\wkx\\Desktop\\Zappos_zappos-json"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\wkx\\AppData\\Local\\Temp\\"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BigIntegerFormatter_ESTest_scaffolding.class.getClassLoader() ,
      "com.zappos.json.format.BigDecimalFormatter",
      "com.zappos.json.format.JavaTimestampFormatter",
      "com.zappos.json.JsonReaderCodeGenerator",
      "com.zappos.json.format.JavaTimeLocalDateFormatter",
      "com.zappos.json.JsonWriterCodeGenerator",
      "com.zappos.json.JsonBeanIntrospector",
      "com.zappos.json.ZapposJson$ZapposJsonSingleton",
      "com.zappos.json.JsonConfig$ReaderConfig",
      "com.zappos.json.format.AbstractNumberFormatter",
      "com.zappos.json.ZapposJson",
      "com.zappos.json.format.BigIntegerFormatter",
      "com.zappos.json.JsonConfig$WriterConfig",
      "com.zappos.json.format.JavaSqlDateFormatter",
      "com.zappos.json.util.Reflections",
      "com.zappos.json.format.ValueFormatter",
      "com.zappos.json.format.AbstractValueFormatter",
      "com.zappos.json.format.JavaTimeInstantFormatter",
      "com.zappos.json.JsonException",
      "com.zappos.json.format.JavaDateFormatter"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BigIntegerFormatter_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.zappos.json.format.AbstractValueFormatter",
      "com.zappos.json.format.AbstractNumberFormatter",
      "com.zappos.json.format.BigIntegerFormatter",
      "com.zappos.json.ZapposJson",
      "com.zappos.json.format.JavaDateFormatter",
      "com.zappos.json.format.JavaSqlDateFormatter",
      "com.zappos.json.format.JavaTimestampFormatter",
      "com.zappos.json.format.BigDecimalFormatter",
      "com.zappos.json.util.Reflections",
      "com.zappos.json.format.JavaTimeLocalDateFormatter",
      "com.zappos.json.format.JavaTimeInstantFormatter",
      "com.zappos.json.JsonBeanIntrospector",
      "com.zappos.json.JsonWriterCodeGenerator",
      "com.zappos.json.JsonReaderCodeGenerator",
      "com.zappos.json.ZapposJson$ZapposJsonSingleton",
      "com.zappos.json.format.NoOpValueFormatter",
      "com.zappos.json.JsonException",
      "com.zappos.json.JsonWriter",
      "com.zappos.json.util.JsonUtils",
      "com.zappos.json.util.Strings",
      "com.zappos.json.JsonConfig$WriterConfig",
      "com.zappos.json.JsonConfig$ReaderConfig"
    );
  }
}
