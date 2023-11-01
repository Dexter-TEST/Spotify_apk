package p.d25;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;
import java.lang.NullPointerException;
import java.lang.StringBuilder;
import java.lang.Object;

public final class d25 extends RuntimeException	// class@0012c6 from classes.dex
{

    public void d25(String p0,Throwable p1){
       if (p1 != null) {
       }else {
          NullPointerException nullPointerE = new NullPointerException();
       }
       super(p0, p1);
       return;
    }
    public void d25(Throwable p0){
       super("The exception was not handled due to missing onError handler in the subscribe\(\) method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | "+p0, p0);
    }
}
