package Lesson4.Exercise4_38;

public class DeencryptedValue {
    private int data;

    public DeencryptedValue(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int deEncrypt () {
        int deEncrypted = 0 ;
        int fisrtDigit , secondDigit , thirdDigit , forthDigit , number ;
        int newFisrtDigit , newSecondDigit , newThirdDigit , newForthDigit  ;
        fisrtDigit = getData()%10;
        number = (getData()-fisrtDigit)/10;
        secondDigit = number%10;
        number = (number-secondDigit)/10;
        thirdDigit = number%10;
        number = (number-thirdDigit)/10;
        forthDigit = number%10;
        deEncrypted = (thirdDigit)+(forthDigit*10)+(fisrtDigit*100)+(secondDigit*1000);

        fisrtDigit = deEncrypted%10;
        number = (deEncrypted-fisrtDigit)/10;
        secondDigit = number%10;
        number = (number-secondDigit)/10;
        thirdDigit = number%10;
        number = (number-thirdDigit)/10;
        forthDigit = number%10;

        newFisrtDigit = (fisrtDigit+3)%10;
        newSecondDigit = (secondDigit+3)%10;
        newThirdDigit = (thirdDigit+3)%10;
        newForthDigit = (forthDigit+3)%10;
        deEncrypted = newFisrtDigit + newSecondDigit*10 + newThirdDigit*100 + newForthDigit*1000;

        return  deEncrypted;
    }
}
