//package dk.msw.feedback.controller;
//
//import dk.msw.feedback.entity.Feedback;
//import dk.msw.feedback.repository.FeedbackRepository;
//import org.springframework.graphql.data.method.annotation.Argument;
//import org.springframework.graphql.data.method.annotation.MutationMapping;
//import org.springframework.graphql.data.method.annotation.QueryMapping;
//import org.springframework.stereotype.Controller;
//
//import java.util.Optional;
//
//@Controller
//public class FeedbackController {
//    private final FeedbackRepository feedbackRepository;
//
//    public FeedbackController(FeedbackRepository feedbackRepository) {
//        this.feedbackRepository = feedbackRepository;
//    }
//
//    @QueryMapping
//    Iterable<Feedback> feedbacks() {
//        return feedbackRepository.findAll();
//    }
//
//    @QueryMapping
//    Optional<Feedback> feedbackById(@Argument Long feedbackId) {
//        return feedbackRepository.findById(feedbackId);
//    }
//
//    @QueryMapping
//    Iterable<Feedback> feedbacksByCourierId(@Argument Long courierId) {
//        return feedbackRepository.findFeedbacksByCourierId(courierId);
//    }
//
//    @QueryMapping
//    Iterable<Feedback> feedbacksByCustomerIdAndRestaurantId(@Argument Long customerId, @Argument Long restaurantId) {
//        return feedbackRepository.findFeedbacksByCustomerIdAndRestaurantId(customerId, restaurantId);
//    }
//
//    @MutationMapping
//    Feedback addFeedback(@Argument FeedbackInput feedback) {
////        feedbackRepository.findById(feedback.customerId()).orElseThrow(() -> new IllegalArgumentException("Customer not found"));
//        Feedback f = new Feedback(feedback.customerId(), feedback.restaurantId(), feedback.courierId(), feedback.title(), feedback.foodRating(), feedback.courierRating(), feedback.overallRating(), feedback.description());
//        return feedbackRepository.save(f);
//    }
//
//    record FeedbackInput(Long customerId, Long restaurantId, Long courierId, String title, int foodRating, int courierRating, int overallRating, String description){}
//}
