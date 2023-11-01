package p.yn5;
import com.spotify.clientfoundations.cosmos.cosmos.ResolveCallback;
import java.lang.String;
import p.xt5;
import java.lang.Object;
import p.co5;
import java.lang.ref.WeakReference;
import p.ao5;
import java.lang.Throwable;
import java.lang.ref.Reference;
import p.yt5;
import java.lang.Class;
import com.spotify.clientfoundations.cosmos.cosmos.Response;
import p.jl;
import java.lang.RuntimeException;

public final class yn5 implements ResolveCallback	// class@002df2 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void yn5(String p0,xt5 p1){
       this.a = 1;
       co5.o(p0, "id");
       super();
       this.b = p0;
       this.c = new WeakReference(p1);
    }
    public void yn5(yn5 p0,ao5 p1){
       this.a = 0;
       co5.o(p1, "queuingResolveCallback");
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onError(Throwable p0){
       yn5 tc = this.c;
       switch (this.a){
           case 0:
           default:
             co5.o(p0, "throwable");
             ResolveCallback resolveCallb = tc.get();
             yt5.c.getClass();
             if (resolveCallb != null) {
                resolveCallb.onError(p0);
             }
             return;
       }
       co5.o(p0, "throwable");
       tc.c = true;
       tc.a();
       this.b.onError(p0);
       return;
    }
    public final void onResolved(Response p0){
       String str = "response";
       switch (this.a){
           case 0:
           default:
             co5.o(p0, str);
             ResolveCallback resolveCallb = this.c.get();
             try{
                yt5.c.getClass();
                if (resolveCallb != null) {
                   resolveCallb.onResolved(p0);
                }
             }catch(java.lang.Exception e3){
                jl.f("Caught an Exception in ResolveCallback.onResolved", e3);
             }catch(java.lang.OutOfMemoryError e3){
                jl.f("Caught an OutOfMemoryError in ResolveCallback.onResolved", e3);
                throw new RuntimeException("OutOfMemoryError converted to RuntimeException", e3);
             }
             return;
       }
       co5.o(p0, str);
       this.b.onResolved(p0);
       return;
    }
}
