/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: registry-for-agent.proto

package io.holoinsight.server.registry.grpc.agent;

public interface GetCollectTasksResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.holoinsight.server.registry.grpc.agent.GetCollectTasksResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
   */
  boolean hasHeader();
  /**
   * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
   */
  io.holoinsight.server.common.grpc.CommonResponseHeader getHeader();
  /**
   * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
   */
  io.holoinsight.server.common.grpc.CommonResponseHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   * 返回每个bucket的最新状态, 如果bucket里的state与agent上的state相同, 那么说明该bucket没有任何变化
   * 此时其对应的 collect_tasks 也会为空
   * </pre>
   *
   * <code>map&lt;string, .io.holoinsight.server.registry.grpc.agent.CollectConfigsBucket&gt; buckets = 2;</code>
   */
  int getBucketsCount();
  /**
   * <pre>
   * 返回每个bucket的最新状态, 如果bucket里的state与agent上的state相同, 那么说明该bucket没有任何变化
   * 此时其对应的 collect_tasks 也会为空
   * </pre>
   *
   * <code>map&lt;string, .io.holoinsight.server.registry.grpc.agent.CollectConfigsBucket&gt; buckets = 2;</code>
   */
  boolean containsBuckets(
      java.lang.String key);
  /**
   * Use {@link #getBucketsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.holoinsight.server.registry.grpc.agent.CollectConfigsBucket>
  getBuckets();
  /**
   * <pre>
   * 返回每个bucket的最新状态, 如果bucket里的state与agent上的state相同, 那么说明该bucket没有任何变化
   * 此时其对应的 collect_tasks 也会为空
   * </pre>
   *
   * <code>map&lt;string, .io.holoinsight.server.registry.grpc.agent.CollectConfigsBucket&gt; buckets = 2;</code>
   */
  java.util.Map<java.lang.String, io.holoinsight.server.registry.grpc.agent.CollectConfigsBucket>
  getBucketsMap();
  /**
   * <pre>
   * 返回每个bucket的最新状态, 如果bucket里的state与agent上的state相同, 那么说明该bucket没有任何变化
   * 此时其对应的 collect_tasks 也会为空
   * </pre>
   *
   * <code>map&lt;string, .io.holoinsight.server.registry.grpc.agent.CollectConfigsBucket&gt; buckets = 2;</code>
   */

  io.holoinsight.server.registry.grpc.agent.CollectConfigsBucket getBucketsOrDefault(
      java.lang.String key,
      io.holoinsight.server.registry.grpc.agent.CollectConfigsBucket defaultValue);
  /**
   * <pre>
   * 返回每个bucket的最新状态, 如果bucket里的state与agent上的state相同, 那么说明该bucket没有任何变化
   * 此时其对应的 collect_tasks 也会为空
   * </pre>
   *
   * <code>map&lt;string, .io.holoinsight.server.registry.grpc.agent.CollectConfigsBucket&gt; buckets = 2;</code>
   */

  io.holoinsight.server.registry.grpc.agent.CollectConfigsBucket getBucketsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * 引用的配置
   * </pre>
   *
   * <code>map&lt;string, .io.holoinsight.server.registry.grpc.agent.CollectConfig&gt; collect_configs = 3;</code>
   */
  int getCollectConfigsCount();
  /**
   * <pre>
   * 引用的配置
   * </pre>
   *
   * <code>map&lt;string, .io.holoinsight.server.registry.grpc.agent.CollectConfig&gt; collect_configs = 3;</code>
   */
  boolean containsCollectConfigs(
      java.lang.String key);
  /**
   * Use {@link #getCollectConfigsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.holoinsight.server.registry.grpc.agent.CollectConfig>
  getCollectConfigs();
  /**
   * <pre>
   * 引用的配置
   * </pre>
   *
   * <code>map&lt;string, .io.holoinsight.server.registry.grpc.agent.CollectConfig&gt; collect_configs = 3;</code>
   */
  java.util.Map<java.lang.String, io.holoinsight.server.registry.grpc.agent.CollectConfig>
  getCollectConfigsMap();
  /**
   * <pre>
   * 引用的配置
   * </pre>
   *
   * <code>map&lt;string, .io.holoinsight.server.registry.grpc.agent.CollectConfig&gt; collect_configs = 3;</code>
   */

  io.holoinsight.server.registry.grpc.agent.CollectConfig getCollectConfigsOrDefault(
      java.lang.String key,
      io.holoinsight.server.registry.grpc.agent.CollectConfig defaultValue);
  /**
   * <pre>
   * 引用的配置
   * </pre>
   *
   * <code>map&lt;string, .io.holoinsight.server.registry.grpc.agent.CollectConfig&gt; collect_configs = 3;</code>
   */

  io.holoinsight.server.registry.grpc.agent.CollectConfig getCollectConfigsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * 应用的采集目标, 绝大多数只会有一个目标, 就是本机
   * </pre>
   *
   * <code>map&lt;string, .io.holoinsight.server.registry.grpc.agent.CollectTarget&gt; collect_targets = 4;</code>
   */
  int getCollectTargetsCount();
  /**
   * <pre>
   * 应用的采集目标, 绝大多数只会有一个目标, 就是本机
   * </pre>
   *
   * <code>map&lt;string, .io.holoinsight.server.registry.grpc.agent.CollectTarget&gt; collect_targets = 4;</code>
   */
  boolean containsCollectTargets(
      java.lang.String key);
  /**
   * Use {@link #getCollectTargetsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.holoinsight.server.registry.grpc.agent.CollectTarget>
  getCollectTargets();
  /**
   * <pre>
   * 应用的采集目标, 绝大多数只会有一个目标, 就是本机
   * </pre>
   *
   * <code>map&lt;string, .io.holoinsight.server.registry.grpc.agent.CollectTarget&gt; collect_targets = 4;</code>
   */
  java.util.Map<java.lang.String, io.holoinsight.server.registry.grpc.agent.CollectTarget>
  getCollectTargetsMap();
  /**
   * <pre>
   * 应用的采集目标, 绝大多数只会有一个目标, 就是本机
   * </pre>
   *
   * <code>map&lt;string, .io.holoinsight.server.registry.grpc.agent.CollectTarget&gt; collect_targets = 4;</code>
   */

  io.holoinsight.server.registry.grpc.agent.CollectTarget getCollectTargetsOrDefault(
      java.lang.String key,
      io.holoinsight.server.registry.grpc.agent.CollectTarget defaultValue);
  /**
   * <pre>
   * 应用的采集目标, 绝大多数只会有一个目标, 就是本机
   * </pre>
   *
   * <code>map&lt;string, .io.holoinsight.server.registry.grpc.agent.CollectTarget&gt; collect_targets = 4;</code>
   */

  io.holoinsight.server.registry.grpc.agent.CollectTarget getCollectTargetsOrThrow(
      java.lang.String key);
}