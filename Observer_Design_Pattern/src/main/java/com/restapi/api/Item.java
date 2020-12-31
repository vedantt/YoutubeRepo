package com.restapi.api;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Item {

    int quantity;
    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {

        support.addPropertyChangeListener(listener);
    }

    public void addQuantity(int quantity) {

        support.firePropertyChange("item", this.quantity, quantity);
        this.quantity = quantity;
    }
}
