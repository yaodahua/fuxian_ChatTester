/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:01:27 GMT 2024
 */
package org.jinstagram.entity.locations;


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


@Test(timeout = 4000)
public void test0() throws Throwable {
    LocationInfo locationInfo0 = new LocationInfo();
    String string0 = locationInfo0.toString();
    assertEquals("LocationInfo [locationData=null]", string0);
}


@Test(timeout = 4000)
public void test1() throws Throwable {
    LocationInfo locationInfo0 = new LocationInfo();
    Location location0 = new Location();
    locationInfo0.setLocationData(location0);
    Location location1 = locationInfo0.getLocationData();
    assertNull(location1.getId());
}

}
