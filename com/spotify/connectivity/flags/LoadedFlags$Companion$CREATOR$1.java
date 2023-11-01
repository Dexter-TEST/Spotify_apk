package com.spotify.connectivity.flags.LoadedFlags$Companion$CREATOR$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.spotify.connectivity.flags.LoadedFlags;
import java.lang.String;
import p.co5;
import android.util.SparseIntArray;
import java.lang.Class;
import java.lang.ClassLoader;
import android.util.SparseArray;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LoadedFlags$Companion$CREATOR$1 implements Parcelable$Creator	// class@00070e from classes.dex
{

    public void LoadedFlags$Companion$CREATOR$1(){
       super();
    }
    public LoadedFlags createFromParcel(Parcel p0){
       int i;
       SparseIntArray sparseIntArr;
       LoadedFlags p0;
       co5.o(p0, "in");
       if ((i = p0.readInt()) < 0) {
          sparseIntArr = null;
       }else {
          SparseIntArray sparseIntArr1 = new SparseIntArray(i);
          while (i > 0) {
             sparseIntArr1.append(p0.readInt(), p0.readInt());
             i = i - 1;
          }
          sparseIntArr = sparseIntArr1;
       }
       sparseIntArr.getClass();
       p0 = new LoadedFlags(sparseIntArr, p0.createStringArray(), p0.readSparseArray(LoadedFlags$Companion$CREATOR$1.class.getClassLoader()), new SparseArray(), null);
       return p0;
    }
    public Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public LoadedFlags[] newArray(int p0){
       LoadedFlags[] loadedFlagsA = new LoadedFlags[p0];
       return loadedFlagsA;
    }
    public Object[] newArray(int p0){
       return this.newArray(p0);
    }
}
