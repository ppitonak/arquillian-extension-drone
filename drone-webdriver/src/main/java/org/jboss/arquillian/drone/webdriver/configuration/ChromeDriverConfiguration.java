/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.arquillian.drone.webdriver.configuration;


/**
 * Configuration for Chrome Driver
 *
 * @author <a href="kpiwko@redhat.com>Karel Piwko</a>
 *
 */
public interface ChromeDriverConfiguration extends CommonWebDriverConfiguration {

    /**
     * @return the chromeBinary
     */
    String getChromeBinary();

    /**
     * @param chromeBinary the chromeBinary to set
     */
    void setChromeBinary(String chromeBinary);

    /**
     * @param chromeDriverBinary the chromeDriverBinary to set
     */
    void setChromeDriverBinary(String chromeDriverBinary);

    /**
     * @return the chromeDriverBinary
     */
    String getChromeDriverBinary();

    /**
     * @param chromeSwitches the chromeSwitches to set
     */
    void setChromeSwitches(String chromeSwitches);

    /**
     * @return the chromeSwitches
     */
    String getChromeSwitches();

}
