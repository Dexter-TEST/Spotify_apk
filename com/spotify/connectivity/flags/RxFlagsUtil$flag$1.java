package com.spotify.connectivity.flags.RxFlagsUtil$flag$1;
import p.yf2;
import com.spotify.connectivity.flags.Flag;
import java.lang.Object;
import com.spotify.connectivity.flags.Flags;
import java.io.Serializable;
import java.lang.String;
import p.co5;

final class RxFlagsUtil$flag$1 implements yf2	// class@00071a from classes.dex
{
    final Flag $flag;

    public void RxFlagsUtil$flag$1(Flag p0){
       this.$flag = p0;
       super();
    }
    public final Serializable apply(Flags p0){
       co5.o(p0, "flags");
       return p0.get(this.$flag);
    }
    public Object apply(Object p0){
       return this.apply(p0);
    }
}
