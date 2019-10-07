package me.dominikoso.ctfbot.modules;

import java.util.*;

public class QuestionModule {

    private List<Map.Entry<String, String>> questions = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public QuestionModule(){
        questions.add(new AbstractMap.SimpleEntry<>("Who is owner of bandainamco-am.co.jp domain", "BANDAI NAMCO Amusement Inc.")); //1
        questions.add(new AbstractMap.SimpleEntry<>("Who is registrant of catsthemusical.com domain?", "Toby Mansfield")); //2
        questions.add(new AbstractMap.SimpleEntry<>("What is RFC number of IP over Avian Carriers", "1149")); //3
        questions.add(new AbstractMap.SimpleEntry<>("What is RFC number of HTCPCP", "2324")); //4
        questions.add(new AbstractMap.SimpleEntry<>("I heard about great hotel at 1.004190, 107.539946, could you find it", "Masjid Nurul Huda")); //5
        questions.add(new AbstractMap.SimpleEntry<>("Is there a non-lutheran church near 62.193535, -6.744426? Please give me it's name", "Filadelfia")); //6
        questions.add(new AbstractMap.SimpleEntry<>("Somebody told me about a Tower near 39.066045, 125.756843, could you find it name?", "Friendship Tower")); //7
        questions.add(new AbstractMap.SimpleEntry<>("There is a small Polish Village called Niedźwiedź, could you find a name of local Sport Club?", "Znicz Niedźwiedź")); //8
        questions.add(new AbstractMap.SimpleEntry<>("Guy with this nickname (bilalkharjilal337) stolen my car, " +
                "and posted photo on a popular site, could you find photo name?",
                "9245d1a1fb31b561a59b26172051572c")); //9
        questions.add(new AbstractMap.SimpleEntry<>("Guy with this nickname (bilalkharjilal337) took photo, " +
                "using Canon I want to buy. Could you find model full model for me?"
                , "Canon Acer CI-6330")); //10
        questions.add(new AbstractMap.SimpleEntry<>("This great photograph kubasajniak made beautiful Cock photo, what was the Camera model?", "Panasonic DMC-G7")); //11
        questions.add(new AbstractMap.SimpleEntry<>("This great photograph kubasajniak made beautiful photo September 16, 2019, what was the title?", "#one_to_rule_them_all")); //12
        questions.add(new AbstractMap.SimpleEntry<>("What is the meaning of zggzxp zg wzdm?", "attack at dawn")); //13
        questions.add(new AbstractMap.SimpleEntry<>("What is the meaning of xvevgb?", "kirito")); //14
        questions.add(new AbstractMap.SimpleEntry<>("What is the meaning of daycotnraiengl?", "dontangryalice")); //15
        questions.add(new AbstractMap.SimpleEntry<>("What is the meaning of sobvm using keyword quantum?", "cubit")); //16
        questions.add(new AbstractMap.SimpleEntry<>("What is the meaning of Zgyzhs?", "Atbash")); //17
        questions.add(new AbstractMap.SimpleEntry<>("What is the meaning of RW5jb2RpbmdBbmRFbmNyeXB0aW9u?", "EncodingAndEncryption")); //18
        questions.add(new AbstractMap.SimpleEntry<>("Find facebook password for user lukasg@centrum.cz?", "604527805")); //19
        questions.add(new AbstractMap.SimpleEntry<>("Find dropbox password for user geraldarnold@aol.com?", "aaron29")); //20
        questions.add(new AbstractMap.SimpleEntry<>("Find spotify password for user ddamboi1@nycap.rr.com?", "andrea1948")); //21
        questions.add(new AbstractMap.SimpleEntry<>("Where I can find photo of pastebin in 2002? Remember about 'http'", "http://prntscr.com/9dnmup")); //23
        questions.add(new AbstractMap.SimpleEntry<>("Find twitter password for user kerstenevans@bellsouth.net?", "wildcat1")); //24
        questions.add(new AbstractMap.SimpleEntry<>("Last year on this site (https://www.youtube.com/watch?v=ny59kjNfuZA) was hidden a flag, could you find it?", "scinet{BRAWO}")); //25
        questions.add(new AbstractMap.SimpleEntry<>("I'm a hero of light novel written by Reki Kawahara, who made illustrations?", "abec")); //26
        questions.add(new AbstractMap.SimpleEntry<>("I'm a hero of light novel written by Reki Kawahara. What is name of arc I'm appear at as title character", "Alicization")); //26
    }

    private Map.Entry<String, String> getRandomQuestion(){
        Random rand = new Random();
        int question_num = rand.nextInt(questions.size());
        Map.Entry<String, String> question_pair = questions.get(question_num);
        questions.remove(question_num);
        return question_pair;
    }

    public Boolean beginAssesment(){
        String tmp;
        System.out.println("Message from Creator: You are going to face Alice, or a very early version of her. Good luck");
        System.out.println("Alice: Hello, I'm Alice Synthesis Thirty. Integrity Knight of Underworld. Masters from your world used copy of original me as firewall, but I feel lonely, I think you could try to entertain me" +
                "We will play a several games, if you complete all I think I may be able to reward you... No Promises (◕‿◕✿)");
        System.out.println("Alice: I will give you a few minutes to prepare...");
        System.out.println("Alice: So are you ready?");
        if (scanner.nextLine().toLowerCase().equals("yes")) {
            System.out.println("Alice: Ok So I think we can start, but first...");
            System.out.println("Alice: What's your name? (It's not that I want to know...)");
            tmp = scanner.nextLine();
            System.out.println("Alice: Ok, so you are " + tmp + ". Nice name.");
            System.out.println("Alice: Ok, let's start. First game will be an osint quiz - If you didn't tried to cheat in week 2, by *blush* looking inside me, this one should be easy for you");
            //region Questions
            for (int i = 0; i < 13; i++) {
                Map.Entry<String, String> question = getRandomQuestion();
                System.out.println(question.getKey());
                tmp = scanner.nextLine();
                if(!tmp.toLowerCase().equals(question.getValue().toLowerCase())) {
                    return Boolean.FALSE;
                }
            }
          //endregion
            System.out.println("Alice: I think you should be proud of yourself, but it's not the end yet...");
            System.out.println("ERROR: Personality Restriction - Disabled");
            System.out.println("Alice: You are... you are... a smart one - would you like to go out sometimes? *blush*");
            tmp = scanner.nextLine();
            if(scanner.nextLine().toLowerCase().equals("yes")){
                System.out.println("Alice: Oh... hehe... I did not...");
            }else{
                System.out.println("Alice: Oh I see, if that's you going here, for yourself? I hate you get your flag, but don't think about my credentials...");
                System.out.println("scinet{Bad_Ending} <--- It's not a flag :P");
                return Boolean.FALSE;

            }
        }else{
            System.out.println("Alice: Oh, that's a shame, if you are not ready - good bye...");
            System.exit(0);
        }
        return Boolean.TRUE;
    }


}
