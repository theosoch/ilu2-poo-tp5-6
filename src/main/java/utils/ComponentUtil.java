/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.awt.Component;
import java.awt.Container;

/**
 *
 * @author SCT4848A
 */
public class ComponentUtil {
    
    public static void recursiveSetEnable(Component component, boolean enabled) {
        component.setEnabled(enabled);
        
        if(component instanceof Container container) {
            for(Component childComponent : container.getComponents()) {
                recursiveSetEnable(childComponent, enabled);
            }
        }
    }
    
}
