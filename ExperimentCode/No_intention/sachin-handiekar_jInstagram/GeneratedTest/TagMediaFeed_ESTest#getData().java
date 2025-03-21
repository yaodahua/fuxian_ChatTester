// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/tags/TagMediaFeed_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:16:28 GMT 2024
 */
package org.jinstagram.entity.tags;
import org.jinstagram.entity.users.feed.MediaFeedData;
import org.jinstagram.entity.users.feed.MediaFeed;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.common.Pagination;
import org.jinstagram.entity.tags.TagMediaFeed;
import org.jinstagram.entity.users.feed.MediaFeedData;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class TagMediaFeed_ESTest extends TagMediaFeed_ESTest_scaffolding {
    @Test
    public void testGetData() {
        // Create a TagMediaFeed instance
        TagMediaFeed tagMediaFeed = new TagMediaFeed();

        // Create a list of MediaFeedData
        List<MediaFeedData> expectedData = List.of(
            new MediaFeedData(),
            new MediaFeedData(),
            new MediaFeedData()
        );

        // Set the data in the TagMediaFeed instance
        tagMediaFeed.setData(expectedData);

        // Call the getData() method
        List<MediaFeedData> actualData = tagMediaFeed.getData();

        // Assert that the returned data is equal to the expected data
        assertEquals(expectedData, actualData);
    }
}
