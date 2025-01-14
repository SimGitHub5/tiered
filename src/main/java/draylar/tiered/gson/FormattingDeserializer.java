package draylar.tiered.gson;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import net.minecraft.util.text.TextFormatting;

public class FormattingDeserializer implements JsonDeserializer<TextFormatting> {

    @Override
    public TextFormatting deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return TextFormatting.getValueByName(json.getAsString().toUpperCase());
    }
}
