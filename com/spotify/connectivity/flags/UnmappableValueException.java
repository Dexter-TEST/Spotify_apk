package com.spotify.connectivity.flags.UnmappableValueException;
import java.lang.Exception;
import com.spotify.connectivity.flags.UnmappableValueException$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.spotify.connectivity.flags.Flag;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import java.lang.Class;

public final class UnmappableValueException extends Exception	// class@00071f from classes.dex
{
    public static final UnmappableValueException$Companion Companion;
    private static final long serialVersionUID;

    static {
       UnmappableValueException.Companion = new UnmappableValueException$Companion(null);
    }
    public void UnmappableValueException(Flag p0,String p1,Throwable p2){
       co5.o(p0, "flag");
       co5.o(p1, "value");
       super(p0.getIdentifier()+" of type "+p0.getType().getName()+" cannot map value \""+p1+'"', p2);
    }
}
