/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:30:23 GMT 2024
 */

package org.jinstagram.entity.users.feed;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Caption;
import org.jinstagram.entity.common.Comments;
import org.jinstagram.entity.common.Images;
import org.jinstagram.entity.common.Likes;
import org.jinstagram.entity.common.Location;
import org.jinstagram.entity.common.User;
import org.jinstagram.entity.common.UsersInPhoto;
import org.jinstagram.entity.common.Videos;
import org.jinstagram.entity.users.feed.CarouselMedia;
import org.jinstagram.entity.users.feed.MediaFeedData;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MediaFeedData_ESTest extends MediaFeedData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      mediaFeedData0.setUserHasLiked(true);
      boolean boolean0 = mediaFeedData0.isUserHasLiked();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      Videos videos0 = new Videos();
      mediaFeedData0.setVideos(videos0);
      Videos videos1 = mediaFeedData0.getVideos();
      assertSame(videos1, videos0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      LinkedList<UsersInPhoto> linkedList0 = new LinkedList<UsersInPhoto>();
      UsersInPhoto usersInPhoto0 = new UsersInPhoto();
      linkedList0.add(usersInPhoto0);
      mediaFeedData0.setUsersInPhotoList(linkedList0);
      List<UsersInPhoto> list0 = mediaFeedData0.getUsersInPhotoList();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      User user0 = new User();
      mediaFeedData0.setUser(user0);
      User user1 = mediaFeedData0.getUser();
      assertNull(user1.getUserName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      mediaFeedData0.setType("QSPSls~Efd^/'.c^");
      String string0 = mediaFeedData0.getType();
      assertEquals("QSPSls~Efd^/'.c^", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      mediaFeedData0.setTags(linkedList0);
      List<String> list0 = mediaFeedData0.getTags();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("image");
      mediaFeedData0.setTags(linkedList0);
      List<String> list0 = mediaFeedData0.getTags();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      Location location0 = new Location();
      location0.setLongitude(1.0);
      mediaFeedData0.setLocation(location0);
      Location location1 = mediaFeedData0.getLocation();
      assertNull(location1.getName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      Location location0 = new Location();
      location0.setLongitude((-206.074841));
      mediaFeedData0.setLocation(location0);
      Location location1 = mediaFeedData0.getLocation();
      assertEquals((-206.074841), location1.getLongitude(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      Location location0 = new Location();
      location0.setLatitude(1384.39555932679);
      mediaFeedData0.setLocation(location0);
      Location location1 = mediaFeedData0.getLocation();
      assertEquals(0.0, location1.getLongitude(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      Location location0 = new Location();
      location0.setLatitude((-206.074841));
      mediaFeedData0.setLocation(location0);
      Location location1 = mediaFeedData0.getLocation();
      assertEquals((-206.074841), location1.getLatitude(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      mediaFeedData0.setLink("org.jinstagram.entity.common.User");
      String string0 = mediaFeedData0.getLink();
      assertEquals("org.jinstagram.entity.common.User", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      mediaFeedData0.setLink("");
      String string0 = mediaFeedData0.getLink();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      Likes likes0 = new Likes();
      likes0.setCount(542);
      mediaFeedData0.setLikes(likes0);
      Likes likes1 = mediaFeedData0.getLikes();
      assertEquals(542, likes1.getCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      Likes likes0 = new Likes();
      likes0.setCount((-1609));
      mediaFeedData0.setLikes(likes0);
      Likes likes1 = mediaFeedData0.getLikes();
      assertEquals((-1609), likes1.getCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      mediaFeedData0.setImageFilter("'p`?Fy");
      String string0 = mediaFeedData0.getImageFilter();
      assertEquals("'p`?Fy", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      mediaFeedData0.setImageFilter("");
      String string0 = mediaFeedData0.getImageFilter();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      mediaFeedData0.setId("");
      String string0 = mediaFeedData0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      mediaFeedData0.setCreatedTime("+I+");
      String string0 = mediaFeedData0.getCreatedTime();
      assertEquals("+I+", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      Comments comments0 = new Comments();
      mediaFeedData0.setComments(comments0);
      Comments comments1 = mediaFeedData0.getComments();
      assertEquals(0, comments1.getCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      Comments comments0 = new Comments();
      comments0.setCount((-1172));
      mediaFeedData0.setComments(comments0);
      Comments comments1 = mediaFeedData0.getComments();
      assertSame(comments1, comments0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      LinkedList<CarouselMedia> linkedList0 = new LinkedList<CarouselMedia>();
      CarouselMedia carouselMedia0 = new CarouselMedia();
      linkedList0.add(carouselMedia0);
      mediaFeedData0.setCarouselMedia(linkedList0);
      List<CarouselMedia> list0 = mediaFeedData0.getCarouselMedia();
      assertTrue(list0.contains(carouselMedia0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      Images images0 = new Images();
      mediaFeedData0.setImages(images0);
      Images images1 = mediaFeedData0.getImages();
      assertSame(images1, images0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      String string0 = mediaFeedData0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      String string0 = mediaFeedData0.toString();
      assertEquals("MediaFeedData [caption=null, comments=null, createdTime=null, id=null, imageFilter=null, images=null, likes=null, link=null, location=null, tags=null, type=null, user=null, userHasLiked=false, usersInPhoto=null]", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      List<String> list0 = mediaFeedData0.getTags();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      User user0 = mediaFeedData0.getUser();
      assertNull(user0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      mediaFeedData0.setCreatedTime("");
      String string0 = mediaFeedData0.getCreatedTime();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      String string0 = mediaFeedData0.getType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      Comments comments0 = new Comments();
      mediaFeedData0.setComments(comments0);
      comments0.setCount(2);
      Comments comments1 = mediaFeedData0.getComments();
      assertEquals(2, comments1.getCount());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      mediaFeedData0.setType("");
      String string0 = mediaFeedData0.getType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      List<CarouselMedia> list0 = mediaFeedData0.getCarouselMedia();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      Caption caption0 = mediaFeedData0.getCaption();
      assertNull(caption0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      Comments comments0 = mediaFeedData0.getComments();
      assertNull(comments0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      Likes likes0 = mediaFeedData0.getLikes();
      assertNull(likes0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      LinkedList<UsersInPhoto> linkedList0 = new LinkedList<UsersInPhoto>();
      mediaFeedData0.setUsersInPhotoList(linkedList0);
      List<UsersInPhoto> list0 = mediaFeedData0.getUsersInPhotoList();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      String string0 = mediaFeedData0.getImageFilter();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      mediaFeedData0.setId("Y\"6");
      String string0 = mediaFeedData0.getId();
      assertEquals("Y\"6", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      Images images0 = mediaFeedData0.getImages();
      assertNull(images0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      Likes likes0 = new Likes();
      mediaFeedData0.setLikes(likes0);
      Likes likes1 = mediaFeedData0.getLikes();
      assertSame(likes1, likes0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      List<UsersInPhoto> list0 = mediaFeedData0.getUsersInPhotoList();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      Videos videos0 = mediaFeedData0.getVideos();
      assertNull(videos0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      Caption caption0 = new Caption();
      mediaFeedData0.setCaption(caption0);
      Caption caption1 = mediaFeedData0.getCaption();
      assertSame(caption1, caption0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      String string0 = mediaFeedData0.getLink();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      Location location0 = mediaFeedData0.getLocation();
      assertNull(location0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      String string0 = mediaFeedData0.getCreatedTime();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      boolean boolean0 = mediaFeedData0.isUserHasLiked();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MediaFeedData mediaFeedData0 = new MediaFeedData();
      LinkedList<CarouselMedia> linkedList0 = new LinkedList<CarouselMedia>();
      mediaFeedData0.setCarouselMedia(linkedList0);
      List<CarouselMedia> list0 = mediaFeedData0.getCarouselMedia();
      assertTrue(list0.isEmpty());
  }
}
