/*
 * Copyright 2015 Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.net.newresource;

import com.google.common.annotations.Beta;

/**
 * Represents allocation of resource which belongs to a particular subject.
 *
 * @param <S> type of the subject
 * @param <T> type of the resource
 */
@Beta
public interface ResourceAllocation<S, T> {
    /**
     * Returns the subject of the resource.
     * The value is the identifier which this resource belongs to.
     *
     * @return the subject of the resource
     */
    S subject();

    /**
     * Returns the resource which belongs to the subject.
     *
     * @return the resource which belongs to the subject
     */
    T resource();

    /**
     * Returns the consumer of this resource.
     *
     * @return the consumer of this resource
     */
    ResourceConsumer consumer();
}
