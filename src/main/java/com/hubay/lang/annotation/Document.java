/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hubay.lang.annotation;

import java.lang.annotation.*;

/**
 * Document
 * @author Rizwan Idrees
 * @author Mohsin Husen
 * @author shuye
 */

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
public @interface Document {

	String index();

	String type() default "";
	
	short shards() default 5;

	short replicas() default 1;

	String refreshInterval() default "1s";

	String indexStoreType() default "fs";
	
}
