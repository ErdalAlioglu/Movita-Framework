package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    static Properties properties;
    //src/test/java/utilities

    static {
        String path="configuration.properties";
        FileInputStream file=null;
        try {
            file=new FileInputStream(path);
            properties=new Properties();
            properties.load(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
