package de.oette.course.I02.controller;

import de.oette.course.I02.rating.Rating;
import de.oette.course.I02.rating.RatingHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Mac/Linux
 * curl -XPOST http://localhost:8080/rating -H "Content-Type: application/json" -d '{"text":"great product", "nrOfStars":"5"}'
 * <p>
 * Windows
 * curl -XPOST "localhost:8080" -H "Content-Type: application/json" -d "{\"text\" : \"great product\", \"nrOfStars\" : \"5\" }"
 */
@RestController("/rating")
public class RatingController {

    private final List<RatingHandler> ratingHandlers;

    public RatingController(List<RatingHandler> ratingHandlers) {
        this.ratingHandlers = ratingHandlers;
    }

    @PostMapping
    public void newRating(@RequestBody Rating rating) {
        ratingHandlers
                .forEach(rh -> rh.newRating(rating));
    }
}
