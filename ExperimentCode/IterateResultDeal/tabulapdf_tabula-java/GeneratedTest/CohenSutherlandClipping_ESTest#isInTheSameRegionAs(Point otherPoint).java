// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/CohenSutherlandClipping_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 09:46:24 GMT 2024
 */
package technology.tabula;





import java.util.*;
import java.lang.*;
import org.junit.Test;
import static org.junit.Assert.*;
import technology.tabula.CohenSutherlandClipping;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import technology.tabula.CohenSutherlandClipping;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class CohenSutherlandClipping_ESTest extends CohenSutherlandClipping_ESTest_scaffolding {
    


    
    
    
    @Test
    public void testIsInTheSameRegionAs_WhenPointsAreInTheSameRegion_ExpectTrue() {
        Point point1 = new Point(1.0, 2.0);
        point1.region = 1;
        
        Point point2 = new Point(3.0, 4.0);
        point2.region = 1;
        
        assertTrue(point1.isInTheSameRegionAs(point2));
    }
}
