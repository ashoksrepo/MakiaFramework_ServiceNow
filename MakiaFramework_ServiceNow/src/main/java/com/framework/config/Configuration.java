/*
 * Apache 2.0 License
 *
 * Copyright (c) 2022 QEAGLE
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.framework.config;

import java.util.Locale;
import java.util.Random;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.LoadType;

import groovy.lang.GrabConfig;

@LoadPolicy(LoadType.MERGE)
@Config.Sources({ "system:properties", "classpath:config.properties",
					"classpath:config_api.properties" })

public interface Configuration extends Config {


	@Key("server")
	String getBaseURI();

	@Key("url")
	String getUrl();

	@Key("username")
	String getUsername();

	@Key("password")
	String getPassword();

	@Key("resources")
	String getResources();
	
	@Key("shortdesc")
	String getShortDesc();

	@Key("path_incident")
	String getIncident();
	
	@Key("post_statuscode")
	int postStatuscode();
	
	@Key("put_statuscode")
	int putStatuscode();
	@Key("delete_statuscode")
	int deleteStatusCode();
	
	@Key("TC001")
	String File();
@Key("faker.locale")
	String faker();
	
	
	
	
	
	
	
}
