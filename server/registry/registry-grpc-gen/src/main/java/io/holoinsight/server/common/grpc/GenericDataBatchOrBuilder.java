/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package io.holoinsight.server.common.grpc;

public interface GenericDataBatchOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.holoinsight.server.common.grpc.GenericDataBatch)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .io.holoinsight.server.common.grpc.GenericData data = 1;</code>
   */
  java.util.List<io.holoinsight.server.common.grpc.GenericData> 
      getDataList();
  /**
   * <code>repeated .io.holoinsight.server.common.grpc.GenericData data = 1;</code>
   */
  io.holoinsight.server.common.grpc.GenericData getData(int index);
  /**
   * <code>repeated .io.holoinsight.server.common.grpc.GenericData data = 1;</code>
   */
  int getDataCount();
  /**
   * <code>repeated .io.holoinsight.server.common.grpc.GenericData data = 1;</code>
   */
  java.util.List<? extends io.holoinsight.server.common.grpc.GenericDataOrBuilder> 
      getDataOrBuilderList();
  /**
   * <code>repeated .io.holoinsight.server.common.grpc.GenericData data = 1;</code>
   */
  io.holoinsight.server.common.grpc.GenericDataOrBuilder getDataOrBuilder(
      int index);
}
