// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Images_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:42:55 GMT 2024
 */
package org.jinstagram.entity.common;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.ImageData;
import org.jinstagram.entity.common.Images;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Images_ESTest extends Images_ESTest_scaffolding {
    @Test
    public void testToString() {
        Images images = new Images();
        ImageData lowResolution = new ImageData();
        lowResolution.setUrl("http://example.com/lowres.jpg");
        ImageData standardResolution = new ImageData();
        standardResolution.setUrl("http://example.com/standardres.jpg");
        ImageData thumbnail = new ImageData();
        thumbnail.setUrl("http://example.com/thumbnail.jpg");

        images.setLowResolution(lowResolution);
        images.setStandardResolution(standardResolution);
        images.setThumbnail(thumbnail);

        String expected = "Images [lowResolution=ImageData{url='http://example.com/lowres.jpg'}, standardResolution=ImageData{url='http://example.com/standardres.jpg'}, thumbnail=ImageData{url='http://example.com/thumbnail.jpg'}]";
        String actual = images.toString();

        assertEquals(expected, actual);
    }
}
