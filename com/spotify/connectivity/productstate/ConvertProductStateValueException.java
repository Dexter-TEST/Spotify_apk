package com.spotify.connectivity.productstate.ConvertProductStateValueException;
import java.lang.Exception;
import com.spotify.connectivity.productstate.ConvertProductStateValueException$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;

public final class ConvertProductStateValueException extends Exception	// class@0007d6 from classes.dex
{
    public static final ConvertProductStateValueException$Companion Companion;
    private static final long serialVersionUID;

    static {
       ConvertProductStateValueException.Companion = new ConvertProductStateValueException$Companion(null);
    }
    public void ConvertProductStateValueException(Class p0,String p1){
       co5.o(p0, "targetType");
       co5.o(p1, "value");
       super("Value "+p1+" couldn\'t be converted to target type "+p0.getCanonicalName());
    }
}
