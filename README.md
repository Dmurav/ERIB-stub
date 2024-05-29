## Простая заглушка внешней системы на основе spring-boot

### Установка статуса - false/true
 - http://localhost:13666/ERIBRouter/erib/limits/setstatus?status=false

### Установка времени задержки ответа от заглушки, возможность изменять во время теста
- http://localhost:13666/ERIBRouter/erib/limits/settime?time=25000

### Запросы в заглушку от тестового приложения
- http://localhost:13666/ERIBRouter/erib/limits/rollback/v1
- http://localhost:13666/ERIBRouter/erib/limits/get
- http://localhost:13666/ERIBRouter/erib/limits/exec/v1

Ответ от заглушки:
```
{
    "success": true,
        "status": {
            "body": {
                "code": "SUCCESS"
            }
        }
}
```

Запуск из проекта
- mvn spring-boot:run

Сформировать исполняемый stub-0.0.1.jar
- mvn clean package

Запуск jar
- java -jar stub-0.0.1.jar




