import java.util.Scanner;

public class Plan  extends Reserve {
    private String date;

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
    void getData(String string) {
        Scanner scanner=new Scanner(string);
        super.getData(scanner);
        if(scanner.hasNext()) {
            this.date = scanner.next();
        }
    }
}
