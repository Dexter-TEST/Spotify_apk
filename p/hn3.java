package p.hn3;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.content.Intent;
import p.aq6;
import p.td7;
import java.lang.StringBuilder;
import p.jl;
import java.lang.Enum;
import p.xj0;

public final class hn3	// class@001886 from classes.dex
{
    public final Context a;

    public void hn3(Context p0){
       co5.o(p0, "context");
       super();
       this.a = p0;
    }
    public final Intent a(String p0){
       int i;
       co5.o(p0, "uri");
       aq6 uoaq6 = td7.d(p0);
       Intent intent = null;
       if (uoaq6 == null) {
          jl.d("Request had a bad URI, \""+p0+'"');
          return intent;
       }else if((i = uoaq6.b.ordinal()) != 1 && (i != 64 && (i != 75 && (i != 3 && (i != 4 && (i != 5 && (i != 51 && i != 52))))))){
          switch (i){
              case 8:
              case 10:
              case 9:
                break;
              default:
                jl.d("Request had an unsupported URI, \""+uoaq6+'"');
          }
          return intent;
       }
       intent = xj0.s(this.a, td7.a(p0));
    }
}
