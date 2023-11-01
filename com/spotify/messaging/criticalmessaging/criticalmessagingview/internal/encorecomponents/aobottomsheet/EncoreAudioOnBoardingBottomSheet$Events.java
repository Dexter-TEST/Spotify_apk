package com.spotify.messaging.criticalmessaging.criticalmessagingview.internal.encorecomponents.aobottomsheet.EncoreAudioOnBoardingBottomSheet$Events;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class EncoreAudioOnBoardingBottomSheet$Events extends Enum	// class@000a1d from classes.dex
{
    private static final EncoreAudioOnBoardingBottomSheet$Events[] $VALUES;
    public static final EncoreAudioOnBoardingBottomSheet$Events PrimaryActionTapped;
    public static final EncoreAudioOnBoardingBottomSheet$Events SecondaryActionTapped;

    private static final EncoreAudioOnBoardingBottomSheet$Events[] $values(){
       EncoreAudioOnBoardingBottomSheet$Events[] uEventsArray = new EncoreAudioOnBoardingBottomSheet$Events[]{EncoreAudioOnBoardingBottomSheet$Events.PrimaryActionTapped,EncoreAudioOnBoardingBottomSheet$Events.SecondaryActionTapped};
       return uEventsArray;
    }
    static {
       EncoreAudioOnBoardingBottomSheet$Events.PrimaryActionTapped = new EncoreAudioOnBoardingBottomSheet$Events("PrimaryActionTapped", 0);
       EncoreAudioOnBoardingBottomSheet$Events.SecondaryActionTapped = new EncoreAudioOnBoardingBottomSheet$Events("SecondaryActionTapped", 1);
       EncoreAudioOnBoardingBottomSheet$Events.$VALUES = EncoreAudioOnBoardingBottomSheet$Events.$values();
    }
    private void EncoreAudioOnBoardingBottomSheet$Events(String p0,int p1){
       super(p0, p1);
    }
    public static EncoreAudioOnBoardingBottomSheet$Events valueOf(String p0){
       return Enum.valueOf(EncoreAudioOnBoardingBottomSheet$Events.class, p0);
    }
    public static EncoreAudioOnBoardingBottomSheet$Events[] values(){
       return EncoreAudioOnBoardingBottomSheet$Events.$VALUES.clone();
    }
}
