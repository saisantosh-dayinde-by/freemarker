package com.syscho.objectmapper.model;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DataHub {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    private static byte[] getBytesFromFilePath(String filePath) {
        try {
            URL resource = ClassLoader.getSystemResource(filePath);
            if (resource == null) {
                throw new RuntimeException("File not found : " + filePath);
            }
            Path path = Paths.get(resource.toURI());
            return Files.readAllBytes(path);
        } catch (URISyntaxException | IOException exp) {
            throw new RuntimeException("Failed in loading the files to the Object specified", exp);
        }
    }

    public static <T> T getObjectFromFilePath(String filePath, Class<T> valueType) {
        try {
            byte[] allData = getBytesFromFilePath(filePath);
            return objectMapper.readValue(allData, valueType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
