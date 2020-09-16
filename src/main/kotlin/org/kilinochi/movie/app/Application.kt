package org.kilinochi.movie.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class Application {

    @GetMapping("/movies")
    fun getMovies(): List<Movie> {
        return listOf(Movie(1, "Island"), Movie(2, "Earth"))
    }

    data class Movie(val id: Int, val name: String)
}

fun main (args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}
