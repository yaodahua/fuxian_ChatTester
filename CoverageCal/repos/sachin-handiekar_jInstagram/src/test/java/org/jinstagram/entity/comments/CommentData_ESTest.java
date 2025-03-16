/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:28:38 GMT 2024
 */
package org.jinstagram.entity.comments;


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.comments.CommentData;
import org.jinstagram.entity.common.FromTagData;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class CommentData_ESTest extends CommentData_ESTest_scaffolding {


@Test(timeout = 4000)
public void test01() throws Throwable {
    CommentData commentData0 = new CommentData();
    commentData0.setText("");
    String string0 = commentData0.getText();
    assertEquals("", string0);
}


@Test(timeout = 4000)
public void test05() throws Throwable {
    CommentData commentData0 = new CommentData();
    commentData0.setCreatedTime("");
    String string0 = commentData0.getCreatedTime();
    assertEquals("", string0);
}


@Test(timeout = 4000)
public void test06() throws Throwable {
    CommentData commentData0 = new CommentData();
    String string0 = commentData0.toString();
    assertEquals("CommentData [commentFrom=null, createdTime=null, id=null, text=null]", string0);
}


@Test(timeout = 4000)
public void test10() throws Throwable {
    CommentData commentData0 = new CommentData();
    FromTagData fromTagData0 = new FromTagData();
    commentData0.setCommentFrom(fromTagData0);
    FromTagData fromTagData1 = commentData0.getCommentFrom();
    assertNull(fromTagData1.getFullName());
}


@Test(timeout = 4000)
public void test03() throws Throwable {
    CommentData commentData0 = new CommentData();
    commentData0.setId("");
    String string0 = commentData0.getId();
    assertEquals("", string0);
}

}
