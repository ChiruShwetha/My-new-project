/*
 *  Copyright 2015 Adobe Systems Incorporated
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.adobe.aem.guides.wknd.core.models;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

@Model(adaptables = Resource.class)
public class Training {
    
    @Inject @Optional
    private String title1;
    
    @Inject @Optional
    private String title2;
    
    @Inject @Optional
    private String title3;
    
    private int title4;

    @PostConstruct
    protected void init() {
    	
    	title4=Integer.parseInt(title1+title2)/Integer.parseInt(title3);
    	
    }

	public int getTitle4() {
		return title4;
	}

	public void setTitle4(int title4) {
		this.title4 = title4;
	}

	

}
