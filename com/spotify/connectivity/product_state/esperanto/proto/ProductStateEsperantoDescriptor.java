package com.spotify.connectivity.product_state.esperanto.proto.ProductStateEsperantoDescriptor;
import com.spotify.connectivity.product_state.esperanto.proto.ProductStateEsperantoDescriptor$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.spotify.clientfoundations.esperanto.esperanto.MethodDescriptor;
import java.lang.String;
import java.lang.Object;

public final class ProductStateEsperantoDescriptor	// class@0007b9 from classes.dex
{
    public static final ProductStateEsperantoDescriptor$Companion Companion;

    static {
       ProductStateEsperantoDescriptor$Companion uCompanion = new ProductStateEsperantoDescriptor$Companion(null);
       ProductStateEsperantoDescriptor.Companion = uCompanion;
       ProductStateEsperantoDescriptor$Companion.access$addMethod(uCompanion, "SubValues", new MethodDescriptor("com.spotify.connectivity.product_state.esperanto.proto.SubValuesRequest", "com.spotify.connectivity.product_state.esperanto.proto.GetValuesResponse", "SubValues"));
       ProductStateEsperantoDescriptor$Companion.access$addMethod(uCompanion, "GetValues", new MethodDescriptor("com.spotify.connectivity.product_state.esperanto.proto.GetValuesRequest", "com.spotify.connectivity.product_state.esperanto.proto.GetValuesResponse", "GetValues"));
       ProductStateEsperantoDescriptor$Companion.access$addMethod(uCompanion, "PutValues", new MethodDescriptor("com.spotify.connectivity.product_state.esperanto.proto.PutValuesRequest", "com.spotify.connectivity.product_state.esperanto.proto.PutValuesResponse", "PutValues"));
       ProductStateEsperantoDescriptor$Companion.access$addMethod(uCompanion, "PutOverridesValues", new MethodDescriptor("com.spotify.connectivity.product_state.esperanto.proto.PutOverridesValuesRequest", "com.spotify.connectivity.product_state.esperanto.proto.PutOverridesValuesResponse", "PutOverridesValues"));
       ProductStateEsperantoDescriptor$Companion.access$addMethod(uCompanion, "DelOverridesValues", new MethodDescriptor("com.spotify.connectivity.product_state.esperanto.proto.DelOverridesValuesRequest", "com.spotify.connectivity.product_state.esperanto.proto.DelOverridesValuesResponse", "DelOverridesValues"));
    }
    public void ProductStateEsperantoDescriptor(){
       super();
    }
    public static String getServiceID(){
       return ProductStateEsperantoDescriptor.Companion.getServiceID();
    }
    public static String getServiceName(){
       return ProductStateEsperantoDescriptor.Companion.getServiceName();
    }
}
