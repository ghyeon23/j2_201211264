package com.sd.sort.v2;
import java.util.Date;
import com.sd.turtle.WeightTurtle;
import java.text.SimpleDateFormat;

public class SorterMainV2 {
     public static void main(String[] args) {       
   
        String[] B={"John", "Adam", "Skrien", "Smith", "Jones"};
        Comparator stringComp = new StringComparator();
        Sorter.sort(B,stringComp);
        for(int i=0; i<B.length; i++)
            System.out.println("String Comparator ["+i+"]="+B[i]);
        
        
         //Reverse Comparator
        Comparator reverseComp = new ReverseComparator();
        Sorter.sort(B,reverseComp);

        for(int i=0; i<B.length; i++)
            System.out.println("Reverse Comparator ["+i+"]="+B[i]);
        
        
        //Turtle Comparator
        WeightTurtle[] wts={new WeightTurtle(30), new WeightTurtle(10), new WeightTurtle(20)};
        Comparator turtleComp=new TurtleComparator();
        Sorter.sort(wts, turtleComp);

        for(int i=0; i<wts.length; i++)
            System.out.println("WeightTurtle["+i+"]="+wts[i].getWeight());
        
        
        //DateComparator        
        Date[] date = {new Date(117,3,23),new Date(117,4,8),
          new Date(112,12,2),new Date(111,1,1),new Date(112,2,7)};
       
        Comparator dateComp = new DateComparator();
        Sorter.sort(date,dateComp);
        for(int i = 0; i<date.length; i++)
          System.out.println("Date comparator ["+i+"]= "+ date[i]);          
     }
}