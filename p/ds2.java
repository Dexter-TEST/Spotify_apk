package p.ds2;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.StringBuffer;
import java.lang.String;
import java.lang.Object;
import p.cx5;
import java.lang.StringBuilder;
import p.xw0;
import java.lang.StackTraceElement;

public final class ds2 extends RuntimeException	// class@0013a7 from classes.dex
{
    public final int a;
    public final Object b;

    public void ds2(Throwable p0){
       this.a = 2;
       String str = (p0 == null)? "com.googlecode.mp4parser.RequiresParseDetailAspect": "Exception while initializing com.googlecode.mp4parser.RequiresParseDetailAspect: "+p0;
       super(str);
       this.b = p0;
       return;
    }
    public void ds2(cx5 p0){
       this.a = 0;
       super("HTTP "+p0.t+": "+p0.c);
       this.b = p0;
    }
    public void ds2(xw0 p0){
       this.a = 1;
       super();
       this.b = p0;
    }
    public final Throwable fillInStackTrace(){
       switch (this.a){
           case 1:
           default:
             return super.fillInStackTrace();
       }
       StackTraceElement[] stackTraceEl = new StackTraceElement[0];
       this.setStackTrace(stackTraceEl);
       return this;
    }
    public final Throwable getCause(){
       switch (this.a){
           case 2:
           default:
             return super.getCause();
       }
       return this.b;
    }
    public final String getLocalizedMessage(){
       switch (this.a){
           case 1:
           default:
             return super.getLocalizedMessage();
       }
       return this.b.toString();
    }
}
