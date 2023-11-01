package p.pf2;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.String;
import p.kg4;

public final class pf2 extends RuntimeException	// class@00224d from classes.dex
{
    public final int a;
    public final Throwable b;

    public void pf2(int p0,Throwable p1){
       kg4.t(p0, "callbackName");
       super(p1);
       this.a = p0;
       this.b = p1;
    }
    public final Throwable getCause(){
       return this.b;
    }
}
