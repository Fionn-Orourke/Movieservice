package recommendationservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "movie-service",
        url = "http://localhost:8080"   // <-- must point to movie-service
)
public interface MovieClient {
    @GetMapping("/movies/random")
    Movie getRandomMovie();
}
