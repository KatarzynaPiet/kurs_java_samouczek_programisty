package porownywanie_obiektow;

import java.util.Objects;

public class Chair {

    private String model;
    private String manufacturer;
    private int productionYear;

    public Chair(String model, String manufacturer, int productionYear) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chair otherChair = (Chair) o;
        return productionYear == otherChair.productionYear &&
                Objects.equals(model, otherChair.model) &&
                Objects.equals(manufacturer, otherChair.manufacturer);
    }

    @Override
    public int hashCode() {
        return 17 * model.hashCode() + 31 * manufacturer.hashCode() + 7 * productionYear;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }

    public static void main(String args[]){
        Chair chair1 = new Chair("Anna", "Miasto krzeseł", 2015);
        Chair chair2 = new Chair("Anna", "Miasto krzeseł", 2016);
        Chair chair3 = new Chair("Anna", "Miasto krzeseł", 2016);

        System.out.println(chair1.toString());
        System.out.println(chair2.toString());
        System.out.println(chair3.toString());
        System.out.println();

        System.out.println("char1 = char2: " + chair1.equals(chair2));
        System.out.println("char1 = char3: " + chair1.equals(chair3));
        System.out.println("char2 = char3: " + chair2.equals(chair3));
        System.out.println();

        System.out.println("char1.hashCode(): " + chair1.hashCode());
        System.out.println("char2.hashCode(): " + chair2.hashCode());
        System.out.println("char3.hashCode(): " + chair3.hashCode());
    }

}

