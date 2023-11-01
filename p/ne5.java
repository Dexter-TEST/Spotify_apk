package p.ne5;
import p.me5;
import java.lang.String;
import p.rn6;
import android.content.Context;
import p.tn6;
import p.l32;
import java.lang.Object;
import java.io.File;
import p.j80;
import p.ir2;

public final class ne5 implements me5	// class@001fc1 from classes.dex
{
    public final Context a;
    public final tn6 b;
    public final l32 c;
    public static final rn6 d;

    static {
       ne5.d = rn6.a("PINNED_KEYS");
    }
    public void ne5(Context p0,tn6 p1,l32 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final File a(String p0){
       return new File(new File(this.a.getFilesDir(), "pinned"), ir2.t(p0).c("MD5").e());
    }
}
