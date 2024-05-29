Простая заглушка внешней системы ЕРИБ на основе spring-boot

Установка статуса
http://localhost:13666/ERIBRouter/erib/limits/setstatus?status=false

Установка времени задержки ответа от заглушки, возможность изменять во время теста
http://localhost:13666/ERIBRouter/erib/limits/settime?time=25000

Запросы в заглушку от тестового приложения
http://localhost:13666/ERIBRouter/erib/limits/rollback/v1
http://localhost:13666/ERIBRouter/erib/limits/get
http://localhost:13666/ERIBRouter/erib/limits/exec/v1
