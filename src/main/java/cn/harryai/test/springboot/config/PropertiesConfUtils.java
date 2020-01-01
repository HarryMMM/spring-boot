package cn.harryai.test.springboot.config;

import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import static cn.harryai.test.springboot.config.CommonConstans.TEST1;
import static cn.harryai.test.springboot.config.CommonConstans.TEST2;

/**
 * @author Harry
 * @since 2020/01/01 12:35
 **/
@PropertySource(value = {TEST1, TEST2}, encoding = "UTF-8")
@Configuration
public class PropertiesConfUtils implements EnvironmentAware {
    private static Environment environment;

    public static String getProperty(String propertyName, String defaultVal) {
        return environment.getProperty(propertyName, defaultVal);
    }

    public static String getProperty(String propertyName) {
        return environment.getProperty(propertyName);
    }

    public static <T> T getProperty(String propertyName, Class<T> clazz, T defaultVal) {
        return environment.getProperty(propertyName, clazz, defaultVal);
    }

    public static <T> T getProperty(String propertyName, Class<T> clazz) {
        return environment.getProperty(propertyName, clazz);
    }

    @Override
    public void setEnvironment(Environment environment) {
        PropertiesConfUtils.environment = environment;
    }
}


