/**
 * 
 */
package com.ib.trainingcommon.test.ac;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ib.trainingcommon.ac.ICourseAC;
import com.ib.trainingcommon.ac.CourseAC;
import com.ib.trainingcommon.bo.Course;

/**
 * @author ib
 *
 */
class CourseACTest {

	private static ICourseAC livreAC = null;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		// demarrage de spring
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextCommon.xml");

		livreAC = context.getBean("livreAC", CourseAC.class);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {

	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.ib.trainingcommon.ac.CourseAC#findAll()}.
	 */
	@Test
	void testFindAll() {
		List<Course> livres = livreAC.findAll();

		// on controle le bouchon
		assertNotNull(livres);
		assertEquals(2, livres.size());
	}

}
