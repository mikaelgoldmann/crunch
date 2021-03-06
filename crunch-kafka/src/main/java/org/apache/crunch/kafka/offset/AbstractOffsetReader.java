/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.crunch.kafka.offset;

import org.apache.kafka.common.TopicPartition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Base implementation of {@link OffsetReader}
 */
public abstract class AbstractOffsetReader implements OffsetReader {

  @Override
  public Map<TopicPartition, Long> readOffsets(long persistedOffsetTime) throws IOException {
    throw new UnsupportedOperationException("Operation to read old offsets is not supported");
  }

  @Override
  public List<Long> getStoredOffsetPersistenceTimes() throws IOException {
    throw new UnsupportedOperationException("Operation to retrieve old offset persistence times is not supported");
  }

}
