package com.spotify.localfiles.proto.c;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class c extends Enum implements tb3	// class@000989 from classes.dex
{
    public final int a;
    public static final c b;
    public static final c c;
    public static final c t;
    public static final c[] v;

    static {
       c uoc = new c("AVAILABLE", 1, 1);
       c.b = uoc;
       c uoc1 = new c("UNAVAILABLE", 2, 2);
       c.c = uoc1;
       c uoc2 = new c("UNRECOGNIZED", 3, -1);
       c.t = uoc2;
       c[] uocArray = new c[]{new c("UNKNOWN", 0, 0),uoc,uoc1,uoc2};
       c.v = uocArray;
    }
    public void c(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static c valueOf(String p0){
       return Enum.valueOf(c.class, p0);
    }
    public static c[] values(){
       return c.v.clone();
    }
    public final int getNumber(){
       if (this != c.t) {
          return this.a;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
