package p.ap3;
import p.hn3;
import p.gn3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.kk6;
import android.content.Intent;
import p.zg4;
import p.yg4;

public final class ap3	// class@000fc9 from classes.dex
{
    public final hn3 a;
    public final gn3 b;
    public final kk6 c;

    public void ap3(hn3 p0,gn3 p1){
       co5.o(p0, "uriMapper");
       co5.o(p1, "deepLinkLogger");
       super();
       this.a = p0;
       this.b = p1;
       this.c = new kk6();
    }
    public final void a(String p0){
       co5.o(p0, "uri");
       Intent intent = this.a.a(p0);
       ap3 tc = this.c;
       if (intent != null) {
          this.b.a(intent, p0);
          tc.onSuccess(new zg4(intent));
       }else {
          tc.onSuccess(yg4.a);
       }
       return;
    }
}
