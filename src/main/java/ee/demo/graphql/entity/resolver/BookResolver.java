package ee.demo.graphql.entity.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import ee.demo.graphql.entity.Author;
import ee.demo.graphql.entity.Book;
import ee.demo.graphql.entity.repository.AuthorRepository;

class BookResolver implements GraphQLResolver<Book> {

	private AuthorRepository authorRepository;

	public Author author(Book book) {
		return authorRepository.findById(book.getAuthorId());
	}
}
