package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.example.models.ObjectModel;

public class GetObjectRest implements Task {

    private final ObjectModel objectModelRest;

    public GetObjectRest(ObjectModel objectModelRest) {
        this.objectModelRest = objectModelRest;
    }

    public static GetObjectRest with(ObjectModel objectModel) {
        return Tasks.instrumented(GetObjectRest.class, objectModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo((ConsumeService.withPost));
    }
}
