package Lesson8.Exercise8_13;

import java.util.Arrays;
import java.util.Random;

public class SetOfInteger {

    private static int setSize = 101;
    private boolean [] setOfInteger = new boolean[setSize];
    private Random random = new Random();

    public SetOfInteger() {
//        for (int i = 0; i < setOfInteger.length; i++) {
//            setOfInteger[i] = random.nextBoolean();
//        }
        Arrays.fill(setOfInteger, false);
    }

    public boolean getSetOfInteger(int i) {
        return setOfInteger[i];
    }

    public void setSetOfInteger(int i) {
        setOfInteger[i] = true;
    }


    public void randomValue (){
        for (int i = 0; i < setOfInteger.length; i++) {
            setOfInteger[i] = random.nextBoolean();
        }
    }

    public SetOfInteger unite (SetOfInteger set1,SetOfInteger set2){
        SetOfInteger setUnite = new SetOfInteger();
        for (int i = 0; i < setSize; i++) {
            if (set1.getSetOfInteger(i) || set2.getSetOfInteger(i)) {
                setUnite.setSetOfInteger(i);
            }
        }
        return setUnite;
    }

    public static SetOfInteger intersect (SetOfInteger set1, SetOfInteger set2) {
        SetOfInteger setIntersect = new SetOfInteger();
        for (int i = 0; i < 10 ; i++) {
            if (set1.getSetOfInteger(i) && set2.getSetOfInteger(i)) {
                setIntersect.setSetOfInteger(i);
            }
        }
        return setIntersect;
    }

    public void insertElement (int k) {
        setOfInteger[k] = true;
    }
    public void deleteElement (int m) {
        setOfInteger[m] = false;
    }

    public void displayArray () {
        for (int i = 0; i < setOfInteger.length; i++) {
            System.out.printf("%s ",setOfInteger[i]);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < setSize; i++) {
            if(setOfInteger[i]){
                s.append(" "+i);
            }
            else {
                s.append("---");
            }
        }
        return s.toString();
    }
}
