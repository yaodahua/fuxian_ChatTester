// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/locations/LocationInfo_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:01:27 GMT 2024
 */
package org.jinstagram.entity.locations;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Location;
import org.jinstagram.entity.locations.LocationInfo;
import org.junit.runner.RunWith;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Location;
import org.jinstagram.entity.locations.LocationInfo;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class LocationInfo_ESTest extends LocationInfo_ESTest_scaffolding {

    @Test
    public void testGetLocationData() {
        LocationInfo locationInfo = new LocationInfo();
        
        // Create a sample Location object for testing
        Location sampleLocation = new Location();
        sampleLocation.setLatitude(40.7128);
        sampleLocation.setLongitude(74.0060);
        
        // Set the sample Location object as the locationData in LocationInfo
        locationInfo.setLocationData(sampleLocation);
        
        // Retrieve the Location object using getLocationData()
        Location retrievedLocation = locationInfo.getLocationData();
        
        // Assert that the retrieved Location object is not null
        assertNotNull(retrievedLocation);
        
        // Additional assertions can be added based on the specific properties of the Location object
        // For example, assertEquals(expectedValue, retrievedLocation.getLatitude());
        // For example, assertEquals(expectedValue, retrievedLocation.getLongitude());
    }

    @Test
    public void testSetLocationData() {
        // Given
        LocationInfo locationInfo = new LocationInfo();
        Location locationData = new Location();
        
        // When
        locationInfo.setLocationData(locationData);
        
        // Then
        assertEquals(locationData, locationInfo.getLocationData());
    }

}
