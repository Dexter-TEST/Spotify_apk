package p.b1;
import p.rt2;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import p.tt2;
import p.cu2;
import p.c1;
import java.lang.Class;
import p.au2;
import java.lang.String;
import p.zs2;
import p.an5;
import p.xl;

public final class b1 implements rt2	// class@001038 from classes.dex
{
    public final int b;
    public final Fragment c;

    public void b1(Fragment p0,int p1){
       this.b = p1;
       this.c = p0;
       super();
    }
    public final void a(tt2 p0,cu2 p1){
       String str;
       b1 tc = this.c;
       switch (this.b){
           case 0:
             tc.getClass();
             str = p0.b().q("uri");
             tc.z.a(str);
             if (str != null) {
                tc.x.onNext(str);
             }
             break;
           default:
             tc.getClass();
             str = p0.b().q("uri");
             tc.B.a(str);
             if (str != null) {
                tc.w.onNext(str);
             }
             return;
       }
       return;
    }
}
