package p.yj4;
import java.io.Serializable;
import java.lang.Throwable;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import java.lang.StringBuilder;

public final class yj4 implements Serializable	// class@002dcd from classes.dex
{
    public final Throwable a;

    public void yj4(Throwable p0){
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (p0 instanceof yj4) {
          return Objects.equals(this.a, p0.a);
       }
       return false;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final String toString(){
       return "NotificationLite.Error["+this.a+"]";
    }
}
