package com.spotify.connectivity.flags.Flags;
import android.os.Parcelable;
import com.spotify.connectivity.flags.Flag;
import java.io.Serializable;

public interface abstract Flags implements Parcelable	// class@00070a from classes.dex
{

    Serializable get(Flag p0);
    Serializable getNonOverriddenValue(Flag p0);
    boolean isEnabled(Flag p0);
    boolean isLoaded();
    boolean isOverridden(Flag p0);
    boolean isSame(Flags p0,Flag p1);
}
