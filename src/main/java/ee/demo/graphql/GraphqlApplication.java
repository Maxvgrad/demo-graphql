package ee.demo.graphql;

import graphql.Scalars;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLSchema;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication(scanBasePackages = "ee.demo.graphql")
@SpringBootApplication
public class GraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

	@Bean
	GraphQLSchema schema() {
		return GraphQLSchema.newSchema()
				.query(GraphQLObjectType.newObject()
						.name("query")
						.field(field -> field
								.name("test")
								.type(Scalars.GraphQLString)
								.dataFetcher(environment -> "response")
						)
						.build())
				.build();
	}

}
