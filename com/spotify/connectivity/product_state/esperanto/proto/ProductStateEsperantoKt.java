package com.spotify.connectivity.product_state.esperanto.proto.ProductStateEsperantoKt;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;
import com.spotify.connectivity.product_state.esperanto.proto.ProductStateClient;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.product_state.esperanto.proto.ProductStateClientImpl;

public final class ProductStateEsperantoKt	// class@0007ba from classes.dex
{

    public static final ProductStateClient createProductStateClient(Transport p0){
       co5.o(p0, "transport");
       return new ProductStateClientImpl(p0);
    }
}
