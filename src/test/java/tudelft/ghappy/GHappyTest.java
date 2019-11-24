package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class GHappyTest {
    private GHappy gHappy;
    @BeforeEach
    void initilize(){
        gHappy = new GHappy();
    }

    @ParameterizedTest(name ="{0}")
    @ValueSource(strings = {"ggHappy"," Happygg", "ggHapygg", "ggHggHgg"})
    void gIsHappy(String str){
        boolean isHappy;
        isHappy = gHappy.gHappy(str);
        Assertions.assertTrue(isHappy);
    }

    @ParameterizedTest(name ="{0}")
    @ValueSource(strings = {"gHappy"," Happyg", "gHapygg", "ggHgHgg", "ggHggHg"})
    void gIsNotHappy(String str){
        boolean isHappy;
        isHappy = gHappy.gHappy(str);
        Assertions.assertFalse(isHappy);
    }




}
