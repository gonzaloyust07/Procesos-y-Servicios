package procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassLauncher {
    static void main(String[] args) throws IOException {
        String path = System.getProperty("java.class.path");

        Process process = new ProcessBuilder("java","-cp",path,"ClassLaunched"," hugo").start();
        BufferedReader br= new BufferedReader(new InputStreamReader(process.getInputStream()));

        String line = br.readLine();
        System.out.println(line);

    }
}
