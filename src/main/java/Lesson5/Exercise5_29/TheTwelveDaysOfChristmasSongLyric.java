package Lesson5.Exercise5_29;

public class TheTwelveDaysOfChristmasSongLyric {
    private String dayOrder (int i) {
        String day = " ";
        switch (i) {
            case 1:
//                System.out.println("first");
                day = "first";
                break;
            case 2:
//                System.out.println("second");
                day = "second";
                break;
            case 3:
//                System.out.println("third");
                day = "third";
                break;
            case 4:
//                System.out.println("forth");
                day = "forth";
                break;
            case 5:
//                System.out.println("fifth");
                day = "fifth";
                break;
            case 6:
//                System.out.println("sixth");
                day = "sixth";
                break;
            case 7:
//                System.out.println("seventh");
                day = "seventh";
                break;
            case 8:
//                System.out.println("eighth");
                day = "eighth";
                break;
            case 9:
//                System.out.println("ninth");
                day = "ninth";
                break;
            case 10:
//                System.out.println("tenth");
                day = "tenth";
                break;
            case 11:
//                System.out.println("eleventh");
                day = "eleventh";
                break;
            case 12:
//                System.out.println("twelfth");
                day = "twelfth";
                break;
        }
        return  day;
    }

    private String verse (int i) {
        String verse = " ";
        switch (i) {
            case 1 :
//                System.out.print("A partridge in a pear tree");
                verse = "A partridge in a pear tree";
                break;
            case 2 :
//                System.out.print("Two turtle doves,");
                verse = "Two turtle doves,";
                break;
            case 3 :
//                System.out.print("Three French hens,");
                verse = "Three French hens,";
                break;
            case 4 :
//                System.out.print("four calling birds,");
                verse = "Four calling birds,";
                break;
            case 5 :
//                System.out.print("five gold rings,");
                verse = "Five gold rings,";
                break;
            case 6 :
//                System.out.print("six geese a-laying,");
                verse = "Six geese a-laying,";
                break;
            case 7 :
//                System.out.print("seven swans a-swimming,");
                verse =  "Seven swans a-swimming,";
                break;
            case 8 :
//                System.out.print("eight maids a-milking,");
                verse = "Eight maids a-milking,";
                break;
            case 9 :
//                System.out.print("nine ladies dancing,");
                verse = "Nine ladies dancing,";
                break;
            case 10 :
//                System.out.print("ten lords a-leaping,");
                verse = "Ten lords a-leaping,";
                break;
            case 11 :
//                System.out.print("eleven pipers piping,");
                verse = "Eleven pipers piping,";
                break;
            case 12 :
//                System.out.print("twelve drummers drumming,");
                verse = "twelve drummers drumming,";
                break;
        }
        return verse;
    }

    public void displayLyric () {
        for (int i = 1; i <= 12 ; i++) {
            System.out.printf("On the %s day of Christmas my true love sent to me\n",dayOrder(i));
            for (int j = i; j > 0 ; j--) {
                System.out.printf("%s\n",verse(j));
            }
            System.out.println();
        }
    }
}
