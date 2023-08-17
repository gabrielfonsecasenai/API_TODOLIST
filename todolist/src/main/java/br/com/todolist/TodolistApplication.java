package br.com.todolist;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TodolistApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

	@Bean
	CommandLineRunner criarTarefasFake(TodoRepository todoRpository) {
		return args -> {
			todoRpository.deleteAll();

			Todo todo1 = new Todo("Configurar JDK", "Preciso aprender a configurar o jdk corretamente", StatusEnum.NOT_STARTED);
			Todo todo2 = new Todo("Estudar Java", "Estudar Java para aprender programação", StatusEnum.IN_PROGRESS);
			Todo todo3 = new Todo("Estudar HTML", "Estudar HTML para aprender programação", StatusEnum.FINISHED);

			todoRpository.save(todo1);
			todoRpository.save(todo2);
			todoRpository.save(todo3);
		};
	}
}

