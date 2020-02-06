package ee.demo.graphql.entity.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import ee.demo.graphql.entity.Book;
import ee.demo.graphql.entity.repository.BookRepository;

import java.util.List;

public class Query implements GraphQLQueryResolver {

	private BookRepository bookRepository;

	public Query(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public List<Book> books() {
		return bookRepository.findAll();
	}
}
