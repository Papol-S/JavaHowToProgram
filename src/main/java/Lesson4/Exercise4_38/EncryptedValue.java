package Lesson4.Exercise4_38;

public class EncryptedValue {
    private int data;

    public EncryptedValue(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int encript (){
        int encrypted;
        int fisrtDigit , secondDigit , thirdDigit , forthDigit , number ;
        int newFisrtDigit , newSecondDigit , newThirdDigit , newForthDigit  ;
        fisrtDigit = getData()%10;
        number = (getData()-fisrtDigit)/10;
        secondDigit = number%10;
        number = (number-secondDigit)/10;
        thirdDigit = number%10;
        number = (number-thirdDigit)/10;
        forthDigit = number%10;

        newFisrtDigit = (fisrtDigit+7)%10;
        newSecondDigit = (secondDigit+7)%10;
        newThirdDigit = (thirdDigit+7)%10;
        newForthDigit = (forthDigit+7)%10;

        encrypted = (newFisrtDigit)+(newSecondDigit*10)+(newThirdDigit*100)+(newForthDigit*1000);
        int encrypted2 = (newThirdDigit)+(newForthDigit*10)+(newFisrtDigit*100)+(newSecondDigit*1000);
        return encrypted2;
    }
}
