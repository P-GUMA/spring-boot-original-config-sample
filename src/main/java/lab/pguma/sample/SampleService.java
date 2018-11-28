package lab.pguma.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

@Service
@EnableAutoConfiguration
public class SampleService {

    @Autowired
    SampleConfig sampleConfig;

    public String URL() {
        return "http://" + sampleConfig.getHost() + ":" + sampleConfig.getPort();
    }

}
