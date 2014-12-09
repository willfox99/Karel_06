import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab06Exercises {

   public static void task_07(Athlete arg) {
      
      int count = 0;
      while (!arg.nextToABeeper() && arg.frontIsClear()) 
     {
      arg.move();
      count++;
     }
      JOptionPane.showMessageDialog(null, "The robot for task_07 took " + count + " steps.", "task_07 Robot", JOptionPane.OK_OPTION);
    }
    
   public static void task_08(Athlete arg) {
   
   Robot mike = new Robot(5, 2, Display.EAST,0);
      while (!arg.nextToARobot()) 
     {
      arg.move();
     }
      while (arg.hasBeepers()) 
     {
      arg.putBeeper();
     }
    }
    
    public static void task_09(Athlete arg) {
     for (int k = 1; k <= 5; k++){
     
       for (int i = 1; i <= 4; i++){
     
      arg.putBeeper();
     }
      arg.move();
    }
    }
    
    public static void task_10(Athlete arg) {
      while (arg.frontIsClear()) 
     {
         if (arg.nextToABeeper()) 
        {
         arg.move();
        }
         else 
        {
         arg.putBeeper();
        }
     }
    }
    
     public static void task_11(Athlete arg) {
       while (!arg.rightIsClear()) {
       arg.putBeeper();
       arg.move();
     }
    }
    
     public static void task_12(Athlete arg) {
       while (arg.rightIsClear() || !arg.nextToABeeper()) {
       arg.move();
     }
    }
   
     public static void main(String[] args) 
    {
      
          String filename = JOptionPane.showInputDialog("What robot map?");     
          Display.openWorld("maps/" + filename + ".map");
          if (filename.equals("tasks5")) 
         {
          Athlete m = new Athlete(5, 2, Display.NORTH, 0);
        }
          else if (filename.equals("tasks6"))
         {
          Athlete n = new Athlete(2, 2, Display.WEST, 1);
         }
          Display.setSize(11, 11);
          Display.setSpeed(6);
          
          Athlete g = new Athlete(1, 1, Display.EAST, 20);
          Athlete h = new Athlete(1, 2, Display.EAST, 20);
          Athlete i = new Athlete(1, 3, Display.EAST, 20);
          Athlete j = new Athlete(1, 4, Display.EAST, 20);
          Athlete k = new Athlete(1, 5, Display.EAST, 20);
          Athlete l = new Athlete(1, 6, Display.EAST, 20); 
          
          task_07(g);
          task_08(h);
          task_09(i);
          task_10(j);
          task_11(k);
          task_12(l);
     
    }
    
}