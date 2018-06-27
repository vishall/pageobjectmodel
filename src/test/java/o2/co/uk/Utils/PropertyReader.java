package o2.co.uk.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {


    private final Properties proper;

    public PropertyReader(final String propertyFile) {

        InputStream ip = getClass().getClassLoader().getResourceAsStream(propertyFile);

        proper = new Properties();
        try {

            proper.load(ip);
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getProperty(final String properName) {

        return proper.getProperty(properName);
    }
}



