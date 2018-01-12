package com.uic.myquiz.Llait;

/**
 * Created by user on 03/01/2018.
 */

public class quiz {
    public String bugtong[];
    public String choices[][];
    public String answer[];

    public final int MAX_SIZE = 50;          //Array maximum size
    public final int TOTAL_SIZE = 50;        //Total questions set for the user
    public static int questionShown = 0;    //Counter for total questions being shown to the user
    public static int SCORE = 50;           /*Scoring Rule:
                                                if correct score => sum of current score and timeremaining multiplied by 10
                                                else score => difference of current score and 10
                                                note: timeremaining is in seconds.
                                             */
    public quiz() {
        bugtong = new String [MAX_SIZE];
        choices = new String [MAX_SIZE][4];
        answer = new String [MAX_SIZE];

        bugtong[0] = "Lazy";
        choices[0][0] = "Idle";
        choices[0][1] = "Lack";
        choices[0][2] = "Isle";
        choices[0][3] = "Loose";
        answer[0] = "A";

        bugtong[1] = "Mean";
        choices[1][0] = "Unhappy";
        choices[1][1] = "Lower";
        choices[1][2] = "Upper";
        choices[1][3] = "Unpleasant";
        answer[1] = "D";

        bugtong[2] = "Outgoing";
        choices[2][0] = "Field";
        choices[2][1] = "Fire";
        choices[2][2] = "Friendly";
        choices[2][3] = "Force";
        answer[2] = "C";

        bugtong[3] = "Rich";
        choices[3][0] = "Around";
        choices[3][1] = "Affluent";
        choices[3][2] = "Arrive";
        choices[3][3] = "All";
        answer[3] = "B";

        bugtong[4] = "Strong";
        choices[4][0] = "Stack";
        choices[4][1] = "Streak";
        choices[4][2] = "Start";
        choices[4][3] = "Stable";
        answer[4] = "D";

        bugtong[5] = "Unhappy";
        choices[5][0] = "Should";
        choices[5][1] = "Same";
        choices[5][2] = "Sick";
        choices[5][3] = "Sad";
        answer[5] = "D";

        bugtong[6] = "Lucky";
        choices[6][0] = "Fold";
        choices[6][1] = "Fuse";
        choices[6][2] = "Form";
        choices[6][3] = "Fortunate";
        answer[6] = "D";

        bugtong[7] = "Kind";
        choices[7][0] = "Tight";
        choices[7][1] = "Try";
        choices[7][2] = "Thick";
        choices[7][3] = "Thoughtful";
        answer[7] = "D";

        bugtong[8] = "Introverted";
        choices[8][0] = "Soul";
        choices[8][1] = "Shall";
        choices[8][2] = "Seal";
        choices[8][3] = "Shy";
        answer[8] = "D";

        bugtong[9] = "Positive";
        choices[9][0] = "Real";
        choices[9][1] = "Open";
        choices[9][2] = "Optic";
        choices[9][3] = "Optimistic";
        answer[9] = "D";

        bugtong[10] = "Bossy";
        choices[10][0] = "Confuse";
        choices[10][1] = "Color";
        choices[10][2] = "Contrast";
        choices[10][3] = "Controlling";
        answer[10] = "D";

        bugtong[11] = "Baffle";
        choices[11][0] = "Cool";
        choices[11][1] = "Cold";
        choices[11][2] = "Confuse";
        choices[11][3] = "Cone";
        answer[11] = "C";

        bugtong[12] = "Hypocrisy";
        choices[12][0] = "Deeper";
        choices[12][1] = "Duplicity";
        choices[12][2] = "Duper";
        choices[12][3] = "Dug";
        answer[12] = "B";

        bugtong[13] = "Recalcitrant";
        choices[13][0] = "Stroke";
        choices[13][1] = "Street";
        choices[13][2] = "Stone";
        choices[13][3] = "Stubborn";
        answer[13] = "D";

        bugtong[14] = "Pacify";
        choices[14][0] = "App";
        choices[14][1] = "Appear";
        choices[14][2] = "Apple";
        choices[14][3] = "Appease";
        answer[14] = "D";

        bugtong[15] = "Turbulent";
        choices[15][0] = "Violent";
        choices[15][1] = "Virtual";
        choices[15][2] = "Visual";
        choices[15][3] = "Violin";
        answer[15] = "A";

        bugtong[16] = "Valid";
        choices[16][0] = "Legal";
        choices[16][1] = "Leave";
        choices[16][2] = "Legitimate";
        choices[16][3] = "Leak";
        answer[16] = "C";

        bugtong[17] = "Old";
        choices[17][0] = "Arrive";
        choices[17][1] = "Antiquated";
        choices[17][2] = "Acid";
        choices[17][3] = "Acquire";
        answer[17] = "B";

        bugtong[18] = "True";
        choices[18][0] = "Factual";
        choices[18][1] = "Falser";
        choices[18][2] = "Fair";
        choices[18][3] = "Fake";
        answer[18] = "A";

        bugtong[19] = "Important";
        choices[19][0] = "Required";
        choices[19][1] = "Resolve";
        choices[19][2] = "Reverse";
        choices[19][3] = "Recruit";
        answer[19] = "A";

        bugtong[20] = "Weak";
        choices[20][0] = "Freight";
        choices[20][1] = "Fronts";
        choices[20][2] = "Frail";
        choices[20][3] = "Fraud";
        answer[20] = "C";

        bugtong[21] = "Beautiful";
        choices[21][0] = "Premix";
        choices[21][1] = "Prank";
        choices[21][2] = "Promo";
        choices[21][3] = "Pretty";
        answer[21] = "D";

        bugtong[22] = "Fair";
        choices[22][0] = "Juk";
        choices[22][1] = "Just";
        choices[22][2] = "Jugful";
        choices[22][3] = "Juggle";
        answer[22] = "B";

        bugtong[23] = "Funny";
        choices[23][0] = "Humorous";
        choices[23][1] = "Hummus";
        choices[23][2] = "Huge";
        choices[23][3] = "Humors";
        answer[23] = "A";

        bugtong[24] = "Happy";
        choices[24][0] = "Contrast";
        choices[24][1] = "Control";
        choices[24][2] = "Convene";
        choices[24][3] = "Content";
        answer[24] = "D";

        bugtong[25] = "Hardworking";
        choices[25][0] = "Determined";
        choices[25][1] = "Defers";
        choices[25][2] = "Depart";
        choices[25][3] = "Depute";
        answer[25] = "A";

        bugtong[26] = "Honest";
        choices[26][0] = "Honorable";
        choices[26][1] = "Hot";
        choices[26][2] = "Hoax";
        choices[26][3] = "Holy";
        answer[26] = "A";

        bugtong[27] = "Smart";
        choices[27][0] = "Innate";
        choices[27][1] = "Intelligent";
        choices[27][2] = "Infant";
        choices[27][3] = "Inborn";
        answer[27] = "B";

        bugtong[28] = "Scary";
        choices[28][0] = "Fraud";
        choices[28][1] = "Eyelike";
        choices[28][2] = "Early";
        choices[28][3] = "Eerie";
        answer[28] = "D";

        bugtong[29] = "Love";
        choices[29][0] = "Loom";
        choices[29][1] = "Look";
        choices[29][2] = "Passion";
        choices[29][3] = "Lone";
        answer[29] = "C";

        bugtong[30] = "Nice";
        choices[30][0] = "Pinch";
        choices[30][1] = "Peace";
        choices[30][2] = "Pleasant";
        choices[30][3] = "Pins";
        answer[30] = "C";

        bugtong[31] = "Percentage sign";
        choices[31][0] = "Piece";
        choices[31][1] = "Pied";
        choices[31][2] = "Pin";
        choices[31][3] = "Percent sign";
        answer[31] = "D";

        bugtong[32] = "Good";
        choices[32][0] = "Elude";
        choices[32][1] = "Edge";
        choices[32][2] = "Excellent";
        choices[32][3] = "Extravagant";
        answer[32] = "C";

        bugtong[33] = "Power";
        choices[33][0] = "Force";
        choices[33][1] = "Portal";
        choices[33][2] = "Policy";
        choices[33][3] = "Poison";
        answer[33] = "A";

        bugtong[34] = "Guardian";
        choices[34][0] = "Putty";
        choices[34][1] = "Pause";
        choices[34][2] = "Protector";
        choices[34][3] = "Poll";
        answer[34] = "C";

        bugtong[35] = "Froth";
        choices[35][0] = "Foam";
        choices[35][1] = "Fit";
        choices[35][2] = "Fly";
        choices[35][3] = "Flop";
        answer[35] = "A";

        bugtong[36] = "Warrior";
        choices[36][0] = "Fighter";
        choices[36][1] = "Tomult";
        choices[36][2] = "Tocker";
        choices[36][3] = "Frozen";
        answer[36] = "A";

        bugtong[37] = "Delicious";
        choices[37][0] = "Thug";
        choices[37][1] = "Talk";
        choices[37][2] = "Tasty";
        choices[37][3] = "Palm";
        answer[37] = "C";

        bugtong[38] = "Overwhelm";
        choices[38][0] = "Belly";
        choices[38][1] = "Bite";
        choices[38][2] = "Astonish";
        choices[38][3] = "Bed";
        answer[38] = "C";

        bugtong[39] = "Frient";
        choices[39][0] = "Beg";
        choices[39][1] = "Bias";
        choices[39][2] = "Beauty";
        choices[39][3] = "Buddy";
        answer[39] = "D";

        bugtong[40] = "Help";
        choices[40][0] = "Ace";
        choices[40][1] = "Aid";
        choices[40][2] = "Acid";
        choices[40][3] = "Acute";
        answer[40] = "B";

        bugtong[41] = "Rigid";
        choices[41][0] = "Sane";
        choices[41][1] = "Soul";
        choices[41][2] = "Sock";
        choices[41][3] = "Stiff";
        answer[41] = "D";

        bugtong[42] = "Obstinate";
        choices[42][0] = "Wince";
        choices[42][1] = "Wield";
        choices[42][2] = "Stubborn";
        choices[42][3] = "Wild";
        answer[42] = "C";

        bugtong[43] = "Bias";
        choices[43][0] = "Wink";
        choices[43][1] = "Wide";
        choices[43][2] = "Wig";
        choices[43][3] = "Mindset";
        answer[43] = "D";

        bugtong[44] = "Awesome";
        choices[44][0] = "Ended";
        choices[44][1] = "Enlighten";
        choices[44][2] = "Impressive";
        choices[44][3] = "Enlarge";
        answer[44] = "C";

        bugtong[45] = "Amazing";
        choices[45][0] = "Light bulb";
        choices[45][1] = "Electric razor";
        choices[45][2] = "Refrigerator";
        choices[45][3] = "Phenomenal";
        answer[45] = "D";

        bugtong[46] = "Freedom";
        choices[46][0] = "Conference";
        choices[46][1] = "Liberty";
        choices[46][2] = "Work";
        choices[46][3] = "Pleasant";
        answer[46] = "B";

        bugtong[47] = "Peculiar";
        choices[47][0] = "Mine";
        choices[47][1] = "Even";
        choices[47][2] = "play";
        choices[47][3] = "Odd";
        answer[47] = "D";

        bugtong[48] = "Awful";
        choices[48][0] = "Player";
        choices[48][1] = "Dancer";
        choices[48][2] = "Terrible";
        choices[48][3] = "Pretty";
        answer[48] = "C";

        bugtong[49] = "Very";
        choices[49][0] = "Graceful";
        choices[49][1] = "Thoughtful";
        choices[49][2] = "Playful";
        choices[49][3] = "Extremely";
        answer[49] = "D";

    }

    public String getBugtong(int index){
        return bugtong[index];
    }

    public String getChoices(int index, int choice){
        return choices[index][choice];
    }

    public String getAnswer(int index){
        return answer[index];
    }

    public int getRandomIndex(){
        return 0 + new java.util.Random().nextInt(MAX_SIZE-1);
    }
}
