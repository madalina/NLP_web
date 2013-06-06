package com.madi.nlp;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class MainPage extends WebPage {
    private static final long serialVersionUID = 1L;
    
    public MainPage(final PageParameters parameters) {
 
        add(new Label("message", "Hello World, Wicket"));
 
    }
}
