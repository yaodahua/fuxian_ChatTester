// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/Table_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 10:11:53 GMT 2024
 */
package technology.tabula;
import org.junit.Test;
import static org.junit.Assert.*;
import technology.tabula.Table;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Point;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import technology.tabula.RectangularTextContainer;
import technology.tabula.Table;
import technology.tabula.extractors.ExtractionAlgorithm;
import technology.tabula.extractors.SpreadsheetExtractionAlgorithm;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Table_ESTest extends Table_ESTest_scaffolding {
    @Test
    public void testEmpty() {
        Table table = Table.empty();
        
        assertNotNull(table);
        assertEquals("", table.getExtractionMethod());
        assertEquals(0, table.getRowCount());
        assertEquals(0, table.getColCount());
        assertEquals(0, table.getPageNumber());
        
        // Additional test cases can be added based on specific requirements
    }
}
