// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Location_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:46:49 GMT 2024
 */
package org.jinstagram.entity.common;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Location;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Location_ESTest extends Location_ESTest_scaffolding {
    @Test
    public void testSetLatitude() {
        // Create a new Location object
        Location location = new Location();

        // Set the latitude using the setLatitude method
        double latitude = 37.7749;
        location.setLatitude(latitude);

        // Verify that the latitude has been set correctly
        assertEquals(latitude, location.getLatitude(), 0.001);
    }
}
