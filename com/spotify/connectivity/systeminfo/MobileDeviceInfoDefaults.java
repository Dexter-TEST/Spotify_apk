package com.spotify.connectivity.systeminfo.MobileDeviceInfoDefaults;
import java.lang.Object;
import com.spotify.connectivity.MobileDeviceInfo;
import android.os.Build$VERSION;
import java.lang.String;
import android.os.Build;
import com.spotify.clientfoundations.core.core.DeviceType;

public final class MobileDeviceInfoDefaults	// class@000835 from classes.dex
{

    private void MobileDeviceInfoDefaults(){
       super();
    }
    public static MobileDeviceInfo defaults(){
       MobileDeviceInfo mobileDevice = new MobileDeviceInfo();
       mobileDevice.setOsVersion(Build$VERSION.RELEASE);
       mobileDevice.setApiLevel(Build$VERSION.SDK_INT);
       String mODEL = Build.MODEL;
       mobileDevice.setName(mODEL);
       mobileDevice.setModel(mODEL);
       mobileDevice.setBrand(Build.BRAND);
       mobileDevice.setManufacturer(Build.MANUFACTURER);
       mobileDevice.setDeviceType(DeviceType.SMARTPHONE.getValue());
       return mobileDevice;
    }
}
