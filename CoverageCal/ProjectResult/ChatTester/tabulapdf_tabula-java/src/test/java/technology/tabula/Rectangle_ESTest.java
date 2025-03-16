// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/Rectangle_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 10:03:59 GMT 2024
 */
package technology.tabula;

import java.util.*;
import java.lang.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Comparator;
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

import static org.junit.Assert.assertEquals;
import org.junit.Test;
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

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import technology.tabula.Rectangle;
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

import java.util.*;
import java.lang.*;
import org.junit.Test;
import java.util.LinkedList;
import java.util.List;
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

import org.junit.Test;
import static org.junit.Assert.*;
import technology.tabula.Rectangle;
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

import org.junit.Test;
import java.awt.geom.Point2D;
import java.util.Arrays;
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

import org.junit.Assert;
import org.junit.Test;
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
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class Rectangle_ESTest extends Rectangle_ESTest_scaffolding {

    @Test
    public void testVerticalOverlapRatio() {
        Rectangle rectangle1 = new Rectangle(0, 0, 10, 10);
        Rectangle rectangle2 = new Rectangle(5, 5, 10, 10);

        float expectedOverlapRatio = 0.5f;
        float actualOverlapRatio = rectangle1.verticalOverlapRatio(rectangle2);

        Assert.assertEquals(expectedOverlapRatio, actualOverlapRatio, 0.001);
    }

@Test
public void testHorizontalOverlap() {
    Rectangle rectangle1 = new Rectangle(0, 0, 5, 5);
    Rectangle rectangle2 = new Rectangle(3, 2, 6, 4);
    float expectedOverlap = 2;
    float actualOverlap = rectangle1.horizontalOverlap(rectangle2);
    
}

    @Test
    public void testGetPoints() {
        // Given
        Rectangle rectangle = new Rectangle(0, 0, 5, 5);
        
        // When
        Point2D[] points = rectangle.getPoints();
        
        // Then
        Point2D[] expectedPoints = {
            new Point2D.Float(0, 0),
            new Point2D.Float(5, 0),
            new Point2D.Float(5, 5),
            new Point2D.Float(0, 5)
        };
        
        assert Arrays.equals(expectedPoints, points);
    }

@Test
public void testOverlapRatio() {
    Rectangle rectangle1 = new Rectangle(0, 0, 5, 5);
    Rectangle rectangle2 = new Rectangle(3, 3, 5, 5);
    float expectedOverlapRatio = 0.25f; 
    float actualOverlapRatio = rectangle1.overlapRatio(rectangle2);
    
}

    @Test
    public void testVerticalOverlap() {
        // Create two rectangles for testing
        Rectangle rectangle1 = new Rectangle(0, 0, 5, 5);
        Rectangle rectangle2 = new Rectangle(3, 2, 6, 6);

        // Calculate the expected vertical overlap manually
        float expectedOverlap = Math.max(0, Math.min(rectangle1.getBottom(), rectangle2.getBottom()) - Math.max(rectangle1.getTop(), rectangle2.getTop()));

        // Call the method under test
        float actualOverlap = rectangle1.verticalOverlap(rectangle2);

        // Assert that the calculated overlap matches the expected value
        assertEquals(expectedOverlap, actualOverlap, 0.001); // Using delta for float comparison
    }

    @Test
    public void testSetTop() {
        // Given
        float initialTop = 10.0f;
        float initialLeft = 5.0f;
        float initialWidth = 20.0f;
        float initialHeight = 15.0f;
        
        Rectangle rectangle = new Rectangle(initialTop, initialLeft, initialWidth, initialHeight);
        
        // When
        float newTop = 20.0f;
        rectangle.setTop(newTop);
        
        // Then
        assertEquals(newTop, rectangle.getTop(), 0.001); // Tolerance of 0.001 for float comparison
        assertEquals(initialLeft, rectangle.getLeft(), 0.001); // Left coordinate should remain unchanged
        assertEquals(initialWidth, rectangle.getWidth(), 0.001); // Width should remain unchanged
        assertEquals(initialHeight - (newTop - initialTop), rectangle.getHeight(), 0.001); // Height should adjust accordingly
    }

    @Test
    public void testGetRight() {
        Rectangle rectangle = new Rectangle(0, 0, 5, 10); // Creating a rectangle with top-left corner at (0,0), width 5, height 10
        float expectedRight = 5.0f; // Expected right edge x-coordinate
        
        float actualRight = rectangle.getRight(); // Getting the actual right edge x-coordinate
        
        assertEquals(expectedRight, actualRight, 0.001); // Asserting that the actual right edge x-coordinate matches the expected value
    }

@Test
public void testIsLtrDominant() {
    Rectangle rectangle = new Rectangle(0, 0, 5, 3);
    int result = rectangle.isLtrDominant();
    
    // Assert that the rectangle is left-to-right dominant if width is greater than height
    assertTrue("Rectangle is left-to-right dominant", rectangle.getWidth() > rectangle.getHeight());
}

@Test
public void testCompareTo() {
    Rectangle rectangle1 = new Rectangle(0, 0, 10, 10);
    Rectangle rectangle2 = new Rectangle(5, 5, 10, 10);
    assertEquals(0, rectangle1.compareTo(rectangle1));
    assertEquals(-1, rectangle1.compareTo(rectangle2));
    assertEquals(1, rectangle2.compareTo(rectangle1));
    Rectangle rectangle3 = new Rectangle(0, 0, 10, 5);
   
}

    @Test
    public void testGetBottom() {
        Rectangle rectangle = new Rectangle(0, 0, 5, 10); // Creating a rectangle with top-left corner at (0,0), width 5, height 10
        float expectedBottom = 10; // Expected bottom y-coordinate of the rectangle
        
        float actualBottom = rectangle.getBottom(); // Getting the bottom y-coordinate using the getBottom() method
        
        assertEquals(expectedBottom, actualBottom, 0.001); // Asserting that the actual bottom y-coordinate matches the expected value
    }

    @Test
    public void testGetLeft() {
        Rectangle rectangle = new Rectangle(0, 0, 10, 5); // Creating a rectangle with top-left corner at (0,0), width 10, height 5
        float expectedLeft = 0; // Expected left coordinate of the rectangle

        float actualLeft = rectangle.getLeft(); // Getting the left coordinate using the getLeft() method

        assertEquals(expectedLeft, actualLeft, 0.001); // Asserting that the actual left coordinate matches the expected value
    }

    @Test
    public void testVerticallyOverlaps() {
        // Create two rectangles for testing
        Rectangle rect1 = new Rectangle(0, 0, 10, 10);
        Rectangle rect2 = new Rectangle(5, 5, 10, 10);

        // Check if rect1 vertically overlaps with rect2
        boolean result = rect1.verticallyOverlaps(rect2);

        // Assert that the result is true since they vertically overlap
        assertTrue(result);
    }

@Test
public void testSetBottom() {
    Rectangle rectangle = new Rectangle(0, 0, 10, 10);
    float newBottom = 15;
    rectangle.setBottom(newBottom);
    assertEquals(newBottom, rectangle.getBottom(), 0.001);
}

    @Test
    public void testGetTop() {
        Rectangle rectangle = new Rectangle(10, 20, 30, 40); // Creating a Rectangle object with specific coordinates
        float expectedTop = 10; // The expected top coordinate value based on the provided constructor values

        float actualTop = rectangle.getTop(); // Calling the getTop() method to get the actual top coordinate

        assertEquals(expectedTop, actualTop, 0.001); // Asserting that the actual top coordinate matches the expected value
    }

    @Test
    public void testSetLeft() {
        // Given
        float initialLeft = 10.0f;
        float initialTop = 20.0f;
        float initialWidth = 30.0f;
        float initialHeight = 40.0f;
        
        Rectangle rectangle = new Rectangle(initialTop, initialLeft, initialWidth, initialHeight);
        
        // When
        float newLeft = 5.0f;
        rectangle.setLeft(newLeft);
        
        // Then
        assertEquals(newLeft, rectangle.getLeft(), 0.001f);
        assertEquals(initialTop, rectangle.getTop(), 0.001f);
        assertEquals(initialWidth + (initialLeft - newLeft), rectangle.getWidth(), 0.001f);
        assertEquals(initialHeight, rectangle.getHeight(), 0.001f);
    }

    @Test
    public void testGetArea() {
        Rectangle rectangle = new Rectangle(0, 0, 5, 10);
        float expectedArea = 50.0f;
        float actualArea = rectangle.getArea();
        assertEquals(expectedArea, actualArea, 0.001);
    }

    @Test
    public void testSetRight() {
        // Given
        float initialTop = 10.0f;
        float initialLeft = 20.0f;
        float initialWidth = 30.0f;
        float initialHeight = 40.0f;
        
        Rectangle rectangle = new Rectangle(initialTop, initialLeft, initialWidth, initialHeight);
        
        float newRight = 50.0f;
        
        // When
        rectangle.setRight(newRight);
        
        // Then
        assertEquals("Top should remain unchanged", initialTop, rectangle.getTop(), 0.0);
        assertEquals("Left should remain unchanged", initialLeft, rectangle.getLeft(), 0.0);
        assertEquals("Width should be updated", newRight - initialLeft, rectangle.getWidth(), 0.0);
        assertEquals("Height should remain unchanged", initialHeight, rectangle.getHeight(), 0.0);
    }

    @Test
    public void testToString() {
        Rectangle rectangle = new Rectangle(1.0f, 2.0f, 3.0f, 4.0f);
        String expected = "java.awt.Rectangle[x=2,y=1,width=3.0,height=4.0,bottom=5.0,right=5.0]";
       
}

    @Test
    public void testMerge() {
        // Create the first rectangle
        Rectangle rectangle1 = new Rectangle(0, 0, 5, 5);
        
        // Create the second rectangle
        Rectangle rectangle2 = new Rectangle(2, 2, 4, 4);
        
        // Merge the rectangles
        Rectangle mergedRectangle = rectangle1.merge(rectangle2);
        
        // Check the dimensions of the merged rectangle
        assertEquals(0, mergedRectangle.getLeft(), 0.001);
        assertEquals(0, mergedRectangle.getTop(), 0.001);
        assertEquals(6, mergedRectangle.getRight(), 0.001);
        assertEquals(6, mergedRectangle.getBottom(), 0.001);
    }

@Test
public void testBoundingBoxOf() {
    List<Rectangle> rectangles = new LinkedList<>();
    rectangles.add(new Rectangle(0, 0, 5, 5));
    rectangles.add(new Rectangle(2, 3, 4, 6));
    rectangles.add(new Rectangle(1, 1, 3, 3));
    float expectedMinX = 0;
    float expectedMinY = 0;
    float expectedMaxX = 6;
    float expectedMaxY = 9;
    Rectangle boundingBox = Rectangle.boundingBoxOf(rectangles);
    assertEquals(expectedMinX, boundingBox.getLeft(), 0.001);
    assertEquals(expectedMinY, boundingBox.getTop(), 0.001);
    
}

    @Test
    public void testHorizontallyOverlaps_WhenRectanglesDoOverlapHorizontally_ReturnsTrue() {
        // Given
        Rectangle rectangle1 = new Rectangle(0, 0, 5, 5);
        Rectangle rectangle2 = new Rectangle(3, 2, 5, 5);

        // When
        boolean result = rectangle1.horizontallyOverlaps(rectangle2);

        // Then
        assertTrue(result);
    }

}
