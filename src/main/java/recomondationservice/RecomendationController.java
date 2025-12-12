package recomondationservice;

package recommendationservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationController {

    private final MovieClient movieClient;

    public RecommendationController(MovieClient movieClient) {
        this.movieClient = movieClient;
    }

    @GetMapping("/recommendation")
    public String recommend() {
        Movie movie = movieClient.getRandomMovie();
        return "Today's movie recommendation: " + movie.getTitle() +
                " directed by " + movie.getDirector();
    }
}
