/*
 * Copyright (C) 2015 Sebastian Daschner, sebastian-daschner.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sebastian_daschner.jaxrs_test;

import javax.ejb.Stateless;

/**
 * These sources are solely used for test purposes and not meant for deployment.
 */
@Stateless
public class Manager<T> {

    public <U> U getInstance(final Class<U> clazz, final T object) {
        // some reflection magic
        final T tObject = object;
        final U uObject = (U) object;
        return uObject;
    }

}
