package p.qi5;
import p.a02;
import java.lang.Object;
import p.tm5;
import p.fv1;
import p.i16;
import java.lang.Class;
import java.lang.String;
import p.co5;
import com.spotify.clientfoundations.esperanto.esperantocosmos.CosmosTransport;
import p.pi5;
import com.spotify.clientfoundations.esperanto.esperantocosmos.EsperantoRxRouter;
import p.rs6;
import p.oi5;
import p.v84;
import p.ht0;

public final class qi5 implements a02	// class@0023ab from classes.dex
{
    public final int a;
    public final tm5 b;
    public final Object c;

    public void qi5(Object p0,tm5 p1,int p2){
       this.a = p2;
       this.c = p0;
       this.b = p1;
       super();
    }
    public final Object get(){
       i16 oi16;
       String str = "rxRouter";
       qi5 tb = this.b;
       qi5 tc = this.c;
       switch (this.a){
           case 0:
             oi16 = tb.get();
             tc.getClass();
             co5.o(oi16, str);
             return new oi5(new CosmosTransport(new pi5(oi16, 0)));
           case 1:
             oi16 = tb.get();
             tc.getClass();
             co5.o(oi16, str);
             return new rs6(new CosmosTransport(new pi5(oi16, 1)));
           default:
             oi16 = tb.get();
             tc.getClass();
             co5.o(oi16, str);
             return new ht0(new CosmosTransport(new pi5(oi16, 2)));
       }
    }
}
