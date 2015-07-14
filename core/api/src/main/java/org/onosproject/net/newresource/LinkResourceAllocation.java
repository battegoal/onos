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
import org.onosproject.net.LinkKey;

/**
 * Represents allocation of resource bound to link.
 *
 * @param <T> type of the resource
 */
@Beta
public final class LinkResourceAllocation<T> extends AbstractResourceAllocation<LinkKey, T> {

    /**
     * Creates a new allocation of resource bound to the specified device and consumed by the specified user.
     *
     * @param link device identifier which this resource belongs to
     * @param resource resource of the device
     * @param consumer consumer of this resource
     */
    public LinkResourceAllocation(LinkKey link, T resource, ResourceConsumer consumer) {
        super(link, resource, consumer);
    }
}
