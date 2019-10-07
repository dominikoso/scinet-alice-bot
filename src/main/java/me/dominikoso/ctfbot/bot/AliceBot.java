package me.dominikoso.ctfbot.bot;

import me.dominikoso.ctfbot.modules.FlagModule;
import me.dominikoso.ctfbot.modules.QuestionModule;

public class AliceBot {
    private static AliceBot instance = null;
    private static QuestionModule qModule = null;
    private static FlagModule fModule = null;
    private Boolean passedTest = Boolean.FALSE;

    private AliceBot(){

    }

    public void start(){
        passedTest = qModule.beginAssesment();
        fModule.printFlag(passedTest);
    }

    public static AliceBot getInstance() {
        if (instance == null){
            instance = new AliceBot();
        }
        return instance;
    }

    public void initModules(){
        if (qModule == null){
            qModule = new QuestionModule();
            System.out.println("Personality Cube: initialized Question Module");
        }else{
            System.out.println("Personality Cube: Question Module already initialized");
        }

        if(fModule == null){
            fModule = new FlagModule();
            System.out.println("Personality Cube: initialized Flag Module");
        }else{
            System.out.println("Personality Cube: Flag Module already initialized");
        }
    }
}
