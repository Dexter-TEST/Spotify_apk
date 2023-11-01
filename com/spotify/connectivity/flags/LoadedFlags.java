package com.spotify.connectivity.flags.LoadedFlags;
import com.spotify.connectivity.flags.Flags;
import com.spotify.connectivity.flags.LoadedFlags$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Collections;
import com.spotify.connectivity.flags.LoadedFlags$Companion$CREATOR$1;
import android.util.SparseIntArray;
import java.lang.String;
import android.util.SparseArray;
import java.lang.Object;
import com.spotify.connectivity.flags.Flag;
import java.io.Serializable;
import p.co5;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.AssertionError;
import java.lang.ref.WeakReference;
import java.lang.ref.Reference;
import com.spotify.connectivity.flags.ReadCallback;
import p.ye7;
import android.os.Parcel;

public final class LoadedFlags implements Flags	// class@000710 from classes.dex
{
    private final SparseIntArray flagHashToValueIndex;
    private final SparseArray overridden;
    private final SparseArray readCallbacks;
    private final String[] values;
    public static final Parcelable$Creator CREATOR;
    public static final LoadedFlags$Companion Companion;
    private static final Map internalReadFlags;

    static {
       LoadedFlags.Companion = new LoadedFlags$Companion(null);
       LoadedFlags.internalReadFlags = Collections.synchronizedMap(new LinkedHashMap(64));
       LoadedFlags.CREATOR = new LoadedFlags$Companion$CREATOR$1();
    }
    private void LoadedFlags(SparseIntArray p0,String[] p1,SparseArray p2,SparseArray p3){
       super();
       this.flagHashToValueIndex = p0;
       this.values = p1;
       this.overridden = p2;
       this.readCallbacks = p3;
    }
    public void LoadedFlags(SparseIntArray p0,String[] p1,SparseArray p2,SparseArray p3,DefaultConstructorMarker p4){
       super(p0, p1, p2, p3);
    }
    public static final Map access$getInternalReadFlags$cp(){
       return LoadedFlags.internalReadFlags;
    }
    private final Serializable getInternal(Flag p0){
       Serializable serializable;
       int i;
       LoadedFlags toverridden = this.overridden;
       co5.i(toverridden);
       object oobject = null;
       if ((serializable = toverridden.get(p0.getHash(), oobject)) == null) {
          LoadedFlags tflagHashToV = this.flagHashToValueIndex;
          co5.i(tflagHashToV);
          if ((i = tflagHashToV.get(p0.getHash(), -1)) != -1) {
             LoadedFlags tvalues = this.values;
             co5.i(tvalues);
             oobject = tvalues[i];
          }
       }
       if (serializable == null && oobject == null) {
          throw new IllegalStateException("Value for "+p0.getIdentifier()+" has not been set");
       }else if(serializable == null){
          try{
             if (oobject == null) {
                oobject = "";
             }
             serializable = p0.mapValue(oobject);
          }catch(com.spotify.connectivity.flags.UnmappableValueException e6){
             throw new AssertionError(e6);
          }
       }
       return serializable;
    }
    public static final Map getReadFlags(){
       return LoadedFlags.Companion.getReadFlags();
    }
    public int describeContents(){
       return 0;
    }
    public Serializable get(Flag p0){
       Serializable serializable;
       LoadedFlags tflagHashToV;
       int i;
       WeakReference weakReferenc;
       ReadCallback readCallback;
       Map internalRead;
       LoadedFlags toverridden = this.overridden;
       co5.i(toverridden);
       co5.i(p0);
       object oobject = null;
       if ((serializable = toverridden.get(p0.getHash(), oobject)) == null) {
          tflagHashToV = this.flagHashToValueIndex;
          co5.i(tflagHashToV);
          if ((i = tflagHashToV.get(p0.getHash(), -1)) != -1) {
             LoadedFlags tvalues = this.values;
             co5.i(tvalues);
             oobject = tvalues[i];
          }
       }else {
          internalRead = LoadedFlags.internalReadFlags;
          internalRead.remove(p0.getIdentifier());
          internalRead.put(p0.getIdentifier(), serializable);
       }
       internalRead = (serializable == null && oobject == null)? 0: 1;
       if (i) {
          if (oobject == null) {
             oobject = "";
          }
          if (serializable == null) {
             try{
                serializable = p0.mapValue(oobject);
                tflagHashToV = this.readCallbacks;
                co5.i(tflagHashToV);
                if ((weakReferenc = tflagHashToV.get(p0.getHash())) != null && (readCallback = weakReferenc.get()) != null) {
                   readCallback.onFlagRead(p0, oobject);
                }
                internalRead = LoadedFlags.internalReadFlags;
                internalRead.remove(p0.getIdentifier());
                internalRead.put(p0.getIdentifier(), serializable);
             }catch(com.spotify.connectivity.flags.UnmappableValueException e6){
                throw new AssertionError(e6);
             }
          }
          return serializable;
       }else {
          throw new IllegalStateException(ye7.Y("Value for "+p0.getIdentifier()+" has not been set.\n                Don\'t panic and check if you have registered\n                your FlagProvider in the FeatureFlags class.\n                ").toString());
       }
    }
    public Serializable getNonOverriddenValue(Flag p0){
       int i;
       String str = "flag";
       try{
          co5.o(p0, str);
          LoadedFlags tflagHashToV = this.flagHashToValueIndex;
          co5.i(tflagHashToV);
          if ((i = tflagHashToV.get(p0.getHash(), -1)) == -1) {
             str = null;
          }else {
             LoadedFlags tvalues = this.values;
             co5.i(tvalues);
             object oobject = tvalues[i];
          }
          if (str == null) {
             str = "";
          }
          return p0.mapValue(str);
       }catch(com.spotify.connectivity.flags.UnmappableValueException e4){
          throw new AssertionError(e4);
       }
    }
    public boolean isEnabled(Flag p0){
       co5.o(p0, "flag");
       return p0.isEnabled(this.get(p0));
    }
    public boolean isLoaded(){
       return true;
    }
    public boolean isOverridden(Flag p0){
       co5.o(p0, "flag");
       LoadedFlags toverridden = this.overridden;
       co5.i(toverridden);
       boolean b = (toverridden.get(p0.getHash(), null) != null)? true: false;
       return b;
    }
    public boolean isSame(Flags p0,Flag p1){
       co5.o(p0, "otherFlags");
       co5.o(p1, "flag");
       if (p0 instanceof LoadedFlags) {
          return co5.c(this.getInternal(p1), p0.getInternal(p1));
       }
       return co5.c(this.getInternal(p1), p0.get(p1));
    }
    public void writeToParcel(Parcel p0,int p1){
       LoadedFlags tflagHashToV;
       co5.o(p0, "dest");
       if ((tflagHashToV = this.flagHashToValueIndex) == null) {
          p0.writeInt(-1);
       }else {
          int i = tflagHashToV.size();
          p0.writeInt(i);
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             p0.writeInt(tflagHashToV.keyAt(i1));
             p0.writeInt(tflagHashToV.valueAt(i1));
          }
       }
       p0.writeStringArray(this.values);
       p0.writeSparseArray(this.overridden);
       return;
    }
}
