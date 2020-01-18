import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateNumber
{
    @Test
    public void validateCorrectNumber(){
        Assert.assertTrue(validation.validateSAPhoneNumber("0765182977"));
    }

    @Test(description = "")
    public void validateCorrectNumberCountryCode(){
        Assert.assertTrue(validation.validateSAPhoneNumber("+27765182977"));
    }

    @Test(description = "")
    public void validateCorrectNumberCountryCodeWithoutPlus(){
        Assert.assertTrue(validation.validateSAPhoneNumber("27765182977"));
    }

    @Test(description = "")
    public void validateIncorrectNumber(){
        Assert.assertFalse(validation.validateSAPhoneNumber("1234567890"));
    }

    @Test(description = "")
    public void validateIncorrectNumberAlphaNumeric(){
        Assert.assertFalse(validation.validateSAPhoneNumber("@#$rhdh55d"));
    }

    @Test(description = "")
    public void validateIncorrectNumberLessThanTen(){
        Assert.assertFalse(validation.validateSAPhoneNumber("0765182"));
    }

    @Test(description = "")
    public void validateIncorrectNumberMoreThanTen(){
        Assert.assertFalse(validation.validateSAPhoneNumber("07651829777"));
    }
}
