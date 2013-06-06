package com.madi.norwegianlearningplatform;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class NorwegianLearningPlatformWebApp extends WebApplication{

    @Override
    public Class<? extends Page> getHomePage() {
        return MainPage.class;
    }

}
