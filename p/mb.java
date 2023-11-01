package p.mb;
import p.ir0;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.io.IOException;
import p.bs2;
import java.lang.String;
import p.jl;
import p.ge6;
import p.t37;
import java.lang.Class;
import com.spotify.base.java.logging.Logger;
import java.lang.StringBuilder;
import p.d25;
import p.kv6;

public final class mb implements ir0	// class@001e65 from classes.dex
{
    public final int a;
    public static final mb b;
    public static final mb c;
    public static final mb t;
    public static final mb v;
    public static final mb w;
    public static final mb x;
    public static final mb y;
    public static final mb z;

    static {
       mb.b = new mb(0);
       mb.c = new mb(1);
       mb.t = new mb(2);
       mb.v = new mb(3);
       mb.w = new mb(5);
       mb.x = new mb(6);
       mb.y = new mb(7);
       mb.z = new mb(8);
    }
    public void mb(int p0){
       this.a = p0;
       super();
    }
    public final void a(Throwable p0){
       Object[] objArray;
       Object[] objArray1;
       Object[] objArray2;
       int i = 1;
       switch (this.a){
           case 0:
             objArray = new Object[0];
             Logger.b("Impossible to setTasteOnboardingCompleted\(true\)", objArray);
             return;
           case 1:
             objArray = new Object[0];
             Logger.b("Impossible to update fav artist", objArray);
             return;
           case 2:
             objArray = new Object[0];
             Logger.b("Impossible to update fav show", objArray);
             return;
           case 3:
             objArray1 = new Object[i];
             objArray1[0] = p0;
             Logger.c(p0, "Error fetching branch partner-id: %s", objArray1);
             return;
           case 4:
             objArray2 = new Object[0];
             Logger.c(p0, "Error sending to Client Opt-In Proxy: "+p0.getMessage(), objArray2);
             return;
           case 5:
             objArray1 = new Object[0];
             Logger.c(p0, "Cannot extract storage status", objArray1);
             return;
           case 6:
             p0.getMessage();
             objArray2 = new Object[i];
             objArray2[0] = p0;
             t37.a().getClass();
             ge6.l(objArray2);
             return;
           case 7:
             objArray2 = new Object[i];
             objArray2[0] = p0;
             t37.a().getClass();
             ge6.e(objArray2);
             return;
           case 8:
             if (!p0 instanceof IOException && (!(v0 = p0 instanceof bs2) && (p0.a == 400 && (!v0 && (p0.a == 417 && (!v0 && p0.a == 503)))))) {
                if (v0) {
                   bs2 a = p0.a;
                   if (500 > a || a >= 505) {
                      i = 0;
                   }
                   if (i) {
                   label_004c :
                      return;
                   }
                }
                jl.f("Failed while trying to follow zero rating telco", p0);
                goto label_004c ;
             }else {
                goto label_004c ;
             }
             break;
           case 10:
             RxJavaPlugins.c(p0);
             return;
           default:
             RxJavaPlugins.c(new d25(p0));
             return;
       }
    }
    public final void accept(Object p0){
       switch (this.a){
           case 0:
             this.a(p0);
             return;
           case 1:
             this.a(p0);
             return;
           case 2:
             this.a(p0);
             return;
           case 3:
             this.a(p0);
             return;
           case 4:
             this.a(p0);
             return;
           case 5:
             this.a(p0);
             return;
           case 6:
             this.a(p0);
             return;
           case 7:
             this.a(p0);
             return;
           case 8:
             this.a(p0);
             return;
           case 9:
             return;
           case 10:
             this.a(p0);
             break;
           case 11:
             p0.a(Long.MAX_VALUE);
             return;
           default:
             this.a(p0);
             return;
       }
    }
    public final String toString(){
       switch (this.a){
           case 9:
           default:
             return super.toString();
       }
       return "EmptyConsumer";
    }
}
