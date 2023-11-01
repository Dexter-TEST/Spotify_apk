package p.ws6;
import p.tu1;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.vs6;
import p.pt6;
import com.spotify.messages.StorageOperationNonAuth;
import p.kg4;
import java.lang.Enum;
import p.t65;
import p.ss6;
import java.util.Map;
import p.q14;
import p.ml1;
import com.google.protobuf.c;
import com.google.protobuf.b;

public final class ws6	// class@002b9b from classes.dex
{
    public final tu1 a;
    public final String b;

    public void ws6(tu1 p0,String p1){
       co5.o(p0, "eventPublisher");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(vs6 p0){
       Map map;
       pt6 opt6 = StorageOperationNonAuth.m();
       opt6.d(this.b);
       opt6.h(kg4.f(p0.a));
       opt6.f(p0.e);
       opt6.i(p0.g);
       opt6.e((long)p0.c);
       opt6.g(p0.b.name());
       if ((p0 = p0.f) != null) {
          t65[] ot65Array = new t65[]{new t65("code", kg4.e(p0.b)),new t65("message", p0.a)};
          map = q14.o0(ot65Array);
       }else {
          map = ml1.a;
       }
       opt6.c(map);
       StorageOperationNonAuth storageOpera = opt6.build();
       co5.l(storageOpera, "ev");
       this.a.a(storageOpera);
       return;
    }
}
