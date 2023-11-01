package com.spotify.connectivity.sessionstate.AutoValue_SessionState$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.spotify.connectivity.sessionstate.AutoValue_SessionState;
import java.lang.String;
import com.spotify.connectivity.sessionstate.SessionState$PaymentStateAdapter;
import android.os.Parcelable;
import com.spotify.connectivity.sessionstate.OptimizedParcelableTypeAdapter;
import com.spotify.connectivity.sessionstate.PaymentState;

class AutoValue_SessionState$1 implements Parcelable$Creator	// class@000827 from classes.dex
{

    public void AutoValue_SessionState$1(){
       super();
    }
    public AutoValue_SessionState createFromParcel(Parcel p0){
       String str = p0.readString();
       int i = 1;
       int i1 = (p0.readInt() == i)? 1: 0;
       int i2 = (p0.readInt() == i)? 1: 0;
       int i3 = (p0.readInt() == i)? 1: 0;
       int i4 = p0.readInt();
       String str1 = p0.readString();
       int i5 = (p0.readInt() == i)? 1: 0;
       int i6 = (p0.readInt() == i)? 1: 0;
       AutoValue_SessionState v11 = new AutoValue_SessionState(str, i1, i2, i3, i4, str1, i5, i6, AutoValue_SessionState.access$000().fromParcel(p0), p0.readString());
       return v11;
    }
    public Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public AutoValue_SessionState[] newArray(int p0){
       AutoValue_SessionState[] uAutoValue_S = new AutoValue_SessionState[p0];
       return uAutoValue_S;
    }
    public Object[] newArray(int p0){
       return this.newArray(p0);
    }
}
