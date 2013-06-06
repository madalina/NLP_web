package com.madi.nlp;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class NLPWebApp extends WebApplication{

    @Override
    public Class<? extends Page> getHomePage() {
        return MainPage.class;
    }

}
