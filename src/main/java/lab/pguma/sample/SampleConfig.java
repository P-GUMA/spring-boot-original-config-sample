package lab.pguma.sample;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@PropertySource("classpath:sample.properties")
@ConfigurationProperties(prefix = "sample")
@Setter
@Getter
public class SampleConfig {

    private String host;

    private int port;

}
