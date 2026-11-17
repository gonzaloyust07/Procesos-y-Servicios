package procesos;

public class PrincipalProcess1 {
    public static void main(String[] args) {
        try {

            String path = System.getProperty("java.class.path");
            System.out.println(path);
            String[] infoProcess = {"Java", "-cp", path, "secondary.SecondaryProcess"};

            Process process = Runtime.getRuntime().exec(infoProcess);

            int returnValue = process.waitFor();

            System.out.println("secondary process finished. " + "Error code: " + returnValue);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
