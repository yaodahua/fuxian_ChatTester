// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/ImageData_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:40:48 GMT 2024
 */
package org.jinstagram.entity.common;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.ImageData;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class ImageData_ESTest extends ImageData_ESTest_scaffolding {
@Test
public void testSetImageWidth() {
    // Create an instance of ImageData
    ImageData imageData = new ImageData();

    // Set the image width using the focal method
    int imageWidth = 800;
    imageData.setImageWidth(imageWidth);

    // Verify that the image width is set correctly
    assertEquals(imageWidth, imageData.getImageWidth());
}
}
