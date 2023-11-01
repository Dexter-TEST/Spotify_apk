package com.spotify.connectivity.auth.esperanto.proto.GetStateResultOrBuilder;
import p.u74;
import java.lang.String;
import p.i80;
import p.s74;

public interface abstract GetStateResultOrBuilder implements u74	// class@00063a from classes.dex
{

    boolean getCanStream();
    boolean getConnected();
    String getCountryCode();
    i80 getCountryCodeBytes();
    String getCurrentUser();
    i80 getCurrentUserBytes();
    s74 getDefaultInstanceForType();
    boolean getLoggedIn();
    boolean getLoggingIn();
    boolean getLoggingOut();
    String getPaymentState();
    i80 getPaymentStateBytes();
    String getProductType();
    i80 getProductTypeBytes();
    boolean isInitialized();
}
