// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentsFeed_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:32:11 GMT 2024
 */
package org.jinstagram.entity.comments;

import org.jinstagram.entity.common.Meta;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.comments.CommentData;
import org.jinstagram.entity.comments.MediaCommentsFeed;
import org.jinstagram.entity.common.Meta;
import org.junit.runner.RunWith;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.comments.CommentData;
import org.jinstagram.entity.comments.MediaCommentsFeed;
import org.jinstagram.entity.common.Meta;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class MediaCommentsFeed_ESTest extends MediaCommentsFeed_ESTest_scaffolding {

    @Test
    public void testGetMeta() {
        // Create a MediaCommentsFeed object
        MediaCommentsFeed mediaCommentsFeed = new MediaCommentsFeed();

        // Create a Meta object
        Meta expectedMeta = new Meta();
        expectedMeta.setCode(200);
        expectedMeta.setErrorType("none");
        expectedMeta.setErrorMessage(null);

        // Set the Meta object in the MediaCommentsFeed object
        mediaCommentsFeed.setMeta(expectedMeta);

        // Call the getMeta() method
        Meta actualMeta = mediaCommentsFeed.getMeta();

        // Assert that the returned Meta object is equal to the expected Meta object
        assertEquals(expectedMeta, actualMeta);
    }

@Test
public void testSetMeta() {
    // Create a new instance of MediaCommentsFeed
    MediaCommentsFeed mediaCommentsFeed = new MediaCommentsFeed();

    // Create a new instance of Meta
    Meta meta = new Meta();

    // Set the Meta instance to the MediaCommentsFeed
    mediaCommentsFeed.setMeta(meta);

    // Verify that the Meta instance is set correctly
    assertEquals(meta, mediaCommentsFeed.getMeta());
}

}
