// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PaymentGatewayService.proto

package com.packt.modern.api.grpc.v1;

public interface AddressOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.packtpub.v1.Address)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Number of house, flat, bunglow, plot or property
   * </pre>
   *
   * <code>string number = 2;</code>
   * @return The number.
   */
  java.lang.String getNumber();
  /**
   * <pre>
   * Number of house, flat, bunglow, plot or property
   * </pre>
   *
   * <code>string number = 2;</code>
   * @return The bytes for number.
   */
  com.google.protobuf.ByteString
      getNumberBytes();

  /**
   * <pre>
   * Name and other details of the residency, society or building
   * </pre>
   *
   * <code>string residency = 3;</code>
   * @return The residency.
   */
  java.lang.String getResidency();
  /**
   * <pre>
   * Name and other details of the residency, society or building
   * </pre>
   *
   * <code>string residency = 3;</code>
   * @return The bytes for residency.
   */
  com.google.protobuf.ByteString
      getResidencyBytes();

  /**
   * <pre>
   * Address line 2 (e.g., apartment, suite, unit, or building).
   * </pre>
   *
   * <code>string street = 4;</code>
   * @return The street.
   */
  java.lang.String getStreet();
  /**
   * <pre>
   * Address line 2 (e.g., apartment, suite, unit, or building).
   * </pre>
   *
   * <code>string street = 4;</code>
   * @return The bytes for street.
   */
  com.google.protobuf.ByteString
      getStreetBytes();

  /**
   * <pre>
   * City, district, suburb, town, or village.
   * </pre>
   *
   * <code>string city = 5;</code>
   * @return The city.
   */
  java.lang.String getCity();
  /**
   * <pre>
   * City, district, suburb, town, or village.
   * </pre>
   *
   * <code>string city = 5;</code>
   * @return The bytes for city.
   */
  com.google.protobuf.ByteString
      getCityBytes();

  /**
   * <pre>
   * State, county, province, or region.
   * </pre>
   *
   * <code>string state = 6;</code>
   * @return The state.
   */
  java.lang.String getState();
  /**
   * <pre>
   * State, county, province, or region.
   * </pre>
   *
   * <code>string state = 6;</code>
   * @return The bytes for state.
   */
  com.google.protobuf.ByteString
      getStateBytes();

  /**
   * <pre>
   * Two-letter country code (ISO 3166-1 alpha-2).
   * </pre>
   *
   * <code>string country = 7;</code>
   * @return The country.
   */
  java.lang.String getCountry();
  /**
   * <pre>
   * Two-letter country code (ISO 3166-1 alpha-2).
   * </pre>
   *
   * <code>string country = 7;</code>
   * @return The bytes for country.
   */
  com.google.protobuf.ByteString
      getCountryBytes();

  /**
   * <code>string postalCode = 8;</code>
   * @return The postalCode.
   */
  java.lang.String getPostalCode();
  /**
   * <code>string postalCode = 8;</code>
   * @return The bytes for postalCode.
   */
  com.google.protobuf.ByteString
      getPostalCodeBytes();
}
