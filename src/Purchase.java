import java.util.Scanner;

public class Purchase extends Reserve{
    private String quarter;

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    Purchase(){
        super();
        this.quarter="";
    }

    @Override
    void getData(String string) {
        Scanner scanner=new Scanner(string);
        super.getData(scanner);
        if(scanner.hasNext()) {
            this.quarter = scanner.next();
        }
    }
}
