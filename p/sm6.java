package p.sm6;
import java.lang.Throwable;
import java.lang.String;
import java.lang.StackTraceElement;
import java.lang.Object;
import p.co5;

public final class sm6 extends Throwable	// class@00265b from classes.dex
{
    public final String a;

    public void sm6(String p0,Throwable p1,StackTraceElement[] p2){
       co5.o(p2, "filteredCallerStackTrace");
       super(p0, p1);
       this.a = p0;
       this.setStackTrace(p2);
    }
    public final String getMessage(){
       return this.a;
    }
}
