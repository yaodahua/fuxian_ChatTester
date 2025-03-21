// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/PageDims_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 09:56:04 GMT 2024
 */
package technology.tabula;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import technology.tabula.PageDims;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class PageDims_ESTest extends PageDims_ESTest_scaffolding {
@Test
public void testGetLeft() {
    // Create a PageDims object with specific values
    PageDims pageDims = PageDims.of(10.0f, 20.0f, 30.0f, 40.0f);

    // Call the getLeft() method and assert the expected result
    float expectedLeft = 20.0f;
    float actualLeft = pageDims.getLeft();
    assertEquals(expectedLeft, actualLeft, 0.0f);
}
}
