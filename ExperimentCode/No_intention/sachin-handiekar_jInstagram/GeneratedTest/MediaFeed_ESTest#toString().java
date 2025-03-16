// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeed_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:28:18 GMT 2024
 */
package org.jinstagram.entity.users.feed;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.common.Pagination;
import org.jinstagram.entity.users.feed.MediaFeed;
import org.jinstagram.entity.users.feed.MediaFeedData;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class MediaFeed_ESTest extends MediaFeed_ESTest_scaffolding {
@Test
public void testToString() {
    // Create test data
    Pagination pagination = new Pagination();
    Meta meta = new Meta();
    List<MediaFeedData> data = new ArrayList<>();
    data.add(new MediaFeedData());

    // Set test data
    MediaFeed mediaFeed = new MediaFeed();
    mediaFeed.setPagination(pagination);
    mediaFeed.setMeta(meta);
    mediaFeed.setData(data);

    // Expected result
    String expected = "MediaFeed [data=" + data + ", meta=" + meta + ", pagination=" + pagination + "]";

    // Test the toString() method
    String result = mediaFeed.toString();

    // Assert the result
    assertEquals(expected, result);
}
}
