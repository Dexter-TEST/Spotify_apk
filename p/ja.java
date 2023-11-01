package p.ja;
import p.ma;
import com.spotify.allboarding.entrypoint.EntryPoint;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class ja extends ma	// class@001a9e from classes.dex
{
    public final EntryPoint a;

    public void ja(EntryPoint p0){
       co5.o(p0, "entryPoint");
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ja) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final String toString(){
       return "ScreenOpened\(entryPoint="+this.a+')';
    }
}
