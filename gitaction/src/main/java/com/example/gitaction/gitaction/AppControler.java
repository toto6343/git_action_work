public class AppControler {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Git Action!";
    }
}
