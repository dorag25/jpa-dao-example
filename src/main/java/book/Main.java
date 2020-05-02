package book;

import book.model.Book;
import com.google.inject.Guice;
import com.google.inject.Injector;
import guice.PersistenceModule;
//import book.BookGenerator.;


import static book.BookGenerator.createBook;

public class Main {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new PersistenceModule("test"));
        BookDao bookDao = injector.getInstance(BookDao.class);
        for (int i = 0; i < 1000; i++) {
            Book book = createBook();
            bookDao.persist(book);
        }
        bookDao.findAll()
                .stream()
                .forEach(System.out::println);
    }
}
/*    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new PersistenceModule("test"));
        UserDao userDao = injector.getInstance(UserDao.class);
        for (int i = 0; i < 10; i++) {
            User user = createUser();
            userDao.persist(user);
        }
        userDao.findAll()
                .stream()
                .forEach(System.out::println);*/
