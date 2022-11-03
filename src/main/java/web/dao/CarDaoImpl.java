package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Cars;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Cars> carsList;

    public CarDaoImpl() {
        carsList = new ArrayList<>();
        carsList.add(new Cars("LADA", "Vesta", "K007PA07"));
        carsList.add(new Cars("TESLA", "Model S", "T123TT78"));
        carsList.add(new Cars("Geely", "Atlas", "K456KK93"));
    }


    @Override
    public void addCar(Cars car) {

        carsList.add(car);
    }

    @Override
    public List<Cars> getCarsListByCount(int count) {
        if (count == 0 || count > carsList.size()) {
            return carsList;
        } else {
            List<Cars> newList = new ArrayList<>();
            newList = carsList.stream()
                    .limit(count)
                    .toList();
            return newList;
        }
    }

    public List<Cars> getAllCars() {
        return carsList;
    }
}
