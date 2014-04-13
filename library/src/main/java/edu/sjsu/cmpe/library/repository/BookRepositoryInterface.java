package edu.sjsu.cmpe.library.repository;

import java.util.List;

import com.yammer.dropwizard.jersey.params.LongParam;

import edu.sjsu.cmpe.library.domain.Book;
import edu.sjsu.cmpe.library.domain.Book.Status;

/**
 * Book repository interface.
 * 
 * What is repository pattern?
 * 
 * @see http://martinfowler.com/eaaCatalog/repository.html
 */
public interface BookRepositoryInterface {
    /**
     * Save a new book in the repository
     * 
     * @param newBook
     *            a book instance to be create in the repository
     * @return a newly created book instance with auto-generated ISBN
     */
    Book saveBook(Book newBook);

    /**
     * Retrieve an existing book by ISBN
     * 
     * @param isbn
     *            a valid ISBN
     * @return a book instance
     */
    Book getBookByISBN(Long isbn);

    /**
     * Retrieve all books
     * 
     * @return a list of books
     */
    List<Book> getAllBooks();
    
    /*
     * Update status of a book by its isbn
     * @param isbn
     *            an ISBN of the book to be deleted
     * @param status
     *            an status to be updated
     */
    
    public void updateBookStatus(LongParam isbn,Status status);

    /**
     * Delete an existing book
     * 
     * @param isbn
     *            an ISBN of the book to be deleted
     */
    void delete(Long isbn);
}
