package com.spotify.playback.playbacknative.FloatPcmSupportDeviceSet;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.content.pm.PackageManager;
import p.av6;
import android.os.Build;
import android.os.Build$VERSION;

public final class FloatPcmSupportDeviceSet	// class@000ae0 from classes.dex
{
    private final Context context;

    public void FloatPcmSupportDeviceSet(Context p0){
       co5.o(p0, "context");
       super();
       this.context = p0;
    }
    private final boolean isSamsungExperienceSystemFeatureAvailable(){
       boolean b = (!this.context.getPackageManager().hasSystemFeature("com.samsung.feature.samsung_experience_mobile") && !this.context.getPackageManager().hasSystemFeature("com.samsung.feature.SAMSUNG_EXPERIENCE"))? false: true;
       return b;
    }
    private final boolean isSamsungFloatPcmSupported(String p0,int p1){
       boolean b = true;
       if (!av6.i0(p0, "Samsung", b) || (p1 < 31 || !this.isSamsungExperienceSystemFeatureAvailable())) {
          b = false;
       }
       return b;
    }
    public final Context getContext(){
       return this.context;
    }
    public final boolean isFloatPcmSupported(){
       String mANUFACTURER = Build.MANUFACTURER;
       co5.l(mANUFACTURER, "MANUFACTURER");
       return this.isFloatPcmSupported(mANUFACTURER, Build$VERSION.SDK_INT);
    }
    public final boolean isFloatPcmSupported(String p0,int p1){
       co5.o(p0, "manufacturer");
       return this.isSamsungFloatPcmSupported(p0, p1);
    }
}
