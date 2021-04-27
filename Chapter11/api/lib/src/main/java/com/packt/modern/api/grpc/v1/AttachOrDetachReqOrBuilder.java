// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PaymentGatewayService.proto

package com.packt.modern.api.grpc.v1;

public interface AttachOrDetachReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.packtpub.v1.AttachOrDetachReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Id of the Source for which attach/detach request is being called.
   * </pre>
   *
   * <code>string sourceId = 1;</code>
   * @return The sourceId.
   */
  java.lang.String getSourceId();
  /**
   * <pre>
   * Id of the Source for which attach/detach request is being called.
   * </pre>
   *
   * <code>string sourceId = 1;</code>
   * @return The bytes for sourceId.
   */
  com.google.protobuf.ByteString
      getSourceIdBytes();

  /**
   * <pre>
   * unique customer ID
   * </pre>
   *
   * <code>string customerId = 2;</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * unique customer ID
   * </pre>
   *
   * <code>string customerId = 2;</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();
}
