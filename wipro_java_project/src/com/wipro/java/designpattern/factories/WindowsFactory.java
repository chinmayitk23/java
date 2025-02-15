package com.wipro.java.designpattern.factories;
import com.wipro.java.designpattern.buttons.Button;
import com.wipro.java.designpattern.buttons.WindowsButton;

import com.wipro.java.designpattern.checkboxes.Checkbox;
import com.wipro.java.designpattern.checkboxes.WindowsCheckbox;


/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}