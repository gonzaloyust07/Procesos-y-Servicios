package procesos;

import java.io.IOException;
import java.util.Scanner;

public class Shutdowm {
    static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String command;
        System.out.println("escribe el tiempo que tienes hasta que se apague el equipo: ");
        String tiempo = sc.nextLine();

        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            command="C:\\Windows\\System32\\shutdown.exe -r -t "+tiempo;
        } else {
            command="shutdowm.exe -r -t 360";
        }

        ProcessBuilder builder = new ProcessBuilder(command.split("\\s"));

        builder.start();
    }
}
