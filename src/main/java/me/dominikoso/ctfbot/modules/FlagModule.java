package me.dominikoso.ctfbot.modules;

public class FlagModule {
    public void printFlag(Boolean status){
        if (status == Boolean.TRUE){
            System.out.println("Alice: I think you are... enough, just, enough, but remember your time is limited, and RATH is looking. I wish you a... just go, here is my credentials 54178912alice:0935612771342swordknight");
            System.out.println("Alice: And you may want to get this - scinet{D4T3_w1th_4l1c3} - It's not that I'm giving it to you dumb *blush*." +
                    " Master wanted to give it to you, and make you remember my name 'alice', he told me that I'm a pass, but I not know what it means ... Bye...");
            System.exit(0);
        }else{
            System.out.println("Alice: Sorry, you are not the one I'm looking for.");
        }
    }
}
