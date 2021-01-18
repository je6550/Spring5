package com.spetaxintegrated.Springwebapp.bootstrap;

import com.spetaxintegrated.Springwebapp.domain.Author;
import com.spetaxintegrated.Springwebapp.domain.Book;
import com.spetaxintegrated.Springwebapp.domain.Publisher;
import com.spetaxintegrated.Springwebapp.repositories.AuthorRepository;
import com.spetaxintegrated.Springwebapp.repositories.BookRepository;
import com.spetaxintegrated.Springwebapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started BootStrap");

        Publisher publisher = new Publisher();
        publisher.setName("SoftBrain LLC");
        publisher.setCity("Warri");
        publisher.setState("DT");

        publisherRepository.save(publisher);

        System.out.println("Publisher Count " + publisherRepository.count());

        Author prince = new Author("Prince", "John");
        Book ddd = new Book("Domain Driven Design", "123456789");
        prince.getBooks().add(ddd);
        ddd.getAuthors().add(prince);

        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(prince);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        System.out.println("Number of books " + bookRepository.count());
        System.out.println("Publisher Number of Books" + publisherRepository.count());

    }
}
