/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.formats.tiff.fieldtypes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.nio.ByteOrder;

import org.junit.jupiter.api.Test;

public class FieldTypeLongTest {

    @Test
    public void testWriteDataWithNonNull() {
        final FieldTypeLong fieldTypeLong = FieldType.IFD;
        final ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;

        try {
            fieldTypeLong.writeData(byteOrder, byteOrder);
            fail("Expecting exception: Exception");
        } catch (final Exception e) {
            assertEquals("Invalid data: BIG_ENDIAN (java.nio.ByteOrder)", e.getMessage());
            assertEquals(FieldTypeLong.class.getName(), e.getStackTrace()[0].getClassName());
        }
    }

}