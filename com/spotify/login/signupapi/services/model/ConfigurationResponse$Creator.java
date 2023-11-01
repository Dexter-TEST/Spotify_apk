package com.spotify.login.signupapi.services.model.ConfigurationResponse$Creator;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import java.lang.String;
import p.co5;
import java.util.ArrayList;
import com.spotify.login.signupapi.services.model.CallingCode;
import com.spotify.login.signupapi.services.model.TermsConditionAcceptance;
import com.spotify.login.signupapi.services.model.PrivacyPolicyAcceptance;
import com.spotify.login.signupapi.services.model.MarketingMessagesOption;
import java.util.List;

public final class ConfigurationResponse$Creator implements Parcelable$Creator	// class@000998 from classes.dex
{

    public void ConfigurationResponse$Creator(){
       super();
    }
    public final ConfigurationResponse createFromParcel(Parcel p0){
       Object obj = p0;
       co5.o(obj, "parcel");
       boolean b = (p0.readInt())? true: false;
       boolean b1 = (p0.readInt())? true: false;
       boolean b2 = (p0.readInt())? true: false;
       boolean b3 = (p0.readInt())? true: false;
       boolean b4 = (p0.readInt())? true: false;
       boolean b5 = (p0.readInt())? true: false;
       boolean b6 = (p0.readInt())? true: false;
       boolean b7 = (p0.readInt())? true: false;
       int i = p0.readInt();
       String str = p0.readString();
       boolean b8 = (p0.readInt())? true: false;
       int i1 = p0.readInt();
       ArrayList uArrayList = new ArrayList(i1);
       for (int i2 = 0; i2 != i1; i2 = i2 + 1) {
          uArrayList.add(CallingCode.CREATOR.createFromParcel(obj));
       }
       TermsConditionAcceptance termsConditi = TermsConditionAcceptance.valueOf(p0.readString());
       PrivacyPolicyAcceptance privacyPolic = PrivacyPolicyAcceptance.valueOf(p0.readString());
       MarketingMessagesOption marketingMes = MarketingMessagesOption.valueOf(p0.readString());
       boolean b9 = (p0.readInt())? true: false;
       ConfigurationResponse obj1 = new ConfigurationResponse(b, b1, b2, b3, b4, b5, b6, b7, i, str, b8, uArrayList, termsConditi, privacyPolic, marketingMes, b9);
       return obj;
    }
    public Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public final ConfigurationResponse[] newArray(int p0){
       ConfigurationResponse[] uConfigurati = new ConfigurationResponse[p0];
       return uConfigurati;
    }
    public Object[] newArray(int p0){
       return this.newArray(p0);
    }
}
