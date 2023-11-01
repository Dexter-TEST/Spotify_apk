package p.ur6;
import java.lang.reflect.Type;
import p.la0;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.app.Application;
import com.squareup.moshi.Moshi;
import android.content.Context;
import com.squareup.moshi.Moshi$a;
import com.spotify.litesignup.phonesignup.callingcode.json.CallingCode$CallingCodeAdapter;

public final class ur6	// class@002909 from classes.dex
{
    public final Context a;
    public final Moshi b;
    public static final ParameterizedType c;

    static {
       Type[] typeArray = new Type[]{la0.class};
       ParameterizedType parameterize = ya7.j(List.class, typeArray);
       co5.l(parameterize, "newParameterizedType\(\n  …ode::class.java\n        \)");
       ur6.c = parameterize;
    }
    public void ur6(Application p0,Moshi p1){
       Moshi moshi;
       co5.o(p0, "context");
       co5.o(p1, "moshi");
       super();
       Context applicationC = p0.getApplicationContext();
       co5.l(applicationC, "context.applicationContext");
       this.a = applicationC;
       moshi = p1.h().b(new CallingCode$CallingCodeAdapter()).d();
       co5.l(moshi, "moshi.newBuilder\(\).add\(C…ingCodeAdapter\(\)\).build\(\)");
       this.b = moshi;
    }
}
