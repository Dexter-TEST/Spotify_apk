package p.ny1;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.Random;
import p.sz1;
import p.v12;
import p.t12;
import p.my1;
import p.s12;
import java.lang.Exception;
import java.lang.Throwable;

public class ny1 extends RuntimeException	// class@002070 from classes.dex
{

    public void ny1(){
       super();
    }
    public void ny1(String p0){
       super(p0);
       Random random = new Random();
       if (p0 != null && (sz1.h() && random.nextInt(100) > 50)) {
          v12.a(new my1(p0), t12.M);
       }
       return;
    }
    public void ny1(String p0,Exception p1){
       super(p0, p1);
    }
    public void ny1(Throwable p0){
       super(p0);
    }
    public String toString(){
       String message;
       if ((message = this.getMessage()) == null) {
          message = "";
       }
       return message;
    }
}
