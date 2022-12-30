/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: registry-for-prod.proto

package io.holoinsight.server.registry.grpc.prod;

public interface DryRunRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.holoinsight.server.registry.grpc.prod.DryRunRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * common request header
   * </pre>
   *
   * <code>.io.holoinsight.server.common.grpc.CommonRequestHeader header = 1;</code>
   */
  boolean hasHeader();
  /**
   * <pre>
   * common request header
   * </pre>
   *
   * <code>.io.holoinsight.server.common.grpc.CommonRequestHeader header = 1;</code>
   */
  io.holoinsight.server.common.grpc.CommonRequestHeader getHeader();
  /**
   * <pre>
   * common request header
   * </pre>
   *
   * <code>.io.holoinsight.server.common.grpc.CommonRequestHeader header = 1;</code>
   */
  io.holoinsight.server.common.grpc.CommonRequestHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   * agent id
   * </pre>
   *
   * <code>string agent_id = 2;</code>
   */
  java.lang.String getAgentId();
  /**
   * <pre>
   * agent id
   * </pre>
   *
   * <code>string agent_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getAgentIdBytes();

  /**
   * <pre>
   * 配置类型
   * </pre>
   *
   * <code>string type = 3;</code>
   */
  java.lang.String getType();
  /**
   * <pre>
   * 配置类型
   * </pre>
   *
   * <code>string type = 3;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * 采集配置, 格式和 gaea_collect_config 的 json 字段保持一致
   * </pre>
   *
   * <code>string json = 4;</code>
   */
  java.lang.String getJson();
  /**
   * <pre>
   * 采集配置, 格式和 gaea_collect_config 的 json 字段保持一致
   * </pre>
   *
   * <code>string json = 4;</code>
   */
  com.google.protobuf.ByteString
      getJsonBytes();

  /**
   * <code>.io.holoinsight.server.registry.grpc.prod.TargetIdentifier target = 5;</code>
   */
  boolean hasTarget();
  /**
   * <code>.io.holoinsight.server.registry.grpc.prod.TargetIdentifier target = 5;</code>
   */
  io.holoinsight.server.registry.grpc.prod.TargetIdentifier getTarget();
  /**
   * <code>.io.holoinsight.server.registry.grpc.prod.TargetIdentifier target = 5;</code>
   */
  io.holoinsight.server.registry.grpc.prod.TargetIdentifierOrBuilder getTargetOrBuilder();
}