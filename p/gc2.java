package p.gc2;
import android.app.Notification;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;

public final class gc2	// class@0016df from classes.dex
{
    public final int a;
    public final int b;
    public final Notification c;

    public void gc2(int p0,int p1,Notification p2){
       super();
       this.a = p0;
       this.c = p2;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       boolean b = false;
       if (p0 == null || gc2.class != p0.getClass()) {
          return b;
       }
       if (this.a != p0.a) {
          return b;
       }
       if (this.b != p0.b) {
          return b;
       }
       return this.c.equals(p0.c);
    }
    public final int hashCode(){
       return (this.c.hashCode() + (((this.a * 31) + this.b) * 31));
    }
    public final String toString(){
       return "ForegroundInfo{mNotificationId="+this.a+", mForegroundServiceType="+this.b+", mNotification="+this.c+'}';
    }
}
