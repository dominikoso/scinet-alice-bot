package me.dominikoso.ctfbot;

import me.dominikoso.ctfbot.bot.AliceBot;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CtfBotApplication {
    private static final Logger LOGGER = LogManager.getLogger(CtfBotApplication.class);

    public CtfBotApplication() {
    }

    public static void main(String[] args) {
        try {
            AliceBot bot = AliceBot.getInstance();
            if (bot != null) {
                LOGGER.info("AliceBot - Initialized");
                bot.initModules();
                bot.start();
            } else {
                LOGGER.error("AliceBot - Initialization Failed");
            }
        } catch (Exception var2) {
            LOGGER.error(var2);
        }

    }
}