package ru.sapteh.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "gender")
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private char Code;

    @Column
    private String name;

    @Override
    public String toString() {
        return "Gender{" +
                "Code=" + Code +
                ", name='" + name + '\'' +
                '}';
    }
}
