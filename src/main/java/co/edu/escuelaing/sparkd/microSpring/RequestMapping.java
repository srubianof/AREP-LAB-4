package co.edu.escuelaing.sparkd.microSpring;


import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RequestMapping {
    String value();
}
