package book;



import com.github.javafaker.*;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date date;


public class BookGenerator {
    public static CreateBook() {
        Faker faker = new Faker();

        Book book=Book.builder()
                .isbn13(faker.code().isbn13())
                .author(faker.book().author())
                .title(faker.book().title())
                .format(faker.options().option()
                .publisher(faker.book().publisher())
                .publicationDate(localDate)
                .pages(faker.number().numberBetween()
                .available(faker.bool().bool())
                .build();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return book;
    }
    //Faker faker = new Faker();

    //String name = faker.name().fullName(); // Miss Samanta Schmidt
    //String firstName = faker.name().firstName(); // Emory
    //String lastName = faker.name().lastName(); // Barton

    //String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
}
