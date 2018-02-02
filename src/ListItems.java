import java.util.ArrayList;
import java.util.List;

public class ListItems {
    List<Reserve> reserveList;

    ListItems(){
        reserveList=new ArrayList<Reserve>();
    }

    public void getData(String filename, class cl){
        try {
//            System.out.print("Enter the file name with extension : ");
//
//            Scanner input = new Scanner(System.in);

            File file = new File(filename);

            input = new Scanner(file);


            while (input.hasNextLine()) {
                String line = input.nextLine();
                if(cl==Purchase.getClass()){
                    Purchase purchase=new Purchase();
                    purchase.getData(line);
                }else if(cl==Plan.getClass()){
                    Plan plan=new Plan();
                    plan.getData(line);
                }
                System.out.println(line);
            }
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
