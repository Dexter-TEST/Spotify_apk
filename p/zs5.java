package p.zs5;
import com.google.common.collect.c;
import p.at5;
import java.lang.Object;
import p.ap5;
import java.util.Objects;
import java.util.AbstractMap$SimpleImmutableEntry;

public final class zs5 extends c	// class@002f5a from classes.dex
{
    public final at5 c;

    public void zs5(at5 p0){
       this.c = p0;
       super();
    }
    public final Object get(int p0){
       zs5 tc = this.c;
       ap5.f(p0, tc.x);
       p0 = p0 * 2;
       at5 w = tc.w;
       at5 v = tc.v;
       object oobject = v[(w + p0)];
       Objects.requireNonNull(oobject);
       object oobject1 = v[(p0 + (w ^ 0x01))];
       Objects.requireNonNull(oobject1);
       return new AbstractMap$SimpleImmutableEntry(oobject, oobject1);
    }
    public final boolean k(){
       return true;
    }
    public final int size(){
       return this.c.x;
    }
}
