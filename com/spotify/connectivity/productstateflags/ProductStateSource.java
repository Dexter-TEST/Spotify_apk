package com.spotify.connectivity.productstateflags.ProductStateSource;
import com.spotify.connectivity.flags.Source;
import com.spotify.connectivity.productstateflags.ProductStateSource$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.String;
import java.lang.Object;
import p.co5;

public final class ProductStateSource extends Source	// class@000807 from classes.dex
{
    public static final ProductStateSource$Companion Companion;
    public static final String TYPE;

    static {
       ProductStateSource.Companion = new ProductStateSource$Companion(null);
    }
    public void ProductStateSource(String p0){
       co5.o(p0, "productStateKey");
       super("product-state", p0);
    }
}
