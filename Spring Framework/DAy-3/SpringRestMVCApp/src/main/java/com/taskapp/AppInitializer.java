package com.taskapp;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import com.taskapp.config.WebMvcConfig;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;   // no parent (root) context for now
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebMvcConfig.class };  // MVC config
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
