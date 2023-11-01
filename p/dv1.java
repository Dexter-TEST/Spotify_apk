package p.dv1;
import p.ng2;
import p.uv1;
import p.lv1;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.messages.EventSenderStats2NonAuth;
import p.xt1;
import p.kv1;
import java.lang.Class;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.lang.Iterable;
import p.di7;
import p.dj0;
import p.n26;
import p.c87;
import p.la6;
import p.zf2;
import p.oa6;
import com.google.protobuf.a;
import p.i80;
import p.h80;
import p.u65;

public final class dv1 implements ng2	// class@0013c1 from classes.dex
{
    public final uv1 a;
    public final lv1 b;

    public void dv1(uv1 p0,lv1 p1){
       co5.o(p1, "eventSequenceNumbersDao");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final xt1 a(EventSenderStats2NonAuth p0,byte[] p1){
       dv1 uodv1 = this;
       Object obj = p1;
       co5.o(p0, "input");
       co5.o(obj, "sequenceId");
       dv1 b = uodv1.b;
       String str = "EventSenderStats2NonAuth";
       long l = b.p(str, obj);
       long l1 = 1;
       long l2 = (!(l))? l1: l;
       b.s(new kv1(str, (l2 + l1), obj));
       b = uodv1.a;
       b.getClass();
       ArrayList uArrayList = oa6.H(new c87(dj0.e0(new ArrayList(b.b)), n26.H));
       byte[] uobyteArray = p0.toByteArray();
       uArrayList.add(new u65("message", i80.c(uobyteArray, 0, uobyteArray.length)));
       xt1 obj1 = new xt1(-100, "EventSenderStats2NonAuth", i80.c(obj, 0, obj.length), l2, uArrayList);
       return obj;
    }
    public final Object b(Object p0,Object p1){
       return this.a(p0, p1);
    }
}
