package com.spotify.ucs.proto.v0.h;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class h extends Enum	// class@000c4c from classes.dex
{
    private final int value;
    private static final h[] $VALUES;
    public static final h a;
    public static final h b;
    public static final h c;

    static {
       h oh = new h("ACCOUNT_ATTRIBUTES_SUCCESS", 0, 3);
       h.a = oh;
       h oh1 = new h("ACCOUNT_ATTRIBUTES_ERROR", 1, 4);
       h.b = oh1;
       h oh2 = new h("ACCOUNTATTRIBUTESRESULT_NOT_SET", 2, 0);
       h.c = oh2;
       h[] ohArray = new h[]{oh,oh1,oh2};
       h.$VALUES = ohArray;
    }
    public void h(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static h valueOf(String p0){
       return Enum.valueOf(h.class, p0);
    }
    public static h[] values(){
       return h.$VALUES.clone();
    }
}
