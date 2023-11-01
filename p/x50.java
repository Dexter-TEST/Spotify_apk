package p.x50;
import java.lang.String;
import p.en6;
import java.lang.Object;
import java.util.HashMap;
import org.json.JSONObject;
import java.util.ArrayList;
import android.content.Context;
import p.t50;
import p.jb6;
import p.ib6;

public final class x50	// class@002c0c from classes.dex
{
    public final String a;
    public final boolean b;
    public final HashMap c;
    public final JSONObject d;
    public final JSONObject e;
    public final ArrayList f;

    public void x50(){
       String str = en6.h(15);
       super();
       this.c = new HashMap();
       this.d = new JSONObject();
       this.e = new JSONObject();
       this.a = str;
       int[] ointArray = en6._values();
       int len = ointArray.length;
       boolean b = false;
       int i = 0;
       while (i < len) {
          if (str.equals(en6.h(ointArray[i]))) {
             b = true;
             break ;
          }else {
             i = i + 1;
          }
       }
       this.b = b;
       this.f = new ArrayList();
       return;
    }
    public final void a(Context p0){
       int i = (this.b != null)? 13: 14;
       if (t50.i() != null) {
          t50.i().k(new jb6(this, p0, i));
       }
       return;
    }
}
