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
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
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
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
