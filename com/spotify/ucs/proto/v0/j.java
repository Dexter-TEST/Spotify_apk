package com.spotify.ucs.proto.v0.j;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class j extends Enum	// class@000c4e from classes.dex
{
    private final int value;
    private static final j[] $VALUES;
    public static final j a;
    public static final j b;
    public static final j c;

    static {
       j oj = new j("RESOLVE_SUCCESS", 0, 1);
       j.a = oj;
       j oj1 = new j("RESOLVE_ERROR", 1, 2);
       j.b = oj1;
       j oj2 = new j("RESOLVERESULT_NOT_SET", 2, 0);
       j.c = oj2;
       j[] ojArray = new j[]{oj,oj1,oj2};
       j.$VALUES = ojArray;
    }
    public void j(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static j valueOf(String p0){
       return Enum.valueOf(j.class, p0);
    }
    public static j[] values(){
       return j.$VALUES.clone();
    }
}
