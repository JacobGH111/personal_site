/**
 * server starts at http://localhost:4567/
 */
import static spark.Spark.*;
public class Main {
    public static void main(String[] args){
        get("/hello", (req, res)->"Hello, worldddd!");
    }
}
