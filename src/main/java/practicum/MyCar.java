package practicum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyCar {
    private final Engine engine;
    private final SeatHeater seatHeater;

    //указываем что зависимость необязательная, и если Spring не найдет, то передаст null
    @Autowired
    public MyCar(Engine engine,
                 @Autowired(required = false) SeatHeater seatHeater) {
        this.engine = engine;
        this.seatHeater = seatHeater;
    }

    /*
    Из-за того, что спринг может сюда передать null нужно сделать проверку - иначе ошибка
     */
    public void start() {
        engine.start();
        if (seatHeater != null) {
            seatHeater.start();
        }
    }
}
