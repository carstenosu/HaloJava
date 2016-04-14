package halo.objectmapper;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.mashape.unirest.http.ObjectMapper;


public class PascalCaseObjectMapper implements ObjectMapper {

   private com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
   
   public <T> T readValue( String value, Class<T> valueType ) {
      try {
         jacksonObjectMapper.setPropertyNamingStrategy( PropertyNamingStrategy.PASCAL_CASE_TO_CAMEL_CASE );
         jacksonObjectMapper.configure( DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false );
         return jacksonObjectMapper.readValue( value, valueType );
      }
      catch ( IOException e ) {
         throw new RuntimeException( e );
      }
   }

   public String writeValue( Object value ) {
      try {
         return jacksonObjectMapper.writeValueAsString( value );
      }
      catch ( JsonProcessingException e ) {
         throw new RuntimeException( e );
      }
   }


}
