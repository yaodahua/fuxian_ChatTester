// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/media/MediaInfoFeed_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:05:00 GMT 2024
 */
package org.jinstagram.entity.media;


import org.jinstagram.entity.users.feed.MediaFeedData;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.media.MediaInfoFeed;
import org.jinstagram.entity.users.feed.MediaFeedData;
import org.junit.runner.RunWith;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.media.MediaInfoFeed;
import org.jinstagram.entity.users.feed.MediaFeedData;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class MediaInfoFeed_ESTest extends MediaInfoFeed_ESTest_scaffolding {

@Test
public void testToString() {
    // Create test data
    Meta meta = new Meta();
    MediaFeedData data = new MediaFeedData();
    MediaInfoFeed mediaInfoFeed = new MediaInfoFeed();
    mediaInfoFeed.setMeta(meta);
    mediaInfoFeed.setData(data);

    // Call the toString() method
    String result = mediaInfoFeed.toString();

    // Verify the result
    String expected = "MediaInfoFeed [data=" + data + ", meta=" + meta + "]";
    assertEquals(expected, result);
}

@Test
public void testSetMeta() {
    // Create a new instance of MediaInfoFeed
    MediaInfoFeed mediaInfoFeed = new MediaInfoFeed();

    // Create a new instance of Meta
    Meta meta = new Meta();

    // Set the values for the Meta object
    meta.setCode(200);
    meta.setErrorType("none");
    meta.setErrorMessage("");

    // Call the setMeta method with the Meta object
    mediaInfoFeed.setMeta(meta);

    // Get the Meta object from the MediaInfoFeed instance
    Meta result = mediaInfoFeed.getMeta();

    // Assert that the Meta object is not null
    assertNotNull(result);

    // Assert that the values of the Meta object are set correctly
    assertEquals(200, result.getCode());
    assertEquals("none", result.getErrorType());
    assertEquals("", result.getErrorMessage());
}

    @Test
    public void testGetData() {
        // Create a MediaInfoFeed object
        MediaInfoFeed mediaInfoFeed = new MediaInfoFeed();

        // Create a MediaFeedData object
        MediaFeedData expectedData = new MediaFeedData();

        // Set the expected data in the MediaInfoFeed object
        mediaInfoFeed.setData(expectedData);

        // Call the getData() method
        MediaFeedData actualData = mediaInfoFeed.getData();

        // Assert that the actual data is equal to the expected data
        assertEquals(expectedData, actualData);
    }

@Test
public void testGetMeta() {
    // Create a new instance of MediaInfoFeed
    MediaInfoFeed mediaInfoFeed = new MediaInfoFeed();

    // Create a new instance of Meta
    Meta expectedMeta = new Meta();

    // Set the expected Meta object in MediaInfoFeed
    mediaInfoFeed.setMeta(expectedMeta);

    // Call the getMeta() method
    Meta actualMeta = mediaInfoFeed.getMeta();

    // Assert that the returned Meta object is equal to the expected Meta object
    assertEquals(expectedMeta, actualMeta);
}

    @Test
    public void testSetData() {
        // Create a new instance of MediaInfoFeed
        MediaInfoFeed mediaInfoFeed = new MediaInfoFeed();

        // Create a new instance of MediaFeedData
        MediaFeedData data = new MediaFeedData();

        // Set the data using the setData method
        mediaInfoFeed.setData(data);

        // Verify that the data is set correctly
        assertEquals(data, mediaInfoFeed.getData());
    }

}
