package org.example.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.thucydides.core.util.EnvironmentVariables;
import static org.example.utils.RestService.GET_OBJECT;

public class WithPost {

    private String body;

    public WithPost(String body) {
        this.body = body;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to(GET_OBJECT.toString())
                .with(requestSpecification -> requestSpecification
                        .headers("Content-type", "application/json")
                        .body(body)));

    }

}
