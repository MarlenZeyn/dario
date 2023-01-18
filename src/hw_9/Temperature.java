package hw_9;

public class Temperature {
    private double temp;
    private String c = "C";
    private String f = "F";

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    void changeDegrees_FtoC(){
        double new_tempC;

        new_tempC = 5*(temp-32)/9;
        System.out.println(new_tempC);

    }
    void changeDegrees_CtoF(){
        double new_tempF;

        new_tempF = (9*(temp/5))+32;
        System.out.println(new_tempF);

    }
}
