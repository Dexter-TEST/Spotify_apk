package com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import android.os.Parcelable;
import p.ie5;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;
import p.hr7;
import android.os.Parcel;

public final class SearchConfiguration implements Parcelable	// class@000505 from classes.dex
{
    private final String initialText;
    private final String placeholder;
    private final String url;
    public static final Parcelable$Creator CREATOR;

    static {
       SearchConfiguration.CREATOR = new ie5(10);
    }
    public void SearchConfiguration(String p0,String p1,String p2){
       co5.o(p0, "url");
       co5.o(p1, "placeholder");
       co5.o(p2, "initialText");
       super();
       this.url = p0;
       this.placeholder = p1;
       this.initialText = p2;
    }
    public static SearchConfiguration copy$default(SearchConfiguration p0,String p1,String p2,String p3,int p4,Object p5){
       SearchConfiguration url;
       SearchConfiguration placeholder;
       SearchConfiguration initialText;
       if ((p4 & 0x01)) {
          url = p0.url;
       }
       if ((p4 & 0x02)) {
          placeholder = p0.placeholder;
       }
       if ((p4 & 0x04)) {
          initialText = p0.initialText;
       }
       return p0.copy(url, placeholder, initialText);
    }
    public final String component1(){
       return this.url;
    }
    public final String component2(){
       return this.placeholder;
    }
    public final String component3(){
       return this.initialText;
    }
    public final SearchConfiguration copy(String p0,String p1,String p2){
       co5.o(p0, "url");
       co5.o(p1, "placeholder");
       co5.o(p2, "initialText");
       return new SearchConfiguration(p0, p1, p2);
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof SearchConfiguration) {
          return false;
       }
       if (!co5.c(this.url, p0.url)) {
          return false;
       }
       if (!co5.c(this.placeholder, p0.placeholder)) {
          return false;
       }
       if (!co5.c(this.initialText, p0.initialText)) {
          return false;
       }
       return true;
    }
    public final String getInitialText(){
       return this.initialText;
    }
    public final String getPlaceholder(){
       return this.placeholder;
    }
    public final String getUrl(){
       return this.url;
    }
    public int hashCode(){
       return (this.initialText.hashCode() + tp2.g(this.placeholder, (this.url.hashCode() * 31), 31));
    }
    public String toString(){
       return hr7.a("SearchConfiguration\(url="+this.url+", placeholder="+this.placeholder+", initialText=", this.initialText, ')');
    }
    public void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.url);
       p0.writeString(this.placeholder);
       p0.writeString(this.initialText);
    }
}
