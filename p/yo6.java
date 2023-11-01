package p.yo6;
import p.r50;
import p.ap6;
import p.t50;
import java.lang.Object;
import org.json.JSONObject;
import p.r8;
import java.util.Iterator;
import java.util.List;
import p.x50;
import java.lang.Class;
import android.content.Context;
import java.util.LinkedList;

public final class yo6 implements r50	// class@002dfc from classes.dex
{
    public final ap6 a;
    public final t50 b;

    public void yo6(ap6 p0,t50 p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(JSONObject p0,r8 p1){
       if (p1 == null) {
          yo6 ta = this.a;
          Iterator iterator = ta.e.iterator();
          while (iterator.hasNext()) {
             ta.d.getClass();
             iterator.next().a(this.b.d);
          }
          ta.e.clear();
       }
       return;
    }
}
