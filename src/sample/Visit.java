package sample;

import java.io.Serializable;
import java.util.Calendar;

public class Visit implements Serializable {
    private float height; //in feet
    private float weight; //in lbs
    private float bodyTemp; //in fahrenheit
    private float bloodPressure;
    private Calendar date;
    private String reasonForVisit;

    Visit(float height, float weight, float bodyTemp, float bloodPressure, String reasonForVisit) {
        this.height = height;
        this.weight = weight;
        this.bodyTemp = bodyTemp;
        this.bloodPressure = bloodPressure;
        this.reasonForVisit = reasonForVisit;
        date = Calendar.getInstance();
    }

    public Calendar getDate() {
        return date;
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

    public String getReasonForVisit() {
        return reasonForVisit;
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
