package com.spotify.connectivity.productstate.ProductStateFlags$SHUFFLE_RESTRICTED$1;
import com.spotify.connectivity.flags.BooleanFlag;
import com.spotify.connectivity.productstateflags.ProductStateSource;
import com.spotify.connectivity.flags.Overridable;
import java.lang.String;
import com.spotify.connectivity.flags.Source;
import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Object;
import p.co5;
import com.spotify.connectivity.productstate.ProductStateFlags;

public final class ProductStateFlags$SHUFFLE_RESTRICTED$1 extends BooleanFlag	// class@0007d8 from classes.dex
{

    public void ProductStateFlags$SHUFFLE_RESTRICTED$1(ProductStateSource p0,Overridable p1){
       super("shuffle_restricted", p0, p1);
    }
    public Serializable mapValue(String p0){
       return this.mapValue(p0);
    }
    public Boolean mapValue(String p0){
       co5.o(p0, "value");
       return Boolean.valueOf(ProductStateFlags.isShuffleRestricted(p0));
    }
}
