/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
package io.holoinsight.server.registry.core.cluster;

import io.holoinsight.server.common.grpc.GenericData;

/**
 * <p>created at 2022/4/17
 *
 * @author zzhb101
 */
public interface Handler {
    int[] types();

    void handle(GenericData d);
}
