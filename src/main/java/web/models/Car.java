package web.models;

import java.util.Objects;
import java.util.StringJoiner;

public class Car {
    private final String model;
    private final String classification;
    private final String bodyStyle;

    public Car(String model, String classification, String bodyStyle) {
        this.model = model;
        this.classification = classification;
        this.bodyStyle = bodyStyle;
    }

    public String getModel() {
        return model;
    }

    public String getClassification() {
        return classification;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Car.class.getSimpleName() + "[", "]")
                .add("model='" + model + "'")
                .add("classification='" + classification + "'")
                .add("bodyStyle='" + bodyStyle + "'")
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return model.equals(car.model) && classification.equals(car.classification) && bodyStyle.equals(car.bodyStyle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, classification, bodyStyle);
    }
}
