package com.intuit.smartgateway;

import org.junit.jupiter.api.Test;

class SmartGatewayServiceApplicationTests {

	@Test
	void applicationClassLoads() {
		org.junit.jupiter.api.Assertions.assertNotNull(SmartGatewayServiceApplication.class);
	}

}
