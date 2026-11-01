package com.intuit.apimanagement;

import org.junit.jupiter.api.Test;

class ApiManagementServiceApplicationTests {

	@Test
	void applicationClassLoads() {
		org.junit.jupiter.api.Assertions.assertNotNull(ApiManagementServiceApplication.class);
	}

}
