import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main{
  public static void main(String[] args){
    ArrayList<Manager> managers = inputManagers();
    for(Manager manager:managers){
      System.out.println(manager);
    }
    ManagerComparator compareSalary = new ManagerComparator();
    managers.sort(compareSalary);

    System.out.println("The best paid manager is: " + managers.get(0).getName() + " who earns "
                    +  managers.get(0).getSalary() + " pounds per annum");
  }

  public static ArrayList<Manager> inputManagers(){
    ArrayList<Manager> managers = new ArrayList<Manager>();
    String name;
    int salary;

    try{
      File managerInfo = new File("Managers.txt");
      Scanner scan = new Scanner(managerInfo);
      while(scan.hasNextLine()){
        String[] info = scan.nextLine().split("-");
        name = info[0] + " " + info[1];
        try{
          salary = Integer.parseInt(info[2]);
        }catch (NumberFormatException e){
          salary = 0;
          JOptionPane.showMessageDialog(null, "Manger salaries should be stored as numbers!","Manager",
                                        JOptionPane.ERROR_MESSAGE);
        }
        managers.add(new Manager(name, salary));
      }
      scan.close();
    } catch (FileNotFoundException e){
      System.out.println("File not found");
    }
    return managers;

  }
}
