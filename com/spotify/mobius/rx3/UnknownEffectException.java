package com.spotify.mobius.rx3.UnknownEffectException;
import java.lang.RuntimeException;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;

public class UnknownEffectException extends RuntimeException	// class@000a96 from classes.dex
{
    public final Object a;

    public void UnknownEffectException(Object p0){
       p0.getClass();
       super(p0.toString());
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof UnknownEffectException) {
          return false;
       }
       return this.a.equals(p0.a);
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
}
