package Lesson8.Exercise8_4;

public class Rectangle {
    private float length = 1;
    private float width = 1;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if (length > 0 && length < 20)
            this.length = length;
        else
            throw new IllegalArgumentException("Must greater than 0.0 and less than 20");
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if (width > 0 && width < 20)
            this.width = width;
        else
            throw new IllegalArgumentException("Must greater than 0.0 and less than 20");
    }

    public float perimeterCalc () {
        float result = (2*length) + (2*width);
        return result;
    }

    public float areaCalc () {
        float result = length*width;
        return result;
    }
}
