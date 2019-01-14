package top.heysunday.myblog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.heysunday.myblog.model.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyblogApplicationTests {
    @Autowired
    Person person;
    @Test
    public void contextLoads() {
        System.out.println(person.getName());
        System.out.println(person.getSecondName());
        System.out.println(person.getEmail());
    }

}

