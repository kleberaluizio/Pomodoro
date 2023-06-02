package com.kleberaluizio.pomodoro;

import com.kleberaluizio.pomodoro.model.task.Task;
import com.kleberaluizio.pomodoro.model.task.TaskRegistrationRequest;
import com.kleberaluizio.pomodoro.model.task.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class PomodoroApplication {

	public static void main(String[] args) {
		SpringApplication.run(PomodoroApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner(TaskRepository taskRepository){
//		return args -> {
//			Task spring = new Task(new TaskRegistrationRequest(
//					"SpringBoot Course",
//					19
//			));
//
//			Task junit = new Task(new TaskRegistrationRequest(
//					"JUnit Course",
//					10
//			));
//
//
//			List<Task> tasks = List.of(spring, junit);
//			taskRepository.saveAll(tasks);
//		};
//	}

}
