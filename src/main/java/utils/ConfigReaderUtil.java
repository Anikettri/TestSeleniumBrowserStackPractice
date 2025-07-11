package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReaderUtil {
    private static Properties properties;
    static {
        try {
            String path = System.getProperty("user.dir") + "/src/main/resources/config.properties";
            FileInputStream file = new FileInputStream(path);
            properties = new Properties();
            properties.load(file);
        }catch (IOException e){
            throw new RuntimeException("Failed to load config.properties file"+e.getMessage());
        }
    }
    public static String get(String key){
        return properties.getProperty(key);
    }
}
