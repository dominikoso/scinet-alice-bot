package me.dominikoso.ctfbot.modules;

public class FlagModule {
    public FlagModule() {
    }

    public void printFlag(Boolean status) {
        if (status == Boolean.TRUE) {
            System.out.println("AliceBot: I see you are walking path of knowledge, you may get a flag: scinet{G00GL3_1s_KN0WL3Dg3}");
            System.exit(0);
        } else {
            System.out.println("AliceBot: Sorry, you are not smart enough to get a flag");
        }

    }
}
