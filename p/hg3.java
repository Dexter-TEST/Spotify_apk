package p.hg3;
import java.io.IOException;
import java.lang.String;
import p.ne;
import java.lang.Throwable;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.Object;

public abstract class hg3 extends IOException	// class@001847 from classes.dex
{

    public void hg3(String p0){
       super(p0);
    }
    public void hg3(String p0,ne p1,Throwable p2){
       super(p0, p2);
    }
    public String a(){
       return null;
    }
    public final String b(){
       return super.getMessage();
    }
    public String getMessage(){
       String message;
       String str;
       if ((message = super.getMessage()) == null) {
          message = "N/A";
       }
       if ((str = this.a()) != null) {
          StringBuilder str1 = new StringBuilder(100)+message;
          if (str != null) {
             str1 = str1+str;
          }
          message = str1;
       }
       return message;
    }
    public String toString(){
       return this.getClass().getName()+": "+this.getMessage();
    }
}
