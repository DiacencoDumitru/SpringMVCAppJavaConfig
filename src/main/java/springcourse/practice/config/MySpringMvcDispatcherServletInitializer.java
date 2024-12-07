package springcourse.practice.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null; // null так как мы этот метод не будем использовать
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringConfig.class}; // Поставить класс который является у нас Конфигурационным (что-бы знал где у нас находится Spring-Конфигурация)
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"}; // Данный  слэш "/", эквивалентно тому что мы все HTTP запросы пользователя ссылаем на dispatcher servlet
    }
}
