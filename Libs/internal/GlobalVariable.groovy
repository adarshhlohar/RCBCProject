package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object G_Timeout
     
    /**
     * <p></p>
     */
    public static Object G_ShortTimeOut
     
    /**
     * <p></p>
     */
    public static Object G_Qrace
     
    /**
     * <p></p>
     */
    public static Object G_Qrace_url
     
    /**
     * <p></p>
     */
    public static Object G_Qrace_application
     
    /**
     * <p></p>
     */
    public static Object G_ScreenShotpath
     
    /**
     * <p></p>
     */
    public static Object G_m1DeviceUrl
     
    /**
     * <p></p>
     */
    public static Object G_deviceName
     
    /**
     * <p></p>
     */
    public static Object G_devicePlatform
     
    /**
     * <p></p>
     */
    public static Object G_browserstackDeviceUrl
     
    /**
     * <p></p>
     */
    public static Object G_osVersion
     
    /**
     * <p></p>
     */
    public static Object G_remoteType
     
    /**
     * <p></p>
     */
    public static Object G_app
     
    /**
     * <p></p>
     */
    public static Object G_Qrace_Username
     
    /**
     * <p></p>
     */
    public static Object G_Qrace_Password
     
    /**
     * <p></p>
     */
    public static Object m1_username
     
    /**
     * <p></p>
     */
    public static Object m1_apikey
     
    /**
     * <p></p>
     */
    public static Object m1_duration
     
    /**
     * <p></p>
     */
    public static Object G_m1IsBooked
     
    /**
     * <p></p>
     */
    public static Object G_Platform
     
    /**
     * <p></p>
     */
    public static Object G_Password
     
    /**
     * <p></p>
     */
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object username
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object LOSID
     
    /**
     * <p></p>
     */
    public static Object CI1
     
    /**
     * <p></p>
     */
    public static Object CI2
     
    /**
     * <p></p>
     */
    public static Object FolderPath
     
    /**
     * <p></p>
     */
    public static Object OldSIRate
     
    /**
     * <p></p>
     */
    public static Object NewSIRate
     
    /**
     * <p></p>
     */
    public static Object OldDIRate
     
    /**
     * <p></p>
     */
    public static Object NewDIRate
     
    /**
     * <p></p>
     */
    public static Object isDeviation
     
    /**
     * <p></p>
     */
    public static Object CIFNumber
     
    /**
     * <p></p>
     */
    public static Object AccountNumber
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            G_Timeout = selectedVariables['G_Timeout']
            G_ShortTimeOut = selectedVariables['G_ShortTimeOut']
            G_Qrace = selectedVariables['G_Qrace']
            G_Qrace_url = selectedVariables['G_Qrace_url']
            G_Qrace_application = selectedVariables['G_Qrace_application']
            G_ScreenShotpath = selectedVariables['G_ScreenShotpath']
            G_m1DeviceUrl = selectedVariables['G_m1DeviceUrl']
            G_deviceName = selectedVariables['G_deviceName']
            G_devicePlatform = selectedVariables['G_devicePlatform']
            G_browserstackDeviceUrl = selectedVariables['G_browserstackDeviceUrl']
            G_osVersion = selectedVariables['G_osVersion']
            G_remoteType = selectedVariables['G_remoteType']
            G_app = selectedVariables['G_app']
            G_Qrace_Username = selectedVariables['G_Qrace_Username']
            G_Qrace_Password = selectedVariables['G_Qrace_Password']
            m1_username = selectedVariables['m1_username']
            m1_apikey = selectedVariables['m1_apikey']
            m1_duration = selectedVariables['m1_duration']
            G_m1IsBooked = selectedVariables['G_m1IsBooked']
            G_Platform = selectedVariables['G_Platform']
            G_Password = selectedVariables['G_Password']
            url = selectedVariables['url']
            username = selectedVariables['username']
            password = selectedVariables['password']
            LOSID = selectedVariables['LOSID']
            CI1 = selectedVariables['CI1']
            CI2 = selectedVariables['CI2']
            FolderPath = selectedVariables['FolderPath']
            OldSIRate = selectedVariables['OldSIRate']
            NewSIRate = selectedVariables['NewSIRate']
            OldDIRate = selectedVariables['OldDIRate']
            NewDIRate = selectedVariables['NewDIRate']
            isDeviation = selectedVariables['isDeviation']
            CIFNumber = selectedVariables['CIFNumber']
            AccountNumber = selectedVariables['AccountNumber']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
