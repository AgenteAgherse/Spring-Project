package com.website.project;

import com.website.project.model.Entities.Usuario;
import com.website.project.service.entityService.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ProjectApplication implements CommandLineRunner {

    private UserService userService;

    public ProjectApplication(
            UserService userService
    ){
        this.userService = userService;
    }


	public static void main(String[] args) {

        SpringApplication.run(ProjectApplication.class, args);

	}


	@Override
	public void run(String... args) throws Exception {
        userService.add(new Usuario(10134567, "Luisa", "Hernández", "Serpa", "lferyonoseque@gmail.com", "3023600696", 'F'));
	}

}
