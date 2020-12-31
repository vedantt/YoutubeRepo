package com.restapi.api.services;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class NotifyService implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt){
     EmailClient.sendMail(evt.getNewValue().toString(),"omfhxpiqmvftdsowab@twzhhq.online");
    }
}
