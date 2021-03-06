//
// Generated by protoc, do not edit by hand.
//
package org.apache.activemq.store.kahadb.data;


public final class KahaXATransactionId extends KahaXATransactionIdBase<KahaXATransactionId> {

   public java.util.ArrayList<String> missingFields() {
      java.util.ArrayList<String> missingFields = super.missingFields();
      if(  !hasFormatId() ) {
         missingFields.add("format_id");
      }
      if(  !hasBranchQualifier() ) {
         missingFields.add("branch_qualifier");
      }
      if(  !hasGlobalTransactionId() ) {
         missingFields.add("global_transaction_id");
      }
      return missingFields;
   }

   public void clear() {
      super.clear();
      clearFormatId();
      clearBranchQualifier();
      clearGlobalTransactionId();
   }

   public KahaXATransactionId clone() {
      return new KahaXATransactionId().mergeFrom(this);
   }

   public KahaXATransactionId mergeFrom(KahaXATransactionId other) {
      if (other.hasFormatId()) {
         setFormatId(other.getFormatId());
      }
      if (other.hasBranchQualifier()) {
         setBranchQualifier(other.getBranchQualifier());
      }
      if (other.hasGlobalTransactionId()) {
         setGlobalTransactionId(other.getGlobalTransactionId());
      }
      return this;
   }

   public int serializedSizeUnframed() {
      if (memoizedSerializedSize != -1)
         return memoizedSerializedSize;

      int size = 0;
      if (hasFormatId()) {
         size += org.apache.activemq.protobuf.CodedOutputStream.computeInt32Size(1, getFormatId());
      }
      if (hasBranchQualifier()) {
         size += org.apache.activemq.protobuf.CodedOutputStream.computeBytesSize(2, getBranchQualifier());
      }
      if (hasGlobalTransactionId()) {
         size += org.apache.activemq.protobuf.CodedOutputStream.computeBytesSize(3, getGlobalTransactionId());
      }
      memoizedSerializedSize = size;
      return size;
   }

   public KahaXATransactionId mergeUnframed(org.apache.activemq.protobuf.CodedInputStream input) throws java.io.IOException {
      while (true) {
         int tag = input.readTag();
         if ((tag & 0x07) == 4) {
            return this;
         }
         switch (tag) {
         case 0:
            return this;
         default: {
            break;
         }
         case 8:
            setFormatId(input.readInt32());
            break;
         case 18:
            setBranchQualifier(input.readBytes());
            break;
         case 26:
            setGlobalTransactionId(input.readBytes());
            break;
         }
      }
   }
   public void writeUnframed(org.apache.activemq.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (hasFormatId()) {
         output.writeInt32(1, getFormatId());
      }
      if (hasBranchQualifier()) {
         output.writeBytes(2, getBranchQualifier());
      }
      if (hasGlobalTransactionId()) {
         output.writeBytes(3, getGlobalTransactionId());
      }
   }

   public static KahaXATransactionId parseUnframed(org.apache.activemq.protobuf.CodedInputStream data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException, java.io.IOException {
      return new KahaXATransactionId().mergeUnframed(data).checktInitialized();
   }

   public static KahaXATransactionId parseUnframed(org.apache.activemq.protobuf.Buffer data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException {
      return new KahaXATransactionId().mergeUnframed(data).checktInitialized();
   }

   public static KahaXATransactionId parseUnframed(byte[] data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException {
      return new KahaXATransactionId().mergeUnframed(data).checktInitialized();
   }

   public static KahaXATransactionId parseUnframed(java.io.InputStream data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException, java.io.IOException {
      return new KahaXATransactionId().mergeUnframed(data).checktInitialized();
   }

   public static KahaXATransactionId parseFramed(org.apache.activemq.protobuf.CodedInputStream data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException, java.io.IOException {
      return new KahaXATransactionId().mergeFramed(data).checktInitialized();
   }

   public static KahaXATransactionId parseFramed(org.apache.activemq.protobuf.Buffer data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException {
      return new KahaXATransactionId().mergeFramed(data).checktInitialized();
   }

   public static KahaXATransactionId parseFramed(byte[] data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException {
      return new KahaXATransactionId().mergeFramed(data).checktInitialized();
   }

   public static KahaXATransactionId parseFramed(java.io.InputStream data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException, java.io.IOException {
      return new KahaXATransactionId().mergeFramed(data).checktInitialized();
   }

   public String toString() {
      return toString(new java.lang.StringBuilder(), "").toString();
   }

   public java.lang.StringBuilder toString(java.lang.StringBuilder sb, String prefix) {
      if(  hasFormatId() ) {
         sb.append(prefix+"format_id: ");
         sb.append(getFormatId());
         sb.append("\n");
      }
      if(  hasBranchQualifier() ) {
         sb.append(prefix+"branch_qualifier: ");
         sb.append(getBranchQualifier());
         sb.append("\n");
      }
      if(  hasGlobalTransactionId() ) {
         sb.append(prefix+"global_transaction_id: ");
         sb.append(getGlobalTransactionId());
         sb.append("\n");
      }
      return sb;
   }

   public boolean equals(Object obj) {
      if( obj==this )
         return true;
      
      if( obj==null || obj.getClass()!=KahaXATransactionId.class )
         return false;
      
      return equals((KahaXATransactionId)obj);
   }
   
   public boolean equals(KahaXATransactionId obj) {
      if (hasFormatId() ^ obj.hasFormatId() ) 
         return false;
      if (hasFormatId() && ( getFormatId()!=obj.getFormatId() ))
         return false;
      if (hasBranchQualifier() ^ obj.hasBranchQualifier() ) 
         return false;
      if (hasBranchQualifier() && ( !getBranchQualifier().equals(obj.getBranchQualifier()) ))
         return false;
      if (hasGlobalTransactionId() ^ obj.hasGlobalTransactionId() ) 
         return false;
      if (hasGlobalTransactionId() && ( !getGlobalTransactionId().equals(obj.getGlobalTransactionId()) ))
         return false;
      return true;
   }
   
   public int hashCode() {
      int rc=-2138302623;
      if (hasFormatId()) {
         rc ^= ( 538723218^getFormatId() );
      }
      if (hasBranchQualifier()) {
         rc ^= ( 1822873864^getBranchQualifier().hashCode() );
      }
      if (hasGlobalTransactionId()) {
         rc ^= ( -346697322^getGlobalTransactionId().hashCode() );
      }
      return rc;
   }
   
}

abstract class KahaXATransactionIdBase<T> extends org.apache.activemq.protobuf.BaseMessage<T> {

   // required int32 format_id = 1;
   private int f_formatId = 0;
   private boolean b_formatId;

   public boolean hasFormatId() {
      return this.b_formatId;
   }

   public int getFormatId() {
      return this.f_formatId;
   }

   public T setFormatId(int formatId) {
      loadAndClear();
      this.b_formatId = true;
      this.f_formatId = formatId;
      return (T)this;
   }

   public void clearFormatId() {
      loadAndClear();
      this.b_formatId = false;
      this.f_formatId = 0;
   }

   // required bytes branch_qualifier = 2;
   private org.apache.activemq.protobuf.Buffer f_branchQualifier = null;
   private boolean b_branchQualifier;

   public boolean hasBranchQualifier() {
      return this.b_branchQualifier;
   }

   public org.apache.activemq.protobuf.Buffer getBranchQualifier() {
      return this.f_branchQualifier;
   }

   public T setBranchQualifier(org.apache.activemq.protobuf.Buffer branchQualifier) {
      loadAndClear();
      this.b_branchQualifier = true;
      this.f_branchQualifier = branchQualifier;
      return (T)this;
   }

   public void clearBranchQualifier() {
      loadAndClear();
      this.b_branchQualifier = false;
      this.f_branchQualifier = null;
   }

   // required bytes global_transaction_id = 3;
   private org.apache.activemq.protobuf.Buffer f_globalTransactionId = null;
   private boolean b_globalTransactionId;

   public boolean hasGlobalTransactionId() {
      return this.b_globalTransactionId;
   }

   public org.apache.activemq.protobuf.Buffer getGlobalTransactionId() {
      return this.f_globalTransactionId;
   }

   public T setGlobalTransactionId(org.apache.activemq.protobuf.Buffer globalTransactionId) {
      loadAndClear();
      this.b_globalTransactionId = true;
      this.f_globalTransactionId = globalTransactionId;
      return (T)this;
   }

   public void clearGlobalTransactionId() {
      loadAndClear();
      this.b_globalTransactionId = false;
      this.f_globalTransactionId = null;
   }

}

