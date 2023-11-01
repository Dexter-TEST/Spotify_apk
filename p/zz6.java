package p.zz6;
import p.ml1;
import java.util.Map;
import java.lang.Object;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;

public final class zz6	// class@002f99 from classes.dex
{
    public final Map a;
    public static final zz6 b;

    static {
       zz6.b = new zz6(ml1.a);
    }
    public void zz6(Map p0){
       this.a = p0;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof zz6 || !co5.c(this.a, p0.a)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final String toString(){
       return "Tags\(tags="+this.a+')';
    }
}
