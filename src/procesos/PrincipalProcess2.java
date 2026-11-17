package procesos;

public class PrincipalProcess2 {
    static void main(String[] args) {
        try {



            Process process = Runtime.getRuntime().exec("C:\\Program Files\\WindowsApps\\Microsoft.WindowsNotepad_11.2607.14.0_x64__8wekyb3d8bbwe\\Notepad\\Notepad.exe");

            Thread.sleep(2000);

            Process process2 = Runtime.getRuntime().exec("calc");

            Thread.sleep(2000);

            String documentPath="C:\\Users\\gomez.pahug\\Documents\\Libro1.xlsx";
            String excelPath = "C:\\Program Files\\Microsoft Office\\root\\Office16\\EXCEL";
            String path [] = {excelPath,documentPath};

            Process process3 = Runtime.getRuntime().exec(path);



        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
