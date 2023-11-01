package com.spotify.connectivity.flags.Flag;
import com.spotify.connectivity.flags.Flag$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import java.lang.Class;
import java.lang.String;
import com.spotify.connectivity.flags.Source;
import com.spotify.connectivity.flags.Overridable;
import java.lang.Object;
import p.co5;
import java.util.Map;
import java.lang.Integer;
import java.lang.AssertionError;
import java.io.Serializable;
import java.lang.Enum;

public abstract class Flag	// class@000707 from classes.dex
{
    private final String defaultValue;
    private final int hash;
    private final String identifier;
    private final Overridable overridable;
    private final Source source;
    private final Class type;
    public static final Flag$Companion Companion;
    private static final Map flagIdentifiers;
    private static final Set identifierSet;

    static {
       Flag.Companion = new Flag$Companion(null);
       Flag.flagIdentifiers = new HashMap(64);
       Flag.identifierSet = Collections.synchronizedSet(new HashSet());
    }
    public void Flag(Class p0,String p1,Source p2,Overridable p3,String p4){
       co5.o(p0, "type");
       co5.o(p1, "identifier");
       co5.o(p2, "source");
       co5.o(p3, "overridable");
       co5.o(p4, "defaultValue");
       super();
       Map flagIdentifi = Flag.flagIdentifiers;
       if (flagIdentifi.containsKey(p1)) {
          throw new AssertionError("There can be only one feature flag instance with identifier ".concat(p1));
       }
       flagIdentifi.put(p1, this);
       int i = this.generateHashCode(p1);
       this.hash = i;
       if (!Flag.identifierSet.add(Integer.valueOf(i))) {
          throw new AssertionError("There can be only one feature flag instance with the same hashcode identifier ".concat(p1));
       }
       this.type = p0;
       this.source = p2;
       this.identifier = p1;
       this.overridable = p3;
       this.defaultValue = p4;
       return;
    }
    public static final Map access$getFlagIdentifiers$cp(){
       return Flag.flagIdentifiers;
    }
    public static final Set access$getIdentifierSet$cp(){
       return Flag.identifierSet;
    }
    private final int generateHashCode(String p0){
       int i = p0.length();
       int i1 = 0;
       if (i > 0) {
          int i2 = 0;
          for (; i1 < i; i1 = i1 + 1) {
             i2 = i2 * 31;
             i2 = i2 + p0.charAt(i1);
          }
          i1 = i2;
       }
       return i1;
    }
    public static final Flag getFlagForIdentifier(String p0){
       return Flag.Companion.getFlagForIdentifier(p0);
    }
    public static final void resetFlagIdentifiers(){
       Flag.Companion.resetFlagIdentifiers();
    }
    public final String getDefaultValue(){
       return this.defaultValue;
    }
    public abstract Serializable getDisabledValue();
    public abstract Serializable getEnabledValue();
    public final int getHash(){
       return this.hash;
    }
    public final String getIdentifier(){
       return this.identifier;
    }
    public final Source getSource(){
       return this.source;
    }
    public final Class getType(){
       return this.type;
    }
    public abstract boolean isEnabled(Serializable p0);
    public final boolean isOverridableAt(Overridable p0){
       co5.o(p0, "level");
       boolean b = (this.overridable.compareTo(p0) >= 0)? true: false;
       return b;
    }
    public abstract Serializable mapValue(String p0);
}
