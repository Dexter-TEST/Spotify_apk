package p.f80;
import p.h80;
import p.i80;
import java.io.ObjectInputStream;
import java.io.InvalidObjectException;
import java.lang.String;
import java.lang.ArrayIndexOutOfBoundsException;
import p.tp2;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.System;

public final class f80 extends h80	// class@001577 from classes.dex
{
    public final int v;
    public final int w;

    public void f80(byte[] p0,int p1,int p2){
       super(p0);
       i80.b(p1, (p1 + p2), p0.length);
       this.v = p1;
       this.w = p2;
    }
    private void readObject(ObjectInputStream p0){
       throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }
    public final byte a(int p0){
       f80 tw = this.w;
       if ((((tw - (p0 + 1)) | p0)) >= 0) {
          return this.t[(this.v + p0)];
       }
       if (p0 < 0) {
          throw new ArrayIndexOutOfBoundsException(tp2.k("Index < 0: ", p0));
       }
       throw new ArrayIndexOutOfBoundsException("Index > length: "+p0+", "+tw);
    }
    public final void g(int p0,byte[] p1){
       System.arraycopy(this.t, (this.v + 0), p1, 0, p0);
    }
    public final byte k(int p0){
       return this.t[(this.v + p0)];
    }
    public final int size(){
       return this.w;
    }
    public final int t(){
       return this.v;
    }
    public Object writeReplace(){
       return new h80(this.p());
    }
}
