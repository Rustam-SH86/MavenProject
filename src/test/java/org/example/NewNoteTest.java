package org.example;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewNoteTest extends AbstractTest {
    @Test @Feature("Новая запись") @Epic("epic_7")

    public void  createNote() {
        driver.get("https://vc.ru/");
        NewNote note = new NewNote(driver);
        note.createNote();
        Assertions.assertTrue(driver.getTitle().equals("vc.ru — бизнес, технологии, идеи, модели роста, стартапы"));

    }


}
