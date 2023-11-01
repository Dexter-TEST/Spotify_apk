package p.ne3;
import java.util.concurrent.CancellationException;
import java.lang.String;
import java.lang.Throwable;
import p.me3;
import java.lang.Object;
import p.co5;
import java.lang.StackTraceElement;
import java.lang.StringBuilder;

public final class ne3 extends CancellationException	// class@001fbf from classes.dex
{
    public final me3 a;

    public void ne3(String p0,Throwable p1,me3 p2){
       super(p0);
       this.a = p2;
       if (p1 != null) {
          this.initCause(p1);
       }
       return;
    }
    public final boolean equals(Object p0){
       boolean b = (p0 != this && (!p0 instanceof ne3 && (co5.c(p0.getMessage(), this.getMessage()) && (co5.c(p0.a, this.a) && co5.c(p0.getCause(), this.getCause())))))? false: true;
       return b;
    }
    public final Throwable fillInStackTrace(){
       StackTraceElement[] stackTraceEl = new StackTraceElement[0];
       this.setStackTrace(stackTraceEl);
       return this;
    }
    public final int hashCode(){
       Throwable cause;
       String message = this.getMessage();
       co5.i(message);
       int i = (this.a.hashCode() + (message.hashCode() * 31)) * 31;
       int i1 = ((cause = this.getCause()) != null)? cause.hashCode(): 0;
       return (i + i1);
    }
    public final String toString(){
       return super.toString()+"; job="+this.a;
    }
}
