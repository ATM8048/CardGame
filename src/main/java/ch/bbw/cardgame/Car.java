package ch.bbw.cardgame;

/**
 * Car
 *    Fachklasse für ein Auto
 * @author Peter Rutschmann
 * @date 26.08.2021
 */
public class Car {
    private String imageUrl;
    private String tradeName;
    private String model;
    private double prize;
    private int jahr;
    private double geschwindigkeit;

    public Car(String imageUrl, String tradeName, String model, double prize, int jahr, double geschwindigkeit) {
        this.imageUrl = imageUrl;
        this.tradeName = tradeName;
        this.model = model;
        this.prize = prize;
        this.jahr = jahr;
        this.geschwindigkeit = geschwindigkeit;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }
}
