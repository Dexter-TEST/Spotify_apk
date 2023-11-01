package com.spotify.connectivity.sessionstate.OptimizedParcelableTypeAdapter;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import android.os.Parcelable;
import p.eo5;

public abstract class OptimizedParcelableTypeAdapter	// class@00082b from classes.dex
{
    private final Parcelable$Creator mCreator;

    public void OptimizedParcelableTypeAdapter(Parcelable$Creator p0){
       super();
       this.mCreator = p0;
    }
    public Parcelable fromParcel(Parcel p0){
       return eo5.K(p0, this.mCreator);
    }
    public Object fromParcel(Parcel p0){
       return this.fromParcel(p0);
    }
    public void toParcel(Parcelable p0,Parcel p1){
       eo5.d0(0, p1, p0);
    }
    public void toParcel(Object p0,Parcel p1){
       this.toParcel(p0, p1);
    }
}
