package p.dd4;
import p.su0;
import p.u54;
import java.lang.String;
import p.gg1;
import com.squareup.moshi.JsonAdapter;
import java.lang.Object;
import p.e70;
import p.f70;
import com.squareup.moshi.i;
import p.j80;
import p.co5;
import p.dv5;

public final class dd4 implements su0	// class@0001b4 from classes2.dex
{
    public final JsonAdapter a;
    public static final u54 b;

    static {
       dd4.b = gg1.C("application/json; charset=UTF-8");
    }
    public void dd4(JsonAdapter p0){
       super();
       this.a = p0;
    }
    public final Object a(Object p0){
       e70 uoe70 = new e70();
       this.a.toJson(i.n0(uoe70), p0);
       p0 = uoe70.m0();
       co5.o(p0, "content");
       return new dv5(dd4.b, p0, 1);
    }
}
