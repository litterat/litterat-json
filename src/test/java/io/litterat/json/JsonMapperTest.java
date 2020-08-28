package io.litterat.json;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.litterat.pep.PepContext;

public class JsonMapperTest {

	final static int TEST_X = 1;
	final static int TEST_Y = 2;

	SimpleImmutable test = new SimpleImmutable(TEST_X, TEST_Y);

	PepContext context;

	@BeforeEach
	public void setup() {
		context = PepContext.builder().build();
	}

	@Test
	public void testToArray() throws Throwable {

		// write to array.
		String json = JsonMapper.toJson(test);

		System.out.println("json: " + json);

		SimpleImmutable t2 = JsonMapper.fromJson(json, SimpleImmutable.class);
		Assertions.assertNotNull(t2);
	}
}
