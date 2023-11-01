package p.rg7;
import p.pk;
import java.lang.Object;
import p.sg7;
import java.lang.Class;
import java.lang.String;
import p.wh6;
import java.lang.Package;
import java.lang.ClassLoader;
import java.lang.reflect.Method;
import java.lang.System;
import android.os.Parcel;
import android.os.Parcelable;
import p.tg7;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;
import android.util.SparseIntArray;

public abstract class rg7	// class@0024e4 from classes.dex
{
    public final pk a;
    public final pk b;
    public final pk c;

    public void rg7(pk p0,pk p1,pk p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public abstract sg7 a();
    public final Class b(Class p0){
       Class orDefault;
       rg7 tc = this.c;
       if ((orDefault = tc.getOrDefault(p0.getName(), null)) == null) {
          Object[] objArray = new Object[]{p0.getPackage().getName(),p0.getSimpleName()};
          orDefault = Class.forName(String.format("%s.%sParcelizer", objArray), 0, p0.getClassLoader());
          tc.put(p0.getName(), orDefault);
       }
       return orDefault;
    }
    public final Method c(String p0){
       Method orDefault;
       rg7 ta = this.a;
       if ((orDefault = ta.getOrDefault(p0, null)) == null) {
          System.currentTimeMillis();
          Class[] uClassArray = new Class[true];
          uClassArray[0] = rg7.class;
          orDefault = Class.forName(p0, true, rg7.class.getClassLoader()).getDeclaredMethod("read", uClassArray);
          ta.put(p0, orDefault);
       }
       return orDefault;
    }
    public final Method d(Class p0){
       Method orDefault;
       rg7 tb = this.b;
       if ((orDefault = tb.getOrDefault(p0.getName(), null)) == null) {
          System.currentTimeMillis();
          Class[] uClassArray = new Class[]{p0,rg7.class};
          orDefault = this.b(p0).getDeclaredMethod("write", uClassArray);
          tb.put(p0.getName(), orDefault);
       }
       return orDefault;
    }
    public abstract boolean e(int p0);
    public final int f(int p0,int p1){
       if (!this.e(p1)) {
          return p0;
       }
       return this.e.readInt();
    }
    public final Parcelable g(Parcelable p0,int p1){
       if (!this.e(p1)) {
          return p0;
       }
       return this.e.readParcelable(sg7.class.getClassLoader());
    }
    public final tg7 h(){
       String str = this.e.readString();
       tg7 otg7 = null;
       if (str == null) {
          return otg7;
       }
       sg7 osg7 = this.a();
       try{
          Object[] objArray = new Object[]{osg7};
          return this.c(str).invoke(otg7, objArray);
       }catch(java.lang.IllegalAccessException e0){
          throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e0);
       }catch(java.lang.reflect.InvocationTargetException e0){
          if (e0.getCause() instanceof RuntimeException) {
             throw e0.getCause();
          }
          throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e0);
       }catch(java.lang.NoSuchMethodException e0){
          throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e0);
       }catch(java.lang.ClassNotFoundException e0){
          throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e0);
       }
    }
    public abstract void i(int p0);
    public final void j(int p0,int p1){
       this.i(p1);
       this.e.writeInt(p0);
    }
    public final void k(Parcelable p0,int p1){
       this.i(p1);
       this.e.writeParcelable(p0, 0);
    }
    public final void l(tg7 p0){
       sg7 i;
       String str = null;
       if (p0 == null) {
          this.e.writeString(str);
          return;
       }else {
          try{
             this.e.writeString(this.b(p0.getClass()).getName());
             sg7 osg7 = this.a();
             try{
                Object[] objArray = new Object[]{p0,osg7};
                this.d(p0.getClass()).invoke(str, objArray);
                if ((i = osg7.i) >= null) {
                   int i1 = osg7.d.get(i);
                   sg7 e = osg7.e;
                   int i2 = e.dataPosition();
                   e.setDataPosition(i1);
                   e.writeInt((i2 - i1));
                   e.setDataPosition(i2);
                }
                return;
             }catch(java.lang.IllegalAccessException e6){
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e6);
             }catch(java.lang.reflect.InvocationTargetException e6){
                if (e6.getCause() instanceof RuntimeException) {
                   throw e6.getCause();
                }else {
                   throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e6);
                }
             }catch(java.lang.NoSuchMethodException e6){
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
             }catch(java.lang.ClassNotFoundException e6){
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e6);
             }
          }catch(java.lang.ClassNotFoundException e0){
             throw new RuntimeException(p0.getClass().getSimpleName().concat(" does not have a Parcelizer"), e0);
          }
       }
    }
}
