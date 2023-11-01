package com.spotify.connectivity.flags.NoFlags;
import com.spotify.connectivity.flags.Flags;
import com.spotify.connectivity.flags.NoFlags$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.spotify.connectivity.flags.NoFlags$Companion$CREATOR$1;
import java.lang.String;
import java.lang.Object;
import p.co5;
import com.spotify.connectivity.flags.Flag;
import java.io.Serializable;
import java.lang.UnsupportedOperationException;
import java.lang.StringBuilder;
import android.os.Parcel;

public final class NoFlags implements Flags	// class@000714 from classes.dex
{
    private final String situation;
    public static final Parcelable$Creator CREATOR;
    public static final NoFlags$Companion Companion;

    static {
       NoFlags.Companion = new NoFlags$Companion(null);
       NoFlags.CREATOR = new NoFlags$Companion$CREATOR$1();
    }
    public void NoFlags(String p0){
       co5.o(p0, "situation");
       super();
       this.situation = p0;
    }
    public int describeContents(){
       return 0;
    }
    public Serializable get(Flag p0){
       throw new UnsupportedOperationException("You cannot read any flags from this object: "+this.situation);
    }
    public Serializable getNonOverriddenValue(Flag p0){
       co5.o(p0, "flag");
       throw new UnsupportedOperationException("You cannot read any flags from this object: "+this.situation);
    }
    public boolean isEnabled(Flag p0){
       co5.o(p0, "flag");
       throw new UnsupportedOperationException("You cannot read any flags from this object: "+this.situation);
    }
    public boolean isLoaded(){
       return false;
    }
    public boolean isOverridden(Flag p0){
       co5.o(p0, "flag");
       throw new UnsupportedOperationException("You cannot read any flags from this object: "+this.situation);
    }
    public boolean isSame(Flags p0,Flag p1){
       co5.o(p0, "otherFlags");
       co5.o(p1, "flag");
       throw new UnsupportedOperationException("You cannot read any flags from this object: "+this.situation);
    }
    public void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "dest");
       p0.writeString(this.situation);
    }
}
