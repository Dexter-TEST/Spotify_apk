package p.i7;
import p.h7;
import java.lang.Object;
import java.io.Serializable;
import p.c7;
import androidx.activity.result.a;
import java.lang.String;
import java.util.HashMap;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.util.concurrent.atomic.AtomicReference;

public final class i7 extends h7	// class@00193f from classes.dex
{
    public final int a;
    public final Serializable b;
    public final c7 c;
    public final Object d;

    public void i7(Object p0,Serializable p1,c7 p2,int p3){
       this.a = p3;
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void a(Object p0){
       i7 oi7;
       Integer integer;
       a e;
       h7 oh7;
       String str = ". You must ensure the ActivityResultLauncher is registered before calling launch\(\).";
       i7 tc = this.c;
       i7 td = this.d;
       i7 tb = this.b;
       switch (this.a){
           case 0:
             break;
           case 1:
             oi7 = td;
             if ((integer = oi7.c.get(tb)) == null) {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract "+tc+" and input "+p0+str);
             }
             e = oi7.e;
             try{
                e.add(tb);
                td.b(integer.intValue(), tc, p0);
                return;
             }catch(java.lang.Exception e9){
                oi7.e.remove(tb);
                throw e9;
             }
             break;
           default:
             if ((oh7 = tb.get()) == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
             }
             oh7.a(p0);
             return;
       }
       oi7 = td;
       if ((integer = oi7.c.get(tb)) == null) {
          throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract "+tc+" and input "+p0+str);
       }
       e = oi7.e;
       try{
          e.add(tb);
          td.b(integer.intValue(), tc, p0);
          return;
       }catch(java.lang.Exception e9){
          oi7.e.remove(tb);
          throw e9;
       }
    }
    public final void b(){
       h7 andSet;
       i7 td = this.d;
       i7 tb = this.b;
       switch (this.a){
           case 0:
             td.f(tb);
             return;
           case 1:
             td.f(tb);
             return;
           default:
             if ((andSet = tb.getAndSet(null)) != null) {
                andSet.b();
             }
             return;
       }
    }
}
