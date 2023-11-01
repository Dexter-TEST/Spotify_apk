package com.spotify.clientfoundations.core.core.DeviceType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.util.Locale;
import p.co5;

public final class DeviceType extends Enum	// class@00055a from classes.dex
{
    private final int value;
    private static final DeviceType[] $VALUES;
    public static final DeviceType AUDIODONGLE;
    public static final DeviceType AUTOMOBILE;
    public static final DeviceType AVR;
    public static final DeviceType CASTAUDIO;
    public static final DeviceType CASTVIDEO;
    public static final DeviceType CHROMEBOOK;
    public static final DeviceType COMPUTER;
    public static final DeviceType GAMECONSOLE;
    public static final DeviceType SMARTPHONE;
    public static final DeviceType SMARTWATCH;
    public static final DeviceType SPEAKER;
    public static final DeviceType STB;
    public static final DeviceType TABLET;
    public static final DeviceType TV;

    private static final DeviceType[] $values(){
       DeviceType[] uDeviceTypeA = new DeviceType[14];
       uDeviceTypeA[0] = DeviceType.COMPUTER;
       uDeviceTypeA[1] = DeviceType.TABLET;
       uDeviceTypeA[2] = DeviceType.SMARTPHONE;
       uDeviceTypeA[3] = DeviceType.SPEAKER;
       uDeviceTypeA[4] = DeviceType.TV;
       uDeviceTypeA[5] = DeviceType.AVR;
       uDeviceTypeA[6] = DeviceType.STB;
       uDeviceTypeA[7] = DeviceType.AUDIODONGLE;
       uDeviceTypeA[8] = DeviceType.GAMECONSOLE;
       uDeviceTypeA[9] = DeviceType.CASTVIDEO;
       uDeviceTypeA[10] = DeviceType.CASTAUDIO;
       uDeviceTypeA[11] = DeviceType.AUTOMOBILE;
       uDeviceTypeA[12] = DeviceType.SMARTWATCH;
       uDeviceTypeA[13] = DeviceType.CHROMEBOOK;
       return uDeviceTypeA;
    }
    static {
       DeviceType.COMPUTER = new DeviceType("COMPUTER", 0, 1);
       DeviceType.TABLET = new DeviceType("TABLET", 1, 2);
       DeviceType.SMARTPHONE = new DeviceType("SMARTPHONE", 2, 3);
       DeviceType.SPEAKER = new DeviceType("SPEAKER", 3, 4);
       DeviceType.TV = new DeviceType("TV", 4, 5);
       DeviceType.AVR = new DeviceType("AVR", 5, 6);
       DeviceType.STB = new DeviceType("STB", 6, 7);
       DeviceType.AUDIODONGLE = new DeviceType("AUDIODONGLE", 7, 8);
       DeviceType.GAMECONSOLE = new DeviceType("GAMECONSOLE", 8, 9);
       DeviceType.CASTVIDEO = new DeviceType("CASTVIDEO", 9, 10);
       DeviceType.CASTAUDIO = new DeviceType("CASTAUDIO", 10, 11);
       DeviceType.AUTOMOBILE = new DeviceType("AUTOMOBILE", 11, 12);
       DeviceType.SMARTWATCH = new DeviceType("SMARTWATCH", 12, 13);
       DeviceType.CHROMEBOOK = new DeviceType("CHROMEBOOK", 13, 14);
       DeviceType.$VALUES = DeviceType.$values();
    }
    private void DeviceType(String p0,int p1,int p2){
       this.value = p2;
    }
    public static DeviceType valueOf(String p0){
       return Enum.valueOf(DeviceType.class, p0);
    }
    public static DeviceType[] values(){
       return DeviceType.$VALUES.clone();
    }
    public final int getValue(){
       return this.value;
    }
    public String toString(){
       Locale uS = Locale.US;
       co5.l(uS, "US");
       String str = this.name().toLowerCase(uS);
       co5.l(str, "this as java.lang.String\).toLowerCase\(locale\)");
       return str;
    }
}
