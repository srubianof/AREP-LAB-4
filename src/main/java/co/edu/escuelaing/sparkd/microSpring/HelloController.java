package co.edu.escuelaing.sparkd.microSpring;

public class HelloController {
    @RequestMapping("/hola")
    public static String hola() {
        return "Greetings from Micro Spring Boot";
    }

    @RequestMapping("/pi")
    public static String pi() {
        return "Number PI: " + Math.PI;
    }

    @RequestMapping("/pagina")
    public static String pagina() {
        return "<!DOCTYPE html>\n" +
                "<html>\n"
                + "<head>\n"
                + "<meta charset=\"UTF-8\">\n"
                + "<title>Title of the document</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "<h1>Valor de Euler</h1>\n"
                + "<p>" + Math.E + "</p"
                + "</body>\n"
                + "</html>\n";
    }
}
