package com;

import com.xtremelabs.robolectric.RobolectricTestRunner;

import java.io.File;
import org.junit.runners.model.InitializationError;
import com.xtremelabs.robolectric.RobolectricConfig;
import com.xtremelabs.robolectric.RobolectricTestRunner;

/**
 * 
 * @author shsun
 * 
 */
public class AdSDKTestRunner extends RobolectricTestRunner {

    private static final String MANIFEST_FILE_NAME = "AndroidManifest.xml";

    private static final String RES_FOLDER_NAME = "res";

    private static final File ROOT_ANDROID_PROJECT = new File(MANIFEST_FILE_NAME).exists() ? new File(".") : new File(
            "..");

    public static final File MANIFEST_ANDROID_PROJECT = new File(ROOT_ANDROID_PROJECT, MANIFEST_FILE_NAME);

    public static final File RES_FOLDER_ANDROID_PROJECT = new File(ROOT_ANDROID_PROJECT, RES_FOLDER_NAME);

    /**
     * 
     * @param testClass
     * @throws InitializationError
     */
    public AdSDKTestRunner(Class<?> testClass) throws InitializationError {
        super(testClass, new RobolectricConfig(MANIFEST_ANDROID_PROJECT, RES_FOLDER_ANDROID_PROJECT));
    }
}