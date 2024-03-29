package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    static Properties properties;

    static {
        String dosyaYolu = "configuration.properties";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            properties = new Properties();
            properties.load(fis);
        } catch (IOException e) {
            System.out.println("can not read the properties file");
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
