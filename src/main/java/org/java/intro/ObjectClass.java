package org.java.intro;

import java.util.Objects;

public class ObjectClass {
    /*
    Object class in Java is present in Java.lang package
    Every class in java is directly or indirectly derived from
    The object class, hence Object class acts like a root of the
    inheritance hierarchy in aby java Program
     */

    String model ;
    int price;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof ObjectClass that)) return false;
        return price == that.price && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);

    }

    public static void main(String[] args) {

    }
}
