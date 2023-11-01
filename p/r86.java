package p.r86;
import p.b0;
import p.q86;
import android.os.Parcel;
import java.lang.ClassLoader;
import java.lang.Object;
import java.lang.Boolean;
import android.os.Parcelable;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Integer;
import p.en6;

public final class r86 extends b0	// class@00249a from classes.dex
{
    public boolean c;
    public static final Parcelable$Creator CREATOR;

    static {
       r86.CREATOR = new q86(0);
    }
    public void r86(Parcel p0,ClassLoader p1){
       super(p0, p1);
       this.c = p0.readValue(null).booleanValue();
    }
    public void r86(Parcelable p0){
       super(p0);
    }
    public final String toString(){
       return en6.q("SearchView.SavedState{"+Integer.toHexString(System.identityHashCode(this))+" isIconified=", this.c, "}");
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeParcelable(this.a, p1);
       p0.writeValue(Boolean.valueOf(this.c));
    }
}
