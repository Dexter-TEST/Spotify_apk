package com.spotify.connectivity.flags.Flags$Util;
import java.lang.Object;
import com.spotify.connectivity.flags.Flag;
import com.spotify.connectivity.flags.Flags;
import java.lang.String;
import p.co5;

public final class Flags$Util	// class@000709 from classes.dex
{
    public static final Flags$Util INSTANCE;

    static {
       Flags$Util.INSTANCE = new Flags$Util();
    }
    private void Flags$Util(){
       super();
    }
    public final boolean hasChangedValue(Flag p0,Flags p1,Flags p2){
       co5.o(p0, "flag");
       co5.o(p2, "newFlags");
       boolean b = (p1 != null && !p1.isSame(p2, p0))? true: false;
       return b;
    }
}
