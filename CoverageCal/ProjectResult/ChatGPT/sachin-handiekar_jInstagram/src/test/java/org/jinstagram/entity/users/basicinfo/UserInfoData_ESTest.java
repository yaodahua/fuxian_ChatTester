// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/basicinfo/UserInfoData_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:24:13 GMT 2024
 */
package org.jinstagram.entity.users.basicinfo;


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.users.basicinfo.Counts;
import org.jinstagram.entity.users.basicinfo.UserInfoData;
import org.junit.runner.RunWith;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.users.basicinfo.Counts;
import org.jinstagram.entity.users.basicinfo.UserInfoData;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class UserInfoData_ESTest extends UserInfoData_ESTest_scaffolding {

@Test
public void testGetId() {
    // Create an instance of UserInfoData
    UserInfoData userInfoData = new UserInfoData();

    // Set the value of id using the setter method
    userInfoData.setId("12345");

    // Get the value of id using the getter method
    String id = userInfoData.getId();

    // Assert that the returned id is equal to the expected value
    assertEquals("12345", id);
}

    @Test
    public void testGetLastName() {
        // Create an instance of UserInfoData
        UserInfoData userInfoData = new UserInfoData();

        // Set the last name using the setter method
        userInfoData.setLast_name("Smith");

        // Get the last name using the getter method
        String lastName = userInfoData.getLastName();

        // Assert that the last name is equal to the expected value
        assertEquals("Smith", lastName);
    }

    @Test
    public void testSetUsername() {
        UserInfoData userInfoData = new UserInfoData();
        String username = "testUsername";
        userInfoData.setUsername(username);
        assertEquals(username, userInfoData.getUsername());
    }

    @Test
    public void testGetUsername() {
        // Create an instance of UserInfoData
        UserInfoData userInfoData = new UserInfoData();

        // Set the username using the setter method
        userInfoData.setUsername("john_doe");

        // Get the username using the getter method
        String username = userInfoData.getUsername();

        // Assert that the retrieved username is equal to the expected value
        assertEquals("john_doe", username);
    }

    @Test
    public void testSetProfilePicture() {
        UserInfoData userInfoData = new UserInfoData();
        String profilePicture = "https://example.com/profile.jpg";
        
        userInfoData.setProfilePicture(profilePicture);
        
        assertEquals(profilePicture, userInfoData.getProfilePicture());
    }

    @Test
    public void testSetFirstName() {
        UserInfoData userInfoData = new UserInfoData();
        String firstName = "John";

        userInfoData.setFirstName(firstName);

        assertEquals(firstName, userInfoData.getFirstName());
    }

    @Test
    public void testSetBusiness() {
        UserInfoData userInfoData = new UserInfoData();
        boolean isBusiness = true;
        userInfoData.setBusiness(isBusiness);
        assertEquals(isBusiness, userInfoData.isBusiness());
    }

    @Test
    public void testSetBio() {
        UserInfoData userInfoData = new UserInfoData();
        String bio = "This is a test bio";

        userInfoData.setBio(bio);

        assertEquals(bio, userInfoData.getBio());
    }

    @Test
    public void testSetCounts() {
        UserInfoData userInfoData = new UserInfoData();
        Counts counts = new Counts();
        
        userInfoData.setCounts(counts);
        
        assertEquals(counts, userInfoData.getCounts());
    }

    @Test
    public void testSetId() {
        UserInfoData userInfoData = new UserInfoData();
        String id = "12345";
        userInfoData.setId(id);
        assertEquals(id, userInfoData.getId());
    }

    @Test
    public void testIsBusiness() {
        UserInfoData userInfoData = new UserInfoData();
        userInfoData.setBusiness(true);
        assertTrue(userInfoData.isBusiness());
        
        userInfoData.setBusiness(false);
        assertFalse(userInfoData.isBusiness());
    }

@Test
public void testGetBio() {
    // Create an instance of UserInfoData
    UserInfoData userInfoData = new UserInfoData();

    // Set the bio using the setter method
    String expectedBio = "This is a test bio";
    userInfoData.setBio(expectedBio);

    // Get the bio using the getter method
    String actualBio = userInfoData.getBio();

    // Assert that the retrieved bio is equal to the expected bio
    assertEquals(expectedBio, actualBio);
}

@Test
public void testGetProfilePicture() {
    // Create an instance of UserInfoData
    UserInfoData userInfoData = new UserInfoData();

    // Set the profile picture
    String expectedProfilePicture = "profile_picture.jpg";
    userInfoData.setProfilePicture(expectedProfilePicture);

    // Get the profile picture using the getProfilePicture() method
    String actualProfilePicture = userInfoData.getProfilePicture();

    // Assert that the returned profile picture is equal to the expected profile picture
    assertEquals(expectedProfilePicture, actualProfilePicture);
}

    @Test
    public void testGetCounts() {
        // Create a new instance of UserInfoData
        UserInfoData userInfoData = new UserInfoData();

        // Create a new instance of Counts
        Counts counts = new Counts();
        counts.setFollows(10);
        counts.setFollowedBy(20);
        counts.setMedia(30);

        // Set the Counts object to the UserInfoData instance
        userInfoData.setCounts(counts);

        // Call the getCounts() method and assert the returned Counts object
        Counts returnedCounts = userInfoData.getCounts();
        assertEquals(counts, returnedCounts);
    }

@Test
public void testGetWebsite() {
    // Create an instance of UserInfoData
    UserInfoData userInfoData = new UserInfoData();

    // Set the website value
    String website = "www.example.com";
    userInfoData.setWebsite(website);

    // Get the website value using the getWebsite() method
    String retrievedWebsite = userInfoData.getWebsite();

    // Assert that the retrieved website value is equal to the set website value
    assertEquals(website, retrievedWebsite);
}

    @Test
    public void testSetLast_name() {
        UserInfoData userInfoData = new UserInfoData();
        String last_name = "Doe";
        userInfoData.setLast_name(last_name);
        assertEquals(last_name, userInfoData.getLastName());
    }

    @Test
    public void testSetWebsite() {
        UserInfoData userInfoData = new UserInfoData();
        String website = "www.example.com";
        userInfoData.setWebsite(website);
        assertEquals(website, userInfoData.getWebsite());
    }

    @Test
    public void testGetFirstName() {
        // Create an instance of UserInfoData
        UserInfoData userInfoData = new UserInfoData();

        // Set the value of firstName using the setter method
        userInfoData.setFirstName("John");

        // Get the value of firstName using the getter method
        String firstName = userInfoData.getFirstName();

        // Assert that the value of firstName is equal to "John"
        assertEquals("John", firstName);
    }

    @Test
    public void testSetFullName() {
        UserInfoData userInfoData = new UserInfoData();
        String fullName = "John Doe";
        userInfoData.setFullName(fullName);
        assertEquals(fullName, userInfoData.getFullName());
    }

    @Test
    public void testGetFullName() {
        // Create an instance of UserInfoData
        UserInfoData userInfoData = new UserInfoData();

        // Set the full name
        String fullName = "John Doe";
        userInfoData.setFullName(fullName);

        // Get the full name using the getFullName() method
        String result = userInfoData.getFullName();

        // Assert that the returned full name matches the expected full name
        assertEquals(fullName, result);
    }

}
