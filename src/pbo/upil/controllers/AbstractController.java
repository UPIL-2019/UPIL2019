/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.upil.controllers;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import pbo.upil.models.AbstractModel;
import pbo.upil.views.AbstractView;

/**
 *
 * @author nurhamidan
 */
public abstract class AbstractController implements PropertyChangeListener {
    private final ArrayList<AbstractModel> registeredModels;
    private final ArrayList<AbstractView> registeredViews;

    public AbstractController() {
        registeredModels = new ArrayList<>();
        registeredViews = new ArrayList<>();
    }
    
    public void addModel(AbstractModel model) {
        registeredModels.add(model);
        model.addPropertyChangeListener(this);
    }
    
    public void removeModel(AbstractModel model) {
        registeredModels.remove(model);
        model.removePropertyChangeListener(this);
    }
    
    public void addView(AbstractView view) {
        registeredViews.add(view);
    }
    
    public void removeView(AbstractView view) {
        registeredViews.remove(view);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        registeredViews.forEach((view) -> {
            view.modelPropertyChange(evt);
        });
    }
    
    protected void setModelProperty(String propertyName, Object newValue) {
        for (AbstractModel model : registeredModels) {
            try {
                Method method = model.getClass().getMethod("set" + propertyName, new Class[] {
                    newValue.getClass()
                });
                method.invoke(model, newValue);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
}
