package question2;
import java.util.ArrayList;
import java.util.Scanner;

class Input {
    public void except(ArrayList arrayList){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the index to be checked");
        int index=scanner.nextInt();
        try{
            System.out.println(arrayList.toString().charAt(index));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("error occured"+e.getClass().toString());
        }

    }

    public Input(int size) {
        ArrayList arrayList=new ArrayList();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter elements");
        for (int i = 0; i < size; i++) {

            String a= scanner.next();
            arrayList.add(a);
        }
        except(arrayList);

    }
}

public class Question2 {
    public static void main(String[] args) {
        System.out.println("enter size of the array");
        Scanner scanner = new Scanner(System.in);
        int size=scanner.nextInt();
        Input input = new Input(size);

    }
}
