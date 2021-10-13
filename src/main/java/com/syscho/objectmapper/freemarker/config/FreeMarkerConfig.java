package com.syscho.objectmapper.freemarker.config;

import com.syscho.objectmapper.freemarker.FreeMarkerBasicMain;
import freemarker.template.Configuration;
import freemarker.template.Version;

public class FreeMarkerConfig {

    public static Configuration getConfig() {
        Configuration cfg = new Configuration(new Version("2.3.23"));
        cfg.setClassForTemplateLoading(FreeMarkerBasicMain.class, "\\");
        cfg.setDefaultEncoding("UTF-8");

        return cfg;
    }
}
