package com.test;

import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.util.RestUtil;

public class TwitterTest extends BaseTest {
	RestUtil util;

	@BeforeClass
	public void beforeClass() {
		util = new RestUtil();
		//util.getRequest("statuses/lookup.json?", "20,432656548536401920");
		util.postRequest("statuses/update.json?", "Testing%20post%20request4");
		// util.postRequest("direct_messages/destroy.json?id=785161828531712000");
	}
	
	@Test
	public void testStatusCode() {
		Assert.assertEquals(HttpStatus.SC_OK, util.validateStatusCode());
	}

	@Test(enabled = false)
	public void testListOfObjects() {
		Assert.assertEquals(2, util.getMyPojo().length);
	}

	@Test(enabled = false)
	public void testCreatedAt() {
		Assert.assertEquals("Tue Mar 21 20:50:14 +0000 2006", util.validateCreatedAt(0));
		Assert.assertEquals("Sun Feb 09 23:25:34 +0000 2014", util.validateCreatedAt(1));
	}

	@Test(enabled = false)
	public void testEntitiesUrl() {
		Assert.assertEquals("https://t.co/9S8YO69xzf", util.validateEntitiesUrl(1));
	}

	@Test(enabled = false)
	public void testUserScreenName() {
		Assert.assertEquals("TwitterDev", util.validateUserScreenName(1));
	}
}
