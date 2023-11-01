package p.ia1;
import java.io.FileFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import java.lang.Character;

public final class ia1 implements FileFilter	// class@001953 from classes.dex
{

    public void ia1(){
       super();
    }
    public final boolean accept(File p0){
       String name = p0.getName();
       if (!name.startsWith("cpu")) {
          return false;
       }
       int i = 3;
       while (true) {
          if (i >= name.length()) {
             return true;
          }
          if (!Character.isDigit(name.charAt(i))) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
}
