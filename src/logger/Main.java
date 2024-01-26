package src.logger;

import src.Swap;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Swap.class.getName());

        logger.info("Message 1");

    }
}
