package p.xo;
import p.ir0;
import p.zo;
import p.d22;
import java.lang.Object;
import p.bx5;
import java.lang.String;
import p.co5;
import java.lang.Class;
import java.lang.System;
import java.util.concurrent.atomic.AtomicLong;
import p.ge6;
import p.t37;
import java.lang.Long;
import p.cx5;
import java.lang.Integer;
import com.spotify.ucs.proto.v0.UcsResponseWrapper;
import p.rb7;
import com.spotify.ucs.proto.v0.h;
import com.spotify.ucs.proto.v0.j;
import p.ko0;
import com.spotify.ucs.proto.v0.UcsResponseWrapper$UcsResponse;
import com.spotify.rcs.resolver.grpc.v0.ResolveResponse;
import com.spotify.rcs.resolver.grpc.v0.Configuration;
import com.google.protobuf.c;
import com.spotify.ucs.proto.v0.UcsResponseWrapper$AccountAttributesResponse;
import java.util.Map;
import java.util.LinkedHashMap;
import p.xo5;
import p.xs6;
import p.mm2;
import p.lm2;
import p.dr0;
import java.util.Set;
import java.lang.Boolean;
import java.lang.Enum;
import java.lang.StringBuilder;
import p.za3;
import com.spotify.ucs.proto.v0.UcsResponseWrapper$Error;
import p.ju1;
import p.t65;
import p.w97;
import p.iu1;
import java.lang.Throwable;

public final class xo implements ir0	// class@002cbd from classes.dex
{
    public final int a;
    public final zo b;
    public final d22 c;

    public void xo(zo p0,d22 p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void accept(Object p0){
       ResolveResponse resolveRespo;
       String str1;
       UcsResponseWrapper$UcsResponse ucsResponse;
       UcsResponseWrapper$UcsResponse ucsResponse1;
       UcsResponseWrapper$AccountAttributesResponse uAccountAttr;
       Map map;
       boolean b6;
       UcsResponseWrapper$Error uError;
       t65 ot65;
       UcsResponseWrapper$Error uError1;
       UcsResponseWrapper$Error uError2;
       UcsResponseWrapper$Error uError3;
       w97 ow97;
       UcsResponseWrapper$Error uError4;
       UcsResponseWrapper$Error uError5;
       xo oxo = this;
       xo c = oxo.c;
       String str = "it";
       xo b = oxo.b;
       switch (oxo.a){
           case 0:
             break;
           default:
             Object obj1 = p0;
             co5.l(obj1, str);
             b.c.getClass();
             b.g.c(obj1, c, (System.currentTimeMillis() - b.h.get()));
             return;
       }
       UcsResponseWrapper$UcsResponse obj = p0;
       zo g = b.g;
       co5.l(obj, str);
       b.c.getClass();
       long l = System.currentTimeMillis() - b.h.get();
       g.getClass();
       co5.o(c, "fetchType");
       Object[] objArray = new Object[2];
       int i = 0;
       objArray[0] = Long.valueOf(l);
       int i1 = 1;
       objArray[1] = Integer.valueOf(obj.a.t);
       t37.a().getClass();
       ge6.a(objArray);
       objArray = new Object[i1];
       bx5 b1 = obj.b;
       objArray[i] = b1;
       t37.a().getClass();
       ge6.k(objArray);
       if (obj.a() && b1 != null) {
          rb7 b2 = rb7.b;
          h b3 = h.b;
          j b4 = j.b;
          ko0 b5 = g.b;
          Boolean uBoolean = null;
          if (b1.g() != b2) {
             j oj = ((obj = b1.h()) != null)? obj.l(): uBoolean;
             if (oj != b4) {
                h oh = ((obj = b1.h()) != null)? obj.g(): uBoolean;
                if (oh != b3) {
                   Configuration uConfigurati = ((obj = b1.h()) != null && (resolveRespo = obj.m()) != null)? resolveRespo.f(): uBoolean;
                   str = (uConfigurati != null)? uConfigurati.g(): uBoolean;
                   if (str == null) {
                      str = "";
                   }
                   str1 = str;
                   Long longx = ((ucsResponse = b1.h()) != null)? Long.valueOf(ucsResponse.j()): uBoolean;
                   int serializedSi = b1.getSerializedSize();
                   int i2 = ((ucsResponse1 = b1.h()) != null && ((uAccountAttr = ucsResponse1.h()) != null && (map = uAccountAttr.f()) != null))? co5.C(map).size(): -1;
                   if (uConfigurati != null) {
                      if (b6 = co5.c(g.a.b().a(), dr0.c(lm2.b(uConfigurati)).a())) {
                         Object[] objArray1 = new Object[i];
                         t37.a().getClass();
                         ge6.i(objArray1);
                      }
                      uBoolean = Boolean.valueOf(b6);
                   }
                   b5.d(c.name(), l, serializedSi, str1, longx, Integer.valueOf(i2), "unnecessaryFetch="+uBoolean);
                }
             }
          }
          if (b1.g() == b2) {
             ju1 oju1 = ((uError = b1.f()) != null)? dr0.e(uError.getErrorCode()): uBoolean;
             ot65 = new t65(oju1, b1.f().g());
          }else {
             ot65 = new t65(uBoolean, uBoolean);
          }
          t65 ot651 = ot65.a;
          t65 ot652 = ot65.b;
          j oj1 = ((obj = b1.h()) != null)? obj.l(): uBoolean;
          ko0 c1 = g.c;
          if (oj1 == b4) {
             Integer integer = ((uError1 = obj.k()) != null)? Integer.valueOf(uError1.getErrorCode()): uBoolean;
             ju1 oju11 = ((uError2 = obj.k()) != null)? dr0.e(uError2.getErrorCode()): uBoolean;
             str1 = ((uError3 = obj.k()) != null)? uError3.g(): uBoolean;
             ow97 = new w97(integer, oju11, str1);
          }else {
             ow97 = c1;
          }
          w97 ow971 = ow97.a;
          w97 ow972 = ow97.b;
          w97 ow973 = ow97.c;
          h oh1 = (obj != null)? obj.g(): uBoolean;
          if (oh1 == b3) {
             Integer integer1 = ((uError4 = obj.f()) != null)? Integer.valueOf(uError4.getErrorCode()): uBoolean;
             ju1 oju12 = ((uError5 = obj.f()) != null)? dr0.e(uError5.getErrorCode()): uBoolean;
             if ((uError = obj.f()) != null) {
                uBoolean = uError.g();
             }
             c1 = new w97(integer1, oju12, uBoolean);
          }
          iu1 uBoolean1 = new iu1(ot651, ot652, ow972, ow971, ow973, c1.b, c1.a, c1.c);
          b5.c(c.name(), l, uBoolean, b1.f().getErrorCode());
       }else {
          g.b(l, c, obj);
       }
       return;
    }
}
