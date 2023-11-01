package com.spotify.connectivity.flags.RxFlagsUtil;
import java.lang.Object;
import io.reactivex.rxjava3.core.Flowable;
import com.spotify.connectivity.flags.Flag;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.flags.RxFlagsUtil$flag$1;
import p.r82;
import p.yf2;
import p.i72;

public final class RxFlagsUtil	// class@00071b from classes.dex
{
    public static final RxFlagsUtil INSTANCE;

    static {
       RxFlagsUtil.INSTANCE = new RxFlagsUtil();
    }
    private void RxFlagsUtil(){
       super();
    }
    public final Flowable flag(Flowable p0,Flag p1){
       co5.o(p0, "flagsIn");
       co5.o(p1, "flag");
       return new r82(p0, new RxFlagsUtil$flag$1(p1), 0).g();
    }
}
