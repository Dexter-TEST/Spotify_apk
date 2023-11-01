package p.ad4;
import com.spotify.cosmos.cosmonaut.Converter;
import p.bd4;
import java.lang.Object;
import java.lang.reflect.Type;
import java.lang.String;
import p.co5;
import p.e70;
import p.f70;
import com.squareup.moshi.i;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import p.oe0;
import java.nio.charset.Charset;

public final class ad4 implements Converter	// class@000f5f from classes.dex
{
    public final int a;
    public final bd4 b;

    public void ad4(bd4 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final boolean canHandle(Type p0){
       switch (this.a){
           case 0:
           default:
             co5.o(p0, "type");
             return true;
       }
       co5.o(p0, "type");
       return true;
    }
    public final Object convert(Type p0,Object p1){
       ad4 tb = this.b;
       String str = "type";
       switch (this.a){
           case 0:
           default:
             co5.o(p0, str);
             co5.i(p1);
             return tb.a.d(p0).fromJson(new String(p1, oe0.a));
       }
       co5.o(p0, str);
       e70 uoe70 = new e70();
       tb.a.d(p0).toJson(i.n0(uoe70), p1);
       return uoe70.D();
    }
}
