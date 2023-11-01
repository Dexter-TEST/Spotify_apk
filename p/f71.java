package p.f71;
import p.vy6;
import java.lang.String;
import java.lang.System;
import java.lang.Boolean;
import p.e71;
import p.mc1;
import p.vz3;
import p.sn2;
import p.b91;

public abstract class f71	// class@001570 from classes.dex
{
    public static final int a;

    static {
       e71 x;
       String str = "kotlinx.coroutines.main.delay";
       int a = vy6.a;
       try{
          str = System.getProperty(str);
       }catch(java.lang.SecurityException e0){
          str = null;
       }
       boolean b = (str != null)? Boolean.parseBoolean(str): false;
       if (!b) {
          x = e71.x;
       }else {
          tz3 a1 = vz3.a;
          if (!a1 instanceof b91) {
             x = e71.x;
          }else {
          }
       }
    }
}
