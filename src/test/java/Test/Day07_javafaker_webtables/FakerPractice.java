package Test.Day07_javafaker_webtables;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;


public class FakerPractice {
    @Test
    public void faker_test() {
        Faker faker = new Faker();
        String name = faker.name().fullName(); // Miss Samanta Schmidt
        System.out.println("name= "+name);

        String firstName = faker.name().firstName(); // Emory
        System.out.println("first name= "+firstName);

        String lastName = faker.name().lastName(); // Barton
        System.out.println("last name= "+lastName);

        String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
        System.out.println("street adress= "+streetAddress);

        String gameOfThrones=faker.gameOfThrones().quote();
        System.out.println("Game Of Thrones"+gameOfThrones);

        String chuckNorris=faker.chuckNorris().fact();
        System.out.println("chuckNoris"+chuckNorris);

        String howIMeetYourMother=faker.howIMetYourMother().quote();
        System.out.println(howIMeetYourMother);



    }
}