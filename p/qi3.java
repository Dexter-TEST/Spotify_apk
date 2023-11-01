package p.qi3;
import com.spotify.legacyglue.hugs.layouttraits.TraitsLayoutManager;
import p.yq5;
import java.lang.Object;
import p.a33;
import p.mk2;
import java.util.Set;
import p.vt2;
import p.ou2;
import p.xt2;
import java.util.EnumSet;
import java.util.Collections;
import java.util.Collection;
import com.google.common.collect.d;

public final class qi3	// class@0023a9 from classes.dex
{
    public final Object a;
    public final Object b;

    public void qi3(TraitsLayoutManager p0,yq5 p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void qi3(a33 p0,mk2 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Set a(int p0,qi3 p1){
       vt2 ovt2 = this.a.a.a(p1.a.f(p0));
       EnumSet uEnumSet = (ovt2 instanceof xt2)? ovt2.d(): Collections.emptySet();
       if (uEnumSet.isEmpty()) {
          return Collections.emptySet();
       }else if(uEnumSet instanceof EnumSet){
          return uEnumSet;
       }else {
          return d.o(uEnumSet);
       }
    }
    public final Set b(int p0,int p1,qi3 p2){
       if (p0 < 0) {
          return Collections.emptySet();
       }
       if (p0 >= p1) {
          return Collections.emptySet();
       }
       return this.a(p0, p2);
    }
}
