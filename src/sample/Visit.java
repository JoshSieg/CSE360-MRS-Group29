package sample;

import java.util.Calendar;

public class Visit {
    private float height; //in feet
    private float weight; //in lbs
    private float bodyTemp; //in fahrenheit
    private float bloodPressure;
    private Calendar date;


    Visit(float height, float weight, float bodyTemp, float bloodPressure) {
        this.height = height;
        this.weight = weight;
        this.bodyTemp = bodyTemp;
        this.bloodPressure = bloodPressure;
        date = Calendar.getInstance();
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public float getBodyTemp() {
        return bodyTemp;
    }

    public float getBloodPressure() {
        return bloodPressure;
    }

    public int getDay() {
        return date.get(Calendar.DATE);
    }

    public int getYear() {
        return date.get(Calendar.YEAR);
    }

    public int getMonth() {
        return date.get(Calendar.MONTH);
    }
}
