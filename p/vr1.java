package p.vr1;
import p.jg2;
import java.lang.Object;
import p.tv;
import p.eq3;
import p.io2;
import p.p25;
import java.lang.Boolean;
import p.bq3;
import com.spotify.metadata.cosmos.proto.MetadataCosmos$MetadataItem;
import p.aq6;
import p.yh2;
import p.xt1;
import java.lang.Class;
import com.spotify.eventsender.gabo.a;
import com.spotify.eventsender.gabo.EventEnvelope;
import java.lang.String;
import java.lang.Iterable;
import p.ab2;
import p.rp;
import p.i80;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.a27;
import p.mo;

public final class vr1 implements jg2	// class@002a4b from classes.dex
{
    public final int a;
    public final Object b;

    public void vr1(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Object apply(Object p0){
       vr1 tb = this.b;
       switch (this.a){
           case 0:
             return tb.g(p0);
           case 1:
             tb.getClass();
             a uoa = EventEnvelope.j();
             uoa.d(p0.b);
             uoa.c(ab2.b(p0.e).m(new rp(12)));
             uoa.e(p0.c);
             uoa.f(p0.d);
             return uoa.build();
           case 2:
             return tb;
           case 3:
             return tb.c(p0);
           case 4:
             if (p0 == null) {
                p0 = null;
             }else if(io2.j(p0.k, tb.k)){
                p25 op25 = new p25(p0);
                op25.f = Boolean.TRUE;
                p0 = op25.c();
             }
             return p0;
             break;
           default:
             boolean b = (tb == p0)? true: false;
             return Boolean.valueOf(b);
       }
    }
}
