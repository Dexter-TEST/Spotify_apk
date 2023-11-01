package p.jw7;
import p.iw7;
import p.pw7;
import p.l08;
import android.os.Bundle;
import java.lang.String;
import android.os.Parcelable;
import android.os.ParcelFileDescriptor;
import java.lang.Object;

public final class jw7 extends iw7	// class@001b5d from classes.dex
{
    public final int d;

    public void jw7(pw7 p0,l08 p1,int p2){
       this.d = p2;
       super(p0, p1);
    }
    public final void c(Bundle p0,Bundle p1){
       switch (this.d){
           case 1:
           default:
             super.c(p0, p1);
             return;
       }
       super.c(p0, p1);
       this.b.b(p0.getParcelable("chunk_file_descriptor"));
       return;
    }
}
