package co.edu.escuelaing.sparkd.microSpring;


import jdk.nashorn.internal.runtime.ECMAException;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class MicroSpring {
    private Map<String, Method> beans = new HashMap<>();

    //busca todos los metodos y los guarda en el map
    public void start(String[] args) throws Exception {
        int mapped = 0;

        for (Method m : Class.forName(args[0]).getMethods()) {
            System.out.println("Revisando: " + m.getName());
            if (m.isAnnotationPresent(RequestMapping.class)) {
                System.out.println("Si esta anotando como @RequestMapping");
                try {
                    beans.put(m.getAnnotation(RequestMapping.class).value(),m);
                    mapped++;
                } catch (Throwable ex) {
                    System.out.printf("Test %s failed: %s %n", m, ex.getCause());
                }
            }
        }
    }

    public String invoke(String path) {
        try {
            return beans.get(path).invoke(null).toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Error";
    }
}
