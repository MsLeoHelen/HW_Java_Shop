package by.teachmekills.shop.application.actions;

import by.teachmekills.shop.application.exceptions.StopApplicationException;

public interface Action {
   String getName();

   void run() throws StopApplicationException;
}
