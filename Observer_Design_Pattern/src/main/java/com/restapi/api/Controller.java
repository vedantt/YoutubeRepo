package com.restapi.api;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.restapi.api.services.*;

@RestController
public class Controller {

    Item observable = new Item();

    @RequestMapping(method = RequestMethod.POST, value = "/add-item", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Object addItem() {
        NotifyService observer = new NotifyService();
        observable.addPropertyChangeListener(observer);
        observable.addQuantity(10);
        return "{\"response\":\"success\"}";


    }


}
