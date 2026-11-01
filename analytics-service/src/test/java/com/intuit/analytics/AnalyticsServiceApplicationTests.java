package com.intuit.analytics;

import org.junit.jupiter.api.Test;

class AnalyticsServiceApplicationTests {

	@Test
	void applicationClassLoads() {
		org.junit.jupiter.api.Assertions.assertNotNull(AnalyticsServiceApplication.class);
	}

}
