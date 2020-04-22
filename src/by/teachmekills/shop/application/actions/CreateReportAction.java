package by.teachmekills.shop.application.actions;

import by.teachmekills.shop.application.actions.threads.CreateReportRunnable;
import by.teachmekills.shop.application.exceptions.StopApplicationException;
import by.teachmekills.shop.entity.Product;

import by.teachmekills.shop.application.util.Output;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CreateReportAction extends BaseAction implements Action, Runnable {
    private static final String NAME = "Вывод отчета";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public synchronized void run() {
        Runnable runnable = new CreateReportRunnable(shop.getProducts());
        new Thread(runnable).start();
    }
}
