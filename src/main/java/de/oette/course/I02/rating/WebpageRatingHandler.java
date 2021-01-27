package de.oette.course.I02.rating;

import org.springframework.stereotype.Component;

@Component
public class WebpageRatingHandler implements RatingHandler{

    @Override
    public void newRating(Rating rating) {
        System.out.println("Handle rating, send to webpage " + rating);
    }
}
