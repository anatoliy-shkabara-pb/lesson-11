package s09properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class S01_WritePropertiesFile {
    public static void main(String[] args) {
        Properties prop = new Properties();
        OutputStream output = null;

        try {
            output = new FileOutputStream("files/config.properties");

            // set the properties value
            prop.setProperty("database", "localhost");
            prop.setProperty("dbuser", "sa");
            prop.setProperty("dbpassword", "adm1n");

            // save properties to project root folder
            prop.store(output, null);
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
