package com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$StoredUserInfoOrBuilder;
import p.u74;
import com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlob;
import p.s74;
import java.lang.String;
import p.i80;

public interface abstract EsStoredUserInfo$StoredUserInfoOrBuilder implements u74	// class@00065e from classes.dex
{

    EsAuthBlob$AuthBlob getAuthBlob();
    s74 getDefaultInstanceForType();
    String getUsername();
    i80 getUsernameBytes();
    boolean hasAuthBlob();
    boolean isInitialized();
}
