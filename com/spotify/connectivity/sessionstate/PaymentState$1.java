package com.spotify.connectivity.sessionstate.PaymentState$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.spotify.connectivity.sessionstate.PaymentState;

class PaymentState$1 implements Parcelable$Creator	// class@00082c from classes.dex
{

    public void PaymentState$1(){
       super();
    }
    public PaymentState createFromParcel(Parcel p0){
       return new PaymentState(p0, null);
    }
    public Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public PaymentState[] newArray(int p0){
       PaymentState[] paymentState = new PaymentState[p0];
       return paymentState;
    }
    public Object[] newArray(int p0){
       return this.newArray(p0);
    }
}
