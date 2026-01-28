public class Measurement {
    // Fields
    double value;
    String unit;

    // Constructor
    public Measurement(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    // Method to convert Celsius to Kelvin
    public Measurement toKelvin() {
        if (unit.equals("C")) {
            return new Measurement(value + 273.15, "K");
        }
        return new Measurement(value, "K");
    }

    public static void main(String[] args) {
        Measurement m1 = new Measurement(25.0, "C"); // create object
        System.out.println("Original measurement: "+ m1.value +" "+ m1.unit);
        Measurement k1 = m1.toKelvin();
        System.out.println("In Kelvin:          " + k1.value +" "+ k1.unit);
    }
}
