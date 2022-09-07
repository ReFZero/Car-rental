package pl.refZero.carrental.DbConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pl.refZero.carrental.Model.Car;
import pl.refZero.carrental.Repository.CarRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarDbConfig {
    private final CarRepository carRepository;

    @Autowired
    public CarDbConfig(final CarRepository carRepository) {
        this.carRepository = carRepository;
    }


    //Wypełnienie bazy danych przykładowymi samochodami
    @EventListener(ApplicationReadyEvent.class)
    public void completeTheDatabase() {
        Car car1 = new Car("Honda", "Accord", 300, LocalDate.parse("2020-02-02"), "Black", false);
        Car car2 = new Car("Mazda", "RX-7", 500, LocalDate.parse("2021-05-02"), "Blue", true);
        Car car3 = new Car("BMW", "X3", 900, LocalDate.parse("2022-07-23"), "White", false);
        Car car4 = new Car("Skoda", "Octavia", 700, LocalDate.parse("2019-04-21"), "White", true);
        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);

        carRepository.saveAll(carList);
    }

}
