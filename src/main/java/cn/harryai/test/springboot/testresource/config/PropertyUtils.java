package cn.harryai.test.springboot.testresource.config;

import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

/**
 * @author Harry
 * @since 2020/01/05 19:55
 **/
@Component
public class PropertyUtils extends PropertySourcesPlaceholderConfigurer {
    @Override
    protected String convertProperty(String propertyName, String propertyValue) {
        return super.convertProperty(propertyName, propertyValue);
    }
}
