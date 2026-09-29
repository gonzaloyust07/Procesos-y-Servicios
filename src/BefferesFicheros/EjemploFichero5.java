package BefferesFicheros;

import java.io.File;
import java.io.IOException;

public class EjemploFichero5 {
    static void main(String[] args) {
        try{
            File file = new File("archivoBorrar.txt");
            boolean deleted=false;
            if(file.exists()){
                System.out.println("This file exists");
                deleted= file.delete();
            }else{
                System.out.println("this file doesn't exits");

            }

            if(deleted){
                System.out.println("the file was removed successfully");
            }else{
                System.out.println("the file wasn't removed");
            }

            System.out.println("path to the file: "+ file.getAbsolutePath());

            boolean create = file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}