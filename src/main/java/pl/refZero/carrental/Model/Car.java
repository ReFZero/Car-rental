package pl.refZero.carrental.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

//TODO: Rozbudować model poprzez dodanie kolejnych klas związanych z wypożyczaniem samochodów np: Zamówienia, Klient
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mark;
    private String model;
    private Integer price;
    private LocalDate dateOfProduction;
    private String color;
    private Boolean borrowed;
    public Car() {
    }

    public Car(String mark, String model, Integer price, LocalDate dateOfProduction, String color, Boolean borrowed) {
        this.mark = mark;
        this.model = model;
        this.price = price;
        this.dateOfProduction = dateOfProduction;
        this.color = color;
        this.borrowed = borrowed;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public LocalDate getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(LocalDate dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(Boolean borrowed) {
        this.borrowed = borrowed;
    }
}
