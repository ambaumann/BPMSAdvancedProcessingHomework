package com.solarvillage.permit.domain;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class NewOrder implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("HOA Member")
   private java.lang.Boolean HOAMember;

   @org.kie.api.definition.type.Label(value = "ID")
   private java.lang.Integer ID;

   @org.kie.api.definition.type.Label(value = "Written Approval")
   private java.lang.Boolean HOAAcquiredWrittenApproval;

   @org.kie.api.definition.type.Label(value = "Electric Permit Approved")
   private java.lang.Boolean electricPermitApproved;

   @org.kie.api.definition.type.Label(value = "Structural Permit Approved")
   private java.lang.Boolean structuralPermitApproved;

   public NewOrder()
   {
   }

   public java.lang.Boolean getHOAMember()
   {
      return this.HOAMember;
   }

   public void setHOAMember(java.lang.Boolean HOAMember)
   {
      this.HOAMember = HOAMember;
   }

   public java.lang.Integer getID()
   {
      return this.ID;
   }

   public void setID(java.lang.Integer ID)
   {
      this.ID = ID;
   }

   public java.lang.Boolean getHOAAcquiredWrittenApproval()
   {
      return this.HOAAcquiredWrittenApproval;
   }

   public void setHOAAcquiredWrittenApproval(
         java.lang.Boolean HOAAcquiredWrittenApproval)
   {
      this.HOAAcquiredWrittenApproval = HOAAcquiredWrittenApproval;
   }

   public java.lang.Boolean getElectricPermitApproved()
   {
      return this.electricPermitApproved;
   }

   public void setElectricPermitApproved(java.lang.Boolean electricPermitApproved)
   {
      this.electricPermitApproved = electricPermitApproved;
   }

   public java.lang.Boolean getStructuralPermitApproved()
   {
      return this.structuralPermitApproved;
   }

   public void setStructuralPermitApproved(
         java.lang.Boolean structuralPermitApproved)
   {
      this.structuralPermitApproved = structuralPermitApproved;
   }

   public NewOrder(java.lang.Boolean HOAMember, java.lang.Integer ID,
         java.lang.Boolean HOAAcquiredWrittenApproval,
         java.lang.Boolean electricPermitApproved,
         java.lang.Boolean structuralPermitApproved)
   {
      this.HOAMember = HOAMember;
      this.ID = ID;
      this.HOAAcquiredWrittenApproval = HOAAcquiredWrittenApproval;
      this.electricPermitApproved = electricPermitApproved;
      this.structuralPermitApproved = structuralPermitApproved;
   }

}