package p.j28;
import p.tu7;
import android.os.IBinder;
import java.lang.String;
import android.os.Bundle;
import android.os.Parcel;
import p.y08;

public final class j28 extends tu7	// class@001a55 from classes.dex
{

    public void j28(IBinder p0){
       super(p0, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback", 2);
    }
    public final void u(Bundle p0){
       Parcel parcel = this.n();
       parcel.writeInt(1);
       p0.writeToParcel(parcel, 0);
       this.y(parcel, 3);
    }
}
