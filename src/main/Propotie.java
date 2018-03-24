package main;

import java.awt.RenderingHints.Key;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Propotie {
   String propfile = "Timer/User.properties";
   Properties prop = new Properties();
   Set set;
   int time = 0;

   public int getTime() {
      try {
         prop.load(new FileInputStream(propfile));
      } catch (FileNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      set = prop.keySet();
      Iterator it = set.iterator();
      while (it.hasNext()) {
         time = Integer.parseInt((String) prop.get(it.next())) ;
      }
      return time;
   }
   
   public String getfinalName(){
      try {
         prop.load(new FileInputStream(propfile));
      } catch (FileNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      set = prop.keySet();
      String str=null;
      Iterator it = set.iterator();
      while (it.hasNext()) {
         str=(String) it.next();
      }
      return str;
   }

   public void PutTime(int time){
      String str=getfinalName();
      
      prop.setProperty(str, String.valueOf(time));
      
       try {
         prop.store(new FileOutputStream(propfile), null);
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

      
   }

   public String fomatTime(int secs) {

      int hour, min, sec;
      sec = secs % 60;
      min = secs / 60 % 60;
      hour = secs / 3600;

      String timerBuffer = String.format("%02d:%02d:%02d", hour, min, sec);
      // prop.propCountWrite(secs);
      return timerBuffer;

   }

//   public static void main(String[] args) {
//      Propotie pp=new Propotie();
//      
//      System.out.println(pp.getTime());
//      System.out.println(pp.getfinalName());
//      System.out.println(pp.fomatTime(544));
//      pp.PutTime(433);
//      System.out.println(pp.getTime());
//      
//   }
}