package p.c66;
import p.ty0;
import p.mq5;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class c66 extends ty0	// class@0011a8 from classes.dex
{
    public final mq5 m;

    public void c66(mq5 p0){
       super();
       this.m = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof c66) {
          return false;
       }
       return p0.m.equals(this.m);
    }
    public final int hashCode(){
       return (this.m.hashCode() + 0);
    }
    public final String toString(){
       return "SaveRecentSearch{recentSearch="+this.m+'}';
    }
}
