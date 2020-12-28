package univ.kunsan.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
public class Application
{
    @CrossOrigin(origins = "http://localhost:3000")
    public static void main(String... args)
    {
        SpringApplication.run(Application.class, args);
    }
}