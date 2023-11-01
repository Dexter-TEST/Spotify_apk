package com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValueOrBuilder;
import p.u74;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$BoolValue;
import java.lang.String;
import p.i80;
import p.s74;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$EnumValue;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$IntValue;
import com.spotify.rcs.model.a;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$StructuredValueCase;

public interface abstract GranularConfiguration$AssignedPropertyValueOrBuilder implements u74	// class@000bc4 from classes.dex
{

    GranularConfiguration$AssignedPropertyValue$BoolValue getBoolValue();
    String getClientId();
    i80 getClientIdBytes();
    String getComponentId();
    i80 getComponentIdBytes();
    s74 getDefaultInstanceForType();
    GranularConfiguration$AssignedPropertyValue$EnumValue getEnumValue();
    long getGroupId();
    GranularConfiguration$AssignedPropertyValue$IntValue getIntValue();
    String getName();
    i80 getNameBytes();
    a getPlatform();
    int getPlatformValue();
    long getPolicyId();
    GranularConfiguration$AssignedPropertyValue$StructuredValueCase getStructuredValueCase();
    boolean hasBoolValue();
    boolean hasEnumValue();
    boolean hasIntValue();
    boolean isInitialized();
}
