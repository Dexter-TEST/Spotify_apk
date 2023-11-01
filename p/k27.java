package p.k27;
import p.b0;
import p.q86;
import android.os.Parcel;
import java.lang.ClassLoader;
import android.text.TextUtils;
import java.lang.Object;
import android.os.Parcelable$Creator;
import java.lang.CharSequence;
import android.os.Parcelable;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Integer;

public final class k27 extends b0	// class@001b95 from classes.dex
{
    public CharSequence c;
    public boolean t;
    public CharSequence v;
    public CharSequence w;
    public CharSequence x;
    public static final Parcelable$Creator CREATOR;

    static {
       k27.CREATOR = new q86(11);
    }
    public void k27(Parcel p0,ClassLoader p1){
       super(p0, p1);
       this.c = TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(p0);
       boolean b = true;
       if (p0.readInt() == b) {
       }else {
          b = false;
       }
       this.t = b;
       this.v = TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(p0);
       this.w = TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(p0);
       this.x = TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(p0);
       return;
    }
    public void k27(Parcelable p0){
       super(p0);
    }
    public final String toString(){
       return "TextInputLayout.SavedState{"+Integer.toHexString(System.identityHashCode(this))+" error="+this.c+" hint="+this.v+" helperText="+this.w+" placeholderText="+this.x+"}";
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeParcelable(this.a, p1);
       TextUtils.writeToParcel(this.c, p0, p1);
       p0.writeInt(this.t);
       TextUtils.writeToParcel(this.v, p0, p1);
       TextUtils.writeToParcel(this.w, p0, p1);
       TextUtils.writeToParcel(this.x, p0, p1);
    }
}
