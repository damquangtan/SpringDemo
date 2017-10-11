package dam.tan.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("dam.tan.demo.*")
@EnableTransactionManagement
// Load to Environtment
@PropertySource("classpath:ds-hibernate-cfg.properties")
public class ApplicationContextConfig {

}
