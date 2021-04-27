// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PaymentGatewayService.proto

package com.packt.modern.api.grpc.v1;

/**
 * Protobuf enum {@code com.packtpub.v1.Flow}
 */
public enum Flow
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>REDIRECT = 0;</code>
   */
  REDIRECT(0),
  /**
   * <code>RECEIVER = 1;</code>
   */
  RECEIVER(1),
  /**
   * <code>CODEVERIFICATION = 2;</code>
   */
  CODEVERIFICATION(2),
  /**
   * <code>NONE = 3;</code>
   */
  NONE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>REDIRECT = 0;</code>
   */
  public static final int REDIRECT_VALUE = 0;
  /**
   * <code>RECEIVER = 1;</code>
   */
  public static final int RECEIVER_VALUE = 1;
  /**
   * <code>CODEVERIFICATION = 2;</code>
   */
  public static final int CODEVERIFICATION_VALUE = 2;
  /**
   * <code>NONE = 3;</code>
   */
  public static final int NONE_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Flow valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Flow forNumber(int value) {
    switch (value) {
      case 0: return REDIRECT;
      case 1: return RECEIVER;
      case 2: return CODEVERIFICATION;
      case 3: return NONE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Flow>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Flow> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Flow>() {
          public Flow findValueByNumber(int number) {
            return Flow.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.packt.modern.api.grpc.v1.PaymentGatewayService.getDescriptor().getEnumTypes().get(0);
  }

  private static final Flow[] VALUES = values();

  public static Flow valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Flow(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.packtpub.v1.Flow)
}

