package com.spotify.rcs.model.a;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import com.spotify.rcs.model.Platform$1;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class a extends Enum implements tb3	// class@000bc9 from classes.dex
{
    private final int value;
    private static final a[] $VALUES;
    public static final a a;
    public static final a b;
    public static final a c;
    private static final ub3 internalValueMap;
    public static final a t;
    public static final a v;
    public static final a w;

    static {
       a uoa = new a("UNKNOWN", 0, 0);
       a.a = uoa;
       a uoa1 = new a("ANDROID", 1, 1);
       a.b = uoa1;
       a uoa2 = new a("BACKEND", 2, 2);
       a.c = uoa2;
       a uoa3 = new a("IOS", 3, 3);
       a.t = uoa3;
       a uoa4 = new a("WEB", 4, 4);
       a.v = uoa4;
       a uoa5 = new a("UNRECOGNIZED", 5, -1);
       a.w = uoa5;
       a[] uoaArray = new a[]{uoa,uoa1,uoa2,uoa3,uoa4,uoa5};
       a.$VALUES = uoaArray;
       a.internalValueMap = new Platform$1();
    }
    public void a(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static a a(int p0){
       if (!p0) {
          return a.a;
       }
       if (p0 == 1) {
          return a.b;
       }
       if (p0 == 2) {
          return a.c;
       }
       if (p0 == 3) {
          return a.t;
       }
       if (p0 != 4) {
          return null;
       }
       return a.v;
    }
    public static a valueOf(String p0){
       return Enum.valueOf(a.class, p0);
    }
    public static a[] values(){
       return a.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != a.w) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
