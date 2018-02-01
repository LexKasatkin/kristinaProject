import java.util.Scanner;

public class Plan  extends Reserve {
    String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    Plan(){
        this.date="";
    }

    @Override
    void getData(Scanner scanner) {
        super.getData(scanner);
        if(scanner.hasNext()) {
            this.date = scanner.next();
        }
    }
}
