package com.bitwiseglobal.postfix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by balajeev on 2/22/2016.
 */
public class PostfixEvaluationTest {

    @Test

    public void itshouldEvaluateTheValidPostfixExpression()
    {
    	 //given
        PostfixValidator validator=new PostfixValidator();
        validator.isSpacePresent("17 10 + 3 * 9 /");
        validator.isThresholdManaged("17 10 + 3 * 9 /");
        validator.isValidLength("17 10 + 3 * 9 /");
        validator.isValidWithSymbols("17 10 + 3 * 9 /");
    
        //when
        PostfixEvaluator evaluator=new PostfixEvaluator();
        
        //then
        assertEquals(9, evaluator.calculate("17 10 + 3 * 9 /"));
    }



}
