package p.dc3;
import p.b3;
import android.content.Context;
import p.bj;
import java.lang.String;
import java.lang.Object;
import android.os.Bundle;
import p.sz1;
import p.me7;

public final class dc3	// class@00131e from classes.dex
{
    public final bj a;
    public static final b3 b;

    static {
       dc3.b = new b3(6, 0);
    }
    public void dc3(Context p0){
       super();
       this.a = new bj(p0, null);
    }
    public void dc3(Context p0,String p1){
       super();
       this.a = new bj(p0, p1);
    }
    public final void a(Bundle p0,String p1){
       if (me7.a()) {
          this.a.b(p1, p0);
       }
       return;
    }
}
