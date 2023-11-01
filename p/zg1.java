package p.zg1;
import p.eo5;
import java.util.Collection;
import java.lang.Object;
import java.lang.String;

public final class zg1 extends eo5	// class@002eed from classes.dex
{
    public final Collection D;

    public void zg1(Collection p0){
       super();
       this.D = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof zg1) {
          return false;
       }
       return p0.D.equals(this.D);
    }
    public final int hashCode(){
       return (this.D.hashCode() + 0);
    }
    public final String toString(){
       return "LoadMetadata{uris=***}";
    }
}
