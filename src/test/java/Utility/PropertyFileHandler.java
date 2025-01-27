package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileHandler {
    static PropertyFileHandler propertyFileHandler;
    static Properties Prop = new Properties();

    PropertyFileHandler() {

    }
    //This method is to return the PropertyFileHandler object
    public static PropertyFileHandler getPropertyFileHandler() {
        if (propertyFileHandler == null) {
            propertyFileHandler = new PropertyFileHandler();
        }
        return propertyFileHandler;
    }
    //This method is to load the property file
    public static void loadPropertyFile(String path) throws FileNotFoundException, IOException {
        System.out.println("Property File has been loaded");
        Prop.load(new FileInputStream(path));
    }
    //This method is used to read the property file.
    public static String readProperty(String key) {
        return Prop.getProperty(key);
    }
    //This method is used to write to the property file.
    public static void writeProperty(String key, String value) {
        Prop.setProperty(key, value);

    }
}