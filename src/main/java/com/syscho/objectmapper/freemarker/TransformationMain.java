package com.syscho.objectmapper.freemarker;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.syscho.objectmapper.freemarker.config.FreeMarkerConfig;
import com.syscho.objectmapper.model.DataHub;
import com.syscho.objectmapper.model.InputJsonPojo;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class TransformationMain {


    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        InputJsonPojo inputJsonPojo = DataHub.getObjectFromFilePath("input/input1.json", InputJsonPojo.class);

        try {
            Configuration cfg = FreeMarkerConfig.getConfig();
            Template template = cfg.getTemplate("freemarker/output.ftl");
            Map<String, Object> data = new HashMap<>();
            data.put("input", inputJsonPojo);
            data.put("shipment", inputJsonPojo.getShipment());
            Writer out = new StringWriter();
            template.process(data, out);
            out.flush();

        } catch (IOException | TemplateException e) {
            e.printStackTrace();
        }
    }
}
