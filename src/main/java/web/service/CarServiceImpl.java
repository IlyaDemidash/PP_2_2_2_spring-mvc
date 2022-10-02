package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDaoImpl carDao;

    @Autowired
    public CarServiceImpl(CarDaoImpl carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getListOfCar(int count) {
        if (count > 5) {
            count = 5;
        }
        return carDao.getList(count);
    }
}
