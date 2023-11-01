package com.spotify.connectivity.sessionstate.AutoValue_SessionState;
import com.spotify.connectivity.sessionstate.$AutoValue_SessionState;
import com.spotify.connectivity.sessionstate.SessionState$PaymentStateAdapter;
import com.spotify.connectivity.sessionstate.AutoValue_SessionState$1;
import java.lang.String;
import com.spotify.connectivity.sessionstate.PaymentState;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.connectivity.sessionstate.OptimizedParcelableTypeAdapter;

final class AutoValue_SessionState extends $AutoValue_SessionState	// class@000828 from classes.dex
{
    public static final Parcelable$Creator CREATOR;
    private static final SessionState$PaymentStateAdapter PAYMENT_STATE_ADAPTER;

    static {
       AutoValue_SessionState.PAYMENT_STATE_ADAPTER = new SessionState$PaymentStateAdapter();
       AutoValue_SessionState.CREATOR = new AutoValue_SessionState$1();
    }
    public void AutoValue_SessionState(String p0,boolean p1,boolean p2,boolean p3,int p4,String p5,boolean p6,boolean p7,PaymentState p8,String p9){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }
    public static SessionState$PaymentStateAdapter access$000(){
       return AutoValue_SessionState.PAYMENT_STATE_ADAPTER;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.currentUser());
       p0.writeInt(this.loggedIn());
       p0.writeInt(this.loggingIn());
       p0.writeInt(this.loggingOut());
       p0.writeInt(this.currentAccountType());
       p0.writeString(this.countryCode());
       p0.writeInt(this.connected());
       p0.writeInt(this.canStream());
       AutoValue_SessionState.PAYMENT_STATE_ADAPTER.toParcel(this.paymentState(), p0);
       p0.writeString(this.productType());
    }
}
