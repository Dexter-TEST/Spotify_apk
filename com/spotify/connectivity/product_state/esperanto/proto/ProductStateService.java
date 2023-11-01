package com.spotify.connectivity.product_state.esperanto.proto.ProductStateService;
import com.spotify.clientfoundations.esperanto.esperanto.ServiceBase;
import java.lang.Object;
import com.spotify.connectivity.product_state.esperanto.proto.PutOverridesValuesResponse;
import com.spotify.connectivity.product_state.esperanto.proto.GetValuesResponse;
import com.google.protobuf.a;
import com.spotify.connectivity.product_state.esperanto.proto.PutValuesResponse;
import com.spotify.connectivity.product_state.esperanto.proto.DelOverridesValuesResponse;
import com.spotify.connectivity.product_state.esperanto.proto.DelOverridesValuesRequest;
import io.reactivex.rxjava3.core.Single;
import com.spotify.connectivity.product_state.esperanto.proto.GetValuesRequest;
import com.spotify.connectivity.product_state.esperanto.proto.PutOverridesValuesRequest;
import com.spotify.connectivity.product_state.esperanto.proto.PutValuesRequest;
import com.spotify.connectivity.product_state.esperanto.proto.SubValuesRequest;
import io.reactivex.rxjava3.core.Observable;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.product_state.esperanto.proto.a;
import p.yf2;
import java.lang.RuntimeException;
import p.kg4;
import java.lang.StringBuilder;
import p.en6;

public abstract class ProductStateService implements ServiceBase	// class@0007bc from classes.dex
{
    private final String name;

    public void ProductStateService(){
       super();
       this.name = "spotify.product_state.esperanto.proto.ProductState";
    }
    public static byte[] a(PutOverridesValuesResponse p0){
       return ProductStateService.callSingle$lambda-3(p0);
    }
    public static byte[] b(GetValuesResponse p0){
       return ProductStateService.callSingle$lambda-1(p0);
    }
    public static byte[] c(GetValuesResponse p0){
       return ProductStateService.callStream$lambda-0(p0);
    }
    private static final byte[] callSingle$lambda-1(GetValuesResponse p0){
       return p0.toByteArray();
    }
    private static final byte[] callSingle$lambda-2(PutValuesResponse p0){
       return p0.toByteArray();
    }
    private static final byte[] callSingle$lambda-3(PutOverridesValuesResponse p0){
       return p0.toByteArray();
    }
    private static final byte[] callSingle$lambda-4(DelOverridesValuesResponse p0){
       return p0.toByteArray();
    }
    private static final byte[] callStream$lambda-0(GetValuesResponse p0){
       return p0.toByteArray();
    }
    public static byte[] d(PutValuesResponse p0){
       return ProductStateService.callSingle$lambda-2(p0);
    }
    public static byte[] e(DelOverridesValuesResponse p0){
       return ProductStateService.callSingle$lambda-4(p0);
    }
    public abstract Single DelOverridesValues(DelOverridesValuesRequest p0);
    public abstract Single GetValues(GetValuesRequest p0);
    public abstract Single PutOverridesValues(PutOverridesValuesRequest p0);
    public abstract Single PutValues(PutValuesRequest p0);
    public abstract Observable SubValues(SubValuesRequest p0);
    public Single callSingle(String p0,String p1,byte[] p2){
       Single single;
       co5.o(p0, "service");
       co5.o(p1, "method");
       co5.o(p2, "payload");
       if (!co5.c(p0, this.getName())) {
          throw new RuntimeException(en6.t("Attempted to access mismatched [", p0, "], but this service is [")+this.getName()+']');
       }
       String str = "request_msg";
       if (co5.c(p1, "GetValues")) {
          GetValuesRequest getValuesReq = GetValuesRequest.parseFrom(p2);
          co5.l(getValuesReq, str);
          single = this.GetValues(getValuesReq).map(new a(5));
          co5.l(single, "GetValues\(request_msg\).m…it.toByteArray\(\)\n      }\)");
          return single;
       }else if(co5.c(p1, "PutValues")){
          PutValuesRequest putValuesReq = PutValuesRequest.parseFrom(p2);
          co5.l(putValuesReq, str);
          single = this.PutValues(putValuesReq).map(new a(6));
          co5.l(single, "PutValues\(request_msg\).m…it.toByteArray\(\)\n      }\)");
          return single;
       }else if(co5.c(p1, "PutOverridesValues")){
          PutOverridesValuesRequest putOverrides = PutOverridesValuesRequest.parseFrom(p2);
          co5.l(putOverrides, str);
          single = this.PutOverridesValues(putOverrides).map(new a(7));
          co5.l(single, "PutOverridesValues\(reque…it.toByteArray\(\)\n      }\)");
          return single;
       }else if(co5.c(p1, "DelOverridesValues")){
          DelOverridesValuesRequest uDelOverride = DelOverridesValuesRequest.parseFrom(p2);
          co5.l(uDelOverride, str);
          single = this.DelOverridesValues(uDelOverride).map(new a(8));
          co5.l(single, "DelOverridesValues\(reque…it.toByteArray\(\)\n      }\)");
          return single;
       }else {
          throw new RuntimeException(kg4.m("Attempted to access unknown method. [", p0, ':', p1, ']'));
       }
    }
    public Observable callStream(String p0,String p1,byte[] p2){
       co5.o(p0, "service");
       co5.o(p1, "method");
       co5.o(p2, "payload");
       if (!co5.c(p0, this.getName())) {
          throw new RuntimeException(en6.t("Attempted to access mismatched [", p0, "], but this service is [")+this.getName()+']');
       }
       if (!co5.c(p1, "SubValues")) {
          throw new RuntimeException(kg4.m("Attempted to access unknown method. [", p0, ':', p1, ']'));
       }
       SubValuesRequest subValuesReq = SubValuesRequest.parseFrom(p2);
       co5.l(subValuesReq, "request_msg");
       Observable observable = this.SubValues(subValuesReq).map(new a(9));
       co5.l(observable, "SubValues\(request_msg\).m…it.toByteArray\(\)\n      }\)");
       return observable;
    }
    public byte[] callSync(String p0,String p1,byte[] p2){
       co5.o(p0, "service");
       co5.o(p1, "method");
       co5.o(p2, "payload");
       if (!co5.c(p0, this.getName())) {
          throw new RuntimeException(en6.t("Attempted to access mismatched [", p0, "], but this service is [")+this.getName()+']');
       }
       throw new RuntimeException(kg4.m("Attempted to access unknown method. [", p0, ':', p1, ']'));
    }
    public String getName(){
       return this.name;
    }
}
