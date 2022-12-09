package dk.msw.feedback;

import dk.msw.feedback.entity.Feedback;
import dk.msw.feedback.repository.FeedbackRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class FeedbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeedbackApplication.class, args);
	}

	// Dummy data for testing out GraphQL. Comment out when releasing.
	@Bean
	ApplicationRunner applicationRunner(FeedbackRepository feedbackRepository) {
		return args -> {
			Feedback f1 = feedbackRepository.save(new Feedback(1L, 1L, 1L,
					"Bad service", 1, 1, 0, "I hated it."));
			Feedback f2 = feedbackRepository.save(new Feedback(2L, 1L, 1L,
					"Good service", 5, 5, 0, "I love it!"));
			Feedback f3 = feedbackRepository.save(new Feedback(3L, 2L, 1L,
					"Meh service", 3, 5, 0, "I like it."));

			feedbackRepository.saveAll(List.of(f1, f2, f3));
		};
	}

}
