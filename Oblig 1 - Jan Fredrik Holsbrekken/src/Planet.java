

public class Planet {
    private String navn;
    private double radius;
    private double masse;

    public Planet(String navn, double radius, double masse) {
        this.navn = navn;
        this.radius = radius;
        this.masse = masse;

    }

    public String getNavn() {
        return navn;
    }

    public double getRadius() {
        return radius;
    }

    public double getMasse() {
        return masse;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setMasse(double masse) {
        this.masse = masse;
    }

    public void planetInfo() {
        System.out.println("\nPlaneten " + navn + " har en radius på " + radius + " km og en masse på " + masse + " kg.");
    }


}
