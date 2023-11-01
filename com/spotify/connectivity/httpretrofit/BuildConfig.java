package com.spotify.connectivity.httpretrofit.BuildConfig;
import java.lang.String;
import java.lang.Object;

public final class BuildConfig	// class@000740 from classes.dex
{
    public static final boolean ABORT_ON_ASSERTION;
    public static final String BUILD_TAG;
    public static final String BUILD_TYPE;
    public static final boolean CORE_COMPRESSION_ENABLED;
    public static final boolean CRASH_REPORTING_ENABLED;
    public static final boolean DEBUG;
    public static final boolean DYNAMIC_FEATURE_ENABLED;
    public static final boolean END_TO_END;
    public static final boolean INTERNAL;
    public static final String LIBRARY_PACKAGE_NAME;

    static {
       BuildConfig.DEBUG = BuildConfig.internal();
       BuildConfig.INTERNAL = BuildConfig.internal();
       BuildConfig.BUILD_TYPE = BuildConfig.buildType();
       BuildConfig.BUILD_TAG = BuildConfig.buildTag();
       BuildConfig.LIBRARY_PACKAGE_NAME = BuildConfig.libraryPackageName();
       BuildConfig.DYNAMIC_FEATURE_ENABLED = BuildConfig.dynamicFeatureEnabled();
       BuildConfig.ABORT_ON_ASSERTION = BuildConfig.abortOnAssertion();
       BuildConfig.CRASH_REPORTING_ENABLED = BuildConfig.crashReportingEnabled();
       BuildConfig.CORE_COMPRESSION_ENABLED = BuildConfig.coreCompressionEnabled();
       BuildConfig.END_TO_END = BuildConfig.endToEnd();
    }
    public void BuildConfig(){
       super();
    }
    private static final boolean abortOnAssertion(){
       return false;
    }
    private static final String buildTag(){
       return "gradle";
    }
    private static final String buildType(){
       return "release";
    }
    private static final boolean coreCompressionEnabled(){
       return false;
    }
    private static final boolean crashReportingEnabled(){
       return true;
    }
    private static final boolean dynamicFeatureEnabled(){
       return false;
    }
    private static final boolean endToEnd(){
       return false;
    }
    private static final boolean internal(){
       return false;
    }
    private static final String libraryPackageName(){
       return "com.spotify.connectivity.httpretrofit";
    }
}
