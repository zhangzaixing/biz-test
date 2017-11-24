package banana.biz_test;

import com.appleframework.config.core.PropertyConfigurer;


public class App 
{
	public Integer getConfig() {
		Integer result = PropertyConfigurer.getInteger("biz.test.config");
		return result;
	}
}
