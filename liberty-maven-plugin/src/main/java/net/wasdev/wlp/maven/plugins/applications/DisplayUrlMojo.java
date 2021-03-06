/**
 * (C) Copyright IBM Corporation 2017.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.wasdev.wlp.maven.plugins.applications;

import java.awt.Desktop;

import java.net.URI;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import net.wasdev.wlp.maven.plugins.BasicSupport;

/**
 * Display an application URL in the default browser.
 */
@Mojo(name = "display-url")
public class DisplayUrlMojo extends BasicSupport {
    
    /**
     * Display a URI in the default browser
     */
    @Parameter
    protected URI applicationURL;
 
    @Override
    protected void doExecute() throws Exception {
        if (applicationURL != null && Desktop.isDesktopSupported()) {
            Desktop.getDesktop().browse(applicationURL);
        }
    }
}
