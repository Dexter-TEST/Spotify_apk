package p.il5;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import p.hl5;
import java.lang.Class;
import java.lang.Object;
import p.r82;
import p.yf2;
import p.i16;
import com.spotify.connectivity.product_state.esperanto.proto.ProductStateClient;
import com.spotify.clientfoundations.esperanto.esperantocosmos.CosmosTransport;
import java.util.Objects;
import p.gl5;
import com.spotify.clientfoundations.esperanto.esperantocosmos.EsperantoRxRouter;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;
import com.spotify.connectivity.product_state.esperanto.proto.ProductStateEsperantoKt;
import com.spotify.connectivity.productstateesperanto.ProductStateMethods;
import com.spotify.connectivity.productstateesperanto.ProductStateMethodsImpl;
import com.spotify.connectivity.productstate.RxProductState;
import com.spotify.connectivity.productstateesperanto.RxProductStateImpl;

public abstract class il5	// class@0019b9 from classes.dex
{

    public static Observable a(Flowable p0){
       p0.getClass();
       return new r82(p0, new hl5(0), 0).x();
    }
    public static ProductStateClient b(i16 p0){
       Objects.requireNonNull(p0);
       return ProductStateEsperantoKt.createProductStateClient(new CosmosTransport(new gl5(p0)));
    }
    public static ProductStateMethods c(ProductStateClient p0){
       return new ProductStateMethodsImpl(p0);
    }
    public static RxProductState d(Observable p0){
       return new RxProductStateImpl(p0);
    }
}
