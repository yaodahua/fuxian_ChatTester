// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/CarouselMedia_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:26:18 GMT 2024
 */
package org.jinstagram.entity.users.feed;
import org.jinstagram.entity.common.Videos;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Images;
import org.jinstagram.entity.common.UsersInPhoto;
import org.jinstagram.entity.common.Videos;
import org.jinstagram.entity.users.feed.CarouselMedia;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class CarouselMedia_ESTest extends CarouselMedia_ESTest_scaffolding {
    @Test
    public void testSetVideos() {
        // Create a new instance of CarouselMedia
        CarouselMedia carouselMedia = new CarouselMedia();

        // Create a new instance of Videos
        Videos videos = new Videos();

        // Set the videos using the setVideos method
        carouselMedia.setVideos(videos);

        // Verify that the videos are set correctly
        assertEquals(videos, carouselMedia.getVideos());
    }
}
