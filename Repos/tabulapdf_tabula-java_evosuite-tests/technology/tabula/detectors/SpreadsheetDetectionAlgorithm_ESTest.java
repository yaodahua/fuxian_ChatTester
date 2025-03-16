/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 09:47:55 GMT 2024
 */

package technology.tabula.detectors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import technology.tabula.Page;
import technology.tabula.detectors.SpreadsheetDetectionAlgorithm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SpreadsheetDetectionAlgorithm_ESTest extends SpreadsheetDetectionAlgorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SpreadsheetDetectionAlgorithm spreadsheetDetectionAlgorithm0 = new SpreadsheetDetectionAlgorithm();
      // Undeclared exception!
      try { 
        spreadsheetDetectionAlgorithm0.detect((Page) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("technology.tabula.detectors.SpreadsheetDetectionAlgorithm", e);
      }
  }
}
