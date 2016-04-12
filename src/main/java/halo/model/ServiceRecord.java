package halo.model;


public class ServiceRecord {
   
   private String resultCode;
   private String id;
   private Result result;
   
   public ServiceRecord() {}
   
   public ServiceRecord( String resultCode, String id, Result result ) {
      super();
      this.resultCode = resultCode;
      this.id = id;
      this.result = result;
   }
   
   public String getResultCode() {
      return resultCode;
   }

   public void setResultCode( String resultCode ) {
      this.resultCode = resultCode;
   }

   public String getId() {
      return id;
   }

   public void setId( String id ) {
      this.id = id;
   }

   public Result getResult() {
      return result;
   }
   
   public void setResult( Result result ) {
      this.result = result;
   }
}
