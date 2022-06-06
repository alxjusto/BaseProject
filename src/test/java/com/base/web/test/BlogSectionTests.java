package com.base.web.test;

import com.base.web.helper.BaseHelper;
import com.base.web.util.Driver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BlogSectionTests {

/*

    TST05-HexactaMainPage: Verificar que al menos un resultado de búsqueda coincida con una búsqueda realizada.
            Steps:
            1. https://www.hexacta.com/
            2. Click en el menú superior derecho "Search". Un campo de búsqueda se mostrará en pantalla.
            3. Tipear el texto "Outsource". Un conjunto de resultados de búsqueda se mostrarán en pantalla.
            4. Ver que en alguno de los resultados se encuentre el texto "What not to do when working with an outsourced software team"
*/

    static Driver driver = new Driver();
    BaseHelper baseHelper = new BaseHelper();

    @BeforeAll
    public static void setUp() {
        driver.createDriver();
    }

    @Test
    public void checking_correct_result() throws InterruptedException {
        String textToSearch = "Outsource";
        String articleName = "What not to do when working with an outsourced software team";
        boolean articleNameExist = true;

        baseHelper.choseMenuOption(textToSearch);

        Assertions.assertEquals(articleNameExist, baseHelper.obtainArticleName(articleName));
    }

    @AfterAll
    public static void tearDown() {
        driver.exitDriver();
    }
}
