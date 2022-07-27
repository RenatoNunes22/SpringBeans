package com.example.springbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args){

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Livro livro = factory.getBean(Livro.class);
        livro.setNome("Harry Potter");
        livro.setCodigo("252525");
        livro.exibir();

    }
}
