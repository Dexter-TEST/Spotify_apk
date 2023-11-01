package com.spotify.connectivity.productstate.BooleanProductStateValueConverter;
import java.lang.Object;
import java.lang.String;
import p.te5;
import java.lang.Boolean;
import p.co5;
import p.av6;
import com.spotify.connectivity.productstate.ConvertProductStateValueException;
import java.lang.Class;

public final class BooleanProductStateValueConverter	// class@0007d4 from classes.dex
{
    public static final BooleanProductStateValueConverter INSTANCE;

    static {
       BooleanProductStateValueConverter.INSTANCE = new BooleanProductStateValueConverter();
    }
    private void BooleanProductStateValueConverter(){
       super();
    }
    public static final boolean convert(String p0){
       boolean b = false;
       if (te5.a(p0)) {
          co5.l(Boolean.FALSE, "FALSE");
       }else if(!av6.i0(p0, "true", true) && !co5.c("1", p0)){
          if (!av6.i0(p0, "false", true) && !co5.c("0", p0)) {
             co5.i(p0);
             throw new ConvertProductStateValueException(Boolean.class, p0);
          }else {
             co5.l(Boolean.FALSE, "FALSE");
          }
       }else {
          co5.l(Boolean.TRUE, "TRUE");
          b = true;
       }
       return b;
    }
    public static final boolean convert(String p0,boolean p1){
       if (te5.a(p0)) {
       }else if(!av6.i0(p0, "true", true) && !co5.c("1", p0)){
          if (av6.i0(p0, "false", true) || co5.c("0", p0)) {
             co5.l(Boolean.FALSE, "FALSE");
             p1 = false;
          }
       }else {
          co5.l(Boolean.TRUE, "TRUE");
          p1 = true;
       }
       return p1;
    }
}
