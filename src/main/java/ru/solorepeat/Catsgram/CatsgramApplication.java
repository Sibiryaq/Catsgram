package ru.solorepeat.Catsgram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * GET - получает ресурсы
 * POST - создает ресурс
 * PUT - заменяет существующий данные и при их отсутствии создает новый ресурс
 * PATCH - частичное обновление данных ресурса
 * DELETE - удаляет ресурс
 * <p>
 * HEAD - для получения заголовков ответа
 * OPTIONS - для получения списка HTTP-методов, которые поддерживает сервер
 * <p>
 * небезопасный - может изменить ресурс - PUT, PATCH, DELETE, POST
 * идемпотентный - многократное выполнение = однократному
 * неидемпотентный - POST
 */
@SpringBootApplication
public class CatsgramApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatsgramApplication.class, args);
    }

}
