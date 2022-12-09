package dk.msw.feedback.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import dk.msw.feedback.entity.Feedback;
import dk.msw.feedback.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    private FeedbackRepository feedbackRepository;

    @Autowired
    public Mutation(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    public Feedback createFeedback(Long customerId, Long restaurantId, Long courierId, String title,
                                   int foodRating, int courierRating, int overallRating, String description) {
        Feedback feedback = new Feedback();
        feedback.setCustomerId(customerId);
        feedback.setRestaurantId(restaurantId);
        feedback.setCourierId(courierId);
        feedback.setTitle(title);
        feedback.setFoodRating(foodRating);
        feedback.setCourierRating(courierRating);
        feedback.setOverallRating(overallRating);
        feedback.setDescription(description);

        feedbackRepository.save(feedback);

        return feedback;
    }

}
