package com.syscho.objectmapper.jolt;

import com.bazaarvoice.jolt.Chainr;
import com.bazaarvoice.jolt.JsonUtils;
import org.openjdk.jmh.annotations.*;

import java.util.List;

public class JoltMain {

    public static void main(String[] args) {
        transform();
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1)
    @Warmup(iterations = 1)
    @Measurement(iterations = 1)
    public static void transform() {
        List<Object> specs = JsonUtils.classpathToList("/jolt/basic.json");
        Chainr chainr = Chainr.fromSpec(specs);

        Object inputJSON = JsonUtils.classpathToObject("/data/jolt-basic.json");
        Object transformedOutput = chainr.transform(inputJSON);
        System.out.println(JsonUtils.toPrettyJsonString(transformedOutput));
    }
}
