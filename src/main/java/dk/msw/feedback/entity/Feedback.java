package dk.msw.feedback.entity;

import jakarta.persistence.*;

@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long feedbackId;
    @Column(name = "customer_id")
    private Long customerId;
    @Column(name = "restaurant_id")
    private Long restaurantId;
    @Column(name = "courier_id")
    private Long courierId;
    @Column(name = "title")
    private String title;
    @Column(name = "food_rating")
    private int foodRating;
    @Column(name = "courier_rating")
    private int courierRating;
    @Column(name = "overall_rating")
    private int overallRating;
    @Column(name = "description")
    private String description;


    public Feedback(Long customerId, Long restaurantId, Long courierId,
                    String title, int foodRating, int courierRating, int overallRating, String description) {
        this.customerId = customerId;
        this.restaurantId = restaurantId;
        this.courierId = courierId;
        this.title = title;
        this.foodRating = foodRating;
        this.courierRating = courierRating;
        this.overallRating = (foodRating + courierRating)/ 2;
        this.description = description;
    }

    public Feedback() {
    }

    public Long getFeedbackId() {
        return feedbackId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Long getCourierId() {
        return courierId;
    }

    public void setCourierId(Long courierId) {
        this.courierId = courierId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getFoodRating() {
        return foodRating;
    }

    public void setFoodRating(int foodRating) {
        this.foodRating = foodRating;
    }

    public int getCourierRating() {
        return courierRating;
    }

    public void setCourierRating(int courierRating) {
        this.courierRating = courierRating;
    }

    public int getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(int overallRating) {
        this.overallRating = overallRating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "feedbackId=" + feedbackId +
                ", customerId=" + customerId +
                ", restaurantId=" + restaurantId +
                ", courierId=" + courierId +
                ", title='" + title + '\'' +
                ", foodRating=" + foodRating +
                ", courierRating=" + courierRating +
                ", overallRating=" + overallRating +
                ", description='" + description + '\'' +
                '}';
    }
}
