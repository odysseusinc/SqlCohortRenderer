package org.ohdsi.webapi.helper;

import java.io.InputStreamReader;
import java.io.Reader;
import org.apache.commons.io.IOUtils;

public class ResourceHelper {
    /**
     * @param resource
     * @return
     */
    public static String GetResourceAsString(String resource) {

        try (Reader reader = new InputStreamReader(ResourceHelper.class.getResourceAsStream(resource), "UTF-8")) {
            return IOUtils.toString(reader);
        } catch (Exception exception) {
            throw new RuntimeException("Resource not found: " + resource);
        }
    }
}
