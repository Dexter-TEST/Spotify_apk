package com.spotify.connectivity.product_state.esperanto.proto.a;
import p.yf2;
import java.lang.Object;
import com.spotify.connectivity.product_state.esperanto.proto.DelOverridesValuesResponse;
import com.spotify.connectivity.product_state.esperanto.proto.ProductStateService;
import com.spotify.connectivity.product_state.esperanto.proto.PutOverridesValuesResponse;
import com.spotify.connectivity.product_state.esperanto.proto.PutValuesResponse;
import com.spotify.connectivity.product_state.esperanto.proto.GetValuesResponse;
import com.spotify.connectivity.product_state.esperanto.proto.ProductStateClientImpl;

public final class a implements yf2	// class@0007d3 from classes.dex
{
    public final int a;

    public void a(int p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       switch (this.a){
           case 0:
             return ProductStateClientImpl.c(p0);
           case 1:
             return ProductStateClientImpl.a(p0);
           case 2:
             return ProductStateClientImpl.e(p0);
           case 3:
             return ProductStateClientImpl.b(p0);
           case 4:
             return ProductStateClientImpl.d(p0);
           case 5:
             return ProductStateService.b(p0);
           case 6:
             return ProductStateService.d(p0);
           case 7:
             return ProductStateService.a(p0);
           case 8:
             return ProductStateService.e(p0);
           default:
             return ProductStateService.c(p0);
       }
    }
}
