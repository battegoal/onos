/*
 * Copyright 2017-present Open Networking Laboratory
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
package org.onosproject.openstacknetworking.api;

import org.onosproject.event.AbstractEvent;

/**
 * Describes virtual instance port event.
 */
public class InstancePortEvent extends AbstractEvent<InstancePortEvent.Type, InstancePort> {

    public enum Type {

        /**
         * Signifies that a new instance port is detected.
         */
        OPENSTACK_INSTANCE_PORT_DETECTED,

        /**
         * Signifies that the instance port is updated.
         */
        OPENSTACK_INSTANCE_PORT_UPDATED,

        /**
         * Signifies that the instance port is disabled.
         */
        OPENSTACK_INSTANCE_PORT_VANISHED
    }

    /**
     * Creates an event of a given type for the specified instance port.
     *
     * @param type     instance port event type
     * @param instPort instance port
     */
    public InstancePortEvent(Type type, InstancePort instPort) {
        super(type, instPort);
    }
}
