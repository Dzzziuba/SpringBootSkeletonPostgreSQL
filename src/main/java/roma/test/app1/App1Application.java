package roma.test.app1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import roma.test.app1.DAO.repository.HumanRepository;
import roma.test.app1.domain.Human;

@SpringBootApplication
public class App1Application {

	public static void main(String[] args) {
		SpringApplication.run(App1Application.class, args);
	}

	@Bean
	public CommandLineRunner users(HumanRepository repository){
		return args -> {
			repository.save(new Human("Roma", "Dziuba"));
			repository.save(new Human("Sasha", "Chumak"));
			repository.save(new Human("Nikita", "Vorokhta"));

			System.out.println(repository.findAll());
			System.out.println(repository.findBySurName("Dziuba"));
		};
	}
}
