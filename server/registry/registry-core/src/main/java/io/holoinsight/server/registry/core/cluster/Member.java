/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
package io.holoinsight.server.registry.core.cluster;

import io.grpc.Channel;

/**
 * <p>created at 2022/3/12
 *
 * @author zzhb101
 */
public interface Member {
    Endpoint endpoint();

    Channel channel();
}
