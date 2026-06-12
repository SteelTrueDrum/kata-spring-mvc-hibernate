package web.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    // Сюда передается класс вашей корневой конфигурации (база данных, безопасность и т.д.), если есть
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{
                AppConfig.class
        };
    }

    // Указываем класс вашей Web-конфигурации (где лежат бины Thymeleaf и настройки контроллеров)
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
                WebConfig.class
        };
    }

    // Заменяет тег <servlet-mapping> из web.xml. Перенаправляет все запросы на DispatcherServlet
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }


    // Переопределяем цепочку фильтров (Filter Chain)
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
        encodingFilter.setEncoding("UTF-8");
        encodingFilter.setForceEncoding(true); // Принудительно применять UTF-8 для запросов и ответов

        return new Filter[] { encodingFilter };
    }

}