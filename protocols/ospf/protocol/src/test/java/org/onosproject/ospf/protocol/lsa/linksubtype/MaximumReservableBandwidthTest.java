/*
 * Copyright 2016-present Open Networking Laboratory
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
package org.onosproject.ospf.protocol.lsa.linksubtype;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.onosproject.ospf.protocol.lsa.TlvHeader;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

/**
 * Unit test class for MaximumReservableBandwidth.
 */
public class MaximumReservableBandwidthTest {

    private final byte[] packet = {0, 0, 0, 0};
    private MaximumReservableBandwidth maximumReservableBandwidth;
    private TlvHeader header;
    private ChannelBuffer channelBuffer;
    private byte[] result;

    @Before
    public void setUp() throws Exception {
        maximumReservableBandwidth = new MaximumReservableBandwidth(new TlvHeader());
    }

    @After
    public void tearDown() throws Exception {
        maximumReservableBandwidth = null;
        header = null;
        channelBuffer = null;
        result = null;
    }


    /**
     * Tests maximumBandwidth() setter method.
     */
    @Test
    public void testSetMaximumBandwidth() throws Exception {
        maximumReservableBandwidth.setMaximumBandwidth(123456.78f);
        assertThat(maximumReservableBandwidth, is(notNullValue()));
    }

    /**
     * Tests readFrom() method.
     */
    @Test
    public void testReadFrom() throws Exception {
        header = new TlvHeader();
        header.setTlvType(6);
        header.setTlvLength(4);
        channelBuffer = ChannelBuffers.copiedBuffer(packet);
        maximumReservableBandwidth = new MaximumReservableBandwidth(header);
        maximumReservableBandwidth.readFrom(channelBuffer);
        assertThat(maximumReservableBandwidth, is(notNullValue()));
    }

    /**
     * Tests asBytes() method.
     */
    @Test
    public void testAsBytes() throws Exception {
        result = maximumReservableBandwidth.asBytes();
        assertThat(result, is(notNullValue()));
    }


    /**
     * Tests getLinkSubTypeTlvBodyAsByteArray() method.
     */
    @Test
    public void testGetLinkSubTypeTlvBodyAsByteArray() throws Exception {
        result = maximumReservableBandwidth.getLinksubTypeTlvBodyAsByteArray();
        assertThat(result, is(notNullValue()));
    }

    /**
     * Tests to string method.
     */
    @Test
    public void testToString() throws Exception {
        assertThat(maximumReservableBandwidth.toString(), is(notNullValue()));
    }
}
