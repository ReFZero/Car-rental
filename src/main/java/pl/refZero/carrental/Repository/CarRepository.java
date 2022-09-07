package pl.refZero.carrental.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.refZero.carrental.Model.Car;

// Adnotacja @Repository jest niewymagana, ale dodanie jej zwiększa czytelność
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
