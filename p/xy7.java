package p.xy7;
import p.jd;
import java.lang.String;
import p.dx7;
import p.hy7;
import p.iy7;
import java.lang.Object;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import p.dy7;
import p.uy7;
import java.lang.Integer;
import p.wy7;

public final class xy7	// class@002d14 from classes.dex
{
    public final dx7 a;
    public final hy7 b;
    public final iy7 c;
    public final HashMap d;
    public final ReentrantLock e;
    public static final jd f;

    static {
       xy7.f = new jd("ExtractorSessionStoreView");
    }
    public void xy7(dx7 p0,hy7 p1,iy7 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = new HashMap();
       this.e = new ReentrantLock();
    }
    public static String d(Bundle p0){
       ArrayList stringArrayL;
       if ((stringArrayL = p0.getStringArrayList("pack_names")) != null && !stringArrayL.isEmpty()) {
          return stringArrayL.get(0);
       }
       throw new dy7("Session without pack received.");
    }
    public final void a(){
       this.e.unlock();
    }
    public final uy7 b(int p0){
       uy7 ouy7;
       Integer integer = Integer.valueOf(p0);
       if ((ouy7 = this.d.get(integer)) != null) {
          return ouy7;
       }
       Object[] objArray = new Object[]{integer};
       throw new dy7(String.format("Could not find session %d while trying to get it", objArray), p0);
    }
    public final Object c(wy7 p0){
       xy7 te = this.e;
       te.lock();
       te.unlock();
       return p0.c();
    }
}
