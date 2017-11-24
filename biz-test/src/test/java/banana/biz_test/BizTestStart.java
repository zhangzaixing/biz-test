package banana.biz_test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/spring-*.xml")
public class BizTestStart 
{
	App app = new App();
	
    @Test
    public void diamondTest() {
    	Integer result = app.getConfig();
    	System.out.println(result);
    }
}
