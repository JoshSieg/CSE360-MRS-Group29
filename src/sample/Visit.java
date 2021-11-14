package sample;

public class Visit {
    private float height; //in feet
    private float weight; //in lbs
    private float bodyTemp; //in fahrenheit
    private float bloodPressure;


    Visit(float height, float weight, float bodyTemp, float bloodPressure) {
        this.height = height;
        this.weight = weight;
        this.bodyTemp = bodyTemp;
        this.bloodPressure = bloodPressure;
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
}
