package p.p13;
import p.r13;
import p.q13;
import android.os.Bundle;
import java.lang.String;
import p.zt2;
import java.lang.Object;
import p.co5;
import p.a23;
import java.lang.Class;
import p.au2;
import p.o13;
import android.os.Parcelable;
import java.util.ArrayList;
import android.os.BaseBundle;
import java.io.Serializable;

public final class p13 extends r13	// class@0021cf from classes.dex
{
    public final Bundle a;

    public void p13(q13 p0){
       super();
       this.a = new Bundle(p0.a);
    }
    public final zt2 b(String p0,boolean p1){
       co5.o(p0, "key");
       this.a.putBoolean(p0, p1);
       return this;
    }
    public final zt2 c(String p0,boolean[] p1){
       co5.o(p0, "key");
       this.a.putBooleanArray(p0, p1);
       return this;
    }
    public final a23 d(){
       a23.b.getClass();
       return new a23(new Bundle(this.a));
    }
    public final zt2 e(String p0,au2 p1){
       co5.o(p0, "key");
       a23.b.getClass();
       this.a.putParcelable(p0, o13.b(p1));
       return this;
    }
    public final zt2 f(String p0,au2[] p1){
       ArrayList uArrayList;
       int len;
       int i1;
       a23[] uoa23Array;
       co5.o(p0, "key");
       int i = 0;
       if (p1 != null && p1 instanceof a23[]) {
          uArrayList = new ArrayList(p1.length);
          len = p1.length;
          for (i1 = 0; i1 < len; i1 = i1 + 1) {
             object oobject = p1[i1];
             co5.j(oobject, "null cannot be cast to non-null type com.spotify.hubs.model.immutable.HubsImmutableComponentBundle");
             uArrayList.add(oobject);
          }
          uoa23Array = new a23[i];
          uoa23Array = uArrayList.toArray(uoa23Array);
       }else if(p1 != null){
          uArrayList = new ArrayList(p1.length);
          len = p1.length;
          for (i1 = 0; i1 < len; i1 = i1 + 1) {
             a23.b.getClass();
             uArrayList.add(o13.b(p1[i1]));
          }
          uoa23Array = new a23[i];
          uoa23Array = uArrayList.toArray(uoa23Array);
       }else {
          Parcelable[] parcelableAr = null;
       }
       this.a.putParcelableArray(p0, uoa23Array);
       return this;
    }
    public final zt2 g(String p0,byte[] p1){
       co5.o(p0, "key");
       this.a.putByteArray(p0, p1);
       return this;
    }
    public final zt2 h(String p0,double[] p1){
       co5.o(p0, "key");
       this.a.putDoubleArray(p0, p1);
       return this;
    }
    public final zt2 i(String p0,double p1){
       co5.o(p0, "key");
       this.a.putDouble(p0, p1);
       return this;
    }
    public final zt2 j(String p0,float[] p1){
       co5.o(p0, "key");
       this.a.putFloatArray(p0, p1);
       return this;
    }
    public final zt2 k(String p0,float p1){
       co5.o(p0, "key");
       this.a.putFloat(p0, p1);
       return this;
    }
    public final zt2 l(int p0,String p1){
       co5.o(p1, "key");
       this.a.putInt(p1, p0);
       return this;
    }
    public final zt2 m(String p0,int[] p1){
       co5.o(p0, "key");
       this.a.putIntArray(p0, p1);
       return this;
    }
    public final zt2 n(String p0,long[] p1){
       co5.o(p0, "key");
       this.a.putLongArray(p0, p1);
       return this;
    }
    public final zt2 o(String p0,long p1){
       co5.o(p0, "key");
       this.a.putLong(p0, p1);
       return this;
    }
    public final zt2 p(Parcelable p0,String p1){
       co5.o(p1, "key");
       this.a.putParcelable(p1, p0);
       return this;
    }
    public final zt2 q(String p0,Serializable p1){
       co5.o(p0, "key");
       this.a.putSerializable(p0, p1);
       return this;
    }
    public final zt2 r(String p0,String p1){
       co5.o(p0, "key");
       this.a.putString(p0, p1);
       return this;
    }
    public final p13 s(String p0,String[] p1){
       co5.o(p0, "key");
       this.a.putStringArray(p0, p1);
       return this;
    }
    public final boolean t(){
       return this.a.isEmpty();
    }
}
