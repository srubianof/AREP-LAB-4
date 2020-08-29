package co.edu.escuelaing.sparkd.microSpring;

public class HelloController {
    @RequestMapping("/hola")
    public static String hola() {
        return "Greetings from Micro Spring Boot";
    }

    @RequestMapping("/pi")
    public static String pi() {
        return "Number PI: "+Math.PI;
    }

    @RequestMapping("/pagina")
    public static String pagina() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
    }
}
