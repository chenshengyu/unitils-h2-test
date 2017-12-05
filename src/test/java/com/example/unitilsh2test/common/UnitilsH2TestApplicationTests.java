package com.example.unitilsh2test.common;

import org.unitils.UnitilsJUnit4;
import org.unitils.spring.annotation.SpringApplicationContext;

/**
 * @author chensy
 * @Date: Created in 11:31 2017/12/4
 */
@SpringApplicationContext({"/appContext-unit.xml"})
public abstract class UnitilsH2TestApplicationTests extends UnitilsJUnit4 {
}
