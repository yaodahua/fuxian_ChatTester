// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/Cell_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 09:42:58 GMT 2024
 */
package technology.tabula;




import java.util.*;
import java.lang.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import technology.tabula.Cell;
import technology.tabula.TextChunk;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Cell_ESTest extends Cell_ESTest_scaffolding {
    




    @Test
    public void testGetText_NoTextElements_ReturnsEmptyString() {
        Cell cell = new Cell(0, 0, 100, 100);
        String result = cell.getText(false);
        assertEquals("", result);
    }
}
