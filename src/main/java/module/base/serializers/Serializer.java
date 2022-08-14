package module.base.serializers;

import java.io.IOException;
import java.util.List;

import org.springframework.boot.jackson.JsonComponent;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import module.base.beans.BeanInjection;

@JsonComponent
public class Serializer {

	public Serializer() {
		
	}
	
	public static class Serialize extends JsonSerializer<BeanInjection> {

		public Serialize() {
			
		}
		
		@Override
		public void serialize(BeanInjection obj, JsonGenerator jgen, SerializerProvider provider) throws IOException {
		
			jgen.writeStartObject();
			jgen.writeStringField("secrete", obj.getSecrete());
			jgen.writePOJOField("subjects", obj.getSubjects());
			jgen.writeStringField("injectionType", obj.getInjectionType());
			jgen.writeEndObject();
		}
		
	}
	
	public static class Deserialize extends JsonDeserializer<BeanInjection> {

		public Deserialize() {
			
		}
		
		@Override
		public BeanInjection deserialize(JsonParser parser, DeserializationContext context)
				throws IOException, JacksonException {

			ObjectCodec codec = parser.getCodec();
			JsonNode tree = codec.readTree(parser);
			
			String secrete = tree.get("secrete").textValue();
			List<String> subjects = null;
			tree.findValuesAsText("subjects", subjects);
			String injectionType = tree.get("injectionType").textValue();
			
			BeanInjection bean = new BeanInjection();
			bean.setInjectionType(injectionType);
			bean.setSecrete(secrete);
			bean.setSubjects(subjects);
			
			return bean;
		}
	}
}
