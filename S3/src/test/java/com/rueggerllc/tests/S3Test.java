package com.rueggerllc.tests;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.Bucket;
import software.amazon.awssdk.services.s3.model.ListBucketsRequest;
import software.amazon.awssdk.services.s3.model.ListBucketsResponse;


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
		System.out.println("==================== LIST BUCKETS BEGIN ===========");
		Region region = Region.US_EAST_1;
		S3Client s3 = S3Client.builder().region(region).build();  
		
		// List buckets
		ListBucketsRequest listBucketsRequest = ListBucketsRequest.builder().build();
		ListBucketsResponse listBucketsResponse = s3.listBuckets(listBucketsRequest);
		List<Bucket> buckets = listBucketsResponse.buckets();
		for (Bucket bucket : buckets) {
			logger.info("Next Bucket=" + bucket.name());
		}
		
		// listBucketsResponse.buckets().stream().forEach(x -> System.out.println(x.name()));
	}
	
	
}
