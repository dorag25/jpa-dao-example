package book;

import book.model.Book;
import com.google.inject.persist.Transactional;
import jpa.GenericJpaDao;

import javax.persistence.NoResultException;
import java.util.Optional;

public class BookDao extends GenericJpaDao<Book> {

    //Optional<Book> findByIsbn13(String isbn13): visszaadja az adatbázisból az adott ISBN számú könyvet
    // ábrázoló objektumot, ha van ilyen, egyébként egy üres Optional objektumot ad vissza.

    @Transactional
    public Optional<Book> findByIsbn13(String isbn13){
        try {
            return Optional.of(entityManager.createQuery("SELECT b FROM Book b WHERE b.isbn13 = :isbn13", Book.class)
                    .setParameter("isbn13", isbn13)
                    .getSingleResult());
                    }
        catch (NoResultException e) {
            return Optional.empty();
        }
    }

    //@Transactional
    //public Optional<User> findByUsername(String username) {
        //try {
            //return Optional.of(entityManager.createQuery("SELECT u FROM User u WHERE u.username = :username", User.class)
                    //.setParameter("username", username)
                    //.getSingleResult());
        //} catch (NoResultException e) {
            //return Optional.empty();
        //}
}
