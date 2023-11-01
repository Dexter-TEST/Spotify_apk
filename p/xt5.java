package p.xt5;
import com.spotify.clientfoundations.cosmos.cosmos.ResolveCallback;
import p.yt5;
import p.fw5;
import java.lang.String;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import p.co5;
import p.iz7;
import java.lang.Runnable;
import android.os.Handler;
import p.ir0;
import java.lang.RuntimeException;
import p.iw1;
import com.spotify.clientfoundations.cosmos.cosmos.Response;
import p.az5;
import p.tp2;

public class xt5 implements ResolveCallback	// class@002ce5 from classes.dex
{
    public final fw5 a;
    public final String b;
    public boolean c;
    public final yt5 d;

    public void xt5(yt5 p0,fw5 p1,String p2){
       this.d = p0;
       super();
       this.a = p1;
       this.b = p2;
    }
    public int a(){
       xt5 ta;
       if ((ta = this.a) != null) {
          return ta.b;
       }
       throw new IllegalStateException("Required value was null.".toString());
    }
    public void onError(Throwable p0){
       xt5 ta;
       fw5 a;
       co5.o(p0, "throwable");
       if (this.d.b == null && this.c == null) {
          if ((ta = this.a) != null) {
             if ((a = ta.a) != null) {
                a.post(new iz7(ta, 10, p0));
             }else {
                ta.d.accept(p0);
             }
          }else {
             throw new IllegalStateException("Required value was null.".toString());
          }
       }
       return;
    }
    public void onResolved(Response p0){
       xt5 ta;
       fw5 a;
       xt5 tb = this.b;
       co5.o(p0, "response");
       if (this.d.b == null && this.c == null) {
          try{
             az5.q(p0, tb);
             if ((ta = this.a) != null) {
                if ((a = ta.a) != null) {
                   a.post(new iz7(ta, p0, 9));
                }else {
                   ta.c.accept(p0);
                }
             }else {
                throw new IllegalStateException("Required value was null.".toString());
             }
          }catch(java.lang.Exception e6){
             this.onError(new RuntimeException(tp2.m("onResolved\(", tb, "\) failed."), e6));
          }
       }
       return;
    }
}
