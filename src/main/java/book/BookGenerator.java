package book;

import book.model.Book;

import com.github.javafaker.*;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;


public class BookGenerator {

        private static Faker faker = new Faker(new Locale("hu"));

        public static Book createBook(){

        java.util.Date date;
        date = faker.date().birthday();
        java.time.LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        Book book=Book.builder()
                .isbn13(faker.code().isbn13())
                .author(faker.book().author())
                .title(faker.book().title())
                .format(faker.options().option(Book.Format.class))
                .publisher(faker.book().publisher())
                .publicationDate(localDate)
                .pages(faker.number().numberBetween(12,20))
                .available(faker.bool().bool())
                .build();
        return book;
    }
    //Faker faker = new Faker();

    //String name = faker.name().fullName(); // Miss Samanta Schmidt
    //String firstName = faker.name().firstName(); // Emory
    //String lastName = faker.name().lastName(); // Barton

    //String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
}
