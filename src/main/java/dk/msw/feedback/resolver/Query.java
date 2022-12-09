package dk.msw.feedback.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import dk.msw.feedback.entity.Feedback;
import dk.msw.feedback.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
    private FeedbackRepository feedbackRepository;

    @Autowired
    public Query(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    public Iterable<Feedback> findAllFeedbacks() {
        return feedbackRepository.findAll();
    }

    public long countFeedbacks() {
        return feedbackRepository.count();
    }

}
