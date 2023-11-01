package p.jf1;
import p.b5;
import p.lf1;
import java.lang.Object;
import java.lang.String;
import java.io.FileInputStream;
import android.content.Context;
import p.co5;
import java.io.InputStream;
import p.ej4;
import java.util.Map;
import java.io.Closeable;
import java.lang.Throwable;
import p.eb3;
import p.hs3;

public final class jf1 implements b5	// class@001ac3 from classes.dex
{
    public final int a;
    public final lf1 b;

    public void jf1(lf1 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       switch (this.a){
           case 0:
           default:
             this.b.b.a("Dropped events file init content synchronized");
             return;
       }
       FileInputStream uFileInputSt = this.b.a.openFileInput("ESDrop");
       co5.l(uFileInputSt, "input");
       eb3.d(uFileInputSt, null);
       jf1 tb = this.b;
       lf1 d = tb.d;
       _monitor_enter(d);
       lf1.a(tb, tb.f, lf1.b(this.b, ej4.D0(uFileInputSt)));
       _monitor_exit(d);
       return;
    }
}
