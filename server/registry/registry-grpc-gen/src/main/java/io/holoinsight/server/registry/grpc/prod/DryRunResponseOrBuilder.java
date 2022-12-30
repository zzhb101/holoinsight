/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: registry-for-prod.proto

package io.holoinsight.server.registry.grpc.prod;

public interface DryRunResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.holoinsight.server.registry.grpc.prod.DryRunResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * common response header
   * </pre>
   *
   * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
   */
  boolean hasHeader();
  /**
   * <pre>
   * common response header
   * </pre>
   *
   * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
   */
  io.holoinsight.server.common.grpc.CommonResponseHeader getHeader();
  /**
   * <pre>
   * common response header
   * </pre>
   *
   * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
   */
  io.holoinsight.server.common.grpc.CommonResponseHeaderOrBuilder getHeaderOrBuilder();
}