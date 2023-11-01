package com.spotify.connectivity.flags.LoadedFlags$Builder;
import java.lang.Object;
import android.util.SparseIntArray;
import java.util.HashMap;
import android.util.SparseArray;
import com.spotify.connectivity.flags.LoadedFlags;
import p.co5;
import java.util.Map;
import java.lang.String;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Number;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.spotify.connectivity.flags.Flag;
import java.io.Serializable;
import java.lang.Integer;
import com.spotify.connectivity.flags.ReadCallback;
import java.lang.ref.WeakReference;

public final class LoadedFlags$Builder	// class@00070d from classes.dex
{
    private SparseIntArray flagHashToValueIndex;
    private int nextIndex;
    private SparseArray overrides;
    private SparseArray readCallbacks;
    private Map valueToValueIndex;

    public void LoadedFlags$Builder(){
       super();
       this.flagHashToValueIndex = new SparseIntArray();
       this.valueToValueIndex = new HashMap(100);
       this.overrides = new SparseArray();
       this.readCallbacks = new SparseArray();
    }
    public final LoadedFlags build(){
       LoadedFlags$Builder tvalueToValu = this.valueToValueIndex;
       co5.i(tvalueToValu);
       String[] stringArray = new String[tvalueToValu.size()];
       tvalueToValu = this.valueToValueIndex;
       co5.i(tvalueToValu);
       Iterator iterator = tvalueToValu.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          stringArray[uEntry.getValue().intValue()] = key;
       }
       LoadedFlags iterator1 = new LoadedFlags(this.flagHashToValueIndex, stringArray, this.overrides, this.readCallbacks, null);
       this.flagHashToValueIndex = null;
       this.valueToValueIndex = null;
       this.overrides = null;
       this.readCallbacks = null;
       return iterator;
    }
    public final LoadedFlags$Builder override(Flag p0,Serializable p1){
       co5.o(p0, "flag");
       co5.o(p1, "value");
       LoadedFlags$Builder toverrides = this.overrides;
       co5.i(toverrides);
       toverrides.put(p0.getHash(), p1);
       return this;
    }
    public final LoadedFlags$Builder set(Flag p0,String p1){
       Integer integer;
       co5.o(p0, "flag");
       if (p1 != null) {
          LoadedFlags$Builder tvalueToValu = this.valueToValueIndex;
          co5.i(tvalueToValu);
          if ((integer = tvalueToValu.get(p1)) == null) {
             integer = Integer.valueOf(this.nextIndex);
             this.nextIndex = this.nextIndex + 1;
             LoadedFlags$Builder tvalueToValu1 = this.valueToValueIndex;
             co5.i(tvalueToValu1);
             tvalueToValu1.put(p1, integer);
          }
          LoadedFlags$Builder tflagHashToV = this.flagHashToValueIndex;
          co5.i(tflagHashToV);
          tflagHashToV.put(p0.getHash(), integer.intValue());
       }
       return this;
    }
    public final LoadedFlags$Builder setReadCallback(Flag p0,ReadCallback p1){
       co5.o(p0, "flag");
       co5.o(p1, "readCallback");
       LoadedFlags$Builder treadCallbac = this.readCallbacks;
       co5.i(treadCallbac);
       treadCallbac.put(p0.getHash(), new WeakReference(p1));
       return this;
    }
}
