package org.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;


public class GetObjectStepDef {




    /*
    @Given("the route to the object")
    public void theRouteToTheObject() {
    }
    */

    @When("the Get request is made")
    public void theGetRequestIsMade() {
        List<String> skmkmkmkm =
        OnStage.theActorInTheSpotlight().attemptsTo(Get.resource("perro.jpg"));
    }
    @Then("a succesful response is recieved")
    public void aSuccesfulResponseIsRecieved() {
        OnStage.theActorInTheSpotlight().should(seeThatResponse("Correct",
                                    response -> response.statusCode(200)));
    }

}
