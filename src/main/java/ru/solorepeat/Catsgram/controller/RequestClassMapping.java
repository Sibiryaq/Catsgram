package ru.solorepeat.Catsgram.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TRACE -трассировочные сообщения, например в каком ветвлении if-else, какие параметры внутри циклов, шаги алгоритма
 * DEBUG - для отладочных сообщений, обычно значения переменных, которые относятся к бизнесс-логике приложения
 * INFO - текущее состояние программы, статус обработки запроса, результат авторизации
 * сведения об IP-адресе или сетевом порте
 * <p>
 * WARN - если что-то пошло не так, например исключение, или переданные данные в неверном формате
 * при этом программа может обработать эту ситуацию самостоятельно и продолжить работу
 * <p>
 * ERROR - о критических ошибках, требующих вмещательства, без которого программа не сможет продолжить работу,
 * нехватка ресурсов, невозможность установить соединение с базой данных и т.д.
 */
@RestController
@RequestMapping("/перваячасть/v1/board")
public class RequestClassMapping {
    private static final Logger log = LoggerFactory.getLogger(RequestClassMapping.class);

    @GetMapping
    public void getBoard() {

        log.trace("трасе");
        log.debug("Багги");
        log.info(" У шейкера нет прокаста... Кто, кто дал эту инфу?");
        log.info("Пользователь {} сменил статус на {}.", "Григорий Логинов", "Занят");
        log.warn("ошибка, остановись пока остановка не стала последней ежжи");
        log.error("Егор - еррор");

        // Обработка GET-запроса по пути "/перваячасть/v1/board"
    }

//    @RequestMapping(path = "/tasks", method = RequestMethod.GET)
//    public List<Task> getAllTasks() {
//        // Обработка GET-запроса по пути "/api/v1/board/tasks"
//    }

//    @GetMapping("/groups")
//    public List<Group> getGroups() {
//        // Обработка GET-запроса по пути "/api/v1/board/groups"
//    }


}
