package com.trendyol.polymorphism.member.block;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Member {

    private static final Logger LOGGER = Logger.getLogger(Member.class.getName());

    public void suspend(String nickname) {
        LOGGER.log(Level.INFO, "{0} has been blocked anymore", nickname);
    }

    public void suspend(String nickname, Long periodOfTime) {
        LOGGER.log(Level.INFO, "{0} has been blocked for periodOfTime {1}", new Object[]{nickname, periodOfTime});
    }
}
