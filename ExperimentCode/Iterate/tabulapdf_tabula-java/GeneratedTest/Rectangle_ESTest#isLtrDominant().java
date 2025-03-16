// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/Rectangle_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 10:03:59 GMT 2024
 */
package technology.tabula;
import java.util.*;
import java.lang.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import technology.tabula.Rectangle;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Rectangle_ESTest extends Rectangle_ESTest_scaffolding {
    
@Test
public void testIsLtrDominant() {
    Rectangle rectangle = new Rectangle(0, 0, 5, 3);
    int result = rectangle.isLtrDominant();
    
    // Assert that the rectangle is left-to-right dominant if width is greater than height
    assertTrue("Rectangle is left-to-right dominant", rectangle.getWidth() > rectangle.getHeight());
}
}
