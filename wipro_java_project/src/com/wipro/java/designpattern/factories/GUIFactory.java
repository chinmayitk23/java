package com.wipro.java.designpattern.factories;
import com.wipro.java.designpattern.buttons.Button;
import com.wipro.java.designpattern.checkboxes.Checkbox;


/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}