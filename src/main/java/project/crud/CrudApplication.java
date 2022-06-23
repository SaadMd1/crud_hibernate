package project.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import project.crud.models.Client;
import project.crud.repo.ClientRepo;
import project.crud.repo.ProduitsRepo;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(CrudApplication.class, args);

		ClientRepo clientRepository =
				configurableApplicationContext.getBean(ClientRepo.class);

		ProduitsRepo produitRepository =
				configurableApplicationContext.getBean(ProduitsRepo.class);
	}

}
