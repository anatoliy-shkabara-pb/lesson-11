package s09properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;
import java.util.function.BiConsumer;

public class S04_PrintAllProperties {
    public static void main(String[] args) {
        Properties prop = new Properties();
        InputStream input = null;
        try {
            String filename = "s09properties/config.properties";
            input = S04_PrintAllProperties.class.getClassLoader().getResourceAsStream(filename);
            if (input == null) {
                System.out.println("Sorry, unable to find " + filename);
                return;
            }
            prop.load(input);
            Enumeration<?> e = prop.propertyNames();
            while (e.hasMoreElements()) {
                String key = (String) e.nextElement();
                String value = prop.getProperty(key);
                System.out.println(key + " -> " + value);
            }
            System.out.println();

            prop.forEach(new BiConsumer<Object, Object>() {
                @Override
                public void accept(Object key, Object value) {
                    System.out.println(key + " -> " + value);
                }
            });


        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
