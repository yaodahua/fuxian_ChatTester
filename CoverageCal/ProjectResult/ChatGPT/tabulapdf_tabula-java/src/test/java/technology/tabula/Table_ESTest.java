/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 10:11:53 GMT 2024
 */
package technology.tabula;


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
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class Table_ESTest extends Table_ESTest_scaffolding {

@Test(timeout = 4000)
public void test00() throws Throwable {
    SpreadsheetExtractionAlgorithm spreadsheetExtractionAlgorithm0 = new SpreadsheetExtractionAlgorithm();
    Table table0 = new Table(spreadsheetExtractionAlgorithm0);
    table0.getExtractionMethod();
    assertEquals(0, table0.getColCount());
    assertEquals(0, table0.getRowCount());
    assertEquals(0, table0.getPageNumber());
}

@Test(timeout = 4000)
public void test01() throws Throwable {
    SpreadsheetExtractionAlgorithm spreadsheetExtractionAlgorithm0 = new SpreadsheetExtractionAlgorithm();
    Table table0 = new Table(spreadsheetExtractionAlgorithm0);
    table0.getExtractionMethod();
    assertEquals(0, table0.getColCount());
    assertEquals(0, table0.getRowCount());
    assertEquals(0, table0.getPageNumber());
}

@Test(timeout = 4000)
public void test02() throws Throwable {
    Table table0 = Table.empty();
    assertEquals(0, table0.getPageNumber());
    table0.setPageNumber(1);
    int int0 = table0.getPageNumber();
    assertEquals(1, int0);
}

@Test(timeout = 4000)
public void test03() throws Throwable {
    Table table0 = Table.empty();
    assertEquals(0, table0.getPageNumber());
    table0.setPageNumber(1);
    int int0 = table0.getPageNumber();
    assertEquals(1, int0);
}

@Test(timeout = 4000)
public void test04() throws Throwable {
    SpreadsheetExtractionAlgorithm spreadsheetExtractionAlgorithm0 = new SpreadsheetExtractionAlgorithm();
    Table table0 = new Table(spreadsheetExtractionAlgorithm0);
    table0.getExtractionMethod();
    assertEquals(0, table0.getColCount());
    assertEquals(0, table0.getRowCount());
    assertEquals(0, table0.getPageNumber());
}

@Test(timeout = 4000)
public void test05() throws Throwable {
    Table table0 = Table.empty();
    assertEquals(0, table0.getPageNumber());
    table0.setPageNumber(1);
    int int0 = table0.getPageNumber();
    assertEquals(1, int0);
}

}
