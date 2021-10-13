package com.syscho.objectmapper.freemarker;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.syscho.objectmapper.freemarker.config.FreeMarkerConfig;
import com.syscho.objectmapper.model.Contact;
import com.syscho.objectmapper.model.DataHub;
import com.syscho.objectmapper.model.Note;
import freemarker.template.*;
import org.openjdk.jmh.annotations.*;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FreeMarkerBasicMain {
    static ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws IOException, TemplateException {
        transform();
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1)
    @Warmup(iterations = 1)
    @Measurement(iterations = 1)
    public static void transform() throws IOException, TemplateException {
        Configuration cfg = FreeMarkerConfig.getConfig();

        List<Note> notes = DataHub.getObjectFromFilePath("data/note.json", List.class);
        Map<String, String> map = DataHub.getObjectFromFilePath("data/map.json", Map.class);
        Contact contact = DataHub.getObjectFromFilePath("data/contact.json", Contact.class);

        Template template = cfg.getTemplate("freemarker/basic.ftl");
        Map<String, Object> data = buildDataSet(notes, map, contact);

        Writer out = new StringWriter();
        template.process(data, out);
        out.flush();
        System.out.println(out.toString());
        JsonNode jsonNode = objectMapper.readTree(out.toString());
        System.out.println(jsonNode);
    }

    private static Map<String, Object> buildDataSet(List<Note> notes, Map<String, String> map, Contact contact) {
        Map<String, Object> data = new HashMap<>();
        data.put("list", notes);
        data.put("map", map);
        data.put("contact", contact);
        data.put("booleanCheckList", false);
        data.put("numberField", 34);
        data.put("loggedIn", false);
        data.put("indexOf", new IndexOfMethod());
        data.put("homeContact", contact);
        data.put("officeContact", contact);
        return data;
    }
}


class IndexOfMethod implements TemplateMethodModel {

    public TemplateModel exec(List args) throws TemplateModelException {
        if (args.size() < 2) {
            throw new TemplateModelException("Wrong arguments");
        }
        return new SimpleNumber(
                ((String) args.get(1)).indexOf((String) args.get(0)));
    }
}


