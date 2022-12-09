package dk.msw.feedback.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import dk.msw.feedback.entity.Feedback;
import dk.msw.feedback.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FeedbackResolver implements GraphQLResolver<Feedback> {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public Feedback getFeedback(Feedback feedback) {
        return feedbackRepository.findById(feedback.getFeedbackId()).orElseThrow(null);
    }

}
