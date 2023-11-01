package p.c25;
import java.lang.String;
import java.lang.Object;
import java.util.Set;
import p.co5;
import android.content.Context;
import p.sz1;
import p.ej4;
import p.ap5;
import android.content.Intent;
import java.lang.Boolean;

public abstract class c25	// class@001183 from classes.dex
{
    public static final Set a;

    static {
       String[] stringArray = new String[]{"fb_mobile_purchase","StartTrial","Subscribe"};
       c25.a = co5.I(stringArray);
    }
    public static final boolean a(){
       boolean b = false;
       boolean i = (!sz1.f(sz1.a()) && !ej4.X())? 1: 0;
       if (i) {
          if (ap5.F == null) {
             i = (ap5.p(sz1.a()) != null)? true: false;
             ap5.F = Boolean.valueOf(i);
          }
          Boolean f = ((f = ap5.F) == null)? 0: f.booleanValue();
          if (f) {
             b = true;
          }
       }
       return b;
    }
}
