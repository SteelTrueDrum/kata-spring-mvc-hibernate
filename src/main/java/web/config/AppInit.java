package web.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    // Сюда передается класс вашей корневой конфигурации (база данных, безопасность и т.д.), если есть
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{
                null
//                AppConfig.class
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

}