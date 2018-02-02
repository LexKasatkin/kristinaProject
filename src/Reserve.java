import java.io.*;
import java.util.Scanner;

public class Reserve {
    private String detail;
    private int amount;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    Reserve(){
        this.detail=new String();
        this.amount=0;
    }

    void getData(String string){
        Scanner scanner=new Scanner(string);
        if(scanner.hasNext()){
            this.detail=scanner.next();
        }
        if(scanner.hasNextInt()){
            this.amount=scanner.nextInt();
        }
    }


}
