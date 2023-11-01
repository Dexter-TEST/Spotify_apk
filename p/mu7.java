package p.mu7;
import p.ca5;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p.m07;
import p.da5;
import java.lang.Object;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import p.wx5;
import p.ty0;
import p.a28;
import p.uv5;
import p.ve;
import java.lang.Exception;

public final class mu7 implements ca5	// class@001f0c from classes.dex
{
    public final ty0 a;
    public final m07 b;
    public final da5 c;

    public void mu7(BasePendingResult p0,m07 p1,da5 p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void a(Status p0){
       int i = 1;
       int i1 = (p0.b <= null)? 1: 0;
       mu7 tb = this.b;
       if (i1) {
          tb.a.k(this.c.e(this.a.a(TimeUnit.MILLISECONDS)));
          return;
       }else if(p0.t != null){
          i = 0;
       }
       uv5 ouv5 = (i)? new uv5(p0): new ve(p0);
       tb.a.j(ouv5);
       return;
    }
}
