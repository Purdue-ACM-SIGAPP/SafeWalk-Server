import static spark.Spark.*;

public class Server {

    public Server(){
        //change port for server (default is 4567)
        //port(20000)

        endpoints();


    }

    /**
     Use this method to add all endpoints that server is to be hosting
     */
    private void endpoints(){
        get("/hello", (req, res) -> "Hello world");
        get("/index", "application/json", (request, response) -> {
            return "text";
        }, new JsonTransformer());
    }

    public static void main(String[] args) {
        Server server = new Server();
    }
}
