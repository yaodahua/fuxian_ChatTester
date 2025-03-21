/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 09:46:24 GMT 2024
 */

package technology.tabula;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import technology.tabula.CohenSutherlandClipping;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CohenSutherlandClipping_ESTest extends CohenSutherlandClipping_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CohenSutherlandClipping cohenSutherlandClipping0 = new CohenSutherlandClipping();
      CohenSutherlandClipping.Point cohenSutherlandClipping_Point0 = cohenSutherlandClipping0.new Point(85.583519889645, 85.583519889645);
      CohenSutherlandClipping.Point cohenSutherlandClipping_Point1 = cohenSutherlandClipping0.new Point(85.583519889645, (-1224.317));
      boolean boolean0 = cohenSutherlandClipping_Point1.isInTheSameRegionAs(cohenSutherlandClipping_Point0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CohenSutherlandClipping cohenSutherlandClipping0 = new CohenSutherlandClipping();
      CohenSutherlandClipping.Point cohenSutherlandClipping_Point0 = cohenSutherlandClipping0.new Point(85.583519889645, 85.583519889645);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(1307.7F, 1307.7F, 1307.7F, 1.0F);
      java.awt.Rectangle rectangle0 = rectangle2D_Float0.getBounds();
      Rectangle2D rectangle2D0 = rectangle0.createIntersection(rectangle2D_Float0);
      cohenSutherlandClipping0.setClip(rectangle2D0);
      cohenSutherlandClipping_Point0.setPositionAndRegion(1307.7F, 1307.7F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CohenSutherlandClipping cohenSutherlandClipping0 = new CohenSutherlandClipping();
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, 0.01F, (-867.8885F), 0.0F);
      boolean boolean0 = cohenSutherlandClipping0.clip(line2D_Float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, (-1528.726938792), 0.0, 0.0);
      java.awt.Rectangle rectangle0 = new java.awt.Rectangle((-191), 270);
      Rectangle2D rectangle2D0 = rectangle2D_Double0.createIntersection(rectangle0);
      CohenSutherlandClipping cohenSutherlandClipping0 = new CohenSutherlandClipping(rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CohenSutherlandClipping cohenSutherlandClipping0 = new CohenSutherlandClipping();
      // Undeclared exception!
      try { 
        cohenSutherlandClipping0.setClip((Rectangle2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("technology.tabula.CohenSutherlandClipping", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CohenSutherlandClipping cohenSutherlandClipping0 = new CohenSutherlandClipping();
      // Undeclared exception!
      try { 
        cohenSutherlandClipping0.clip((Line2D.Float) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("technology.tabula.CohenSutherlandClipping", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CohenSutherlandClipping cohenSutherlandClipping0 = null;
      try {
        cohenSutherlandClipping0 = new CohenSutherlandClipping((Rectangle2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("technology.tabula.CohenSutherlandClipping", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CohenSutherlandClipping cohenSutherlandClipping0 = new CohenSutherlandClipping();
      Line2D.Float line2D_Float0 = new Line2D.Float(290.05316F, (-574.2401F), (-574.2401F), 290.05316F);
      boolean boolean0 = cohenSutherlandClipping0.clip(line2D_Float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CohenSutherlandClipping cohenSutherlandClipping0 = new CohenSutherlandClipping();
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, 0.0F, 0.0F, (-1.0F));
      boolean boolean0 = cohenSutherlandClipping0.clip(line2D_Float0);
      assertEquals(0.0F, line2D_Float0.y2, 0.01F);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CohenSutherlandClipping cohenSutherlandClipping0 = new CohenSutherlandClipping();
      Line2D.Float line2D_Float0 = new Line2D.Float((-1.0F), 1763.0F, 1763.0F, (-1.0F));
      boolean boolean0 = cohenSutherlandClipping0.clip(line2D_Float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CohenSutherlandClipping cohenSutherlandClipping0 = new CohenSutherlandClipping();
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, 1442.09F, 0.0F, 0.0F);
      boolean boolean0 = cohenSutherlandClipping0.clip(line2D_Float0);
      assertEquals(0.0F, line2D_Float0.y1, 0.01F);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CohenSutherlandClipping cohenSutherlandClipping0 = new CohenSutherlandClipping();
      Line2D.Float line2D_Float0 = new Line2D.Float(553.22186F, 0.0F, (-1.0F), 0.0F);
      boolean boolean0 = cohenSutherlandClipping0.clip(line2D_Float0);
      assertEquals(0.0F, line2D_Float0.x2, 0.01F);
      assertTrue(boolean0);
  }
}
