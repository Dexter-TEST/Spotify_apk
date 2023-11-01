package p.ko0;
import p.xs6;
import p.za3;
import java.lang.Object;
import p.w97;
import java.lang.Integer;
import p.ju1;
import java.lang.String;
import p.d22;
import p.bx5;
import p.cx5;
import p.dr0;
import p.mp2;
import p.fx5;
import p.co5;
import p.ge6;
import p.t37;
import java.lang.Class;
import java.lang.Enum;
import p.iu1;
import java.lang.Throwable;
import java.lang.Long;
import p.qb7;
import p.bw5;
import java.net.SocketTimeoutException;
import p.ku1;
import p.et0;
import java.lang.StringBuilder;
import p.en6;

public final class ko0	// class@001c4e from classes.dex
{
    public final xs6 a;
    public final ku1 b;
    public final w97 c;

    public void ko0(xs6 p0,za3 p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = new w97(null, null, null);
    }
    public final void a(long p0,d22 p1,bx5 p2){
       String str1;
       String str2;
       bx5 uobx5 = p2;
       ju1 oju1 = dr0.e(uobx5.a.t);
       bx5 a = uobx5.a;
       String str = a.w.a("grpc-message");
       int i = 1;
       if (str == null) {
          if ((uobx5 = uobx5.c) == null || ((str1 = uobx5.J()) == null || !((co5.c(str1, "") ^ i)))) {
             str1 = null;
          }
          if (str1 == null) {
             str = a.c;
             co5.l(str, "message\(\)");
          }else {
             str2 = str1;
          label_0039 :
             Object[] objArray = new Object[]{Integer.valueOf(a.t),str2};
             t37.a().getClass();
             ge6.l(objArray);
             iu1 v12 = new iu1(oju1, str2, oju1, str2, 232);
             this.b.c(p1.name(), p0, v12, a.t);
             return;
          }
       }
       str2 = str;
       goto label_0039 ;
    }
    public final void b(long p0,d22 p1,bx5 p2){
       bx5 uobx5;
       String str1;
       cx5 c;
       cx5 t = (uobx5 = p2)? uobx5.a.t: -1;
       ju1 oju1 = dr0.e(t);
       co5.o(uobx5, "<this>");
       bx5 a = uobx5.a;
       String str = a.w.a("grpc-message");
       int i = 1;
       if (str == null) {
          if ((uobx5 = uobx5.c) == null || ((str1 = uobx5.J()) == null || !((co5.c(str1, "") ^ i)))) {
             c = 0;
          }
          if ((str = str1) == null) {
             c = a.c;
             co5.l(c, "message\(\)");
          label_0041 :
             Object[] objArray = new Object[]{Integer.valueOf(a.t),c};
             t37.a().getClass();
             ge6.l(objArray);
             iu1 v12 = new iu1(oju1, c, null, null, 252);
             this.b.c(p1.name(), p0, v12, a.t);
             return;
          }
       }
       c = str;
       goto label_0041 ;
    }
    public final void c(Throwable p0,d22 p1,long p2){
       iu1 v0;
       StringBuilder message;
       co5.o(p0, "error");
       co5.o(p1, "fetchType");
       Object[] objArray = new Object[]{Long.valueOf(p2)};
       t37.a().getClass();
       ge6.m(objArray);
       if (p0 instanceof qb7) {
          this.b(p2, p1, p0.a);
       }else if(p0 instanceof bw5){
          this.a(p2, p1, p0.a);
       }else {
          ko0 tb = this.b;
          if (!p0 instanceof SocketTimeoutException && !co5.c(p0.getMessage(), "timeout")) {
             if (p0.getMessage() != null) {
                v0 = new iu1(ju1.t, p0.getMessage(), null, null, 252);
                et0.k(tb, p1.name(), p2, v0);
             }else if((message = p0.getMessage()) == null){
                message = "unknown error message";
             }
             message = en6.s(message, " - ");
             String message1 = ((p0 = p0.getCause()) != null)? p0.getMessage(): null;
             v0 = new iu1(ju1.b, message+message1, null, null, 252);
             et0.k(tb, p1.name(), p2, p1);
          }else {
             v0 = new iu1(ju1.c, p0.getMessage(), null, null, 252);
             et0.k(tb, p1.name(), p2, v0);
          }
       }
       return;
    }
}
