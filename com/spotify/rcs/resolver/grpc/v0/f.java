package com.spotify.rcs.resolver.grpc.v0.f;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class f extends Enum	// class@000bda from classes.dex
{
    private final int value;
    private static final f[] $VALUES;
    public static final f a;
    public static final f b;
    public static final f c;
    public static final f t;

    static {
       f uof = new f("BOOL_VALUE", 0, 3);
       f.a = uof;
       f uof1 = new f("INT_VALUE", 1, 4);
       f.b = uof1;
       f uof2 = new f("ENUM_VALUE", 2, 5);
       f.c = uof2;
       f uof3 = new f("STRUCTUREDVALUE_NOT_SET", 3, 0);
       f.t = uof3;
       f[] uofArray = new f[]{uof,uof1,uof2,uof3};
       f.$VALUES = uofArray;
    }
    public void f(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static f valueOf(String p0){
       return Enum.valueOf(f.class, p0);
    }
    public static f[] values(){
       return f.$VALUES.clone();
    }
}
