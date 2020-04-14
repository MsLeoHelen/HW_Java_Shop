package by.teachmekills.shop.application.actions;

import by.teachmekills.shop.application.exceptions.StopApplicationException;

public class StopApplicationAction implements Action {
    private static final String NAME = "Выход";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void run() throws StopApplicationException {
        throw new StopApplicationException();
    }
}
