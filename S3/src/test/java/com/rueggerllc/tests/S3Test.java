package com.rueggerllc.tests;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class S3Test {

	private static Logger logger = Logger.getLogger(S3Test.class);
	
	
	
	@BeforeClass
	public static void setupClass() throws Exception {
	}
	
	@AfterClass
	public static void tearDownClass() throws Exception {
	}

	@Before
	public void setupTest() throws Exception {
	}

	@After
	public void tearDownTest() throws Exception {
	}
	
	@Test
	public void testListBuckets() {
		final AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();
		List<Bucket> buckets = s3.listBuckets();
		System.out.println("Your Amazon S3 buckets are:");
		for (Bucket b : buckets) {
		    logger.info("* " + b.getName());
		}
	}
	
	
}
