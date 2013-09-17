package cucumber.test.config;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;


public class Settings {
    public static final String applicationUrl;
    public static final String device;

    static {
        // Read properties file.
        Properties properties = new Properties();
        try {
            ClassPathResource res = new ClassPathResource("environment.properties");
            properties.load(res.getInputStream());
            properties.putAll(System.getProperties());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        applicationUrl = properties.getProperty("applicationUrl");
        device = properties.getProperty("device");
    }
}

