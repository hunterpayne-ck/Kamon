/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.sematext.spm.client.tracing.thrift;


import org.apache.thrift.TEnum;

public enum TTracingEventType implements TEnum {
  PARTIAL_TRANSACTION(0),
  TRACING_ERROR(1);

  private final int value;

  private TTracingEventType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TTracingEventType findByValue(int value) { 
    switch (value) {
      case 0:
        return PARTIAL_TRANSACTION;
      case 1:
        return TRACING_ERROR;
      default:
        return null;
    }
  }
}