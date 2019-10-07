//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package me.dominikoso.ctfbot.modules;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;

public class QuestionModule {
    private List<Entry<String, String>> questions = new ArrayList();
    private Scanner scanner;

    public QuestionModule() {
        this.scanner = new Scanner(System.in);
        this.questions.add(new SimpleEntry("Who is registrar of sci.edu.pl domain?", "Agnat Sp. z o.o."));
        this.questions.add(new SimpleEntry("Who is registrar of hackyeah.pl domain?", "home.pl S.A."));
        this.questions.add(new SimpleEntry("What server type is adolf.ml using?", "nginx"));
        this.questions.add(new SimpleEntry("What server type is sci.edu.pl using?", "Apache"));
        this.questions.add(new SimpleEntry("I found free hotspot at 52.3913066,4.8357588, but forgotten a big building name...", "MOTION"));
        this.questions.add(new SimpleEntry("Could you give me a route number located at 21.867956, 40.697842?", "4420"));
        this.questions.add(new SimpleEntry("Somebody told me about funny image dealer near 39.066045, 125.756843, could you find it name?", "Meme Dealer"));
        this.questions.add(new SimpleEntry("There is a small Polish Village called Niedźwiedź, could you find a name of local Sport Club?", "Znicz Niedźwiedź"));
        this.questions.add(new SimpleEntry("Guy with this nickname (bilalkharjilal337) stolen my car, and posted photo on a popular site, could you find photo name?", "9245d1a1fb31b561a59b26172051572c"));
        this.questions.add(new SimpleEntry("Guy with this nickname (bilalkharjilal337) took photo, using Canon I want to buy. Could you find model full model for me?", "Canon Acer CI-6330"));
        this.questions.add(new SimpleEntry("This great photograph kubasajniak made beautiful Cock photo, what was the Camera model?", "Panasonic DMC-G7"));
        this.questions.add(new SimpleEntry("This great photograph kubasajniak made beautiful photo September 16, 2019, what was the title?", "#one_to_rule_them_all"));
        this.questions.add(new SimpleEntry("What is the meaning of RWFzeVF1ZXN0aW9u?", "EasyQuestion"));
        this.questions.add(new SimpleEntry("What is the meaning of Zgyzhs?", "Atbash"));
        this.questions.add(new SimpleEntry("Find dropbox password for user dunnglendaj@yahoo.com?", "joyce1717"));
        this.questions.add(new SimpleEntry("Find dropbox password for user geraldarnold@aol.com?", "aaron29"));
        this.questions.add(new SimpleEntry("Find twitter password for user lil_devil_275@yahoo.com?", "antonio1"));
        this.questions.add(new SimpleEntry("Find twitter password for user kerstenevans@bellsouth.net?", "wildcat1"));
        this.questions.add(new SimpleEntry("Last year on this site (https://www.youtube.com/watch?v=ny59kjNfuZA) was hidden a flag, could you find it?", "scinet{BRAWO}"));
    }

    private Entry<String, String> getRandomQuestion() {
        Random rand = new Random();
        int question_num = rand.nextInt(this.questions.size());
        Entry<String, String> question_pair = (Entry)this.questions.get(question_num);
        this.questions.remove(question_num);
        return question_pair;
    }

    public Boolean beginAssesment() {
        System.out.println("AliceBot: I was told by my master that I can only give a flag to smart ones, so I need to test you. Please only answer my question, and do not try to get any additional information from me, sad truth is that I was never completed.");
        System.out.println("AliceBot: Ok, before we start. I always wanted to get a friend. Would you like to be my friend? (Yes/No) - I'm case sensitive ;)");
        if (!this.scanner.nextLine().equals("Yes")) {
            System.out.println("AliceBot: Oh, that's a shame");
            System.exit(0);
        }

        System.out.println("AliceBot: Really? That's great. But it's not enough for you to get a flag. You need to complete my little quiz. Just answer a few questions and you will get it.");
        System.out.println("AliceBot: First one: What's your name?");
        String tmp = this.scanner.nextLine();
        System.out.println("AliceBot: Nice to meet you " + tmp + ". I'm Alice.");

        for(int i = 0; i < 10; ++i) {
            Entry<String, String> question = this.getRandomQuestion();
            System.out.println((String)question.getKey());
            tmp = this.scanner.nextLine();
            if (!tmp.toLowerCase().equals(((String)question.getValue()).toLowerCase())) {
                return Boolean.FALSE;
            }
        }

        return Boolean.TRUE;
    }
}
