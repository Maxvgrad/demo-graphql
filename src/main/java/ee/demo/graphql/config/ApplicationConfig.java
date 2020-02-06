package ee.demo.graphql.config;

import com.coxautodev.graphql.tools.SchemaParser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	private String schemaFile = "schema.graphqls";

	@Bean
	public SchemaParser schemaParser() {
		return SchemaParser.newParser().file(schemaFile).build();
	}


}
