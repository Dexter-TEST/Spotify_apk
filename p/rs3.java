package p.rs3;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.oo0;
import p.vc;
import java.lang.String;
import p.co5;
import p.su1;
import p.zu1;
import p.wy6;
import p.pp3;
import p.xc;
import p.uc;
import p.h32;
import p.bj5;
import p.g32;
import com.spotify.connectivity.product_state.esperanto.proto.ProductStateClient;
import com.spotify.connectivity.productstateesperanto.ProductStateMethodsImpl;
import p.i16;
import com.spotify.clientfoundations.esperanto.esperantocosmos.CosmosTransport;
import p.pi5;
import com.spotify.clientfoundations.esperanto.esperantocosmos.EsperantoRxRouter;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;
import com.spotify.connectivity.product_state.esperanto.proto.ProductStateEsperantoKt;
import com.spotify.connectivity.productstateesperanto.ProductStateMethods;
import p.el5;
import p.kk3;
import p.mk3;
import p.b05;
import p.bs1;
import p.wo0;
import p.xr1;
import p.t46;
import com.spotify.cosmos.cosmonaut.Cosmonaut;
import p.xb6;
import java.lang.Class;
import p.rp0;
import p.zg0;
import p.qs3;
import p.pr3;
import p.rr3;

public final class rs3 implements a02	// class@00254b from classes.dex
{
    public final int a;
    public final tm5 b;

    public void rs3(tm5 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object get(){
       Cosmonaut uCosmonaut;
       i16 oi16;
       ProductStateClient productState;
       oo0 ooo0;
       String str = "cosmonaut";
       boolean b = false;
       String str1 = "rxRouter";
       rs3 tb = this.b;
       switch (this.a){
           case 0:
             return new qs3(tb.get());
           case 1:
             uCosmonaut = tb.get();
             co5.o(uCosmonaut, str);
             rp0 orp0 = uCosmonaut.createCosmosService(rp0.class);
             co5.n(orp0);
             return orp0;
           case 2:
             uCosmonaut = tb.get();
             co5.o(uCosmonaut, str);
             xb6 oxb6 = uCosmonaut.createCosmosService(xb6.class);
             co5.n(oxb6);
             return oxb6;
           case 3:
             oi16 = tb.get();
             co5.o(oi16, str1);
             return new t46(new CosmosTransport(new pi5(oi16, 4)));
           case 4:
             oi16 = tb.get();
             co5.o(oi16, str1);
             return new wo0(new CosmosTransport(new pi5(oi16, 5)));
           case 5:
             oi16 = tb.get();
             co5.o(oi16, str1);
             return new kk3(new CosmosTransport(new pi5(oi16, 6)));
           case 6:
             oi16 = tb.get();
             co5.o(oi16, str1);
             return new b05(new CosmosTransport(new pi5(oi16, 7)));
           case 7:
             return new xr1(tb.get());
           case 8:
             return new bs1(tb.get());
           case 9:
             return new mk3(tb.get());
           case 10:
             return new el5(tb.get());
           case 11:
             oi16 = tb.get();
             co5.o(oi16, str1);
             productState = ProductStateEsperantoKt.createProductStateClient(new CosmosTransport(new pi5(oi16, 8)));
             co5.n(productState);
             return productState;
           case 12:
             productState = tb.get();
             co5.o(productState, "productStateClient");
             return new ProductStateMethodsImpl(productState);
           case 13:
             h32 oh32 = tb.get();
             co5.o(oh32, "filefactoryProvider");
             return new bj5(oh32.a("android-preload-status-impl"));
           case 14:
             ooo0 = tb.get();
             co5.o(ooo0, "configProvider");
             return new uc(b, ooo0);
           case 15:
             ooo0 = tb.get();
             co5.o(ooo0, "configProvider");
             return new xc(ooo0);
           case 16:
             Object obj = tb.get();
             co5.o(obj, "configProvider");
             pp3 v0 = new pp3(false, false, 336, 0x7530, false, false, obj);
             return v0;
           case 17:
             ooo0 = tb.get();
             co5.o(ooo0, "configProvider");
             return new wy6(b, ooo0);
           case 18:
             su1 osu1 = tb.get();
             co5.o(osu1, "eventPublisher");
             return new zu1(osu1);
           case 19:
             ooo0 = tb.get();
             co5.o(ooo0, "configProvider");
             return new vc(b, ooo0);
           default:
             return new rr3(tb.get());
       }
    }
}
