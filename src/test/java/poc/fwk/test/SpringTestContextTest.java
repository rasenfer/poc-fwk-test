package poc.fwk.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import poc.fwk.test.SpringTestContext;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringTestContext.class)
public class SpringTestContextTest {

	@Autowired
	private ApplicationContext applicationContext;
	@Test
	public void testContext() {
		assertNotNull(applicationContext);
	}
}
