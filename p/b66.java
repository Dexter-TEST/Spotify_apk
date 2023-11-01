package p.b66;
import p.xj0;
import p.mq5;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class b66 extends xj0	// class@001064 from classes.dex
{
    public final mq5 H;

    public void b66(mq5 p0){
       super();
       this.H = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof b66) {
          return false;
       }
       return p0.H.equals(this.H);
    }
    public final int hashCode(){
       return (this.H.hashCode() + 0);
    }
    public final String toString(){
       return "SaveRecentSearch{recentSearch="+this.H+'}';
    }
}
