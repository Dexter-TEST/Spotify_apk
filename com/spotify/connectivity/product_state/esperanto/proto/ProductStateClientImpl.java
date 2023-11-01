package com.spotify.connectivity.product_state.esperanto.proto.ProductStateClientImpl;
import com.spotify.connectivity.product_state.esperanto.proto.ProductStateClient;
import com.spotify.clientfoundations.esperanto.esperanto.ClientBase;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.product_state.esperanto.proto.DelOverridesValuesResponse;
import java.util.Base64$Encoder;
import p.p3;
import java.lang.RuntimeException;
import p.tp2;
import java.lang.Throwable;
import com.spotify.connectivity.product_state.esperanto.proto.GetValuesResponse;
import com.spotify.connectivity.product_state.esperanto.proto.PutOverridesValuesResponse;
import com.spotify.connectivity.product_state.esperanto.proto.PutValuesResponse;
import com.spotify.connectivity.product_state.esperanto.proto.DelOverridesValuesRequest;
import io.reactivex.rxjava3.core.Single;
import p.s74;
import com.spotify.connectivity.product_state.esperanto.proto.a;
import p.yf2;
import com.spotify.connectivity.product_state.esperanto.proto.GetValuesRequest;
import com.spotify.connectivity.product_state.esperanto.proto.PutOverridesValuesRequest;
import com.spotify.connectivity.product_state.esperanto.proto.PutValuesRequest;
import com.spotify.connectivity.product_state.esperanto.proto.SubValuesRequest;
import io.reactivex.rxjava3.core.Observable;

final class ProductStateClientImpl extends ClientBase implements ProductStateClient	// class@0007b7 from classes.dex
{
    private final Transport transport;

    public void ProductStateClientImpl(Transport p0){
       co5.o(p0, "transport");
       super(p0);
       this.transport = p0;
    }
    private static final DelOverridesValuesResponse DelOverridesValues$lambda-4(byte[] p0){
       DelOverridesValuesResponse uDelOverride;
       try{
          uDelOverride = DelOverridesValuesResponse.parseFrom(p0);
          return uDelOverride;
       }catch(java.lang.Exception e0){
          throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.connectivity.product_state.esperanto.proto.DelOverridesValuesResponse: \'", p3.n(p3.o(), uDelOverride), "\' \(Base64\)"), e0);
       }
    }
    private static final GetValuesResponse GetValues$lambda-1(byte[] p0){
       GetValuesResponse getValuesRes;
       try{
          getValuesRes = GetValuesResponse.parseFrom(p0);
          return getValuesRes;
       }catch(java.lang.Exception e0){
          throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.connectivity.product_state.esperanto.proto.GetValuesResponse: \'", p3.n(p3.o(), getValuesRes), "\' \(Base64\)"), e0);
       }
    }
    private static final PutOverridesValuesResponse PutOverridesValues$lambda-3(byte[] p0){
       PutOverridesValuesResponse putOverrides;
       try{
          putOverrides = PutOverridesValuesResponse.parseFrom(p0);
          return putOverrides;
       }catch(java.lang.Exception e0){
          throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.connectivity.product_state.esperanto.proto.PutOverridesValuesResponse: \'", p3.n(p3.o(), putOverrides), "\' \(Base64\)"), e0);
       }
    }
    private static final PutValuesResponse PutValues$lambda-2(byte[] p0){
       PutValuesResponse putValuesRes;
       try{
          putValuesRes = PutValuesResponse.parseFrom(p0);
          return putValuesRes;
       }catch(java.lang.Exception e0){
          throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.connectivity.product_state.esperanto.proto.PutValuesResponse: \'", p3.n(p3.o(), putValuesRes), "\' \(Base64\)"), e0);
       }
    }
    private static final GetValuesResponse SubValues$lambda-0(byte[] p0){
       GetValuesResponse getValuesRes;
       try{
          getValuesRes = GetValuesResponse.parseFrom(p0);
          return getValuesRes;
       }catch(java.lang.Exception e0){
          throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.connectivity.product_state.esperanto.proto.GetValuesResponse: \'", p3.n(p3.o(), getValuesRes), "\' \(Base64\)"), e0);
       }
    }
    public static DelOverridesValuesResponse a(byte[] p0){
       return ProductStateClientImpl.DelOverridesValues$lambda-4(p0);
    }
    public static PutOverridesValuesResponse b(byte[] p0){
       return ProductStateClientImpl.PutOverridesValues$lambda-3(p0);
    }
    public static GetValuesResponse c(byte[] p0){
       return ProductStateClientImpl.GetValues$lambda-1(p0);
    }
    public static GetValuesResponse d(byte[] p0){
       return ProductStateClientImpl.SubValues$lambda-0(p0);
    }
    public static PutValuesResponse e(byte[] p0){
       return ProductStateClientImpl.PutValues$lambda-2(p0);
    }
    public Single DelOverridesValues(DelOverridesValuesRequest p0){
       co5.o(p0, "request");
       Single single = this.callSingle("spotify.product_state.esperanto.proto.ProductState", "DelOverridesValues", p0).map(new a(1));
       co5.l(single, "callSingle\(\"spotify.prod…     }\n                }\)");
       return single;
    }
    public Single GetValues(GetValuesRequest p0){
       co5.o(p0, "request");
       Single single = this.callSingle("spotify.product_state.esperanto.proto.ProductState", "GetValues", p0).map(new a(0));
       co5.l(single, "callSingle\(\"spotify.prod…     }\n                }\)");
       return single;
    }
    public Single PutOverridesValues(PutOverridesValuesRequest p0){
       co5.o(p0, "request");
       Single single = this.callSingle("spotify.product_state.esperanto.proto.ProductState", "PutOverridesValues", p0).map(new a(3));
       co5.l(single, "callSingle\(\"spotify.prod…     }\n                }\)");
       return single;
    }
    public Single PutValues(PutValuesRequest p0){
       co5.o(p0, "request");
       Single single = this.callSingle("spotify.product_state.esperanto.proto.ProductState", "PutValues", p0).map(new a(2));
       co5.l(single, "callSingle\(\"spotify.prod…     }\n                }\)");
       return single;
    }
    public Observable SubValues(SubValuesRequest p0){
       co5.o(p0, "request");
       Observable observable = this.callStream("spotify.product_state.esperanto.proto.ProductState", "SubValues", p0).map(new a(4));
       co5.l(observable, "callStream\(\"spotify.prod…     }\n                }\)");
       return observable;
    }
}
