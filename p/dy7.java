package p.dy7;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Exception;
import java.lang.Throwable;

public final class dy7 extends RuntimeException	// class@0013e2 from classes.dex
{
    public final int a;

    public void dy7(String p0){
       super(p0);
       this.a = -1;
    }
    public void dy7(String p0,int p1){
       super(p0);
       this.a = p1;
    }
    public void dy7(String p0,Exception p1){
       super(p0, p1);
       this.a = -1;
    }
    public void dy7(String p0,Exception p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
}
