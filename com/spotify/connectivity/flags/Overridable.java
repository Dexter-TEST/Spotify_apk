package com.spotify.connectivity.flags.Overridable;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Overridable extends Enum	// class@000716 from classes.dex
{
    private static final Overridable[] $VALUES;
    public static final Overridable ALWAYS;
    public static final Overridable DEBUG;
    public static final Overridable INTERNAL;
    public static final Overridable NEVER;

    private static final Overridable[] $values(){
       Overridable[] overridableA = new Overridable[]{Overridable.NEVER,Overridable.DEBUG,Overridable.INTERNAL,Overridable.ALWAYS};
       return overridableA;
    }
    static {
       Overridable.NEVER = new Overridable("NEVER", 0);
       Overridable.DEBUG = new Overridable("DEBUG", 1);
       Overridable.INTERNAL = new Overridable("INTERNAL", 2);
       Overridable.ALWAYS = new Overridable("ALWAYS", 3);
       Overridable.$VALUES = Overridable.$values();
    }
    private void Overridable(String p0,int p1){
       super(p0, p1);
    }
    public static Overridable valueOf(String p0){
       return Enum.valueOf(Overridable.class, p0);
    }
    public static Overridable[] values(){
       return Overridable.$VALUES.clone();
    }
}
