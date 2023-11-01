package p.tx5;
import java.io.Serializable;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class tx5 implements Serializable	// class@002800 from classes.dex
{
    public final Throwable a;

    public void tx5(Throwable p0){
       co5.o(p0, "exception");
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof tx5 && co5.c(this.a, p0.a))? true: false;
       return b;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final String toString(){
       return "Failure\("+this.a+')';
    }
}
