package p.m22;
import java.util.concurrent.Callable;
import p.n22;
import com.spotify.ucs.proto.v0.UcsResponseWrapper$UcsResponse;
import java.lang.Object;
import com.spotify.ucs.proto.v0.UcsResponseWrapper$AccountAttributesResponse;
import java.util.Map;
import java.lang.String;
import p.co5;
import java.lang.Class;
import java.util.LinkedHashMap;
import p.xe7;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import com.spotify.useraccount.v1.AccountAttribute;
import p.r4;
import p.k22;
import java.lang.Enum;
import p.q4;
import com.spotify.remoteconfig.internal.AccountAttribute;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.jl5;
import com.spotify.remoteconfig.internal.ProductStateProto;
import p.ge6;
import p.t37;
import p.xs6;
import p.ll5;
import java.util.Objects;
import com.google.protobuf.a;
import p.jc7;

public final class m22 implements Callable	// class@001e0e from classes.dex
{
    public final n22 a;
    public final UcsResponseWrapper$UcsResponse b;

    public void m22(n22 p0,UcsResponseWrapper$UcsResponse p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Object call(){
       Object[] key;
       AccountAttribute uAccountAttr;
       q4 oq4;
       int i;
       Map map = this.b.h().f();
       co5.l(map, "this\n            .accoun…    .accountAttributesMap");
       this.a.getClass();
       LinkedHashMap linkedHashMa = new LinkedHashMap(xe7.F(map.size()));
       Iterator iterator = map.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          key = uEntry.getKey();
          r4 or4 = ((or4 = uEntry.getValue().j()) == null)? -1: k22.a[or4.ordinal()];
          if (or4 != 1) {
             if (or4 != 2) {
                if (or4 != 3) {
                   uAccountAttr = AccountAttribute.j().build();
                }else {
                   oq4 = AccountAttribute.j();
                   oq4.e(uEntry.getValue().i());
                   uAccountAttr = oq4.build();
                }
             }else {
                oq4 = AccountAttribute.j();
                oq4.d(uEntry.getValue().h());
                uAccountAttr = oq4.build();
             }
          }else {
             oq4 = AccountAttribute.j();
             oq4.c(uEntry.getValue().f());
             uAccountAttr = oq4.build();
          }
          linkedHashMa.put(key, uAccountAttr);
       }
       jl5 ojl5 = ProductStateProto.g();
       ojl5.c(linkedHashMa);
       ProductStateProto productState = ojl5.build();
       co5.l(productState, "productStateProto");
       key = new Object[0];
       t37.a().getClass();
       ge6.a(key);
       n22 a = this.a.a;
       a.getClass();
       xs6 e = a.e;
       _monitor_enter(e);
       Objects.toString(e.a);
       Object[] objArray = new Object[0];
       t37.a().getClass();
       ge6.k(objArray);
       byte[] uobyteArray = productState.toByteArray();
       co5.l(uobyteArray, "data.toByteArray\(\)");
       e.a(uobyteArray);
       _monitor_exit(e);
       return jc7.a;
    }
}
