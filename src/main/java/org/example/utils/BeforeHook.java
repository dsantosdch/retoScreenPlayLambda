package org.example.utils;


import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;

public class BeforeHook {

    private String theRestApiBaseUrl;
    private EnvironmentVariables environmentVariables;
    private Actor actor;

    @Before
    public void ConfigureBaseUrl() {
        theRestApiBaseUrl = environmentVariables.optionalProperty("restapi.baseurl")
                                                .orElse("https://retorest.s3.us-east-2.amazonaws.com/");

        actor = Actor.named("brandon").whoCan(CallAnApi.at(theRestApiBaseUrl));
    }

}
