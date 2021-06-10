package at.vietze.divisionCalc;

import com.sun.net.httpserver.HttpServer;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

public class main {
    public static void main(String[] args) {
        System.out.println("Project started...");
        ResourceConfig rc = new ResourceConfig().packages("at.vietze.divisionCalc");
        HttpServer serv = JdkHttpServerFactory.createHttpServer(URI.create("http://localhost:1234/"), rc);
        System.out.println("Server up and running...");

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        serv.stop(0);
        System.out.println("Execution finished...");
    }
}
