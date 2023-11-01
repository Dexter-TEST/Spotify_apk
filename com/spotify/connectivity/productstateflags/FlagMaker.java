package com.spotify.connectivity.productstateflags.FlagMaker;
import java.lang.Object;
import java.lang.String;
import com.spotify.connectivity.flags.Overridable;
import com.spotify.connectivity.flags.BooleanFlag;
import p.co5;
import com.spotify.connectivity.productstateflags.ProductStateSource;
import com.spotify.connectivity.flags.Source;
import com.spotify.connectivity.flags.IntegerFlag;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.spotify.connectivity.flags.StringFlag;

public final class FlagMaker	// class@000803 from classes.dex
{
    public static final FlagMaker INSTANCE;

    static {
       FlagMaker.INSTANCE = new FlagMaker();
    }
    private void FlagMaker(){
       super();
    }
    public final BooleanFlag makeBooleanProductStateFlag(String p0,Overridable p1){
       co5.o(p0, "identifier");
       co5.o(p1, "overridable");
       return new BooleanFlag(p0, new ProductStateSource(p0), p1);
    }
    public final IntegerFlag makeIntegerProductStateFlag(String p0,Overridable p1){
       co5.o(p0, "identifier");
       co5.o(p1, "overridable");
       IntegerFlag v0 = new IntegerFlag(p0, new ProductStateSource(p0), p1, 0, 8, null);
       return v0;
    }
    public final StringFlag makeStringProductStateFlag(String p0,Overridable p1){
       co5.o(p0, "identifier");
       co5.o(p1, "overridable");
       return new StringFlag(p0, new ProductStateSource(p0), p1);
    }
}
