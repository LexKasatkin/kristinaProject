import java.io.*;
import java.util.Scanner;

public class Reserve {
    String detail;
    int amount;

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

    void getData(Scanner scanner){
        if(scanner.hasNext()){
            this.detail=scanner.next();
        }
        if(scanner.hasNextInt()){
            this.amount=scanner.nextInt();
        }
    }


}
