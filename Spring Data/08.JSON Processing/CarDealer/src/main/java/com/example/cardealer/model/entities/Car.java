package com.example.cardealer.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "cars")
public class Car extends BaseEntity {
    @Column
    private String make;

    @Column
    private String model;

    @Column(name = "travelled_distance")
    private BigInteger travelledDistance;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Part> parts;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(make, car.make) && Objects.equals(model, car.model) && Objects.equals(travelledDistance, car.travelledDistance) && Objects.equals(parts, car.parts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, travelledDistance, parts);
    }
}
