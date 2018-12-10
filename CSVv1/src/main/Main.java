
package main;

import view.ViewCSVv1;
import model.ModelCSVv1;
import Controller.ControllerCSVv1;
/**
 *
 * @author Yoselin
 */
public class Main {
    private static ViewCSVv1 viewCSVv1;
    private static ModelCSVv1 modelCSVv1;
    private static ControllerCSVv1 controllerCSVv1;
    
    public static void main(String[] args)
    {
        viewCSVv1 = new ViewCSVv1();
        modelCSVv1 = new ModelCSVv1();
        controllerCSVv1 = new ControllerCSVv1(modelCSVv1, viewCSVv1);
    }
}