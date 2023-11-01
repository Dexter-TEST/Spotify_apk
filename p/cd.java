package p.cd;
import p.hs3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.Throwable;
import android.util.Log;

public final class cd implements hs3	// class@0011ea from classes.dex
{

    public void cd(){
       super();
    }
    public final void a(String p0){
       co5.o(p0, "message");
    }
    public final void b(String p0,Object[] p1){
       this.a(String.format(p0, p1));
    }
    public final void c(String p0,Throwable p1){
       co5.o(p1, "e");
       co5.o(p0, "message");
       Log.e("EventSender", p0, p1);
    }
    public final void d(String p0){
    }
}
