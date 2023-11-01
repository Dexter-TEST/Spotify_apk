package p.qh1;
import p.eo5;
import com.spotify.webapi.service.models.ShowSimple;
import java.util.Set;
import java.lang.Class;
import java.lang.Object;
import java.util.Collection;
import java.lang.String;
import java.lang.StringBuilder;

public final class qh1 extends eo5	// class@00239e from classes.dex
{
    public final ShowSimple D;
    public final Collection E;

    public void qh1(ShowSimple p0,Set p1){
       super();
       this.D = p0;
       p1.getClass();
       this.E = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof qh1) {
          return false;
       }
       if (!p0.D.equals(this.D) || !p0.E.equals(this.E)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.E.hashCode() + ((this.D.hashCode() + 0) * 31));
    }
    public final String toString(){
       return "SaveShow{show="+this.D+", loaded=***}";
    }
}
