package p.s40;
import p.u00;
import p.v40;
import java.lang.Object;
import p.k40;
import java.lang.Throwable;
import java.lang.String;
import p.co5;
import p.eo5;
import p.md;
import java.util.concurrent.ConcurrentHashMap;
import p.a47;
import p.ld;
import p.bx5;
import p.ic;
import java.lang.Class;
import java.lang.System;
import com.spotify.base.java.logging.Logger;
import java.net.SocketTimeoutException;
import p.sg0;
import p.q40;
import java.lang.Integer;
import p.oh5;
import p.cx5;
import p.p40;
import p.en6;
import com.spotify.bootstrap.v1.proto.Bootstrap$BootstrapResponse;
import p.fx5;
import com.spotify.bootstrap.v1.proto.Bootstrap$UcsResponseWrapperV0;
import com.spotify.bootstrap.v1.proto.Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperError;
import com.spotify.bootstrap.v1.proto.Bootstrap$UcsResponseWrapperV0$UcsResponseWrapperSuccess;
import com.spotify.ucs.v0.proto.Ucs$UcsResponseWrapper;
import com.spotify.ucs.v0.proto.Ucs$UcsResponseWrapper$Error;
import p.x40;
import com.spotify.messages.BootstrapRequestNonAuth;
import p.b17;
import java.util.TreeMap;
import com.google.protobuf.c;
import com.google.protobuf.b;
import com.google.protobuf.a;
import p.nc2;

public final class s40 implements u00	// class@0025b4 from classes.dex
{
    public final int a;
    public final v40 b;

    public void s40(v40 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0,Object p1){
       md b1;
       md b2;
       cx5 t;
       String str3;
       md b3;
       cx5 x;
       cx5 t1;
       cx5 t2;
       String str5;
       md b5;
       cx5 c;
       sg0 d;
       byte[] uobyteArray;
       s40 os40 = this;
       String str = "bootstrap-outcome";
       s40 b = os40.b;
       switch (os40.a){
           case 0:
             v40 f = b.f;
             co5.o(f, "timeKeeper");
             if ((b1 = eo5.b) != null) {
                b1.c("bootstrap-feature");
                str = b1.f.get(str);
                f.b(b1.b());
             }
             break;
           default:
             bx5 uobx5 = p0;
             Throwable throwable = p1;
             b.d.getClass();
             long l = System.currentTimeMillis() - b.g;
             Integer integer = null;
             int i = 0;
             String str1 = "error";
             v40 e = b.e;
             String str2 = "bootstrap-network-request";
             v40 a = b.a;
             if (throwable) {
                Object[] objArray = new Object[i];
                Logger.c(throwable, "There was an error when calling the bootstrap service.", objArray);
                if (throwable instanceof SocketTimeoutException) {
                   e.b(l, integer, a.d);
                   if ((b2 = eo5.b) != null) {
                      b2.c(str2);
                      b2.a(str, "timeout");
                   }
                }else if(uobx5){
                   t = uobx5.a.t;
                }else {
                   str3 = -1;
                }
                str3 = str2;
                str2 = str1;
                en6.l(b.e, l, t, -1, "unknown", throwable.getMessage(), a.d);
                if ((b3 = eo5.b) != null) {
                   b3.c(str3);
                   b3.a(str, str2);
                }
             }else {
                String str4 = str1;
                str1 = str2;
                if (uobx5 != null) {
                   bx5 b4 = uobx5.b;
                   bx5 a1 = uobx5.a;
                   int i1 = ((x = a1.x) != null)? (int)x.f(): -1;
                   Object[] objArray1 = new Object[]{Integer.valueOf(t1),Integer.valueOf(i1)};
                   t1 = a1.t;
                   int i2 = 0;
                   Logger.e("Bootstrap responded with code=%d and payload size=%d", objArray1);
                   if (!uobx5.a()) {
                      Object[] objArray2 = new Object[]{Integer.valueOf(t1)};
                      Logger.b("There was an error returned from Bootstrap. code: %d", objArray2);
                      if ((t2 = a1.t) != 504 && t2 != 408) {
                         str5 = "invalid_bootstrap_payload";
                         c = a1.c;
                         String str6 = ((uobx5 = uobx5.c) != null)? uobx5.J(): null;
                         str5 = str1;
                         e.a(l, t2, i1, str5, c, str6, a.d);
                         if ((b5 = eo5.b) != null) {
                            b5.c(str5);
                            b5.a(str, str4);
                         }
                      }else {
                         str5 = str1;
                         e.b(l, Integer.valueOf(t2), a.d);
                         if ((b5 = eo5.b) != null) {
                            b5.c(str5);
                            b5.a(str, "timeout");
                         }
                      }
                   }else {
                      String str7 = str1;
                      if (b4 != null) {
                         c = 1;
                         if (b4.h() == c) {
                            str3 = 1;
                         label_0140 :
                            if (str3 && b4.g().h() != c) {
                               en6.l(b.e, l, a1.t, i1, "invalid_ucs_payload", b4.g().g().g(), a.d);
                               if ((b2 = eo5.b) != null) {
                                  b2.c(str7);
                                  b2.a(str, str4);
                               }
                            }else if(b4 != null){
                               if (b4.h() == true) {
                                  i2 = 1;
                               }
                            }else {
                               c = 1;
                            }
                            if (i2 && (b4.g().h() == 1 && (b4.g().i().h() && b4.g().i().f().i()))) {
                               en6.l(b.e, l, a1.t, i1, "invalid_ucs_payload", b4.g().i().f().g().g(), a.d);
                               if ((b2 = eo5.b) != null) {
                                  b2.c(str7);
                                  b2.a(str, str4);
                               }
                            }else {
                               d = a.d;
                               e.getClass();
                               co5.o(d, "policyInputs");
                               x40 ox40 = BootstrapRequestNonAuth.n();
                               ox40.g(l);
                               ox40.j(t1);
                               ox40.h((long)i1);
                               ox40.f(b17.c());
                               ox40.c(d.b());
                               uobyteArray = ox40.build().toByteArray();
                               co5.l(uobyteArray, "it.toByteArray\(\)");
                               e.a.c("BootstrapRequestNonAuth", uobyteArray);
                               if ((b2 = eo5.b) != null) {
                                  b2.c(str7);
                                  b2.a(str, "success");
                               }
                            }
                         }
                      }else {
                         c = 1;
                      }
                      uobyteArray = 0;
                      goto label_0140 ;
                   }
                }
             }
             return;
       }
       return;
    }
}
