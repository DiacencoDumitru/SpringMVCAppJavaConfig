## Избавимся конфигурацию из xml файлов и заменим их на Java классы.

1. Изменим `web.xml` на Java класс. 
    * a. Способ: Который реализует интерфейс `WebApplicationInitializer`, 
    * b. Способ: мы будем использовать абстрактный класс `AbstractAnnotationConfigDispatcherServletInitializer`)
2. `applicationContextMVC.xml` на Java класс (С помощью аннотации @Configuration)